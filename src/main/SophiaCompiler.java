package main;

import main.ast.nodes.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parsers.SophiaLexer;
import parsers.SophiaParser;
import main.visitor.ASTTreePrinter;
import main.visitor.NameAnalyzer;
import main.visitor.NameAnalyzer2;
import main.compilerError.CompileTimeErrors;

public class SophiaCompiler {
    public void compile(CharStream textStream) {
        SophiaLexer sophiaLexer = new SophiaLexer(textStream);
        CommonTokenStream tokenStream = new CommonTokenStream(sophiaLexer);
        SophiaParser sophiaParser = new SophiaParser(tokenStream);
        Program program = sophiaParser.sophia().sophiaProgram;

        program.accept(new NameAnalyzer());
        program.accept(new NameAnalyzer2());
        if (CompileTimeErrors.hasErrors()) {
            CompileTimeErrors.print();
        } else {
            program.accept(new ASTTreePrinter());
        }
    }

}
