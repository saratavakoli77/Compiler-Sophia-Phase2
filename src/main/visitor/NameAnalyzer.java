package main.visitor;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.ListValue;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.expression.values.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.loop.BreakStmt;
import main.ast.nodes.statement.loop.ContinueStmt;
import main.ast.nodes.statement.loop.ForStmt;
import main.ast.nodes.statement.loop.ForeachStmt;

import main.symbolTable.SymbolTable;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.items.FieldSymbolTableItem;
import main.symbolTable.items.LocalVariableSymbolTableItem;
import main.symbolTable.items.MethodSymbolTableItem;
import main.symbolTable.items.SymbolTableItem;
import main.symbolTable.exception.ItemAlreadyExistsException;
import main.symbolTable.exception.ItemNotFoundException;

import main.compileError.CompileTimeErrors;

public class ASTTreePrinter extends Visitor<Void> {

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();

        ArrayList<ClassDeclaration> classes = program.getClasses();
        if (classes != null) {
            for (ClassDeclaration class : classes) {
                class.accept(this);
            }
        }
        //main ?!
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        
        Identifier className = classDeclaration.getClassName();
        if (className != null) {
            className.accept(this);
        }

        Identifier parentClassName = classDeclaration.getParentClassName();
        if (parentClassName != null) {
            parentClassName.accept(this);
        }

        ArrayList<FieldDeclaration> fields = classDeclaration.getFields();
        if (fields != null) {
            for (FieldDeclaration field : fields) {
                field.accept(this);
            }
        }

        ConstructorDeclaration constructor = classDeclaration.getConstructor();
        if (constructor != null){
            constructor.accept(this);
        }

        ArrayList<MethodDeclaration> methods = classDeclaration.getMethods();
        if (methods != null) {
            for (MethodDeclaration method : methods) {
                method.accept(this);
            }
        }

        ClassSymbolTableItem classItem = new ClassSymbolTableItem(classDeclaration);
        classItem.setClassSymbolTable(SymbolTable.top);
        SymbolTable.pop()

        while (true) {
            try {
                SymbolTable.root.put(classItem);
                break;
            } catch (ItemAlreadyExistsException e) {
                String name = classDeclaration.getClassName().getName();
                if (name.charAt(0) != '0') {
                    CompileErrors.add(classDeclaration.getLine(), "Redefinition of class " + name);
                }
                classItem.setName('0' + name);
            }
        }

        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        SymbolTable.push(new SymbolTable(SymbolTable.top));

        Identifier methodName = constructorDeclaration.getMethodName();
        if (methodName != null) {
            methodName.accept(this);
        }

        ArrayList<VarDeclaration> args = constructorDeclaration.getArgs();
        if (args != null) {
            for (VarDeclaration arg : args) {
                arg.accept(this);
            }
        }

        ArrayList<VarDeclaration> localVars = constructorDeclaration.getLocalVars();
        if (localVars != null) {
            for (VarDeclaration localVar : localVars) {
                localVar.accept(this);
            }
        }

        MethodSymbolTableItem methodItem = new MethodSymbolTableItem(constructorDeclaration);
        methodItem.setMethodSymbolTable(SymbolTable.top);
        SymbolTable.pop()

        while (true) {
            try {
                SymbolTable.top.put(methodItem);
                break;
            } catch (ItemAlreadyExistsException e) {
                String name = constructorDeclaration.getMethodName().getName();
                
                CompileErrors.add(constructorDeclaration.getLine(), "Redefinition of local variable " + name);
                
            }
        }

