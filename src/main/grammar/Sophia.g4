grammar Sophia;

@header{
    import main.ast.types.*;
    import main.ast.types.functionPointer.*;
    import main.ast.types.list.*;
    import main.ast.types.single.*;
    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.declaration.classDec.*;
    import main.ast.nodes.declaration.classDec.classMembersDec.*;
    import main.ast.nodes.declaration.variableDec.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.operators.*;
    import main.ast.nodes.expression.values.*;
    import main.ast.nodes.expression.values.primitive.*;
    import main.ast.nodes.statement.*;
    import main.ast.nodes.statement.loop.*;
}

sophia returns[Program sophiaProgram]
    : { $sophiaProgram = new Program(); }
    program { $sophiaProgram = $program } EOF;

program returns[Program p]
    : { $p = new Program(); }
    (sophiaClass { $p.addClass($sophiaClass.classDec; ); } )*;

sophiaClass: CLASS identifier (EXTENDS identifier)? LBRACE (((varDeclaration | method)* constructor (varDeclaration | method)*) | ((varDeclaration | method)*)) RBRACE;

varDeclaration: identifier COLON type SEMICOLLON;

method: DEF (type | VOID) identifier LPAR methodArguments RPAR LBRACE methodBody RBRACE;

constructor: DEF identifier LPAR methodArguments RPAR LBRACE methodBody RBRACE;

methodArguments: (variableWithType (COMMA variableWithType)*)?;

variableWithType: identifier COLON type;

type
    : primitiveDataType | 
    listType | 
    functionPointerType | 
    classType;

classType returns[ClassType ct]
    : identifier { $ct = identifier.id; };

listType: LIST LPAR ((INT_VALUE SHARP type) | (listItemsTypes)) RPAR;

listItemsTypes: listItemType (COMMA listItemType)*;

listItemType: variableWithType | type;

functionPointerType: FUNC LESS_THAN (VOID | typesWithComma) ARROW (VOID | type) GREATER_THAN;

typesWithComma: type (COMMA type)*;

primitiveDataType returns[Type t]
    : 
    INT { $t = new IntType(); $t.setLine($INT.getLine()); } | // is setLine getLine necessary
    STRING { $t = new StringType(); $t.setLine($STRING.getLine()); } | 
    BOOLEAN { $t = new BoolType(); $t.setLine($BOOLEAN.getLine()); } ;

methodBody: (varDeclaration)* (statement)*;

statement: forStatement | foreachStatement | ifStatement | assignmentStatement | printStatement | continueBreakStatement | methodCallStatement | returnStatement | block;

block: LBRACE (statement)* RBRACE;

assignmentStatement: assignment SEMICOLLON;

assignment: orExpression ASSIGN expression;

printStatement: PRINT LPAR expression RPAR SEMICOLLON;

returnStatement: RETURN expression? SEMICOLLON;

methodCallStatement: methodCall SEMICOLLON;

methodCall: otherExpression ((LPAR methodCallArguments RPAR) | (DOT identifier) | (LBRACK expression RBRACK))* (LPAR methodCallArguments RPAR);

methodCallArguments returns [ArrayList<Expression> exps]
    : { $exps = new ArrayList<Expression>(); }
    (expression { $exps.add($expression.exp); }
    (COMMA expression { $exps.add($expression.exp); } )*)?;

continueBreakStatement: (BREAK | CONTINUE) SEMICOLLON;

forStatement: FOR LPAR (assignment)? SEMICOLLON (expression)? SEMICOLLON (assignment)? RPAR statement;

foreachStatement: FOREACH LPAR identifier IN expression RPAR statement;

ifStatement: IF LPAR expression RPAR statement (ELSE statement)?;

expression: orExpression (ASSIGN expression)?;

orExpression: andExpression (OR andExpression)*;

andExpression: equalityExpression (AND equalityExpression)*;

equalityExpression: relationalExpression ((EQUAL | NOT_EQUAL) relationalExpression)*;

relationalExpression: additiveExpression ((GREATER_THAN | LESS_THAN) additiveExpression)*;

additiveExpression
    returns [Expression exp]
    locals [BinaryOperator op, int line]
    : multiplicativeExpression { $exp = $multiplicativeExpression.exp; }
    (
        (
            PLUS { $op = BinaryOperator.add; $line = $PLUS.getLine(); } | 
            MINUS { $op = BinaryOperator.sub; $line = $MINUS.getLine(); }
        ) 
        multiplicativeExpression { $exp = new BinaryExpression($exp, $multiplicativeExpression.exp, $op); $exp.setLine($line); }
    )*;

