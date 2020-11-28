// Generated from /home/ghazal/Documents/7th_Semester/compiler/CAs/phase2/Sophia-Phase2/src/main/grammar/Sophia.g4 by ANTLR 4.8
package parsers;

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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SophiaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, EXTENDS=2, CLASS=3, PRINT=4, FUNC=5, NEW=6, CONTINUE=7, BREAK=8, 
		RETURN=9, FOREACH=10, IN=11, FOR=12, IF=13, ELSE=14, BOOLEAN=15, STRING=16, 
		INT=17, VOID=18, NULL=19, LIST=20, TRUE=21, FALSE=22, THIS=23, ARROW=24, 
		GREATER_THAN=25, LESS_THAN=26, NOT_EQUAL=27, EQUAL=28, MULT=29, DIVIDE=30, 
		MOD=31, PLUS=32, MINUS=33, AND=34, OR=35, NOT=36, QUESTION_MARK=37, ASSIGN=38, 
		INCREMENT=39, DECREMENT=40, LPAR=41, RPAR=42, LBRACK=43, RBRACK=44, LBRACE=45, 
		RBRACE=46, SHARP=47, COMMA=48, DOT=49, COLON=50, SEMICOLLON=51, INT_VALUE=52, 
		IDENTIFIER=53, STRING_VALUE=54, COMMENT=55, WS=56;
	public static final int
		RULE_sophia = 0, RULE_program = 1, RULE_sophiaClass = 2, RULE_varDeclaration = 3, 
		RULE_method = 4, RULE_constructor = 5, RULE_methodArguments = 6, RULE_variableWithType = 7, 
		RULE_type = 8, RULE_classType = 9, RULE_listType = 10, RULE_listItemsTypes = 11, 
		RULE_listItemType = 12, RULE_functionPointerType = 13, RULE_typesWithComma = 14, 
		RULE_primitiveDataType = 15, RULE_methodBody = 16, RULE_statement = 17, 
		RULE_block = 18, RULE_assignmentStatement = 19, RULE_assignment = 20, 
		RULE_printStatement = 21, RULE_returnStatement = 22, RULE_methodCallStatement = 23, 
		RULE_methodCall = 24, RULE_methodCallArguments = 25, RULE_continueBreakStatement = 26, 
		RULE_forStatement = 27, RULE_foreachStatement = 28, RULE_ifStatement = 29, 
		RULE_expression = 30, RULE_orExpression = 31, RULE_andExpression = 32, 
		RULE_equalityExpression = 33, RULE_relationalExpression = 34, RULE_additiveExpression = 35, 
		RULE_multiplicativeExpression = 36, RULE_preUnaryExpression = 37, RULE_postUnaryExpression = 38, 
		RULE_accessExpression = 39, RULE_otherExpression = 40, RULE_newExpression = 41, 
		RULE_values = 42, RULE_boolValue = 43, RULE_listValue = 44, RULE_identifier = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"sophia", "program", "sophiaClass", "varDeclaration", "method", "constructor", 
			"methodArguments", "variableWithType", "type", "classType", "listType", 
			"listItemsTypes", "listItemType", "functionPointerType", "typesWithComma", 
			"primitiveDataType", "methodBody", "statement", "block", "assignmentStatement", 
			"assignment", "printStatement", "returnStatement", "methodCallStatement", 
			"methodCall", "methodCallArguments", "continueBreakStatement", "forStatement", 
			"foreachStatement", "ifStatement", "expression", "orExpression", "andExpression", 
			"equalityExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"preUnaryExpression", "postUnaryExpression", "accessExpression", "otherExpression", 
			"newExpression", "values", "boolValue", "listValue", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'extends'", "'class'", "'print'", "'func'", "'new'", 
			"'continue'", "'break'", "'return'", "'foreach'", "'in'", "'for'", "'if'", 
			"'else'", "'bool'", "'string'", "'int'", "'void'", "'null'", "'list'", 
			"'true'", "'false'", "'this'", "'->'", "'>'", "'<'", "'!='", "'=='", 
			"'*'", "'/'", "'%'", "'+'", "'-'", "'&&'", "'||'", "'!'", "'?'", "'='", 
			"'++'", "'--'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'#'", "','", 
			"'.'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "EXTENDS", "CLASS", "PRINT", "FUNC", "NEW", "CONTINUE", 
			"BREAK", "RETURN", "FOREACH", "IN", "FOR", "IF", "ELSE", "BOOLEAN", "STRING", 
			"INT", "VOID", "NULL", "LIST", "TRUE", "FALSE", "THIS", "ARROW", "GREATER_THAN", 
			"LESS_THAN", "NOT_EQUAL", "EQUAL", "MULT", "DIVIDE", "MOD", "PLUS", "MINUS", 
			"AND", "OR", "NOT", "QUESTION_MARK", "ASSIGN", "INCREMENT", "DECREMENT", 
			"LPAR", "RPAR", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "SHARP", "COMMA", 
			"DOT", "COLON", "SEMICOLLON", "INT_VALUE", "IDENTIFIER", "STRING_VALUE", 
			"COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Sophia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SophiaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SophiaContext extends ParserRuleContext {
		public Program sophiaProgram;
		public ProgramContext program;
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SophiaParser.EOF, 0); }
		public SophiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sophia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSophia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSophia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSophia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SophiaContext sophia() throws RecognitionException {
		SophiaContext _localctx = new SophiaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sophia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((SophiaContext)_localctx).sophiaProgram =  new Program(); 
			setState(93);
			((SophiaContext)_localctx).program = program();
			 ((SophiaContext)_localctx).sophiaProgram =  ((SophiaContext)_localctx).program.p; 
			setState(95);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program p;
		public SophiaClassContext sophiaClass;
		public List<SophiaClassContext> sophiaClass() {
			return getRuleContexts(SophiaClassContext.class);
		}
		public SophiaClassContext sophiaClass(int i) {
			return getRuleContext(SophiaClassContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ProgramContext)_localctx).p =  new Program(); 
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(98);
				((ProgramContext)_localctx).sophiaClass = sophiaClass();
				 _localctx.p.addClass(((ProgramContext)_localctx).sophiaClass.dec; ); 
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SophiaClassContext extends ParserRuleContext {
		public ClassDeclaration dec;
		public Token CLASS;
		public IdentifierContext identifier;
		public VarDeclarationContext varDeclaration;
		public MethodContext method;
		public ConstructorContext constructor;
		public TerminalNode CLASS() { return getToken(SophiaParser.CLASS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TerminalNode EXTENDS() { return getToken(SophiaParser.EXTENDS, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public SophiaClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sophiaClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSophiaClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSophiaClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSophiaClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SophiaClassContext sophiaClass() throws RecognitionException {
		SophiaClassContext _localctx = new SophiaClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sophiaClass);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((SophiaClassContext)_localctx).CLASS = match(CLASS);
			setState(107);
			((SophiaClassContext)_localctx).identifier = identifier();
			 ((SophiaClassContext)_localctx).dec =  new ClassDeclaration(((SophiaClassContext)_localctx).identifier.id); _localctx.dec.setLine(((SophiaClassContext)_localctx).CLASS.gitLine()); 
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(109);
				match(EXTENDS);
				setState(110);
				((SophiaClassContext)_localctx).identifier = identifier();
				 _localctx.dec.setParent(((SophiaClassContext)_localctx).identifier.id); 
				}
			}

			setState(115);
			match(LBRACE);
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				{
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(122);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
							{
							setState(116);
							((SophiaClassContext)_localctx).varDeclaration = varDeclaration();
							 _localctx.dec.addField(new FieldDeclaration(((SophiaClassContext)_localctx).varDeclaration.dec)); 
							}
							break;
						case DEF:
							{
							setState(119);
							((SophiaClassContext)_localctx).method = method();
							 _localctx.dec.addMethod(((SophiaClassContext)_localctx).method.dec); 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				{
				setState(127);
				((SophiaClassContext)_localctx).constructor = constructor();
				 _localctx.dec.setConstructor(((SophiaClassContext)_localctx).constructor.dec); 
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DEF || _la==IDENTIFIER) {
					{
					setState(136);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(130);
						((SophiaClassContext)_localctx).varDeclaration = varDeclaration();
						 _localctx.dec.addField(new FieldDeclaration(((SophiaClassContext)_localctx).varDeclaration.dec)); 
						}
						break;
					case DEF:
						{
						setState(133);
						((SophiaClassContext)_localctx).method = method();
						 _localctx.dec.addMethod(((SophiaClassContext)_localctx).method.dec); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DEF || _la==IDENTIFIER) {
					{
					setState(147);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(141);
						((SophiaClassContext)_localctx).varDeclaration = varDeclaration();
						 _localctx.dec.addField(new FieldDeclaration(((SophiaClassContext)_localctx).varDeclaration.dec)); 
						}
						break;
					case DEF:
						{
						setState(144);
						((SophiaClassContext)_localctx).method = method();
						 _localctx.dec.addMethod(((SophiaClassContext)_localctx).method.dec); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(154);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclaration dec;
		public IdentifierContext identifier;
		public TypeContext type;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SophiaParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			((VarDeclarationContext)_localctx).identifier = identifier();
			setState(157);
			match(COLON);
			setState(158);
			((VarDeclarationContext)_localctx).type = type();
			 
			        ((VarDeclarationContext)_localctx).dec =  new VarDeclaration(((VarDeclarationContext)_localctx).identifier.id, ((VarDeclarationContext)_localctx).type.t); 
			        _localctx.dec.setLine(((VarDeclarationContext)_localctx).identifier.id.getLine()) 
			    
			setState(160);
			match(SEMICOLLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public MethodDeclaration dec;
		public Type t;
		public Token DEF;
		public IdentifierContext identifier;
		public MethodArgumentsContext methodArguments;
		public MethodBodyContext methodBody;
		public TerminalNode DEF() { return getToken(SophiaParser.DEF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SophiaParser.VOID, 0); }
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			((MethodContext)_localctx).DEF = match(DEF);
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				setState(163);
				type();
				 ((MethodContext)_localctx).t =  type.t; 
				}
				break;
			case VOID:
				{
				setState(166);
				match(VOID);
				 ((MethodContext)_localctx).t =  new NullType(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(170);
			((MethodContext)_localctx).identifier = identifier();
			 ((MethodContext)_localctx).dec =  new MethodDeclaration(((MethodContext)_localctx).identifier.id, _localctx.t); _localctx.dec.setLine(((MethodContext)_localctx).DEF.getLine()); 
			setState(172);
			match(LPAR);
			{
			setState(173);
			((MethodContext)_localctx).methodArguments = methodArguments();
			 _localctx.dec.setArgs(((MethodContext)_localctx).methodArguments.decs); 
			}
			setState(176);
			match(RPAR);
			setState(177);
			match(LBRACE);
			setState(178);
			((MethodContext)_localctx).methodBody = methodBody();
			 _localctx.dec.setLocalVars(((MethodContext)_localctx).methodBody.decs); _localctx.dec.setBody(((MethodContext)_localctx).methodBody.stmts); 
			setState(180);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorContext extends ParserRuleContext {
		public ConstructorDeclaration dec;
		public Token DEF;
		public IdentifierContext identifier;
		public MethodArgumentsContext methodArguments;
		public MethodBodyContext methodBody;
		public TerminalNode DEF() { return getToken(SophiaParser.DEF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			((ConstructorContext)_localctx).DEF = match(DEF);
			setState(183);
			((ConstructorContext)_localctx).identifier = identifier();
			 ((ConstructorContext)_localctx).dec =  new ConstructorDeclaration(((ConstructorContext)_localctx).identifier.id); _localctx.dec.setLine(((ConstructorContext)_localctx).DEF.getLine()); 
			setState(185);
			match(LPAR);
			{
			setState(186);
			((ConstructorContext)_localctx).methodArguments = methodArguments();
			 _localctx.dec.setArgs(((ConstructorContext)_localctx).methodArguments.decs); 
			}
			setState(189);
			match(RPAR);
			setState(190);
			match(LBRACE);
			setState(191);
			((ConstructorContext)_localctx).methodBody = methodBody();
			 _localctx.dec.setLocalVars(((ConstructorContext)_localctx).methodBody.decs); _localctx.dec.setBody(((ConstructorContext)_localctx).methodBody.stmts); 
			setState(193);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodArgumentsContext extends ParserRuleContext {
		public ArrayList<VarDeclaration> decs;
		public List<VariableWithTypeContext> variableWithType() {
			return getRuleContexts(VariableWithTypeContext.class);
		}
		public VariableWithTypeContext variableWithType(int i) {
			return getRuleContext(VariableWithTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public MethodArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgumentsContext methodArguments() throws RecognitionException {
		MethodArgumentsContext _localctx = new MethodArgumentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MethodArgumentsContext)_localctx).decs =  new ArrayList<VarDeclaration>(); 
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(196);
				variableWithType();
				 _localctx.decs.add(variableWithType.dec); 
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(198);
					match(COMMA);
					setState(199);
					variableWithType();
					 _localctx.decs.add(variableWithType.dec); 
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableWithTypeContext extends ParserRuleContext {
		public VarDeclaration dec;
		public IdentifierContext identifier;
		public TypeContext type;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SophiaParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableWithTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableWithType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterVariableWithType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitVariableWithType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitVariableWithType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableWithTypeContext variableWithType() throws RecognitionException {
		VariableWithTypeContext _localctx = new VariableWithTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableWithType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			((VariableWithTypeContext)_localctx).identifier = identifier();
			setState(210);
			match(COLON);
			setState(211);
			((VariableWithTypeContext)_localctx).type = type();
			 ((VariableWithTypeContext)_localctx).dec =  new VarDeclaration(((VariableWithTypeContext)_localctx).identifier.id, ((VariableWithTypeContext)_localctx).type.t); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type t;
		public PrimitiveDataTypeContext primitiveDataType;
		public ListTypeContext listType;
		public FunctionPointerTypeContext functionPointerType;
		public ClassTypeContext classType;
		public PrimitiveDataTypeContext primitiveDataType() {
			return getRuleContext(PrimitiveDataTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public FunctionPointerTypeContext functionPointerType() {
			return getRuleContext(FunctionPointerTypeContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case STRING:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				((TypeContext)_localctx).primitiveDataType = primitiveDataType();
				 ((TypeContext)_localctx).t =  ((TypeContext)_localctx).primitiveDataType.t; 
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				((TypeContext)_localctx).listType = listType();
				 ((TypeContext)_localctx).t =  ((TypeContext)_localctx).listType.t; 
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				((TypeContext)_localctx).functionPointerType = functionPointerType();
				 ((TypeContext)_localctx).t =  ((TypeContext)_localctx).functionPointerType.t; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				((TypeContext)_localctx).classType = classType();
				 ((TypeContext)_localctx).t =  ((TypeContext)_localctx).classType.t; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public ClassType t;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			identifier();
			 ((ClassTypeContext)_localctx).t =  identifier.id; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListTypeContext extends ParserRuleContext {
		public ListType t;
		public Token INT_VALUE;
		public TypeContext type;
		public ListItemsTypesContext listItemsTypes;
		public TerminalNode LIST() { return getToken(SophiaParser.LIST, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode INT_VALUE() { return getToken(SophiaParser.INT_VALUE, 0); }
		public TerminalNode SHARP() { return getToken(SophiaParser.SHARP, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListItemsTypesContext listItemsTypes() {
			return getRuleContext(ListItemsTypesContext.class,0);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(LIST);
			setState(232);
			match(LPAR);
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VALUE:
				{
				{
				setState(233);
				((ListTypeContext)_localctx).INT_VALUE = match(INT_VALUE);
				setState(234);
				match(SHARP);
				setState(235);
				((ListTypeContext)_localctx).type = type();
				}
				 ((ListTypeContext)_localctx).t =  new ListType((((ListTypeContext)_localctx).INT_VALUE!=null?Integer.valueOf(((ListTypeContext)_localctx).INT_VALUE.getText()):0), ((ListTypeContext)_localctx).type.t); 
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				{
				setState(239);
				((ListTypeContext)_localctx).listItemsTypes = listItemsTypes();
				 ((ListTypeContext)_localctx).t =  new ListType(((ListTypeContext)_localctx).listItemsTypes.ts); 
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(244);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListItemsTypesContext extends ParserRuleContext {
		public ArrayList<ListNameType> ts;
		public ListItemTypeContext listItemType;
		public List<ListItemTypeContext> listItemType() {
			return getRuleContexts(ListItemTypeContext.class);
		}
		public ListItemTypeContext listItemType(int i) {
			return getRuleContext(ListItemTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public ListItemsTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItemsTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListItemsTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListItemsTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListItemsTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListItemsTypesContext listItemsTypes() throws RecognitionException {
		ListItemsTypesContext _localctx = new ListItemsTypesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listItemsTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			((ListItemsTypesContext)_localctx).listItemType = listItemType();
			 _localctx.ts.add(((ListItemsTypesContext)_localctx).listItemType.t); 
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(248);
				match(COMMA);
				setState(249);
				((ListItemsTypesContext)_localctx).listItemType = listItemType();
				 _localctx.ts.add(((ListItemsTypesContext)_localctx).listItemType.t); 
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListItemTypeContext extends ParserRuleContext {
		public ListNameType t;
		public VariableWithTypeContext variableWithType;
		public TypeContext type;
		public VariableWithTypeContext variableWithType() {
			return getRuleContext(VariableWithTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListItemTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItemType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListItemType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListItemType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListItemType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListItemTypeContext listItemType() throws RecognitionException {
		ListItemTypeContext _localctx = new ListItemTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listItemType);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 _localctx.t = new ArrayList<ListNameType>() 
				setState(258);
				((ListItemTypeContext)_localctx).variableWithType = variableWithType();
				 ((ListItemTypeContext)_localctx).t =  new ListNameType(((ListItemTypeContext)_localctx).variableWithType.dec); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				((ListItemTypeContext)_localctx).type = type();
				 ((ListItemTypeContext)_localctx).t =  new ListNameType(((ListItemTypeContext)_localctx).type.t); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionPointerTypeContext extends ParserRuleContext {
		public FptrType t;
		public ArrayList<Type> argumentsTypes;
		public Type returnType;
		public TerminalNode FUNC() { return getToken(SophiaParser.FUNC, 0); }
		public TerminalNode LESS_THAN() { return getToken(SophiaParser.LESS_THAN, 0); }
		public TerminalNode ARROW() { return getToken(SophiaParser.ARROW, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SophiaParser.GREATER_THAN, 0); }
		public List<TerminalNode> VOID() { return getTokens(SophiaParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(SophiaParser.VOID, i);
		}
		public TypesWithCommaContext typesWithComma() {
			return getRuleContext(TypesWithCommaContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionPointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterFunctionPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitFunctionPointerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitFunctionPointerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionPointerTypeContext functionPointerType() throws RecognitionException {
		FunctionPointerTypeContext _localctx = new FunctionPointerTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionPointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionPointerTypeContext)_localctx).argumentsTypes =  new ArrayList<type>(); 
			setState(267);
			match(FUNC);
			setState(268);
			match(LESS_THAN);
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(269);
				match(VOID);
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				setState(270);
				typesWithComma();
				 ((FunctionPointerTypeContext)_localctx).argumentsTypes =  typesWithComma.ts; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(275);
			match(ARROW);
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(276);
				match(VOID);
				 ((FunctionPointerTypeContext)_localctx).returnType =  new NullType(); 
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				setState(278);
				type();
				 ((FunctionPointerTypeContext)_localctx).returnType =  type.t; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(283);
			match(GREATER_THAN);
			 ((FunctionPointerTypeContext)_localctx).t =  new FptrType(argumentsTypes, returnType); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypesWithCommaContext extends ParserRuleContext {
		public ArrayList<Type> ts;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public TypesWithCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesWithComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterTypesWithComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitTypesWithComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitTypesWithComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesWithCommaContext typesWithComma() throws RecognitionException {
		TypesWithCommaContext _localctx = new TypesWithCommaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typesWithComma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((TypesWithCommaContext)_localctx).ts =  new ArrayList<type>(); 
			setState(287);
			type();
			 _localctx.ts.add(type.t); 
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(289);
				match(COMMA);
				setState(290);
				type();
				 _localctx.ts.add(type.t); 
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveDataTypeContext extends ParserRuleContext {
		public Type t;
		public Token INT;
		public Token STRING;
		public Token BOOLEAN;
		public TerminalNode INT() { return getToken(SophiaParser.INT, 0); }
		public TerminalNode STRING() { return getToken(SophiaParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(SophiaParser.BOOLEAN, 0); }
		public PrimitiveDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveDataTypeContext primitiveDataType() throws RecognitionException {
		PrimitiveDataTypeContext _localctx = new PrimitiveDataTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primitiveDataType);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				((PrimitiveDataTypeContext)_localctx).INT = match(INT);
				 ((PrimitiveDataTypeContext)_localctx).t =  new IntType(); _localctx.t.setLine(((PrimitiveDataTypeContext)_localctx).INT.getLine()); 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				((PrimitiveDataTypeContext)_localctx).STRING = match(STRING);
				 ((PrimitiveDataTypeContext)_localctx).t =  new StringType(); _localctx.t.setLine(((PrimitiveDataTypeContext)_localctx).STRING.getLine()); 
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				((PrimitiveDataTypeContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((PrimitiveDataTypeContext)_localctx).t =  new BoolType(); _localctx.t.setLine(((PrimitiveDataTypeContext)_localctx).BOOLEAN.getLine()); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public ArrayList<VarDeclaration> decs;
		public ArrayList<Statement> stmts;
		public VarDeclarationContext varDeclaration;
		public StatementContext statement;
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 ((MethodBodyContext)_localctx).decs =  new ArrayList<VarDeclaration>(); ((MethodBodyContext)_localctx).stmts =  new ArrayList<Statement>(); 
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					((MethodBodyContext)_localctx).varDeclaration = varDeclaration();
					 _localctx.decs.add(((MethodBodyContext)_localctx).varDeclaration.dec); 
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NEW) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << FOREACH) | (1L << FOR) | (1L << IF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << LBRACE) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				{
				setState(315);
				((MethodBodyContext)_localctx).statement = statement();
				 _localctx.stmts.add(((MethodBodyContext)_localctx).statement.stmt); 
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Statement stmt;
		public ForStatementContext forStatement;
		public ForeachStatementContext foreachStatement;
		public IfStatementContext ifStatement;
		public AssignmentStatementContext assignmentStatement;
		public PrintStatementContext printStatement;
		public ContinueBreakStatementContext continueBreakStatement;
		public MethodCallStatementContext methodCallStatement;
		public ReturnStatementContext returnStatement;
		public BlockContext block;
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ContinueBreakStatementContext continueBreakStatement() {
			return getRuleContext(ContinueBreakStatementContext.class,0);
		}
		public MethodCallStatementContext methodCallStatement() {
			return getRuleContext(MethodCallStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				((StatementContext)_localctx).forStatement = forStatement();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).forStatement.stmt; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				((StatementContext)_localctx).foreachStatement = foreachStatement();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).foreachStatement.stmt; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				((StatementContext)_localctx).ifStatement = ifStatement();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).ifStatement.stmt; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				((StatementContext)_localctx).assignmentStatement = assignmentStatement();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).assignmentStatement.stmt; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				((StatementContext)_localctx).printStatement = printStatement();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).printStatement.stmt; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
				((StatementContext)_localctx).continueBreakStatement = continueBreakStatement();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).continueBreakStatement.stmt; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(341);
				((StatementContext)_localctx).methodCallStatement = methodCallStatement();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).methodCallStatement.stmt; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(344);
				((StatementContext)_localctx).returnStatement = returnStatement();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).returnStatement.stmt; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(347);
				((StatementContext)_localctx).block = block();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).block.stmt; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockStmt stmt;
		public Token LBRACE;
		public StatementContext statement;
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			((BlockContext)_localctx).LBRACE = match(LBRACE);
			 ((BlockContext)_localctx).stmt =  new BlockStmt(); _localctx.stmt.setLine(((BlockContext)_localctx).LBRACE.getLine()); 
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NEW) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << FOREACH) | (1L << FOR) | (1L << IF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << LBRACE) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				{
				setState(354);
				((BlockContext)_localctx).statement = statement();
				 _localctx.stmt.add(((BlockContext)_localctx).statement.stmt); 
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentStatement stmt;
		public AssignmentContext assignment;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			((AssignmentStatementContext)_localctx).assignment = assignment();
			setState(365);
			match(SEMICOLLON);
			 
			        ((AssignmentStatementContext)_localctx).stmt =  new AssignmentStatement(((AssignmentStatementContext)_localctx).assignment.lVal, ((AssignmentStatementContext)_localctx).assignment.rVal); 
			        _localctx.stmt.setLine(((AssignmentStatementContext)_localctx).assignment.line); 
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Expression lVal;
		public Expression rVal;
		public int line;
		public OrExpressionContext orExpression;
		public Token ASSIGN;
		public ExpressionContext expression;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SophiaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			((AssignmentContext)_localctx).orExpression = orExpression();
			 ((AssignmentContext)_localctx).lVal =  ((AssignmentContext)_localctx).orExpression.exp; 
			setState(370);
			((AssignmentContext)_localctx).ASSIGN = match(ASSIGN);
			 ((AssignmentContext)_localctx).line =  ((AssignmentContext)_localctx).ASSIGN.getLine(); 
			setState(372);
			((AssignmentContext)_localctx).expression = expression();
			 ((AssignmentContext)_localctx).rVal =  ((AssignmentContext)_localctx).expression.exp; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStmt stmt;
		public Token PRINT;
		public ExpressionContext expression;
		public TerminalNode PRINT() { return getToken(SophiaParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			((PrintStatementContext)_localctx).PRINT = match(PRINT);
			setState(376);
			match(LPAR);
			setState(377);
			((PrintStatementContext)_localctx).expression = expression();
			setState(378);
			match(RPAR);
			setState(379);
			match(SEMICOLLON);
			 ((PrintStatementContext)_localctx).stmt =  new PrintStmt(((PrintStatementContext)_localctx).expression.exp); _localctx.stmt.setLine(((PrintStatementContext)_localctx).PRINT.getLine()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStmt stmt;
		public Token RETURN;
		public ExpressionContext expression;
		public TerminalNode RETURN() { return getToken(SophiaParser.RETURN, 0); }
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			((ReturnStatementContext)_localctx).RETURN = match(RETURN);
			 ((ReturnStatementContext)_localctx).stmt =  new ReturnStmt(); _localctx.stmt.setLine(((ReturnStatementContext)_localctx).RETURN.getLine()); 
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(384);
				((ReturnStatementContext)_localctx).expression = expression();
				 _localctx.stmt.setReturnedExpr(((ReturnStatementContext)_localctx).expression.exp); 
				}
			}

			setState(389);
			match(SEMICOLLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallStatementContext extends ParserRuleContext {
		public MethodCallStmt stmt;
		public MethodCallContext methodCall;
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public MethodCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallStatementContext methodCallStatement() throws RecognitionException {
		MethodCallStatementContext _localctx = new MethodCallStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			((MethodCallStatementContext)_localctx).methodCall = methodCall();
			 
			        stmt = MethodCallStmt(((MethodCallStatementContext)_localctx).methodCall.exp); 
			        stmt.setLine(((MethodCallStatementContext)_localctx).methodCall.exp.getLine()); 
			    
			setState(393);
			match(SEMICOLLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public MethodCall exp;
		public OtherExpressionContext otherExpression;
		public Token LPAR;
		public MethodCallArgumentsContext methodCallArguments;
		public IdentifierContext identifier;
		public Token LBRACK;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(SophiaParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SophiaParser.LPAR, i);
		}
		public List<MethodCallArgumentsContext> methodCallArguments() {
			return getRuleContexts(MethodCallArgumentsContext.class);
		}
		public MethodCallArgumentsContext methodCallArguments(int i) {
			return getRuleContext(MethodCallArgumentsContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SophiaParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SophiaParser.RPAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SophiaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SophiaParser.DOT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SophiaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SophiaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SophiaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SophiaParser.RBRACK, i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_methodCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			((MethodCallContext)_localctx).otherExpression = otherExpression();
			 ((MethodCallContext)_localctx).exp =  ((MethodCallContext)_localctx).otherExpression.exp; 
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(411);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(397);
						((MethodCallContext)_localctx).LPAR = match(LPAR);
						setState(398);
						((MethodCallContext)_localctx).methodCallArguments = methodCallArguments();
						setState(399);
						match(RPAR);
						 
						                ((MethodCallContext)_localctx).exp =  new MethodCall(((MethodCallContext)_localctx).otherExpression.exp, ((MethodCallContext)_localctx).methodCallArguments.exps);
						                _localctx.exp.setLine(((MethodCallContext)_localctx).LPAR.getLine());
						            
						}
						}
						break;
					case DOT:
						{
						{
						setState(402);
						match(DOT);
						setState(403);
						((MethodCallContext)_localctx).identifier = identifier();
						 
						                ((MethodCallContext)_localctx).exp =  new ObjectOrListMemberAccess(((MethodCallContext)_localctx).otherExpression.exp, ((MethodCallContext)_localctx).identifier.id); 
						                _localctx.exp.setLine(((MethodCallContext)_localctx).identifier.id.getLine()); 
						            
						}
						}
						break;
					case LBRACK:
						{
						{
						setState(406);
						((MethodCallContext)_localctx).LBRACK = match(LBRACK);
						setState(407);
						expression();
						setState(408);
						match(RBRACK);
						 
						                ((MethodCallContext)_localctx).exp =  new ListAccessByIndex(((MethodCallContext)_localctx).otherExpression.exp, expression.exp); 
						                _localctx.exp.setLine(((MethodCallContext)_localctx).LBRACK.getLine());
						            
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			{
			setState(416);
			((MethodCallContext)_localctx).LPAR = match(LPAR);
			setState(417);
			((MethodCallContext)_localctx).methodCallArguments = methodCallArguments();
			setState(418);
			match(RPAR);
			}
			 
			        ((MethodCallContext)_localctx).exp =  new MethodCall(_localctx.exp, ((MethodCallContext)_localctx).methodCallArguments.exps);
			        _localctx.exp.setLine(((MethodCallContext)_localctx).LPAR.getLine()); 
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallArgumentsContext extends ParserRuleContext {
		public ArrayList<Expression> exps;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public MethodCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallArgumentsContext methodCallArguments() throws RecognitionException {
		MethodCallArgumentsContext _localctx = new MethodCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodCallArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MethodCallArgumentsContext)_localctx).exps =  new ArrayList<Expression>(); 
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(423);
				((MethodCallArgumentsContext)_localctx).expression = expression();
				 _localctx.exps.add(((MethodCallArgumentsContext)_localctx).expression.exp); 
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(425);
					match(COMMA);
					setState(426);
					((MethodCallArgumentsContext)_localctx).expression = expression();
					 _localctx.exps.add(((MethodCallArgumentsContext)_localctx).expression.exp); 
					}
					}
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueBreakStatementContext extends ParserRuleContext {
		public Statement stmt;
		public Token BREAK;
		public Token CONTINUE;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public TerminalNode BREAK() { return getToken(SophiaParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(SophiaParser.CONTINUE, 0); }
		public ContinueBreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueBreakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterContinueBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitContinueBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitContinueBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueBreakStatementContext continueBreakStatement() throws RecognitionException {
		ContinueBreakStatementContext _localctx = new ContinueBreakStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_continueBreakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				{
				setState(436);
				((ContinueBreakStatementContext)_localctx).BREAK = match(BREAK);
				 ((ContinueBreakStatementContext)_localctx).stmt =  new BreakStmt(); _localctx.stmt.setLine(((ContinueBreakStatementContext)_localctx).BREAK.getLine()); 
				}
				break;
			case CONTINUE:
				{
				setState(438);
				((ContinueBreakStatementContext)_localctx).CONTINUE = match(CONTINUE);
				 ((ContinueBreakStatementContext)_localctx).stmt =  new ContinueStmt(); _localctx.stmt.setLine(((ContinueBreakStatementContext)_localctx).CONTINUE.getLine()); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(442);
			match(SEMICOLLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public ForStmt stmt;
		public Token FOR;
		public AssignmentContext initStmt;
		public ExpressionContext expression;
		public AssignmentContext updateStmt;
		public StatementContext bodyStmt;
		public TerminalNode FOR() { return getToken(SophiaParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public List<TerminalNode> SEMICOLLON() { return getTokens(SophiaParser.SEMICOLLON); }
		public TerminalNode SEMICOLLON(int i) {
			return getToken(SophiaParser.SEMICOLLON, i);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			((ForStatementContext)_localctx).FOR = match(FOR);
			setState(445);
			match(LPAR);
			 ((ForStatementContext)_localctx).stmt =  new ForStmt(); _localctx.stmt.setLine(((ForStatementContext)_localctx).FOR.getLine()); 
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(447);
				((ForStatementContext)_localctx).initStmt = assignment();
				 _localctx.stmt.setInitialize(new AssignmentStmt(((ForStatementContext)_localctx).initStmt.lVal, ((ForStatementContext)_localctx).initStmt.rVal)); 
				}
			}

			setState(452);
			match(SEMICOLLON);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(453);
				((ForStatementContext)_localctx).expression = expression();
				 _localctx.stmt.setInitialize(((ForStatementContext)_localctx).expression.exp); 
				}
			}

			setState(458);
			match(SEMICOLLON);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(459);
				((ForStatementContext)_localctx).updateStmt = assignment();
				 _localctx.stmt.setUpdate(new AssignmentStmt(((ForStatementContext)_localctx).updateStmt.lVal, ((ForStatementContext)_localctx).updateStmt.rVal)); 
				}
			}

			setState(464);
			match(RPAR);
			setState(465);
			((ForStatementContext)_localctx).bodyStmt = statement();
			 _localctx.stmt.setBody(((ForStatementContext)_localctx).bodyStmt.stmt); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachStatementContext extends ParserRuleContext {
		public ForeachStmt stmt;
		public Token FOREACH;
		public IdentifierContext identifier;
		public ExpressionContext expression;
		public StatementContext statement;
		public TerminalNode FOREACH() { return getToken(SophiaParser.FOREACH, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IN() { return getToken(SophiaParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitForeachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			((ForeachStatementContext)_localctx).FOREACH = match(FOREACH);
			setState(469);
			match(LPAR);
			setState(470);
			((ForeachStatementContext)_localctx).identifier = identifier();
			setState(471);
			match(IN);
			setState(472);
			((ForeachStatementContext)_localctx).expression = expression();
			setState(473);
			match(RPAR);
			 
			        ((ForeachStatementContext)_localctx).stmt =  new ForeachStmt(((ForeachStatementContext)_localctx).identifier.id, ((ForeachStatementContext)_localctx).expression.exp);
			        _localctx.stmt.setLine(((ForeachStatementContext)_localctx).FOREACH.getLine()):
			    
			setState(475);
			((ForeachStatementContext)_localctx).statement = statement();
			 _localctx.stmt.setBody(((ForeachStatementContext)_localctx).statement.stmt); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ConditionalStmt stmt;
		public Token IF;
		public ExpressionContext expression;
		public StatementContext ifStmt;
		public StatementContext elseStmt;
		public TerminalNode IF() { return getToken(SophiaParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SophiaParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			((IfStatementContext)_localctx).IF = match(IF);
			setState(479);
			match(LPAR);
			setState(480);
			((IfStatementContext)_localctx).expression = expression();
			setState(481);
			match(RPAR);
			setState(482);
			((IfStatementContext)_localctx).ifStmt = statement();

			        ((IfStatementContext)_localctx).stmt =  new ConditionalStmt(((IfStatementContext)_localctx).expression.exp, ((IfStatementContext)_localctx).ifStmt.stmt);
			        _localctx.stmt.setLine(((IfStatementContext)_localctx).IF.getLine());
			    
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(484);
				match(ELSE);
				setState(485);
				((IfStatementContext)_localctx).elseStmt = statement();
				 _localctx.stmt.setElseBody(((IfStatementContext)_localctx).elseStmt.stmt) 
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression exp;
		public OrExpressionContext orExpression;
		public Token ASSIGN;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SophiaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			((ExpressionContext)_localctx).orExpression = orExpression();
			 ((ExpressionContext)_localctx).exp =  ((ExpressionContext)_localctx).orExpression.exp; 
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(492);
				((ExpressionContext)_localctx).ASSIGN = match(ASSIGN);
				setState(493);
				expression();
				 
				            ((ExpressionContext)_localctx).exp =  new BinaryExpression(
				                _localctx.exp, 
				                ((ExpressionContext)_localctx).orExpression.exp, 
				                BinaryOperator.assign
				            ); 
				            _localctx.exp.setLine(((ExpressionContext)_localctx).ASSIGN.getLine()); 
				        
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExpressionContext extends ParserRuleContext {
		public Expression exp;
		public AndExpressionContext andExpression;
		public Token OR;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SophiaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SophiaParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			((OrExpressionContext)_localctx).andExpression = andExpression();
			 ((OrExpressionContext)_localctx).exp =  ((OrExpressionContext)_localctx).andExpression.exp; 
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(500);
				((OrExpressionContext)_localctx).OR = match(OR);
				setState(501);
				((OrExpressionContext)_localctx).andExpression = andExpression();
				 
				            ((OrExpressionContext)_localctx).exp =  new BinaryExpression(
				                _localctx.exp, 
				                ((OrExpressionContext)_localctx).andExpression.exp, 
				                BinaryOperator.or
				            ); 
				            _localctx.exp.setLine(((OrExpressionContext)_localctx).OR.getLine()); 
				        
				}
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression exp;
		public EqualityExpressionContext equalityExpression;
		public Token AND;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SophiaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SophiaParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			((AndExpressionContext)_localctx).equalityExpression = equalityExpression();
			 ((AndExpressionContext)_localctx).exp =  ((AndExpressionContext)_localctx).equalityExpression.exp; 
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(511);
				((AndExpressionContext)_localctx).AND = match(AND);
				setState(512);
				((AndExpressionContext)_localctx).equalityExpression = equalityExpression();
				 
				            ((AndExpressionContext)_localctx).exp =  new BinaryExpression(
				                _localctx.exp, 
				                ((AndExpressionContext)_localctx).equalityExpression.exp, 
				                BinaryOperator.and
				            ); 
				            _localctx.exp.setLine(((AndExpressionContext)_localctx).AND.getLine()); 
				        
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Expression exp;
		public BinaryOperator op;
		public int line;
		public RelationalExpressionContext relationalExpression;
		public Token EQUAL;
		public Token NOT_EQUAL;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(SophiaParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(SophiaParser.EQUAL, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(SophiaParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(SophiaParser.NOT_EQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			((EqualityExpressionContext)_localctx).relationalExpression = relationalExpression();
			 ((EqualityExpressionContext)_localctx).exp =  ((EqualityExpressionContext)_localctx).relationalExpression.exp; 
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT_EQUAL || _la==EQUAL) {
				{
				{
				setState(526);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(522);
					((EqualityExpressionContext)_localctx).EQUAL = match(EQUAL);
					 ((EqualityExpressionContext)_localctx).op =  BinaryOperator.eq; ((EqualityExpressionContext)_localctx).line =  ((EqualityExpressionContext)_localctx).EQUAL.getLine(); 
					}
					break;
				case NOT_EQUAL:
					{
					setState(524);
					((EqualityExpressionContext)_localctx).NOT_EQUAL = match(NOT_EQUAL);
					 ((EqualityExpressionContext)_localctx).op =  BinaryOperator.neq; ((EqualityExpressionContext)_localctx).line =  ((EqualityExpressionContext)_localctx).NOT_EQUAL.getLine(); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(528);
				((EqualityExpressionContext)_localctx).relationalExpression = relationalExpression();
				 ((EqualityExpressionContext)_localctx).exp =  new BinaryExpression(_localctx.exp, ((EqualityExpressionContext)_localctx).relationalExpression.exp, _localctx.op); _localctx.exp.setLine(_localctx.line); 
				}
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression exp;
		public BinaryOperator op;
		public int line;
		public AdditiveExpressionContext additiveExpression;
		public Token GREATER_THAN;
		public Token LESS_THAN;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(SophiaParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(SophiaParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(SophiaParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(SophiaParser.LESS_THAN, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			((RelationalExpressionContext)_localctx).additiveExpression = additiveExpression();
			 ((RelationalExpressionContext)_localctx).exp =  ((RelationalExpressionContext)_localctx).additiveExpression.exp; 
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(542);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(538);
					((RelationalExpressionContext)_localctx).GREATER_THAN = match(GREATER_THAN);
					 ((RelationalExpressionContext)_localctx).op =  BinaryOperator.gt; ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).GREATER_THAN.getLine(); 
					}
					break;
				case LESS_THAN:
					{
					setState(540);
					((RelationalExpressionContext)_localctx).LESS_THAN = match(LESS_THAN);
					 ((RelationalExpressionContext)_localctx).op =  BinaryOperator.lt; ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).LESS_THAN.getLine(); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(544);
				((RelationalExpressionContext)_localctx).additiveExpression = additiveExpression();
				 ((RelationalExpressionContext)_localctx).exp =  new BinaryExpression(_localctx.exp, ((RelationalExpressionContext)_localctx).additiveExpression.exp, _localctx.op); _localctx.exp.setLine(_localctx.line); 
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression exp;
		public BinaryOperator op;
		public int line;
		public MultiplicativeExpressionContext multiplicativeExpression;
		public Token PLUS;
		public Token MINUS;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SophiaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SophiaParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SophiaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SophiaParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression();
			 ((AdditiveExpressionContext)_localctx).exp =  ((AdditiveExpressionContext)_localctx).multiplicativeExpression.exp; 
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(558);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(554);
					((AdditiveExpressionContext)_localctx).PLUS = match(PLUS);
					 ((AdditiveExpressionContext)_localctx).op =  BinaryOperator.add; ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).PLUS.getLine(); 
					}
					break;
				case MINUS:
					{
					setState(556);
					((AdditiveExpressionContext)_localctx).MINUS = match(MINUS);
					 ((AdditiveExpressionContext)_localctx).op =  BinaryOperator.sub; ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).MINUS.getLine(); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(560);
				((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression();
				 ((AdditiveExpressionContext)_localctx).exp =  new BinaryExpression(_localctx.exp, ((AdditiveExpressionContext)_localctx).multiplicativeExpression.exp, _localctx.op); _localctx.exp.setLine(_localctx.line); 
				}
				}
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression exp;
		public UnaryOperator op;
		public int line;
		public PreUnaryExpressionContext preUnaryExpression;
		public Token MULT;
		public Token DIVIDE;
		public Token MOD;
		public List<PreUnaryExpressionContext> preUnaryExpression() {
			return getRuleContexts(PreUnaryExpressionContext.class);
		}
		public PreUnaryExpressionContext preUnaryExpression(int i) {
			return getRuleContext(PreUnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(SophiaParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(SophiaParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(SophiaParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(SophiaParser.DIVIDE, i);
		}
		public List<TerminalNode> MOD() { return getTokens(SophiaParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(SophiaParser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			((MultiplicativeExpressionContext)_localctx).preUnaryExpression = preUnaryExpression();
			 ((MultiplicativeExpressionContext)_localctx).exp =  ((MultiplicativeExpressionContext)_localctx).preUnaryExpression.exp; 
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				{
				setState(576);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(570);
					((MultiplicativeExpressionContext)_localctx).MULT = match(MULT);
					 ((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.mult; ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).MULT.getLine(); 
					}
					break;
				case DIVIDE:
					{
					setState(572);
					((MultiplicativeExpressionContext)_localctx).DIVIDE = match(DIVIDE);
					 ((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.div; ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).DIVIDE.getLine(); 
					}
					break;
				case MOD:
					{
					setState(574);
					((MultiplicativeExpressionContext)_localctx).MOD = match(MOD);
					 ((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.mod; ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).MOD.getLine(); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(578);
				((MultiplicativeExpressionContext)_localctx).preUnaryExpression = preUnaryExpression();
				 ((MultiplicativeExpressionContext)_localctx).exp =  new BinaryExpression(_localctx.exp, ((MultiplicativeExpressionContext)_localctx).preUnaryExpression.exp, _localctx.op); _localctx.exp.setLine(_localctx.line); 
				}
				}
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public Expression exp;
		public UnaryOperator op;
		public int line;
		public Token INCREMENT;
		public PreUnaryExpressionContext preUnaryExpression;
		public PostUnaryExpressionContext postUnaryExpression;
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SophiaParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(SophiaParser.MINUS, 0); }
		public TerminalNode INCREMENT() { return getToken(SophiaParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(SophiaParser.DECREMENT, 0); }
		public PostUnaryExpressionContext postUnaryExpression() {
			return getRuleContext(PostUnaryExpressionContext.class,0);
		}
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPreUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPreUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_preUnaryExpression);
		try {
			setState(602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
			case INCREMENT:
			case DECREMENT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(594);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(586);
					match(NOT);
					 ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.not; ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).INCREMENT.getLine(); 
					}
					break;
				case MINUS:
					{
					setState(588);
					match(MINUS);
					 ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.minus; ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).INCREMENT.getLine(); 
					}
					break;
				case INCREMENT:
					{
					setState(590);
					((PreUnaryExpressionContext)_localctx).INCREMENT = match(INCREMENT);
					 ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.preinc; ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).INCREMENT.getLine(); 
					}
					break;
				case DECREMENT:
					{
					setState(592);
					match(DECREMENT);
					 ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.predec; ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).INCREMENT.getLine(); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(596);
				((PreUnaryExpressionContext)_localctx).preUnaryExpression = preUnaryExpression();
				 ((PreUnaryExpressionContext)_localctx).exp =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).preUnaryExpression.exp, _localctx.op);
				}
				}
				break;
			case NEW:
			case NULL:
			case TRUE:
			case FALSE:
			case THIS:
			case LPAR:
			case LBRACK:
			case INT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				((PreUnaryExpressionContext)_localctx).postUnaryExpression = postUnaryExpression();
				 ((PreUnaryExpressionContext)_localctx).exp =  ((PreUnaryExpressionContext)_localctx).postUnaryExpression.exp; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostUnaryExpressionContext extends ParserRuleContext {
		public Expression exp;
		public UnaryOperator op;
		public int line;
		public AccessExpressionContext accessExpression;
		public Token INCREMENT;
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(SophiaParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(SophiaParser.DECREMENT, 0); }
		public PostUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPostUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPostUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPostUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostUnaryExpressionContext postUnaryExpression() throws RecognitionException {
		PostUnaryExpressionContext _localctx = new PostUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_postUnaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			((PostUnaryExpressionContext)_localctx).accessExpression = accessExpression();
			 ((PostUnaryExpressionContext)_localctx).exp =  ((PostUnaryExpressionContext)_localctx).accessExpression.exp; 
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCREMENT || _la==DECREMENT) {
				{
				setState(610);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INCREMENT:
					{
					setState(606);
					((PostUnaryExpressionContext)_localctx).INCREMENT = match(INCREMENT);
					 ((PostUnaryExpressionContext)_localctx).op =  UnaryOperator.postinc; ((PostUnaryExpressionContext)_localctx).line =  ((PostUnaryExpressionContext)_localctx).INCREMENT.getLine(); 
					}
					break;
				case DECREMENT:
					{
					setState(608);
					match(DECREMENT);
					 ((PostUnaryExpressionContext)_localctx).op =  UnaryOperator.postdec; ((PostUnaryExpressionContext)_localctx).line =  ((PostUnaryExpressionContext)_localctx).INCREMENT.getLine(); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				 ((PostUnaryExpressionContext)_localctx).exp =  new UnaryExpression(_localctx.op, _localctx.exp); _localctx.exp.setLine(_localctx.line); 
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessExpressionContext extends ParserRuleContext {
		public Expression exp;
		public OtherExpressionContext otherExpression;
		public Token LPAR;
		public MethodCallArgumentsContext methodCallArguments;
		public IdentifierContext identifier;
		public Token LBRACK;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(SophiaParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SophiaParser.LPAR, i);
		}
		public List<MethodCallArgumentsContext> methodCallArguments() {
			return getRuleContexts(MethodCallArgumentsContext.class);
		}
		public MethodCallArgumentsContext methodCallArguments(int i) {
			return getRuleContext(MethodCallArgumentsContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SophiaParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SophiaParser.RPAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SophiaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SophiaParser.DOT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SophiaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SophiaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SophiaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SophiaParser.RBRACK, i);
		}
		public AccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessExpressionContext accessExpression() throws RecognitionException {
		AccessExpressionContext _localctx = new AccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_accessExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			((AccessExpressionContext)_localctx).otherExpression = otherExpression();
			 ((AccessExpressionContext)_localctx).exp =  ((AccessExpressionContext)_localctx).otherExpression.exp; 
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRACK) | (1L << DOT))) != 0)) {
				{
				setState(631);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAR:
					{
					{
					setState(617);
					((AccessExpressionContext)_localctx).LPAR = match(LPAR);
					setState(618);
					((AccessExpressionContext)_localctx).methodCallArguments = methodCallArguments();
					setState(619);
					match(RPAR);
					 
					                ((AccessExpressionContext)_localctx).exp =  new MethodCall(((AccessExpressionContext)_localctx).otherExpression.exp, ((AccessExpressionContext)_localctx).methodCallArguments.exps);
					                _localctx.exp.setLine(((AccessExpressionContext)_localctx).LPAR.getLine()); 
					            
					}
					}
					break;
				case DOT:
					{
					{
					setState(622);
					match(DOT);
					setState(623);
					((AccessExpressionContext)_localctx).identifier = identifier();
					 
					                ((AccessExpressionContext)_localctx).exp =  new ObjectOrListMemberAccess(((AccessExpressionContext)_localctx).otherExpression.exp, ((AccessExpressionContext)_localctx).identifier.id); 
					                _localctx.exp.setLine(((AccessExpressionContext)_localctx).identifier.id.getLine()); 
					            
					}
					}
					break;
				case LBRACK:
					{
					{
					setState(626);
					((AccessExpressionContext)_localctx).LBRACK = match(LBRACK);
					setState(627);
					expression();
					setState(628);
					match(RBRACK);
					 
					                ((AccessExpressionContext)_localctx).exp =  new ListAccessByIndex(((AccessExpressionContext)_localctx).otherExpression.exp, expression.exp); 
					                _localctx.exp.setLine(((AccessExpressionContext)_localctx).LBRACK.getLine());
					            
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherExpressionContext extends ParserRuleContext {
		public Expression exp;
		public Token THIS;
		public ValuesContext values;
		public IdentifierContext identifier;
		public ExpressionContext expression;
		public TerminalNode THIS() { return getToken(SophiaParser.THIS, 0); }
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_otherExpression);
		try {
			setState(651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				((OtherExpressionContext)_localctx).THIS = match(THIS);
				 ((OtherExpressionContext)_localctx).exp =  new ThisClass(); _localctx.exp.setLine(((OtherExpressionContext)_localctx).THIS.getLine()); 
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				newExpression();
				}
				break;
			case NULL:
			case TRUE:
			case FALSE:
			case LBRACK:
			case INT_VALUE:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(639);
				((OtherExpressionContext)_localctx).values = values();
				 ((OtherExpressionContext)_localctx).exp =  ((OtherExpressionContext)_localctx).values.val; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(642);
				((OtherExpressionContext)_localctx).identifier = identifier();
				 ((OtherExpressionContext)_localctx).exp =  ((OtherExpressionContext)_localctx).identifier.id; 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(645);
				match(LPAR);
				{
				setState(646);
				((OtherExpressionContext)_localctx).expression = expression();
				 ((OtherExpressionContext)_localctx).exp =  ((OtherExpressionContext)_localctx).expression.exp; 
				}
				setState(649);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewExpressionContext extends ParserRuleContext {
		public NewClassInstance nci;
		public ClassTypeContext classType;
		public MethodCallArgumentsContext methodCallArguments;
		public TerminalNode NEW() { return getToken(SophiaParser.NEW, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public MethodCallArgumentsContext methodCallArguments() {
			return getRuleContext(MethodCallArgumentsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_newExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(NEW);
			setState(654);
			((NewExpressionContext)_localctx).classType = classType();
			setState(655);
			match(LPAR);
			setState(656);
			((NewExpressionContext)_localctx).methodCallArguments = methodCallArguments();
			setState(657);
			match(RPAR);
			 ((NewExpressionContext)_localctx).nci =  new NewClassInstance(((NewExpressionContext)_localctx).classType.t, ((NewExpressionContext)_localctx).methodCallArguments.exps);  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesContext extends ParserRuleContext {
		public Value val;
		public Token STRING_VALUE;
		public Token INT_VALUE;
		public Token NULL;
		public ListValueContext listValue;
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode STRING_VALUE() { return getToken(SophiaParser.STRING_VALUE, 0); }
		public TerminalNode INT_VALUE() { return getToken(SophiaParser.INT_VALUE, 0); }
		public TerminalNode NULL() { return getToken(SophiaParser.NULL, 0); }
		public ListValueContext listValue() {
			return getRuleContext(ListValueContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_values);
		try {
			setState(672);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				boolValue();
				 ((ValuesContext)_localctx).val =  boolValue.val; 
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				((ValuesContext)_localctx).STRING_VALUE = match(STRING_VALUE);
				 ((ValuesContext)_localctx).val =  new StringValue((((ValuesContext)_localctx).STRING_VALUE!=null?((ValuesContext)_localctx).STRING_VALUE.getText():null)); _localctx.val.setLine(((ValuesContext)_localctx).STRING_VALUE.getLine()); 
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(665);
				((ValuesContext)_localctx).INT_VALUE = match(INT_VALUE);
				 ((ValuesContext)_localctx).val =  new IntValue((((ValuesContext)_localctx).INT_VALUE!=null?Integer.valueOf(((ValuesContext)_localctx).INT_VALUE.getText()):0)); _localctx.val.setLine(((ValuesContext)_localctx).INT_VALUE.getLine()); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(667);
				((ValuesContext)_localctx).NULL = match(NULL);
				 ((ValuesContext)_localctx).val =  new NullValue(); _localctx.val.setLine(((ValuesContext)_localctx).NULL.getLine()); 
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(669);
				((ValuesContext)_localctx).listValue = listValue();
				 ((ValuesContext)_localctx).val =  ((ValuesContext)_localctx).listValue.val; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolValueContext extends ParserRuleContext {
		public BoolValue val;
		public Token TRUE;
		public Token FALSE;
		public TerminalNode TRUE() { return getToken(SophiaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SophiaParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_boolValue);
		try {
			setState(678);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				((BoolValueContext)_localctx).TRUE = match(TRUE);
				 ((BoolValueContext)_localctx).val =  new BoolValue(true); _localctx.val.setLine(((BoolValueContext)_localctx).TRUE.getLine()); 
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				((BoolValueContext)_localctx).FALSE = match(FALSE);
				 ((BoolValueContext)_localctx).val =  new BoolValue(false); _localctx.val.setLine(((BoolValueContext)_localctx).FALSE.getLine()); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListValueContext extends ParserRuleContext {
		public ListValue val;
		public MethodCallArgumentsContext methodCallArguments;
		public TerminalNode LBRACK() { return getToken(SophiaParser.LBRACK, 0); }
		public MethodCallArgumentsContext methodCallArguments() {
			return getRuleContext(MethodCallArgumentsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SophiaParser.RBRACK, 0); }
		public ListValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListValueContext listValue() throws RecognitionException {
		ListValueContext _localctx = new ListValueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_listValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ListValueContext)_localctx).val =  new ListValue(); 
			setState(681);
			match(LBRACK);
			setState(682);
			((ListValueContext)_localctx).methodCallArguments = methodCallArguments();
			 _localctx.val.setElements(((ListValueContext)_localctx).methodCallArguments.exps); 
			setState(684);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier id;
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			((IdentifierContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			 ((IdentifierContext)_localctx).id =  new Identifier((((IdentifierContext)_localctx).IDENTIFIER!=null?((IdentifierContext)_localctx).IDENTIFIER.getText():null)); _localctx.id.setLine(((IdentifierContext)_localctx).IDENTIFIER.getLine()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u02b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3h\n\3\f"+
		"\3\16\3k\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4t\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4}\n\4\f\4\16\4\u0080\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4\u008b\n\4\f\4\16\4\u008e\13\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0096"+
		"\n\4\f\4\16\4\u0099\13\4\5\4\u009b\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ab\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00cd\n\b\f\b\16\b\u00d0\13\b\5\b\u00d2"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u00e5\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00f5\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ff\n\r\f\r"+
		"\16\r\u0102\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u010b\n\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0114\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u011c\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u0128\n\20\f\20\16\20\u012b\13\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u0133\n\21\3\22\3\22\3\22\3\22\7\22\u0139\n\22\f\22\16\22\u013c"+
		"\13\22\3\22\3\22\3\22\7\22\u0141\n\22\f\22\16\22\u0144\13\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0161\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u0168\n\24\f\24\16\24\u016b\13\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u0186\n\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u019e\n\32\f\32\16\32\u01a1\13"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7"+
		"\33\u01b0\n\33\f\33\16\33\u01b3\13\33\5\33\u01b5\n\33\3\34\3\34\3\34\3"+
		"\34\5\34\u01bb\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01c5"+
		"\n\35\3\35\3\35\3\35\3\35\5\35\u01cb\n\35\3\35\3\35\3\35\3\35\5\35\u01d1"+
		"\n\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01eb\n\37"+
		"\3 \3 \3 \3 \3 \3 \5 \u01f3\n \3!\3!\3!\3!\3!\3!\7!\u01fb\n!\f!\16!\u01fe"+
		"\13!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0206\n\"\f\"\16\"\u0209\13\"\3#\3#\3"+
		"#\3#\3#\3#\5#\u0211\n#\3#\3#\3#\7#\u0216\n#\f#\16#\u0219\13#\3$\3$\3$"+
		"\3$\3$\3$\5$\u0221\n$\3$\3$\3$\7$\u0226\n$\f$\16$\u0229\13$\3%\3%\3%\3"+
		"%\3%\3%\5%\u0231\n%\3%\3%\3%\7%\u0236\n%\f%\16%\u0239\13%\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\5&\u0243\n&\3&\3&\3&\7&\u0248\n&\f&\16&\u024b\13&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0255\n\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u025d"+
		"\n\'\3(\3(\3(\3(\3(\3(\5(\u0265\n(\3(\5(\u0268\n(\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u027a\n)\f)\16)\u027d\13)\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u028e\n*\3+\3+\3+\3+\3+\3+\3+\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u02a3\n,\3-\3-\3-\3-\5-\u02a9\n-"+
		"\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\2\2\60\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\2\2\u02d0\2^\3\2\2\2"+
		"\4c\3\2\2\2\6l\3\2\2\2\b\u009e\3\2\2\2\n\u00a4\3\2\2\2\f\u00b8\3\2\2\2"+
		"\16\u00c5\3\2\2\2\20\u00d3\3\2\2\2\22\u00e4\3\2\2\2\24\u00e6\3\2\2\2\26"+
		"\u00e9\3\2\2\2\30\u00f8\3\2\2\2\32\u010a\3\2\2\2\34\u010c\3\2\2\2\36\u0120"+
		"\3\2\2\2 \u0132\3\2\2\2\"\u0134\3\2\2\2$\u0160\3\2\2\2&\u0162\3\2\2\2"+
		"(\u016e\3\2\2\2*\u0172\3\2\2\2,\u0179\3\2\2\2.\u0180\3\2\2\2\60\u0189"+
		"\3\2\2\2\62\u018d\3\2\2\2\64\u01a8\3\2\2\2\66\u01ba\3\2\2\28\u01be\3\2"+
		"\2\2:\u01d6\3\2\2\2<\u01e0\3\2\2\2>\u01ec\3\2\2\2@\u01f4\3\2\2\2B\u01ff"+
		"\3\2\2\2D\u020a\3\2\2\2F\u021a\3\2\2\2H\u022a\3\2\2\2J\u023a\3\2\2\2L"+
		"\u025c\3\2\2\2N\u025e\3\2\2\2P\u0269\3\2\2\2R\u028d\3\2\2\2T\u028f\3\2"+
		"\2\2V\u02a2\3\2\2\2X\u02a8\3\2\2\2Z\u02aa\3\2\2\2\\\u02b0\3\2\2\2^_\b"+
		"\2\1\2_`\5\4\3\2`a\b\2\1\2ab\7\2\2\3b\3\3\2\2\2ci\b\3\1\2de\5\6\4\2ef"+
		"\b\3\1\2fh\3\2\2\2gd\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\5\3\2\2\2"+
		"ki\3\2\2\2lm\7\5\2\2mn\5\\/\2ns\b\4\1\2op\7\4\2\2pq\5\\/\2qr\b\4\1\2r"+
		"t\3\2\2\2so\3\2\2\2st\3\2\2\2tu\3\2\2\2u\u009a\7/\2\2vw\5\b\5\2wx\b\4"+
		"\1\2x}\3\2\2\2yz\5\n\6\2z{\b\4\1\2{}\3\2\2\2|v\3\2\2\2|y\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081"+
		"\u0082\5\f\7\2\u0082\u0083\b\4\1\2\u0083\u008c\3\2\2\2\u0084\u0085\5\b"+
		"\5\2\u0085\u0086\b\4\1\2\u0086\u008b\3\2\2\2\u0087\u0088\5\n\6\2\u0088"+
		"\u0089\b\4\1\2\u0089\u008b\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0087\3\2"+
		"\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u009b\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\5\b\5\2\u0090\u0091\b\4"+
		"\1\2\u0091\u0096\3\2\2\2\u0092\u0093\5\n\6\2\u0093\u0094\b\4\1\2\u0094"+
		"\u0096\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0092\3\2\2\2\u0096\u0099\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a~\3\2\2\2\u009a\u0097\3\2\2\2\u009b\u009c\3\2\2\2"+
		"\u009c\u009d\7\60\2\2\u009d\7\3\2\2\2\u009e\u009f\5\\/\2\u009f\u00a0\7"+
		"\64\2\2\u00a0\u00a1\5\22\n\2\u00a1\u00a2\b\5\1\2\u00a2\u00a3\7\65\2\2"+
		"\u00a3\t\3\2\2\2\u00a4\u00aa\7\3\2\2\u00a5\u00a6\5\22\n\2\u00a6\u00a7"+
		"\b\6\1\2\u00a7\u00ab\3\2\2\2\u00a8\u00a9\7\24\2\2\u00a9\u00ab\b\6\1\2"+
		"\u00aa\u00a5\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad"+
		"\5\\/\2\u00ad\u00ae\b\6\1\2\u00ae\u00af\7+\2\2\u00af\u00b0\5\16\b\2\u00b0"+
		"\u00b1\b\6\1\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7,\2\2\u00b3\u00b4\7/\2"+
		"\2\u00b4\u00b5\5\"\22\2\u00b5\u00b6\b\6\1\2\u00b6\u00b7\7\60\2\2\u00b7"+
		"\13\3\2\2\2\u00b8\u00b9\7\3\2\2\u00b9\u00ba\5\\/\2\u00ba\u00bb\b\7\1\2"+
		"\u00bb\u00bc\7+\2\2\u00bc\u00bd\5\16\b\2\u00bd\u00be\b\7\1\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00c0\7,\2\2\u00c0\u00c1\7/\2\2\u00c1\u00c2\5\"\22\2\u00c2"+
		"\u00c3\b\7\1\2\u00c3\u00c4\7\60\2\2\u00c4\r\3\2\2\2\u00c5\u00d1\b\b\1"+
		"\2\u00c6\u00c7\5\20\t\2\u00c7\u00ce\b\b\1\2\u00c8\u00c9\7\62\2\2\u00c9"+
		"\u00ca\5\20\t\2\u00ca\u00cb\b\b\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00c8\3"+
		"\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00c6\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\17\3\2\2\2\u00d3\u00d4\5\\/\2\u00d4\u00d5\7\64\2\2\u00d5\u00d6"+
		"\5\22\n\2\u00d6\u00d7\b\t\1\2\u00d7\21\3\2\2\2\u00d8\u00d9\5 \21\2\u00d9"+
		"\u00da\b\n\1\2\u00da\u00e5\3\2\2\2\u00db\u00dc\5\26\f\2\u00dc\u00dd\b"+
		"\n\1\2\u00dd\u00e5\3\2\2\2\u00de\u00df\5\34\17\2\u00df\u00e0\b\n\1\2\u00e0"+
		"\u00e5\3\2\2\2\u00e1\u00e2\5\24\13\2\u00e2\u00e3\b\n\1\2\u00e3\u00e5\3"+
		"\2\2\2\u00e4\u00d8\3\2\2\2\u00e4\u00db\3\2\2\2\u00e4\u00de\3\2\2\2\u00e4"+
		"\u00e1\3\2\2\2\u00e5\23\3\2\2\2\u00e6\u00e7\5\\/\2\u00e7\u00e8\b\13\1"+
		"\2\u00e8\25\3\2\2\2\u00e9\u00ea\7\26\2\2\u00ea\u00f4\7+\2\2\u00eb\u00ec"+
		"\7\66\2\2\u00ec\u00ed\7\61\2\2\u00ed\u00ee\5\22\n\2\u00ee\u00ef\3\2\2"+
		"\2\u00ef\u00f0\b\f\1\2\u00f0\u00f5\3\2\2\2\u00f1\u00f2\5\30\r\2\u00f2"+
		"\u00f3\b\f\1\2\u00f3\u00f5\3\2\2\2\u00f4\u00eb\3\2\2\2\u00f4\u00f1\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7,\2\2\u00f7\27\3\2\2\2\u00f8\u00f9"+
		"\5\32\16\2\u00f9\u0100\b\r\1\2\u00fa\u00fb\7\62\2\2\u00fb\u00fc\5\32\16"+
		"\2\u00fc\u00fd\b\r\1\2\u00fd\u00ff\3\2\2\2\u00fe\u00fa\3\2\2\2\u00ff\u0102"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\31\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0104\b\16\1\2\u0104\u0105\5\20\t\2\u0105\u0106\b"+
		"\16\1\2\u0106\u010b\3\2\2\2\u0107\u0108\5\22\n\2\u0108\u0109\b\16\1\2"+
		"\u0109\u010b\3\2\2\2\u010a\u0103\3\2\2\2\u010a\u0107\3\2\2\2\u010b\33"+
		"\3\2\2\2\u010c\u010d\b\17\1\2\u010d\u010e\7\7\2\2\u010e\u0113\7\34\2\2"+
		"\u010f\u0114\7\24\2\2\u0110\u0111\5\36\20\2\u0111\u0112\b\17\1\2\u0112"+
		"\u0114\3\2\2\2\u0113\u010f\3\2\2\2\u0113\u0110\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u011b\7\32\2\2\u0116\u0117\7\24\2\2\u0117\u011c\b\17\1\2\u0118"+
		"\u0119\5\22\n\2\u0119\u011a\b\17\1\2\u011a\u011c\3\2\2\2\u011b\u0116\3"+
		"\2\2\2\u011b\u0118\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7\33\2\2\u011e"+
		"\u011f\b\17\1\2\u011f\35\3\2\2\2\u0120\u0121\b\20\1\2\u0121\u0122\5\22"+
		"\n\2\u0122\u0129\b\20\1\2\u0123\u0124\7\62\2\2\u0124\u0125\5\22\n\2\u0125"+
		"\u0126\b\20\1\2\u0126\u0128\3\2\2\2\u0127\u0123\3\2\2\2\u0128\u012b\3"+
		"\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\37\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012d\7\23\2\2\u012d\u0133\b\21\1\2\u012e\u012f\7"+
		"\22\2\2\u012f\u0133\b\21\1\2\u0130\u0131\7\21\2\2\u0131\u0133\b\21\1\2"+
		"\u0132\u012c\3\2\2\2\u0132\u012e\3\2\2\2\u0132\u0130\3\2\2\2\u0133!\3"+
		"\2\2\2\u0134\u013a\b\22\1\2\u0135\u0136\5\b\5\2\u0136\u0137\b\22\1\2\u0137"+
		"\u0139\3\2\2\2\u0138\u0135\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\u0142\3\2\2\2\u013c\u013a\3\2\2\2\u013d"+
		"\u013e\5$\23\2\u013e\u013f\b\22\1\2\u013f\u0141\3\2\2\2\u0140\u013d\3"+
		"\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"#\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\58\35\2\u0146\u0147\b\23\1\2"+
		"\u0147\u0161\3\2\2\2\u0148\u0149\5:\36\2\u0149\u014a\b\23\1\2\u014a\u0161"+
		"\3\2\2\2\u014b\u014c\5<\37\2\u014c\u014d\b\23\1\2\u014d\u0161\3\2\2\2"+
		"\u014e\u014f\5(\25\2\u014f\u0150\b\23\1\2\u0150\u0161\3\2\2\2\u0151\u0152"+
		"\5,\27\2\u0152\u0153\b\23\1\2\u0153\u0161\3\2\2\2\u0154\u0155\5\66\34"+
		"\2\u0155\u0156\b\23\1\2\u0156\u0161\3\2\2\2\u0157\u0158\5\60\31\2\u0158"+
		"\u0159\b\23\1\2\u0159\u0161\3\2\2\2\u015a\u015b\5.\30\2\u015b\u015c\b"+
		"\23\1\2\u015c\u0161\3\2\2\2\u015d\u015e\5&\24\2\u015e\u015f\b\23\1\2\u015f"+
		"\u0161\3\2\2\2\u0160\u0145\3\2\2\2\u0160\u0148\3\2\2\2\u0160\u014b\3\2"+
		"\2\2\u0160\u014e\3\2\2\2\u0160\u0151\3\2\2\2\u0160\u0154\3\2\2\2\u0160"+
		"\u0157\3\2\2\2\u0160\u015a\3\2\2\2\u0160\u015d\3\2\2\2\u0161%\3\2\2\2"+
		"\u0162\u0163\7/\2\2\u0163\u0169\b\24\1\2\u0164\u0165\5$\23\2\u0165\u0166"+
		"\b\24\1\2\u0166\u0168\3\2\2\2\u0167\u0164\3\2\2\2\u0168\u016b\3\2\2\2"+
		"\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169"+
		"\3\2\2\2\u016c\u016d\7\60\2\2\u016d\'\3\2\2\2\u016e\u016f\5*\26\2\u016f"+
		"\u0170\7\65\2\2\u0170\u0171\b\25\1\2\u0171)\3\2\2\2\u0172\u0173\5@!\2"+
		"\u0173\u0174\b\26\1\2\u0174\u0175\7(\2\2\u0175\u0176\b\26\1\2\u0176\u0177"+
		"\5> \2\u0177\u0178\b\26\1\2\u0178+\3\2\2\2\u0179\u017a\7\6\2\2\u017a\u017b"+
		"\7+\2\2\u017b\u017c\5> \2\u017c\u017d\7,\2\2\u017d\u017e\7\65\2\2\u017e"+
		"\u017f\b\27\1\2\u017f-\3\2\2\2\u0180\u0181\7\13\2\2\u0181\u0185\b\30\1"+
		"\2\u0182\u0183\5> \2\u0183\u0184\b\30\1\2\u0184\u0186\3\2\2\2\u0185\u0182"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\7\65\2\2"+
		"\u0188/\3\2\2\2\u0189\u018a\5\62\32\2\u018a\u018b\b\31\1\2\u018b\u018c"+
		"\7\65\2\2\u018c\61\3\2\2\2\u018d\u018e\5R*\2\u018e\u019f\b\32\1\2\u018f"+
		"\u0190\7+\2\2\u0190\u0191\5\64\33\2\u0191\u0192\7,\2\2\u0192\u0193\b\32"+
		"\1\2\u0193\u019e\3\2\2\2\u0194\u0195\7\63\2\2\u0195\u0196\5\\/\2\u0196"+
		"\u0197\b\32\1\2\u0197\u019e\3\2\2\2\u0198\u0199\7-\2\2\u0199\u019a\5>"+
		" \2\u019a\u019b\7.\2\2\u019b\u019c\b\32\1\2\u019c\u019e\3\2\2\2\u019d"+
		"\u018f\3\2\2\2\u019d\u0194\3\2\2\2\u019d\u0198\3\2\2\2\u019e\u01a1\3\2"+
		"\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a2\u01a3\7+\2\2\u01a3\u01a4\5\64\33\2\u01a4\u01a5\7"+
		",\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\b\32\1\2\u01a7\63\3\2\2\2\u01a8"+
		"\u01b4\b\33\1\2\u01a9\u01aa\5> \2\u01aa\u01b1\b\33\1\2\u01ab\u01ac\7\62"+
		"\2\2\u01ac\u01ad\5> \2\u01ad\u01ae\b\33\1\2\u01ae\u01b0\3\2\2\2\u01af"+
		"\u01ab\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01a9\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\65\3\2\2\2\u01b6\u01b7\7\n\2\2\u01b7\u01bb\b\34\1"+
		"\2\u01b8\u01b9\7\t\2\2\u01b9\u01bb\b\34\1\2\u01ba\u01b6\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\7\65\2\2\u01bd\67\3\2\2"+
		"\2\u01be\u01bf\7\16\2\2\u01bf\u01c0\7+\2\2\u01c0\u01c4\b\35\1\2\u01c1"+
		"\u01c2\5*\26\2\u01c2\u01c3\b\35\1\2\u01c3\u01c5\3\2\2\2\u01c4\u01c1\3"+
		"\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01ca\7\65\2\2\u01c7"+
		"\u01c8\5> \2\u01c8\u01c9\b\35\1\2\u01c9\u01cb\3\2\2\2\u01ca\u01c7\3\2"+
		"\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01d0\7\65\2\2\u01cd"+
		"\u01ce\5*\26\2\u01ce\u01cf\b\35\1\2\u01cf\u01d1\3\2\2\2\u01d0\u01cd\3"+
		"\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\7,\2\2\u01d3"+
		"\u01d4\5$\23\2\u01d4\u01d5\b\35\1\2\u01d59\3\2\2\2\u01d6\u01d7\7\f\2\2"+
		"\u01d7\u01d8\7+\2\2\u01d8\u01d9\5\\/\2\u01d9\u01da\7\r\2\2\u01da\u01db"+
		"\5> \2\u01db\u01dc\7,\2\2\u01dc\u01dd\b\36\1\2\u01dd\u01de\5$\23\2\u01de"+
		"\u01df\b\36\1\2\u01df;\3\2\2\2\u01e0\u01e1\7\17\2\2\u01e1\u01e2\7+\2\2"+
		"\u01e2\u01e3\5> \2\u01e3\u01e4\7,\2\2\u01e4\u01e5\5$\23\2\u01e5\u01ea"+
		"\b\37\1\2\u01e6\u01e7\7\20\2\2\u01e7\u01e8\5$\23\2\u01e8\u01e9\b\37\1"+
		"\2\u01e9\u01eb\3\2\2\2\u01ea\u01e6\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb="+
		"\3\2\2\2\u01ec\u01ed\5@!\2\u01ed\u01f2\b \1\2\u01ee\u01ef\7(\2\2\u01ef"+
		"\u01f0\5> \2\u01f0\u01f1\b \1\2\u01f1\u01f3\3\2\2\2\u01f2\u01ee\3\2\2"+
		"\2\u01f2\u01f3\3\2\2\2\u01f3?\3\2\2\2\u01f4\u01f5\5B\"\2\u01f5\u01fc\b"+
		"!\1\2\u01f6\u01f7\7%\2\2\u01f7\u01f8\5B\"\2\u01f8\u01f9\b!\1\2\u01f9\u01fb"+
		"\3\2\2\2\u01fa\u01f6\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fdA\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\5D#\2\u0200"+
		"\u0207\b\"\1\2\u0201\u0202\7$\2\2\u0202\u0203\5D#\2\u0203\u0204\b\"\1"+
		"\2\u0204\u0206\3\2\2\2\u0205\u0201\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205"+
		"\3\2\2\2\u0207\u0208\3\2\2\2\u0208C\3\2\2\2\u0209\u0207\3\2\2\2\u020a"+
		"\u020b\5F$\2\u020b\u0217\b#\1\2\u020c\u020d\7\36\2\2\u020d\u0211\b#\1"+
		"\2\u020e\u020f\7\35\2\2\u020f\u0211\b#\1\2\u0210\u020c\3\2\2\2\u0210\u020e"+
		"\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\5F$\2\u0213\u0214\b#\1\2\u0214"+
		"\u0216\3\2\2\2\u0215\u0210\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2"+
		"\2\2\u0217\u0218\3\2\2\2\u0218E\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021b"+
		"\5H%\2\u021b\u0227\b$\1\2\u021c\u021d\7\33\2\2\u021d\u0221\b$\1\2\u021e"+
		"\u021f\7\34\2\2\u021f\u0221\b$\1\2\u0220\u021c\3\2\2\2\u0220\u021e\3\2"+
		"\2\2\u0221\u0222\3\2\2\2\u0222\u0223\5H%\2\u0223\u0224\b$\1\2\u0224\u0226"+
		"\3\2\2\2\u0225\u0220\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227"+
		"\u0228\3\2\2\2\u0228G\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022b\5J&\2\u022b"+
		"\u0237\b%\1\2\u022c\u022d\7\"\2\2\u022d\u0231\b%\1\2\u022e\u022f\7#\2"+
		"\2\u022f\u0231\b%\1\2\u0230\u022c\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0232"+
		"\3\2\2\2\u0232\u0233\5J&\2\u0233\u0234\b%\1\2\u0234\u0236\3\2\2\2\u0235"+
		"\u0230\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2"+
		"\2\2\u0238I\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023b\5L\'\2\u023b\u0249"+
		"\b&\1\2\u023c\u023d\7\37\2\2\u023d\u0243\b&\1\2\u023e\u023f\7 \2\2\u023f"+
		"\u0243\b&\1\2\u0240\u0241\7!\2\2\u0241\u0243\b&\1\2\u0242\u023c\3\2\2"+
		"\2\u0242\u023e\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245"+
		"\5L\'\2\u0245\u0246\b&\1\2\u0246\u0248\3\2\2\2\u0247\u0242\3\2\2\2\u0248"+
		"\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024aK\3\2\2\2"+
		"\u024b\u0249\3\2\2\2\u024c\u024d\7&\2\2\u024d\u0255\b\'\1\2\u024e\u024f"+
		"\7#\2\2\u024f\u0255\b\'\1\2\u0250\u0251\7)\2\2\u0251\u0255\b\'\1\2\u0252"+
		"\u0253\7*\2\2\u0253\u0255\b\'\1\2\u0254\u024c\3\2\2\2\u0254\u024e\3\2"+
		"\2\2\u0254\u0250\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u0257\5L\'\2\u0257\u0258\b\'\1\2\u0258\u025d\3\2\2\2\u0259\u025a\5N("+
		"\2\u025a\u025b\b\'\1\2\u025b\u025d\3\2\2\2\u025c\u0254\3\2\2\2\u025c\u0259"+
		"\3\2\2\2\u025dM\3\2\2\2\u025e\u025f\5P)\2\u025f\u0267\b(\1\2\u0260\u0261"+
		"\7)\2\2\u0261\u0265\b(\1\2\u0262\u0263\7*\2\2\u0263\u0265\b(\1\2\u0264"+
		"\u0260\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0268\b("+
		"\1\2\u0267\u0264\3\2\2\2\u0267\u0268\3\2\2\2\u0268O\3\2\2\2\u0269\u026a"+
		"\5R*\2\u026a\u027b\b)\1\2\u026b\u026c\7+\2\2\u026c\u026d\5\64\33\2\u026d"+
		"\u026e\7,\2\2\u026e\u026f\b)\1\2\u026f\u027a\3\2\2\2\u0270\u0271\7\63"+
		"\2\2\u0271\u0272\5\\/\2\u0272\u0273\b)\1\2\u0273\u027a\3\2\2\2\u0274\u0275"+
		"\7-\2\2\u0275\u0276\5> \2\u0276\u0277\7.\2\2\u0277\u0278\b)\1\2\u0278"+
		"\u027a\3\2\2\2\u0279\u026b\3\2\2\2\u0279\u0270\3\2\2\2\u0279\u0274\3\2"+
		"\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c"+
		"Q\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u027f\7\31\2\2\u027f\u028e\b*\1\2"+
		"\u0280\u028e\5T+\2\u0281\u0282\5V,\2\u0282\u0283\b*\1\2\u0283\u028e\3"+
		"\2\2\2\u0284\u0285\5\\/\2\u0285\u0286\b*\1\2\u0286\u028e\3\2\2\2\u0287"+
		"\u0288\7+\2\2\u0288\u0289\5> \2\u0289\u028a\b*\1\2\u028a\u028b\3\2\2\2"+
		"\u028b\u028c\7,\2\2\u028c\u028e\3\2\2\2\u028d\u027e\3\2\2\2\u028d\u0280"+
		"\3\2\2\2\u028d\u0281\3\2\2\2\u028d\u0284\3\2\2\2\u028d\u0287\3\2\2\2\u028e"+
		"S\3\2\2\2\u028f\u0290\7\b\2\2\u0290\u0291\5\24\13\2\u0291\u0292\7+\2\2"+
		"\u0292\u0293\5\64\33\2\u0293\u0294\7,\2\2\u0294\u0295\b+\1\2\u0295U\3"+
		"\2\2\2\u0296\u0297\5X-\2\u0297\u0298\b,\1\2\u0298\u02a3\3\2\2\2\u0299"+
		"\u029a\78\2\2\u029a\u02a3\b,\1\2\u029b\u029c\7\66\2\2\u029c\u02a3\b,\1"+
		"\2\u029d\u029e\7\25\2\2\u029e\u02a3\b,\1\2\u029f\u02a0\5Z.\2\u02a0\u02a1"+
		"\b,\1\2\u02a1\u02a3\3\2\2\2\u02a2\u0296\3\2\2\2\u02a2\u0299\3\2\2\2\u02a2"+
		"\u029b\3\2\2\2\u02a2\u029d\3\2\2\2\u02a2\u029f\3\2\2\2\u02a3W\3\2\2\2"+
		"\u02a4\u02a5\7\27\2\2\u02a5\u02a9\b-\1\2\u02a6\u02a7\7\30\2\2\u02a7\u02a9"+
		"\b-\1\2\u02a8\u02a4\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9Y\3\2\2\2\u02aa\u02ab"+
		"\b.\1\2\u02ab\u02ac\7-\2\2\u02ac\u02ad\5\64\33\2\u02ad\u02ae\b.\1\2\u02ae"+
		"\u02af\7.\2\2\u02af[\3\2\2\2\u02b0\u02b1\7\67\2\2\u02b1\u02b2\b/\1\2\u02b2"+
		"]\3\2\2\28is|~\u008a\u008c\u0095\u0097\u009a\u00aa\u00ce\u00d1\u00e4\u00f4"+
		"\u0100\u010a\u0113\u011b\u0129\u0132\u013a\u0142\u0160\u0169\u0185\u019d"+
		"\u019f\u01b1\u01b4\u01ba\u01c4\u01ca\u01d0\u01ea\u01f2\u01fc\u0207\u0210"+
		"\u0217\u0220\u0227\u0230\u0237\u0242\u0249\u0254\u025c\u0264\u0267\u0279"+
		"\u027b\u028d\u02a2\u02a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}