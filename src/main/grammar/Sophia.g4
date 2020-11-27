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

type returns [Type t]
    : primitiveDataType { $t = $primitiveDataType.t; } | 
    listType { $t = $listType.t; } | 
    functionPointerType { $t = $functionPointerType.t; } | 
    classType { $t = $classType.t; };

classType returns[ClassType ct]
    : identifier { $ct = identifier.id; };

listType: LIST LPAR ((INT_VALUE SHARP type) | (listItemsTypes)) RPAR;

listItemsTypes: listItemType (COMMA listItemType)*;

listItemType: variableWithType | type;

functionPointerType: FUNC LESS_THAN (VOID | typesWithComma) ARROW (VOID | type) GREATER_THAN;

typesWithComma returns [ArrayList<Type> ts]
    : { $ts = new ArrayList<type>(); }
    type { $ts.add(type.t); } (COMMA type { $ts.add(type.t); } )*;

primitiveDataType returns[Type t]
    : 
    INT { $t = new IntType(); $t.setLine($INT.getLine()); } | // is setLine getLine necessary
    STRING { $t = new StringType(); $t.setLine($STRING.getLine()); } | 
    BOOLEAN { $t = new BoolType(); $t.setLine($BOOLEAN.getLine()); } ;

methodBody: (varDeclaration)* (statement)*;

statement [Statement stmt]
    : 
    forStatement { $stmt = $forStatement.stmt; } | 
    foreachStatement { $stmt = $foreachStatement.stmt; } | 
    ifStatement { $stmt = $ifStatement.stmt; } | 
    assignmentStatement { $stmt = $assignmentStatement.stmt; } | 
    printStatement { $stmt = $printStatement.stmt; } | 
    continueBreakStatement { $stmt = $continueBreakStatement.stmt; } | 
    methodCallStatement { $stmt = $methodCallStatement.stmt; } | 
    returnStatement { $stmt = $returnStatement.stmt; } | 
    block { $stmt = $block.stmt; } ;

block [BlockStmt stmt]
    :
    LBRACE { $stmt = new BlockStmt(); $stmt.setLine($LBRACE.getLine()); } 
    (statement { $stmt.add($statement.stmt); } )* 
    RBRACE;

assignmentStatement [AssignmentStatement stmt]
    : assignment SEMICOLLON
    { $stmt = new AssignmentStatement($assignment.lVal, $assignment.rVal); $stmt.setLine($assignment.line); };

assignment [Expression lVal, Expression rVal, int line]
    : orExpression ASSIGN expression { $line = getLine };

printStatement [PrintStmt stmt]
    : 
    PRINT LPAR expression RPAR SEMICOLLON
    { $stmt = nem PrintStmt($expression.exp); $stmt.setLine($PRINT.getLine()); } ;

returnStatement returns [ReturnStmt stmt]
    : 
    RETURN { $stmt = nem ReturnStmt(); $stmt.setLine($RETURN.getLine()); } 
    (expression { $stmt.setReturnedExpr($expression.exp); } )? SEMICOLLON;

methodCallStatement returns [MethodCallStmt stmt]
    : methodCall { stmt = MethodCallStmt($methodCall.exp); stmt.setLine($methodCall.exp.getLine()); } SEMICOLLON;
//is getLine right this way?

methodCall returns [MethodCall exp]
    : otherExpression
    (
        (
            LPAR methodCallArguments RPAR //TODO
        ) | 
        (
            DOT identifier
        ) | 
        (
            LBRACK expression RBRACK
        )
    )* 
    (LPAR methodCallArguments RPAR)
    { 
        $exp = new MethodCall($otherExpression.exp, $methodCallArguments.exps);
        $exp.setLine($LPAR.getLine()); 
    }  // Should I use if? and change methodCall
    ;

methodCallArguments returns [ArrayList<Expression> exps]
    : { $exps = new ArrayList<Expression>(); }
    (expression { $exps.add($expression.exp); }
    (COMMA expression { $exps.add($expression.exp); } )*)?;

continueBreakStatement returns [Statement stmt]
    : (
        BREAK { $stmt = new BreakStmt(); $stmt.setLine($BREAK.getLine()); } | 
        CONTINUE { $stmt = new ContinueStmt(); $stmt.setLine($CONTINUE.getLine()); }
    ) SEMICOLLON;