multiplicativeExpression
    returns [Expression exp]
    locals[UnaryOperator op, int line]
    : preUnaryExpression { $exp = $preUnaryExpression.exp; }
    (
        (
            MULT { $op = BinaryOperator.mult; $line = $MULT.getLine(); } | 
            DIVIDE { $op = BinaryOperator.div; $line = $DIVIDE.getLine(); } | 
            MOD { $op = BinaryOperator.mod; $line = $MOD.getLine(); }
        ) 
        preUnaryExpression { $exp = new BinaryExpression($exp, $preUnaryExpression.exp, $op); $exp.setLine($line); }
    )*;

preUnaryExpression
    returns [Expression exp]
    locals[UnaryOperator op, int line]
    : 
    (
        (
            NOT { $op = UnaryOperator.not; $line = $INCREMENT.getLine(); } | 
            MINUS { $op = UnaryOperator.minus; $line = $INCREMENT.getLine(); } | 
            INCREMENT { $op = UnaryOperator.preinc; $line = $INCREMENT.getLine(); } | 
            DECREMENT { $op = UnaryOperator.predec; $line = $INCREMENT.getLine(); }
        ) 
        preUnaryExpression { $exp = new UnaryExpression($preUnaryExpression.exp, $op);}
    ) | postUnaryExpression { $exp = $postUnaryExpression.exp; };

postUnaryExpression 
    returns [Expression exp]
    locals[UnaryOperator op, int line]
    : 
    accessExpression { $exp = $accessExpression.exp; }
    (
        (
            INCREMENT { $op = UnaryOperator.postinc; $line = $INCREMENT.getLine(); } | 
            DECREMENT { $op = UnaryOperator.postdec; $line = $INCREMENT.getLine(); }
        )
        { $exp = new UnaryExpression($op, $exp); $exp.setLine($line); }
    )?;

accessExpression returns [Expression exp]
    : 
    otherExpression 
    ((LPAR methodCallArguments RPAR) |
    (DOT identifier) | 
    (LBRACK expression RBRACK))*;

otherExpression returns [Expression exp]
    : 
    THIS { $exp = new ThisClass(); $exp.setLine($THIS.getLine()); } | 
    newExpression | 
    values { $exp = $value.val; } | 
    identifier { $exp = $identifier.id; } | 
    LPAR (expression { $exp = $expression.exp; } ) RPAR;

newExpression [NewClassInstance nci]
    : 
    NEW classType 
    LPAR 
    methodCallArguments 
    RPAR 
    { $nci = new NewClassInstance($classType.ct, $methodCallArguments.exps);  } ;

values returns [Value val]
    : 
    boolValue { $val = boolValue.val; } |
    STRING_VALUE  { $val = new StringValue($STRING_VALUE.text); $val.setLine($STRING_VALUE.getLine()); } | 
    INT_VALUE { $val = new IntValue($INT_VALUE.int); $val.setLine($INT_VALUE.getLine()); } | 
    NULL { $val = new NullValue(); $val.setLine($NULL.getLine()); } | 
    listValue;

boolValue returns [BoolValue val]
    : 
    TRUE { $val = new BoolValue(true); $val.setLine($TRUE.getLine()); } |
    FALSE { $val = new BoolValue(false); $val.setLine($FALSE.getLine()); };

listValue: LBRACK methodCallArguments RBRACK;

identifier returns [Identifier id]
    : 
    IDENTIFIER { $id = new Identifier($IDENTIFIER.text); $id.setLine($IDENTIFIER.getLine()); } ;


DEF: 'def';
EXTENDS: 'extends';
CLASS: 'class';

PRINT: 'print';
FUNC: 'func';

NEW: 'new';

CONTINUE: 'continue';
BREAK: 'break';
RETURN: 'return';

FOREACH: 'foreach';
IN: 'in';
FOR: 'for';
IF: 'if';
ELSE: 'else';

BOOLEAN: 'bool';
STRING: 'string';
INT: 'int';
VOID: 'void';
NULL: 'null';
LIST: 'list';

TRUE: 'true';
FALSE: 'false';

THIS: 'this';

ARROW: '->';
GREATER_THAN: '>';
LESS_THAN: '<';
NOT_EQUAL: '!=';
EQUAL: '==';

MULT: '*';
DIVIDE: '/';
MOD: '%';
PLUS: '+';
MINUS: '-';
AND: '&&';
OR: '||';
NOT: '!';
QUESTION_MARK: '?';

ASSIGN: '=';

INCREMENT: '++';
DECREMENT: '--';

LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';

SHARP: '#';
COMMA: ',';
DOT: '.';
COLON: ':';
SEMICOLLON: ';';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;
STRING_VALUE: '"'~["]*'"';
COMMENT: ('//' ~( '\r' | '\n')*) -> skip;
WS: ([ \t\n\r]) -> skip;