        ArrayList<Statement> bodyStmts = constructorDeclaration.getBody();
        if (bodyStmts != null) {
            for (Statement bodyStmt : bodyStmts) {
                bodyStmt.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        System.out.println(methodDeclaration.toString());

        // Type returnType = methodDeclaration.getReturnType();
        // if (returnType != null) {
        //     returnType.accept(this);
        // }

        Identifier methodName = methodDeclaration.getMethodName();
        if (methodName != null) {
            methodName.accept(this);
        }

        ArrayList<VarDeclaration> args = methodDeclaration.getArgs();
        if (args != null) {
            for (VarDeclaration arg : args) {
                arg.accept(this);
            }
        }

        ArrayList<VarDeclaration> localVars = methodDeclaration.getLocalVars();
        if (localVars != null) {
            for (VarDeclaration localVar : localVars) {
                localVar.accept(this);
            }
        }

        ArrayList<Statement> bodyStmts = handlerDeclaration.getBody();
        if (bodyStmts != null) {
            for (Statement bodyStmt : bodyStmts) {
                bodyStmt.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        System.out.println(fieldDeclaration.toString());
        //type accept nadare
        VarDeclaration varDeclaration = fieldDeclaration.getVarDeclaration();
        if (varDeclaration != null) {
            varDeclaration.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        System.out.println(varDeclaration.toString());
        //type accept nadare
        Identifier varName = varDeclaration.getVarName();
        if (varName != null) {
            varName.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        System.out.println(assignmentStmt.toString());

        Expression lValue = assignmentStmt.getlValue();
        if (lValue != null){
            lValue.accept(this);
        }

        Expression rValue = assignmentStmt.getrValue();
        if (rValue != null){
            rValue.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        System.out.println(blockStmt.toString());

        ArrayList<Statement> stmts = blockStmt.getStatements();
        if (stmts != null) {
            for (Statement stmt : stmts) {
                stmt.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        System.out.println(conditionalStmt.toString());

        Expression condition = conditionalStmt.getCondition();
        if (condition != null) {
            condition.accept(this);
        }

        Statement thenBody = conditionalStmt.getThenBody();
        if (thenBody != null) {
            thenBody.accept(this);
        }

        Statement elseBody = conditionalStmt.getElseBody();
        if (elseBody != null) {
            elseBody.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(MethodCallStmt methodCallStmt) {
        System.out.println(methodCallStmt.toString());

        MethodCall methodCall = methodCallStmt.getMethodCall();
        if (methodCall != null) {
            methodCall.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        System.out.println(print.toString());

        Expression arg = print.getArg();
        if (arg != null) {
            arg.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        System.out.println(returnStmt.toString());

        Expression returnedExpr = returnStmt.getReturnedExpr();
        if (returnedExpr != null) {
            returnedExpr.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(BreakStmt breakStmt) {
        System.out.println(breakStmt.toString());
        return null;
    }

    @Override
    public Void visit(ContinueStmt continueStmt) {
        System.out.println(continueStmt.toString());
        return null;
    }

    @Override
    public Void visit(ForeachStmt foreachStmt) {
        System.out.println(foreachStmt.toString());

        Identifier variable = ForeachStmt.getVariable();
        if (variable != null) {
            variable.accept(this);
        }

        Expression list = ForeachStmt.getList();
        if (list != null) {
            list.accept(this);
        }

        Statement body = ForeachStmt.getBody();
        if (body != null) {
            body.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ForStmt forStmt) {
        System.out.println(forStmt.toString());

        AssignmentStmt initialize = forStmt.getInitialize();
        if (initialize != null) {
            initialize.accept(this);
        }

        Expression condition = forStmt.getCondition();
        if (condition != null) {
            condition.accept(this);
        }

        AssignmentStmt update = forStmt.getUpdate();
        if (update != null) {
            update.accept(this);
        }

        Statement body = forStmt.getBody();
        if (body != null) {
            body.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        System.out.println(binaryExpression.toString());

        Expression firstOperand = binaryExpression.getFirstOperand();
        if (firstOperand != null) {
            firstOperand.accept(this);
        }

        Expression secondOperand = binaryExpression.getSecondOperand();
        if (secondOperand != null) {
            secondOperand.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        System.out.println(unaryExpression.toString());
        Expression operand = unaryExpression.getOperand();
        if (operand != null) {
            operand.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ObjectOrListMemberAccess objectOrListMemberAccess) {
        System.out.println(objectOrListMemberAccess.toString());

        Expression instance = objectOrListMemberAccess.getInstance();
        if (instance != null) {
            instance.accept(this);
        }

        Identifier memberName = objectOrListMemberAccess.getMemberName();
        if (memberName != null) {
            memberName.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        System.out.println(identifier.toString());
        return null;
    }

    @Override
    public Void visit(ListAccessByIndex listAccessByIndex) {
        System.out.println(listAccessByIndex.toString());

        Expression instance = listAccessByIndex.getInstance();
        if (instance != null) {
            instance.accept(this);
        }

        Expression index = arrayCall.getIndex();
        if (index != null) {
            index.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(MethodCall methodCall) {
        System.out.println(methodCall.toString());

        Expression instance = methodCall.getInstance();
        if(instance != null) {
            instance.accept(this);
        }

        ArrayList<Expression> args = methodCall.getArgs();
        if(args != null) {
            for (Expression arg : args) {
                arg.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(NewClassInstance newClassInstance) {
        System.out.println(newClassInstance.toString());

        ArrayList<Expression> args = newClassInstance.getArgs();
        if(args != null) {
            for (Expression arg : args) {
                arg.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(ThisClass thisClass) {
        System.out.println(thisClass.toString());
        return null;
    }

    @Override
    public Void visit(ListValue listValue) {
        System.out.println(listValue.toString());

        ArrayList<Expression> elements = listValue.getElements();
        if(elements != null) {
            for (Expression element : elements) {
                element.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(NullValue nullValue) {
        System.out.println(nullValue.toString());
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        System.out.println(intValue.toString());
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        System.out.println(boolValue.toString());
        return null;
    }

    @Override
    public Void visit(StringValue stringValue) {
        System.out.println(stringValue.toString());
        return null;
    }

}
