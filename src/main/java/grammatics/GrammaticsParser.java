// Generated from E:/свнаю/ъохя/lab1/src/main/java/grammatics\Grammatics.g4 by ANTLR 4.8
package grammatics;



import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammaticsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ASSIGN=2, INT_TYPE=3, FLOAT_TYPE=4, SEMICOLON=5, OPAR=6, CPAR=7, 
		OANGLEBR=8, EQOANGLEBR=9, CANGLEBR=10, EQCANGLEBR=11, OBRACKET=12, CBRACKET=13, 
		COLON=14, NEGATION=15, INCR=16, DECR=17, EQ=18, NEQ=19, IS=20, MOD=21, 
		MUL=22, DIV=23, ADD=24, SUB=25, IN=26, POW=27, PRINT=28, CONST=29, IF=30, 
		ELSE=31, WHILE=32, FOREACH=33, FOR=34, CASE=35, DEFAULT=36, MAIN=37, FUNCTION=38, 
		RETURN=39, INT=40, FLOAT=41, ID=42, COMMENT=43, SPACES=44;
	public static final int
		RULE_parse = 0, RULE_main = 1, RULE_start = 2, RULE_instruction = 3, RULE_expr = 4, 
		RULE_create = 5, RULE_create_int = 6, RULE_create_const_int = 7, RULE_create_float = 8, 
		RULE_create_const_float = 9, RULE_name_object_int = 10, RULE_name_object_float = 11, 
		RULE_if_stat = 12, RULE_condition_block = 13, RULE_stat_block = 14, RULE_while_stat = 15, 
		RULE_for_stat = 16, RULE_condition_for = 17, RULE_condition = 18, RULE_print = 19, 
		RULE_print_com = 20, RULE_print_expr = 21, RULE_function_call = 22, RULE_param_call = 23, 
		RULE_arg_call = 24, RULE_function = 25, RULE_stat_block_with_return = 26, 
		RULE_return_id = 27, RULE_param = 28, RULE_arg = 29, RULE_type = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "main", "start", "instruction", "expr", "create", "create_int", 
			"create_const_int", "create_float", "create_const_float", "name_object_int", 
			"name_object_float", "if_stat", "condition_block", "stat_block", "while_stat", 
			"for_stat", "condition_for", "condition", "print", "print_com", "print_expr", 
			"function_call", "param_call", "arg_call", "function", "stat_block_with_return", 
			"return_id", "param", "arg", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'='", "'integer'", "'float'", "';'", "'('", "')'", "'<'", 
			"'<='", "'>'", "'>='", "'{'", "'}'", "':'", "'!'", "'++'", "'--'", "'=='", 
			"'!='", "'is'", "'%'", "'*'", "'/'", "'+'", "'-'", "'in'", "'^'", "'PRINT'", 
			"'CONST'", "'IF'", "'ELSE'", "'WHILE'", "'FOREACH'", "'FOR'", "'CASE'", 
			"'default'", "'START'", "'FUNCTION'", "'RETURN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ASSIGN", "INT_TYPE", "FLOAT_TYPE", "SEMICOLON", "OPAR", 
			"CPAR", "OANGLEBR", "EQOANGLEBR", "CANGLEBR", "EQCANGLEBR", "OBRACKET", 
			"CBRACKET", "COLON", "NEGATION", "INCR", "DECR", "EQ", "NEQ", "IS", "MOD", 
			"MUL", "DIV", "ADD", "SUB", "IN", "POW", "PRINT", "CONST", "IF", "ELSE", 
			"WHILE", "FOREACH", "FOR", "CASE", "DEFAULT", "MAIN", "FUNCTION", "RETURN", 
			"INT", "FLOAT", "ID", "COMMENT", "SPACES"
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
	public String getGrammarFileName() { return "Grammatics.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammaticsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammaticsParser.EOF, 0); }
		public List<CreateContext> create() {
			return getRuleContexts(CreateContext.class);
		}
		public CreateContext create(int i) {
			return getRuleContext(CreateContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CONST))) != 0)) {
				{
				{
				setState(62);
				create();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(68);
				function();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			main();
			setState(75);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(GrammaticsParser.MAIN, 0); }
		public TerminalNode OBRACKET() { return getToken(GrammaticsParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(GrammaticsParser.CBRACKET, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(MAIN);
			setState(78);
			match(OBRACKET);
			setState(79);
			start();
			setState(80);
			match(CBRACKET);
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

	public static class StartContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << OPAR) | (1L << ADD) | (1L << SUB) | (1L << PRINT) | (1L << CONST) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) {
				{
				{
				setState(82);
				instruction();
				}
				}
				setState(87);
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

	public static class InstructionContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Print_comContext print_com() {
			return getRuleContext(Print_comContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				create();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				print_com();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				if_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				while_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				for_stat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
				function_call();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallContext extends ExprContext {
		public TerminalNode ID() { return getToken(GrammaticsParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(GrammaticsParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(GrammaticsParser.CPAR, 0); }
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModMulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(GrammaticsParser.MOD, 0); }
		public TerminalNode MUL() { return getToken(GrammaticsParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(GrammaticsParser.DIV, 0); }
		public ModMulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterModMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitModMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitModMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatExprContext extends ExprContext {
		public Name_object_floatContext name_object_float() {
			return getRuleContext(Name_object_floatContext.class,0);
		}
		public FloatExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterFloatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitFloatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitFloatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimContext extends ExprContext {
		public TerminalNode OPAR() { return getToken(GrammaticsParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(GrammaticsParser.CPAR, 0); }
		public PrimContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterPrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitPrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitPrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(GrammaticsParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GrammaticsParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntExrpContext extends ExprContext {
		public Name_object_intContext name_object_int() {
			return getRuleContext(Name_object_intContext.class,0);
		}
		public IntExrpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterIntExrp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitIntExrp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitIntExrp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConversionContext extends ExprContext {
		public Token tp;
		public TerminalNode OPAR() { return getToken(GrammaticsParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(GrammaticsParser.CPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INT_TYPE() { return getToken(GrammaticsParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(GrammaticsParser.FLOAT_TYPE, 0); }
		public TypeConversionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterTypeConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitTypeConversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitTypeConversion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(GrammaticsParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GrammaticsParser.SUB, 0); }
		public UnaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(GrammaticsParser.POW, 0); }
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitPowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(GrammaticsParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammaticsParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(GrammaticsParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new TypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(99);
				match(OPAR);
				setState(100);
				((TypeConversionContext)_localctx).tp = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT_TYPE || _la==FLOAT_TYPE) ) {
					((TypeConversionContext)_localctx).tp = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(101);
				match(CPAR);
				setState(102);
				expr(10);
				}
				break;
			case 2:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(ID);
				setState(104);
				match(OPAR);
				setState(105);
				expr(0);
				setState(106);
				match(CPAR);
				}
				break;
			case 3:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				((UnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(109);
				expr(7);
				}
				break;
			case 4:
				{
				_localctx = new PrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(OPAR);
				setState(111);
				expr(0);
				setState(112);
				match(CPAR);
				}
				break;
			case 5:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new IntExrpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				name_object_int();
				}
				break;
			case 7:
				{
				_localctx = new FloatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				name_object_float();
				}
				break;
			case 8:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(ID);
				setState(118);
				match(ASSIGN);
				setState(119);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ModMulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(123);
						((ModMulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOD) | (1L << MUL) | (1L << DIV))) != 0)) ) {
							((ModMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(124);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(126);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(127);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(129);
						match(POW);
						setState(130);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CreateContext extends ParserRuleContext {
		public Create_intContext create_int() {
			return getRuleContext(Create_intContext.class,0);
		}
		public Create_const_intContext create_const_int() {
			return getRuleContext(Create_const_intContext.class,0);
		}
		public Create_floatContext create_float() {
			return getRuleContext(Create_floatContext.class,0);
		}
		public Create_const_floatContext create_const_float() {
			return getRuleContext(Create_const_floatContext.class,0);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_create);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				create_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				create_const_int();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				create_float();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				create_const_float();
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

	public static class Create_intContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(GrammaticsParser.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(GrammaticsParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammaticsParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterCreate_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitCreate_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitCreate_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_intContext create_int() throws RecognitionException {
		Create_intContext _localctx = new Create_intContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_create_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(INT_TYPE);
			setState(143);
			match(ID);
			setState(144);
			match(ASSIGN);
			setState(145);
			expr(0);
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

	public static class Create_const_intContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(GrammaticsParser.CONST, 0); }
		public Create_intContext create_int() {
			return getRuleContext(Create_intContext.class,0);
		}
		public Create_const_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_const_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterCreate_const_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitCreate_const_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitCreate_const_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_const_intContext create_const_int() throws RecognitionException {
		Create_const_intContext _localctx = new Create_const_intContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_create_const_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(CONST);
			setState(148);
			create_int();
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

	public static class Create_floatContext extends ParserRuleContext {
		public TerminalNode FLOAT_TYPE() { return getToken(GrammaticsParser.FLOAT_TYPE, 0); }
		public TerminalNode ID() { return getToken(GrammaticsParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammaticsParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterCreate_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitCreate_float(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitCreate_float(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_floatContext create_float() throws RecognitionException {
		Create_floatContext _localctx = new Create_floatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_create_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(FLOAT_TYPE);
			setState(151);
			match(ID);
			setState(152);
			match(ASSIGN);
			setState(153);
			expr(0);
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

	public static class Create_const_floatContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(GrammaticsParser.CONST, 0); }
		public Create_floatContext create_float() {
			return getRuleContext(Create_floatContext.class,0);
		}
		public Create_const_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_const_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterCreate_const_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitCreate_const_float(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitCreate_const_float(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_const_floatContext create_const_float() throws RecognitionException {
		Create_const_floatContext _localctx = new Create_const_floatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_create_const_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(CONST);
			setState(156);
			create_float();
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

	public static class Name_object_intContext extends ParserRuleContext {
		public Name_object_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_int; }
	 
		public Name_object_intContext() { }
		public void copyFrom(Name_object_intContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameObjectIntContext extends Name_object_intContext {
		public TerminalNode INT() { return getToken(GrammaticsParser.INT, 0); }
		public NameObjectIntContext(Name_object_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterNameObjectInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitNameObjectInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitNameObjectInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_intContext name_object_int() throws RecognitionException {
		Name_object_intContext _localctx = new Name_object_intContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_name_object_int);
		try {
			_localctx = new NameObjectIntContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(INT);
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

	public static class Name_object_floatContext extends ParserRuleContext {
		public Name_object_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_float; }
	 
		public Name_object_floatContext() { }
		public void copyFrom(Name_object_floatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameObjectFloatContext extends Name_object_floatContext {
		public TerminalNode FLOAT() { return getToken(GrammaticsParser.FLOAT, 0); }
		public NameObjectFloatContext(Name_object_floatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterNameObjectFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitNameObjectFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitNameObjectFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_floatContext name_object_float() throws RecognitionException {
		Name_object_floatContext _localctx = new Name_object_floatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_name_object_float);
		try {
			_localctx = new NameObjectFloatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(FLOAT);
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

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(GrammaticsParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(GrammaticsParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(GrammaticsParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(GrammaticsParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_stat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(IF);
			setState(163);
			condition_block();
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(164);
					match(ELSE);
					setState(165);
					match(IF);
					setState(166);
					condition_block();
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(172);
				match(ELSE);
				setState(173);
				stat_block();
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

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(GrammaticsParser.OPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(GrammaticsParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode NEGATION() { return getToken(GrammaticsParser.NEGATION, 0); }
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(OPAR);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION) {
				{
				setState(177);
				match(NEGATION);
				}
			}

			setState(180);
			condition();
			setState(181);
			match(CPAR);
			setState(182);
			stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACKET() { return getToken(GrammaticsParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(GrammaticsParser.CBRACKET, 0); }
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stat_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(OBRACKET);
			setState(185);
			start();
			setState(186);
			match(CBRACKET);
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GrammaticsParser.WHILE, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(WHILE);
			setState(189);
			condition_block();
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

	public static class For_statContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GrammaticsParser.FOR, 0); }
		public TerminalNode OPAR() { return getToken(GrammaticsParser.OPAR, 0); }
		public Condition_forContext condition_for() {
			return getRuleContext(Condition_forContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(GrammaticsParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterFor_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitFor_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitFor_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(FOR);
			setState(192);
			match(OPAR);
			setState(193);
			condition_for();
			setState(194);
			match(CPAR);
			setState(195);
			stat_block();
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

	public static class Condition_forContext extends ParserRuleContext {
		public Condition_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_for; }
	 
		public Condition_forContext() { }
		public void copyFrom(Condition_forContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForCondContext extends Condition_forContext {
		public Token oper;
		public List<TerminalNode> ID() { return getTokens(GrammaticsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammaticsParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(GrammaticsParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GrammaticsParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GrammaticsParser.SEMICOLON, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode INCR() { return getToken(GrammaticsParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(GrammaticsParser.DECR, 0); }
		public ForCondContext(Condition_forContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterForCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitForCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitForCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_forContext condition_for() throws RecognitionException {
		Condition_forContext _localctx = new Condition_forContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition_for);
		int _la;
		try {
			_localctx = new ForCondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(ID);
			setState(198);
			match(ASSIGN);
			setState(199);
			expr(0);
			setState(200);
			match(SEMICOLON);
			setState(201);
			condition();
			setState(202);
			match(SEMICOLON);
			setState(203);
			match(ID);
			setState(204);
			((ForCondContext)_localctx).oper = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INCR || _la==DECR) ) {
				((ForCondContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CheckTypeContext extends ConditionContext {
		public TerminalNode ID() { return getToken(GrammaticsParser.ID, 0); }
		public TerminalNode IS() { return getToken(GrammaticsParser.IS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CheckTypeContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterCheckType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitCheckType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitCheckType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ConditionContext {
		public Token op;
		public TerminalNode ID() { return getToken(GrammaticsParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EQ() { return getToken(GrammaticsParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(GrammaticsParser.NEQ, 0); }
		public TerminalNode OANGLEBR() { return getToken(GrammaticsParser.OANGLEBR, 0); }
		public TerminalNode CANGLEBR() { return getToken(GrammaticsParser.CANGLEBR, 0); }
		public TerminalNode EQOANGLEBR() { return getToken(GrammaticsParser.EQOANGLEBR, 0); }
		public TerminalNode EQCANGLEBR() { return getToken(GrammaticsParser.EQCANGLEBR, 0); }
		public EqualityExprContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new EqualityExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(ID);
				setState(207);
				((EqualityExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OANGLEBR) | (1L << EQOANGLEBR) | (1L << CANGLEBR) | (1L << EQCANGLEBR) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
					((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(208);
				expr(0);
				}
				break;
			case 2:
				_localctx = new CheckTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(ID);
				setState(210);
				match(IS);
				setState(211);
				type();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GrammaticsParser.PRINT, 0); }
		public Print_exprContext print_expr() {
			return getRuleContext(Print_exprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(PRINT);
			setState(215);
			print_expr();
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

	public static class Print_comContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GrammaticsParser.PRINT, 0); }
		public TerminalNode OPAR() { return getToken(GrammaticsParser.OPAR, 0); }
		public TerminalNode ID() { return getToken(GrammaticsParser.ID, 0); }
		public TerminalNode CPAR() { return getToken(GrammaticsParser.CPAR, 0); }
		public Print_comContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_com; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterPrint_com(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitPrint_com(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitPrint_com(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_comContext print_com() throws RecognitionException {
		Print_comContext _localctx = new Print_comContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_print_com);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(PRINT);
			setState(218);
			match(OPAR);
			setState(219);
			match(ID);
			setState(220);
			match(CPAR);
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

	public static class Print_exprContext extends ParserRuleContext {
		public Print_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_expr; }
	 
		public Print_exprContext() { }
		public void copyFrom(Print_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintIdContext extends Print_exprContext {
		public TerminalNode ID() { return getToken(GrammaticsParser.ID, 0); }
		public PrintIdContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterPrintId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitPrintId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitPrintId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintIntContext extends Print_exprContext {
		public TerminalNode INT() { return getToken(GrammaticsParser.INT, 0); }
		public PrintIntContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterPrintInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitPrintInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitPrintInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintFloatContext extends Print_exprContext {
		public TerminalNode FLOAT() { return getToken(GrammaticsParser.FLOAT, 0); }
		public PrintFloatContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterPrintFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitPrintFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitPrintFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_exprContext print_expr() throws RecognitionException {
		Print_exprContext _localctx = new Print_exprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_print_expr);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new PrintIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(ID);
				}
				break;
			case INT:
				_localctx = new PrintIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new PrintFloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(FLOAT);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammaticsParser.ID, 0); }
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(ID);
			setState(228);
			param_call();
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

	public static class Param_callContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(GrammaticsParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(GrammaticsParser.CPAR, 0); }
		public Arg_callContext arg_call() {
			return getRuleContext(Arg_callContext.class,0);
		}
		public Param_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterParam_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitParam_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitParam_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_callContext param_call() throws RecognitionException {
		Param_callContext _localctx = new Param_callContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_param_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(OPAR);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(231);
				arg_call();
				}
			}

			setState(234);
			match(CPAR);
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

	public static class Arg_callContext extends ParserRuleContext {
		public Arg_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_call; }
	 
		public Arg_callContext() { }
		public void copyFrom(Arg_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamCallArgsContext extends Arg_callContext {
		public TerminalNode ID() { return getToken(GrammaticsParser.ID, 0); }
		public Arg_callContext arg_call() {
			return getRuleContext(Arg_callContext.class,0);
		}
		public ParamCallArgsContext(Arg_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterParamCallArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitParamCallArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitParamCallArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamCallArgContext extends Arg_callContext {
		public TerminalNode ID() { return getToken(GrammaticsParser.ID, 0); }
		public ParamCallArgContext(Arg_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterParamCallArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitParamCallArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitParamCallArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_callContext arg_call() throws RecognitionException {
		Arg_callContext _localctx = new Arg_callContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arg_call);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ParamCallArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamCallArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(ID);
				setState(238);
				match(T__0);
				setState(239);
				arg_call();
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnFunctionContext extends FunctionContext {
		public TerminalNode FUNCTION() { return getToken(GrammaticsParser.FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammaticsParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Stat_block_with_returnContext stat_block_with_return() {
			return getRuleContext(Stat_block_with_returnContext.class,0);
		}
		public ReturnFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterReturnFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitReturnFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitReturnFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidFunctionContext extends FunctionContext {
		public TerminalNode FUNCTION() { return getToken(GrammaticsParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(GrammaticsParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public VoidFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterVoidFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitVoidFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitVoidFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new VoidFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(FUNCTION);
				setState(243);
				match(ID);
				setState(244);
				param();
				setState(245);
				stat_block();
				}
				break;
			case 2:
				_localctx = new ReturnFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(FUNCTION);
				setState(248);
				type();
				setState(249);
				match(ID);
				setState(250);
				param();
				setState(251);
				stat_block_with_return();
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

	public static class Stat_block_with_returnContext extends ParserRuleContext {
		public TerminalNode OBRACKET() { return getToken(GrammaticsParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public Return_idContext return_id() {
			return getRuleContext(Return_idContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(GrammaticsParser.CBRACKET, 0); }
		public Stat_block_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterStat_block_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitStat_block_with_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitStat_block_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_block_with_returnContext stat_block_with_return() throws RecognitionException {
		Stat_block_with_returnContext _localctx = new Stat_block_with_returnContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_stat_block_with_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(OBRACKET);
			setState(256);
			start();
			setState(257);
			return_id();
			setState(258);
			match(CBRACKET);
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

	public static class Return_idContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(GrammaticsParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(GrammaticsParser.ID, 0); }
		public Return_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterReturn_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitReturn_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitReturn_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_idContext return_id() throws RecognitionException {
		Return_idContext _localctx = new Return_idContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_return_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(RETURN);
			setState(261);
			match(ID);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(GrammaticsParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(GrammaticsParser.CPAR, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(OPAR);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_TYPE || _la==FLOAT_TYPE) {
				{
				setState(264);
				arg();
				}
			}

			setState(267);
			match(CPAR);
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

	public static class ArgContext extends ParserRuleContext {
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	 
		public ArgContext() { }
		public void copyFrom(ArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamArgsContext extends ArgContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammaticsParser.ID, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ParamArgsContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterParamArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitParamArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitParamArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamArgContext extends ArgContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammaticsParser.ID, 0); }
		public ParamArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterParamArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitParamArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitParamArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arg);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ParamArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				type();
				setState(270);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				type();
				setState(273);
				match(ID);
				setState(274);
				match(T__0);
				setState(275);
				arg();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(GrammaticsParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(GrammaticsParser.FLOAT_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaticsListener ) ((GrammaticsListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaticsVisitor ) return ((GrammaticsVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !(_la==INT_TYPE || _la==FLOAT_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u011c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5c\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6{\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6\u0086\n\6\f\6\16\6\u0089\13\6\3\7\3\7\3\7\3\7\5\7\u008f\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u00aa\n\16\f\16\16\16\u00ad"+
		"\13\16\3\16\3\16\5\16\u00b1\n\16\3\17\3\17\5\17\u00b5\n\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u00d7\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\5\27\u00e4\n\27\3\30\3\30\3\30\3\31\3\31\5\31\u00eb\n\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\5\32\u00f3\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0100\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\5\36\u010c\n\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u0118\n\37\3 \3 \3 \2\3\n!\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\7\3\2\5\6\3\2\32\33\3"+
		"\2\27\31\3\2\22\23\4\2\n\r\24\25\2\u011e\2C\3\2\2\2\4O\3\2\2\2\6W\3\2"+
		"\2\2\bb\3\2\2\2\nz\3\2\2\2\f\u008e\3\2\2\2\16\u0090\3\2\2\2\20\u0095\3"+
		"\2\2\2\22\u0098\3\2\2\2\24\u009d\3\2\2\2\26\u00a0\3\2\2\2\30\u00a2\3\2"+
		"\2\2\32\u00a4\3\2\2\2\34\u00b2\3\2\2\2\36\u00ba\3\2\2\2 \u00be\3\2\2\2"+
		"\"\u00c1\3\2\2\2$\u00c7\3\2\2\2&\u00d6\3\2\2\2(\u00d8\3\2\2\2*\u00db\3"+
		"\2\2\2,\u00e3\3\2\2\2.\u00e5\3\2\2\2\60\u00e8\3\2\2\2\62\u00f2\3\2\2\2"+
		"\64\u00ff\3\2\2\2\66\u0101\3\2\2\28\u0106\3\2\2\2:\u0109\3\2\2\2<\u0117"+
		"\3\2\2\2>\u0119\3\2\2\2@B\5\f\7\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2"+
		"\2\2DI\3\2\2\2EC\3\2\2\2FH\5\64\33\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3"+
		"\2\2\2JL\3\2\2\2KI\3\2\2\2LM\5\4\3\2MN\7\2\2\3N\3\3\2\2\2OP\7\'\2\2PQ"+
		"\7\16\2\2QR\5\6\4\2RS\7\17\2\2S\5\3\2\2\2TV\5\b\5\2UT\3\2\2\2VY\3\2\2"+
		"\2WU\3\2\2\2WX\3\2\2\2X\7\3\2\2\2YW\3\2\2\2Zc\5\f\7\2[c\5\n\6\2\\c\5("+
		"\25\2]c\5*\26\2^c\5\32\16\2_c\5 \21\2`c\5\"\22\2ac\5.\30\2bZ\3\2\2\2b"+
		"[\3\2\2\2b\\\3\2\2\2b]\3\2\2\2b^\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2"+
		"c\t\3\2\2\2de\b\6\1\2ef\7\b\2\2fg\t\2\2\2gh\7\t\2\2h{\5\n\6\fij\7,\2\2"+
		"jk\7\b\2\2kl\5\n\6\2lm\7\t\2\2m{\3\2\2\2no\t\3\2\2o{\5\n\6\tpq\7\b\2\2"+
		"qr\5\n\6\2rs\7\t\2\2s{\3\2\2\2t{\7,\2\2u{\5\26\f\2v{\5\30\r\2wx\7,\2\2"+
		"xy\7\4\2\2y{\5\n\6\3zd\3\2\2\2zi\3\2\2\2zn\3\2\2\2zp\3\2\2\2zt\3\2\2\2"+
		"zu\3\2\2\2zv\3\2\2\2zw\3\2\2\2{\u0087\3\2\2\2|}\f\r\2\2}~\t\4\2\2~\u0086"+
		"\5\n\6\16\177\u0080\f\13\2\2\u0080\u0081\t\3\2\2\u0081\u0086\5\n\6\f\u0082"+
		"\u0083\f\4\2\2\u0083\u0084\7\35\2\2\u0084\u0086\5\n\6\5\u0085|\3\2\2\2"+
		"\u0085\177\3\2\2\2\u0085\u0082\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\13\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008f\5\16\b\2\u008b\u008f\5\20\t\2\u008c\u008f\5\22\n\2\u008d\u008f"+
		"\5\24\13\2\u008e\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2"+
		"\u008e\u008d\3\2\2\2\u008f\r\3\2\2\2\u0090\u0091\7\5\2\2\u0091\u0092\7"+
		",\2\2\u0092\u0093\7\4\2\2\u0093\u0094\5\n\6\2\u0094\17\3\2\2\2\u0095\u0096"+
		"\7\37\2\2\u0096\u0097\5\16\b\2\u0097\21\3\2\2\2\u0098\u0099\7\6\2\2\u0099"+
		"\u009a\7,\2\2\u009a\u009b\7\4\2\2\u009b\u009c\5\n\6\2\u009c\23\3\2\2\2"+
		"\u009d\u009e\7\37\2\2\u009e\u009f\5\22\n\2\u009f\25\3\2\2\2\u00a0\u00a1"+
		"\7*\2\2\u00a1\27\3\2\2\2\u00a2\u00a3\7+\2\2\u00a3\31\3\2\2\2\u00a4\u00a5"+
		"\7 \2\2\u00a5\u00ab\5\34\17\2\u00a6\u00a7\7!\2\2\u00a7\u00a8\7 \2\2\u00a8"+
		"\u00aa\5\34\17\2\u00a9\u00a6\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b0\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00af\7!\2\2\u00af\u00b1\5\36\20\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b1\33\3\2\2\2\u00b2\u00b4\7\b\2\2\u00b3\u00b5\7\21\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\5&"+
		"\24\2\u00b7\u00b8\7\t\2\2\u00b8\u00b9\5\36\20\2\u00b9\35\3\2\2\2\u00ba"+
		"\u00bb\7\16\2\2\u00bb\u00bc\5\6\4\2\u00bc\u00bd\7\17\2\2\u00bd\37\3\2"+
		"\2\2\u00be\u00bf\7\"\2\2\u00bf\u00c0\5\34\17\2\u00c0!\3\2\2\2\u00c1\u00c2"+
		"\7$\2\2\u00c2\u00c3\7\b\2\2\u00c3\u00c4\5$\23\2\u00c4\u00c5\7\t\2\2\u00c5"+
		"\u00c6\5\36\20\2\u00c6#\3\2\2\2\u00c7\u00c8\7,\2\2\u00c8\u00c9\7\4\2\2"+
		"\u00c9\u00ca\5\n\6\2\u00ca\u00cb\7\7\2\2\u00cb\u00cc\5&\24\2\u00cc\u00cd"+
		"\7\7\2\2\u00cd\u00ce\7,\2\2\u00ce\u00cf\t\5\2\2\u00cf%\3\2\2\2\u00d0\u00d1"+
		"\7,\2\2\u00d1\u00d2\t\6\2\2\u00d2\u00d7\5\n\6\2\u00d3\u00d4\7,\2\2\u00d4"+
		"\u00d5\7\26\2\2\u00d5\u00d7\5> \2\u00d6\u00d0\3\2\2\2\u00d6\u00d3\3\2"+
		"\2\2\u00d7\'\3\2\2\2\u00d8\u00d9\7\36\2\2\u00d9\u00da\5,\27\2\u00da)\3"+
		"\2\2\2\u00db\u00dc\7\36\2\2\u00dc\u00dd\7\b\2\2\u00dd\u00de\7,\2\2\u00de"+
		"\u00df\7\t\2\2\u00df+\3\2\2\2\u00e0\u00e4\7,\2\2\u00e1\u00e4\7*\2\2\u00e2"+
		"\u00e4\7+\2\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2"+
		"\2\2\u00e4-\3\2\2\2\u00e5\u00e6\7,\2\2\u00e6\u00e7\5\60\31\2\u00e7/\3"+
		"\2\2\2\u00e8\u00ea\7\b\2\2\u00e9\u00eb\5\62\32\2\u00ea\u00e9\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7\t\2\2\u00ed\61\3\2\2"+
		"\2\u00ee\u00f3\7,\2\2\u00ef\u00f0\7,\2\2\u00f0\u00f1\7\3\2\2\u00f1\u00f3"+
		"\5\62\32\2\u00f2\u00ee\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f3\63\3\2\2\2\u00f4"+
		"\u00f5\7(\2\2\u00f5\u00f6\7,\2\2\u00f6\u00f7\5:\36\2\u00f7\u00f8\5\36"+
		"\20\2\u00f8\u0100\3\2\2\2\u00f9\u00fa\7(\2\2\u00fa\u00fb\5> \2\u00fb\u00fc"+
		"\7,\2\2\u00fc\u00fd\5:\36\2\u00fd\u00fe\5\66\34\2\u00fe\u0100\3\2\2\2"+
		"\u00ff\u00f4\3\2\2\2\u00ff\u00f9\3\2\2\2\u0100\65\3\2\2\2\u0101\u0102"+
		"\7\16\2\2\u0102\u0103\5\6\4\2\u0103\u0104\58\35\2\u0104\u0105\7\17\2\2"+
		"\u0105\67\3\2\2\2\u0106\u0107\7)\2\2\u0107\u0108\7,\2\2\u01089\3\2\2\2"+
		"\u0109\u010b\7\b\2\2\u010a\u010c\5<\37\2\u010b\u010a\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7\t\2\2\u010e;\3\2\2\2\u010f"+
		"\u0110\5> \2\u0110\u0111\7,\2\2\u0111\u0118\3\2\2\2\u0112\u0113\5> \2"+
		"\u0113\u0114\7,\2\2\u0114\u0115\7\3\2\2\u0115\u0116\5<\37\2\u0116\u0118"+
		"\3\2\2\2\u0117\u010f\3\2\2\2\u0117\u0112\3\2\2\2\u0118=\3\2\2\2\u0119"+
		"\u011a\t\2\2\2\u011a?\3\2\2\2\24CIWbz\u0085\u0087\u008e\u00ab\u00b0\u00b4"+
		"\u00d6\u00e3\u00ea\u00f2\u00ff\u010b\u0117";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}