forStatement returns [ForStmt stmt]
    : FOR LPAR 
    { $stmt = new ForStmt(); $stmt.setLine($FOR.getLine()); }
    (
        initStmt = assignment { $stmt.setInitialize($initStmt.stmt); }
    )? SEMICOLLON 
    (
        expression { $stmt.setInitialize($expression.exp); }
    )? SEMICOLLON 
    (
        updateStmt = assignment { $stmt.setUpdate($updateStmt.stmt); }
    )? RPAR 
    bodyStmt = statement 
    { $stmt.setBody($bodyStmt.stmt); };

foreachStatement returns [ForeachStmt stmt]
    : FOREACH LPAR identifier IN expression RPAR
    { 
        $stmt = new ForeachStmt($identifier, $expression);
        $stmt.setLine($FOREACH.getLine()):
    
    } // check: is it in right place
    statement { $stmt.setBody($statement); };

ifStatement returns [ConditionalStmt stmt]
    : IF LPAR expression RPAR ifStmt = statement
    {
        $stmt = new ConditionalStmt($expression.exp, $ifStmt.stmt);
        $stmt.setLine($IF.getLine());
    }
    (ELSE elseStmt = statement { $stmt.setElseBody($elseStmt.stmt) } )?;

expression returns [Expression exp]
    : orExpression { $exp = $orExpression.exp; }
    (
        ASSIGN expression
        { 
            $exp = new BinaryExpression(
                $exp, 
                $orExpression.exp, 
                BinaryOperator.assign
            ); 
            $exp.setLine($ASSIGN.getLine()); 
        }
    )?;

orExpression returns [Expression exp]
    : andExpression { $exp = $andExpression.exp; }
    (
        OR andExpression
        { 
            $exp = new BinaryExpression(
                $exp, 
                $andExpression.exp, 
                BinaryOperator.or
            ); 
            $exp.setLine($OR.getLine()); 
        }
    )*;

andExpression returns [Expression exp]
    : equalityExpression { $exp = $equalityExpression.exp; }
    (
        AND equalityExpression
        { 
            $exp = new BinaryExpression(
                $exp, 
                $equalityExpression.exp, 
                BinaryOperator.and
            ); 
            $exp.setLine($AND.getLine()); 
        }
    )*;

equalityExpression
    returns [Expression exp]
    locals [BinaryOperator op, int line]
    : relationalExpression { $exp = $relationalExpression.exp; }
    (
        (
            EQUAL { $op = BinaryOperator.eq; $line = $EQUAL.getLine(); } | 
            NOT_EQUAL { $op = BinaryOperator.neq; $line = $NOT_EQUAL.getLine(); }
        ) 
        relationalExpression { $exp = new BinaryExpression($exp, $relationalExpression.exp, $op); $exp.setLine($line); }
    )*;

relationalExpression
    returns [Expression exp]
    locals [BinaryOperator op, int line]
    : additiveExpression { $exp = $additiveExpression.exp; }
    (
        (
            GREATER_THAN { $op = BinaryOperator.gt; $line = $GREATER_THAN.getLine(); } | 
            LESS_THAN { $op = BinaryOperator.lt; $line = $LESS_THAN.getLine(); }
        ) 
        additiveExpression { $exp = new BinaryExpression($exp, $additiveExpression.exp, $op); $exp.setLine($line); }
    )*;

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
    otherExpression { $exp = $otherExpression.exp; }
    (
        (
            LPAR methodCallArguments RPAR
            { 
                $exp = new MethodCall($otherExpression.exp, $methodCallArguments.exps);
                 $exp.setLine($LPAR.getLine()); 
            }  // Should I use if? and change methodCall
        ) |
        (
            DOT identifier
            { 
                $exp = new ObjectOrListMemberAccess($otherExpression.exp, $identifier.id); 
                $exp.setLine($identifier.id.getLine()); 
            } // should i return line
        ) | 
        (
            LBRACK expression RBRACK
            { 
                $exp = new ListAccessByIndex($otherExpression.exp, expression.exp); 
                $exp.setLine($LBRACK.getLine());
            }
        )
    )*;

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