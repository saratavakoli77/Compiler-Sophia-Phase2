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

public class ASTTreePrinter extends Visitor<Void> {

    @Override
    public Void visit(Program program) {
        //Todo
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        //Todo
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        //Todo
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        //Todo
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        //Todo
        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        System.out.println(varDeclaration.toString());

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
        //Todo
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
        //Todo
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
        //Todo
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        System.out.println(identifier.toString());
        return null;
    }

    @Override
    public Void visit(ListAccessByIndex listAccessByIndex) {
        //Todo
        return null;
    }

    @Override
    public Void visit(MethodCall methodCall) {
        //Todo
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
        //Todo
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
