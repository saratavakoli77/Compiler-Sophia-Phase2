package main.visitor;

import java.util.*;

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
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;

import main.compileError.CompileTimeErrors;

public class NameAnalyzer2 extends Visitor {

    @Override
    public Void visit(Program program) {
        ArrayList<ClassDeclaration> classes = program.getClasses();
        
        Map<String, SymbolTableItem> allItems = SymbolTable.root.getItems();

        if (classes != null) {
            for (ClassDeclaration sophiaClass : classes) {
                HashSet<String> visitedSet = new HashSet<String>();
                String className = sophiaClass.getClassName().getName();
                visitedSet.add(ClassSymbolTableItem.START_KEY + className);
                String parentName = sophiaClass.getParentClassName().getName();
                while (parentName != null) {
                    ClassSymbolTableItem parent = (ClassSymbolTableItem) allItems.get(ClassSymbolTableItem.START_KEY + parentName);
                    if (parent == null) {
                        break;
                    }
                    if (parentName.equals(className) || visitedSet.contains(ClassSymbolTableItem.START_KEY + parentName)) {
                        CompileTimeErrors.addError(sophiaClass.getLine(),"Class " + className + " is in an inheritance cycle");
                        break;
                    }
                    visitedSet.add(ClassSymbolTableItem.START_KEY + parentName);
                    parentName = parent.getClassDeclaration().getParentClassName().getName();
                }
                
            }
        } 
        //main ?!
        if (classes != null) {
            for (ClassDeclaration sophiaClass : classes) {
                sophiaClass.accept(this);
            }
        }
    
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        Identifier parentClassName = classDeclaration.getParentClassName();
        if (parentClassName == null) {
            return null;
        }

        HashSet<String> visitedSet = new HashSet<String>();
        ArrayList<FieldDeclaration> fields = classDeclaration.getFields();

        Map<String, SymbolTableItem> allItems = SymbolTable.root.getItems();

        if (fields != null) {
            for (FieldDeclaration field : fields) {
                String parentName = parentClassName.getName();
                while (parentName != null) {
                    ClassSymbolTableItem parent = (ClassSymbolTableItem) allItems.get(ClassSymbolTableItem.START_KEY + parentName);
                    if (parent == null || parentName.equals(classDeclaration.getClassName().getName()) || visitedSet.contains(ClassSymbolTableItem.START_KEY + parentName))
                        break;
                    Map<String, SymbolTableItem> parentItems = parent.getClassSymbolTable().getItems();
                    String fieldName = field.getVarDeclaration().getVarName().getName();
                    if (parentItems.get(FieldSymbolTableItem.START_KEY + fieldName) != null) {
                        CompileTimeErrors.addError(field.getLine(), "Redefinition of field " + fieldName);
                        break;
                    }
                    visitedSet.add(ClassSymbolTableItem.START_KEY + parentName);
                    parentName = parent.getClassDeclaration().getParentClassName().getName();
                }
            }
        }

        ConstructorDeclaration constructor = classDeclaration.getConstructor();

        ArrayList<MethodDeclaration> methods = classDeclaration.getMethods();
        if (constructor != null){
            methods.add(constructor);    
        }

        visitedSet = new HashSet<String>();
        
        if (methods != null) {
            for (MethodDeclaration method : methods) {
                String parentName = parentClassName.getName();
                while (parentName != null) {
                    ClassSymbolTableItem parent = (ClassSymbolTableItem) allItems.get(ClassSymbolTableItem.START_KEY + parentName);
                    if (parent == null || parentName.equals(classDeclaration.getClassName().getName()) || visitedSet.contains(ClassSymbolTableItem.START_KEY + parentName))
                        break;
                    Map<String, SymbolTableItem> parentItems = parent.getClassSymbolTable().getItems();
                    String methodName = method.getMethodName().getName();
                    if (parentItems.get(FieldSymbolTableItem.START_KEY + methodName) != null) {
                        CompileTimeErrors.addError(method.getLine(), "Name of method " + methodName + " conflicts with a field's name");
                        break;
                    }
                    if (parentItems.get(MethodSymbolTableItem.START_KEY + methodName) != null) {
                        CompileTimeErrors.addError(method.getLine(), "Redefinition of method " + methodName);
                        break;
                    }
                    visitedSet.add(ClassSymbolTableItem.START_KEY + parentName);
                    parentName = parent.getClassDeclaration().getParentClassName().getName();
                }
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

        ArrayList<Statement> bodyStmts = constructorDeclaration.getBody();
        if (bodyStmts != null) {
            for (Statement bodyStmt : bodyStmts) {
                bodyStmt.accept(this);
            }
        }

        MethodSymbolTableItem methodItem = new MethodSymbolTableItem(constructorDeclaration);
        methodItem.setMethodSymbolTable(SymbolTable.top);
        SymbolTable.pop();

        try {
            SymbolTable.top.put(methodItem);
        } catch (ItemAlreadyExistsException e) {
            String name = constructorDeclaration.getMethodName().getName();
            CompileTimeErrors.addError(constructorDeclaration.getLine(), "Redefinition of method " + name);
        }

        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        SymbolTable.push(new SymbolTable(SymbolTable.top));

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

        ArrayList<Statement> bodyStmts = methodDeclaration.getBody();
        if (bodyStmts != null) {
            for (Statement bodyStmt : bodyStmts) {
                bodyStmt.accept(this);
            }
        }

        MethodSymbolTableItem methodItem = new MethodSymbolTableItem(methodDeclaration);
        methodItem.setMethodSymbolTable(SymbolTable.top);
        SymbolTable.pop();

        try {
            SymbolTable.top.put(methodItem);
        } catch (ItemAlreadyExistsException e) {
            String name = methodDeclaration.getMethodName().getName();
            CompileTimeErrors.addError(methodDeclaration.getLine(), "Redefinition of method " + name);
        }

        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        
        //type accept nadare
        VarDeclaration varDeclaration = fieldDeclaration.getVarDeclaration();
        if (varDeclaration != null) {
            varDeclaration.accept(this);
        }

        FieldSymbolTableItem fieldItem = new FieldSymbolTableItem(fieldDeclaration);

        try {
            SymbolTable.top.put(fieldItem);
        } catch (ItemAlreadyExistsException e) {
            String name = fieldDeclaration.getVarDeclaration().getVarName().getName();
            CompileTimeErrors.addError(fieldDeclaration.getLine(), "Redefinition of field " + name);
        }

        // fieldItem.setType(fieldDeclaration.getVarDeclaration().getType());

        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        //type accept nadare
        Identifier varName = varDeclaration.getVarName();
        if (varName != null) {
            varName.accept(this);
        }

        LocalVariableSymbolTableItem localVariableItem = new LocalVariableSymbolTableItem(varDeclaration);

        try {
            SymbolTable.top.put(localVariableItem);
        } catch (ItemAlreadyExistsException e) {
            String name = varDeclaration.getVarName().getName();
            CompileTimeErrors.addError(varDeclaration.getLine(), "Redefinition of local variable " + name);
        }

        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {

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

        MethodCall methodCall = methodCallStmt.getMethodCall();
        if (methodCall != null) {
            methodCall.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(PrintStmt print) {

        Expression arg = print.getArg();
        if (arg != null) {
            arg.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {

        Expression returnedExpr = returnStmt.getReturnedExpr();
        if (returnedExpr != null) {
            returnedExpr.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(BreakStmt breakStmt) {
        return null;
    }

    @Override
    public Void visit(ContinueStmt continueStmt) {
        return null;
    }

    @Override
    public Void visit(ForeachStmt foreachStmt) {

        Identifier variable = foreachStmt.getVariable();
        if (variable != null) {
            variable.accept(this);
        }

        Expression list = foreachStmt.getList();
        if (list != null) {
            list.accept(this);
        }

        Statement body = foreachStmt.getBody();
        if (body != null) {
            body.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ForStmt forStmt) {

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
        Expression operand = unaryExpression.getOperand();
        if (operand != null) {
            operand.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ObjectOrListMemberAccess objectOrListMemberAccess) {

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
        return null;
    }

    @Override
    public Void visit(ListAccessByIndex listAccessByIndex) {

        Expression instance = listAccessByIndex.getInstance();
        if (instance != null) {
            instance.accept(this);
        }

        Expression index = listAccessByIndex.getIndex();
        if (index != null) {
            index.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(MethodCall methodCall) {

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
        return null;
    }

    @Override
    public Void visit(ListValue listValue) {

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
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        return null;
    }

    @Override
    public Void visit(StringValue stringValue) {
        return null;
    }

}
