// Generated from Phase3.g by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Phase3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, Zero=2, One=3, Boolean=4, Int=5, Float=6, While=7, For=8, If=9, 
		Else=10, ElseIf=11, Continue=12, Break=13, True=14, False=15, Equals=16, 
		Assignment=17, Greater=18, Less=19, GreaterEqual=20, LessEqual=21, Not=22, 
		Add=23, Subtraction=24, BitwiseNegation=25, LogicalXor=26, ArtihmeticAnd=27, 
		LogicalAnd=28, ArtihmeticOr=29, LogicalOr=30, Multiplication=31, Division=32, 
		Increment=33, Decrement=34, Mod=35, OpenParenthesis=36, CloseParenthesis=37, 
		SemiColon=38, NotEqual=39, OpenCurlyBrace=40, CloseCurlyBrace=41, ID=42, 
		IntConst=43, FloatConst=44;
	public static final int
		RULE_pogram = 0, RULE_bool = 1, RULE_constValue = 2, RULE_conditional = 3, 
		RULE_arithmatic = 4, RULE_binaryOp = 5, RULE_expr = 6, RULE_loopStmt = 7, 
		RULE_condStmt = 8, RULE_variable = 9, RULE_assignment = 10, RULE_statement = 11, 
		RULE_type = 12, RULE_varDeclCnt = 13, RULE_varDecl = 14, RULE_block = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"pogram", "bool", "constValue", "conditional", "arithmatic", "binaryOp", 
			"expr", "loopStmt", "condStmt", "variable", "assignment", "statement", 
			"type", "varDeclCnt", "varDecl", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'0'", "'1'", "'boolean'", "'int'", "'float'", "'while'", 
			"'for'", "'if'", "'else'", "'else if'", "'continue'", "'break'", "'true'", 
			"'false'", "'=='", "'='", "'>'", "'<'", "'>='", "'<='", "'!'", "'+'", 
			"'-'", "'~'", "'^'", "'&'", "'&&'", "'|'", "'||'", "'*'", "'/'", "'++'", 
			"'--'", "'%'", "'('", "')'", "';'", "'!='", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "Zero", "One", "Boolean", "Int", "Float", "While", "For", 
			"If", "Else", "ElseIf", "Continue", "Break", "True", "False", "Equals", 
			"Assignment", "Greater", "Less", "GreaterEqual", "LessEqual", "Not", 
			"Add", "Subtraction", "BitwiseNegation", "LogicalXor", "ArtihmeticAnd", 
			"LogicalAnd", "ArtihmeticOr", "LogicalOr", "Multiplication", "Division", 
			"Increment", "Decrement", "Mod", "OpenParenthesis", "CloseParenthesis", 
			"SemiColon", "NotEqual", "OpenCurlyBrace", "CloseCurlyBrace", "ID", "IntConst", 
			"FloatConst"
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
	public String getGrammarFileName() { return "Phase3.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Phase3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PogramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pogram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).enterPogram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).exitPogram(this);
		}
	}

	public final PogramContext pogram() throws RecognitionException {
		PogramContext _localctx = new PogramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pogram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			block();
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(Phase3Parser.True, 0); }
		public TerminalNode False() { return getToken(Phase3Parser.False, 0); }
		public TerminalNode One() { return getToken(Phase3Parser.One, 0); }
		public TerminalNode Zero() { return getToken(Phase3Parser.Zero, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Zero) | (1L << One) | (1L << True) | (1L << False))) != 0)) ) {
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

	public static class ConstValueContext extends ParserRuleContext {
		public TerminalNode IntConst() { return getToken(Phase3Parser.IntConst, 0); }
		public TerminalNode FloatConst() { return getToken(Phase3Parser.FloatConst, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ConstValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).enterConstValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).exitConstValue(this);
		}
	}

	public final ConstValueContext constValue() throws RecognitionException {
		ConstValueContext _localctx = new ConstValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constValue);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntConst:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(IntConst);
				}
				break;
			case FloatConst:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(FloatConst);
				}
				break;
			case Zero:
			case One:
			case True:
			case False:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				bool();
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode Equals() { return getToken(Phase3Parser.Equals, 0); }
		public TerminalNode NotEqual() { return getToken(Phase3Parser.NotEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(Phase3Parser.GreaterEqual, 0); }
		public TerminalNode LessEqual() { return getToken(Phase3Parser.LessEqual, 0); }
		public TerminalNode Less() { return getToken(Phase3Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(Phase3Parser.Greater, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equals) | (1L << Greater) | (1L << Less) | (1L << GreaterEqual) | (1L << LessEqual) | (1L << NotEqual))) != 0)) ) {
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

	public static class ArithmaticContext extends ParserRuleContext {
		public TerminalNode Add() { return getToken(Phase3Parser.Add, 0); }
		public TerminalNode Subtraction() { return getToken(Phase3Parser.Subtraction, 0); }
		public TerminalNode Multiplication() { return getToken(Phase3Parser.Multiplication, 0); }
		public TerminalNode Division() { return getToken(Phase3Parser.Division, 0); }
		public TerminalNode Mod() { return getToken(Phase3Parser.Mod, 0); }
		public TerminalNode ArtihmeticAnd() { return getToken(Phase3Parser.ArtihmeticAnd, 0); }
		public TerminalNode ArtihmeticOr() { return getToken(Phase3Parser.ArtihmeticOr, 0); }
		public TerminalNode LogicalXor() { return getToken(Phase3Parser.LogicalXor, 0); }
		public TerminalNode LogicalAnd() { return getToken(Phase3Parser.LogicalAnd, 0); }
		public TerminalNode LogicalOr() { return getToken(Phase3Parser.LogicalOr, 0); }
		public ArithmaticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmatic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).enterArithmatic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).exitArithmatic(this);
		}
	}

	public final ArithmaticContext arithmatic() throws RecognitionException {
		ArithmaticContext _localctx = new ArithmaticContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arithmatic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Add) | (1L << Subtraction) | (1L << LogicalXor) | (1L << ArtihmeticAnd) | (1L << LogicalAnd) | (1L << ArtihmeticOr) | (1L << LogicalOr) | (1L << Multiplication) | (1L << Division) | (1L << Mod))) != 0)) ) {
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

	public static class BinaryOpContext extends ParserRuleContext {
		public ArithmaticContext arithmatic() {
			return getRuleContext(ArithmaticContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public BinaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).enterBinaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).exitBinaryOp(this);
		}
	}

	public final BinaryOpContext binaryOp() throws RecognitionException {
		BinaryOpContext _localctx = new BinaryOpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_binaryOp);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Add:
			case Subtraction:
			case LogicalXor:
			case ArtihmeticAnd:
			case LogicalAnd:
			case ArtihmeticOr:
			case LogicalOr:
			case Multiplication:
			case Division:
			case Mod:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				arithmatic();
				}
				break;
			case Equals:
			case Greater:
			case Less:
			case GreaterEqual:
			case LessEqual:
			case NotEqual:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				conditional();
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode OpenParenthesis() { return getToken(Phase3Parser.OpenParenthesis, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CloseParenthesis() { return getToken(Phase3Parser.CloseParenthesis, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConstValueContext constValue() {
			return getRuleContext(ConstValueContext.class,0);
		}
		public TerminalNode Subtraction() { return getToken(Phase3Parser.Subtraction, 0); }
		public TerminalNode Not() { return getToken(Phase3Parser.Not, 0); }
		public BinaryOpContext binaryOp() {
			return getRuleContext(BinaryOpContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).exitExpr(this);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenParenthesis:
				{
				setState(50);
				match(OpenParenthesis);
				setState(51);
				expr(0);
				setState(52);
				match(CloseParenthesis);
				}
				break;
			case Increment:
			case Decrement:
			case ID:
				{
				setState(54);
				variable(0);
				}
				break;
			case Zero:
			case One:
			case True:
			case False:
			case IntConst:
			case FloatConst:
				{
				setState(55);
				constValue();
				}
				break;
			case Subtraction:
				{
				setState(56);
				match(Subtraction);
				setState(57);
				expr(2);
				}
				break;
			case Not:
				{
				setState(58);
				match(Not);
				setState(59);
				expr(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(62);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(63);
					binaryOp();
					setState(64);
					expr(7);
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class LoopStmtContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(Phase3Parser.For, 0); }
		public TerminalNode OpenParenthesis() { return getToken(Phase3Parser.OpenParenthesis, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(Phase3Parser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(Phase3Parser.SemiColon, i);
		}
		public TerminalNode CloseParenthesis() { return getToken(Phase3Parser.CloseParenthesis, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarDeclCntContext varDeclCnt() {
			return getRuleContext(VarDeclCntContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode While() { return getToken(Phase3Parser.While, 0); }
		public LoopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).enterLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).exitLoopStmt(this);
		}
	}

	public final LoopStmtContext loopStmt() throws RecognitionException {
		LoopStmtContext _localctx = new LoopStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loopStmt);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case For:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(For);
				setState(72);
				match(OpenParenthesis);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Increment) | (1L << Decrement) | (1L << ID))) != 0)) {
					{
					setState(73);
					varDeclCnt();
					}
				}

				setState(76);
				match(SemiColon);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Zero) | (1L << One) | (1L << True) | (1L << False) | (1L << Not) | (1L << Subtraction) | (1L << Increment) | (1L << Decrement) | (1L << OpenParenthesis) | (1L << ID) | (1L << IntConst) | (1L << FloatConst))) != 0)) {
					{
					setState(77);
					expr(0);
					}
				}

				setState(80);
				match(SemiColon);
				setState(83);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(81);
					assignment();
					}
					break;
				case 2:
					{
					setState(82);
					expr(0);
					}
					break;
				}
				setState(85);
				match(CloseParenthesis);
				setState(86);
				block();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(While);
				setState(88);
				match(OpenParenthesis);
				setState(89);
				expr(0);
				setState(90);
				match(CloseParenthesis);
				setState(91);
				block();
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

	public static class CondStmtContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(Phase3Parser.If, 0); }
		public List<TerminalNode> OpenParenthesis() { return getTokens(Phase3Parser.OpenParenthesis); }
		public TerminalNode OpenParenthesis(int i) {
			return getToken(Phase3Parser.OpenParenthesis, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CloseParenthesis() { return getTokens(Phase3Parser.CloseParenthesis); }
		public TerminalNode CloseParenthesis(int i) {
			return getToken(Phase3Parser.CloseParenthesis, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ElseIf() { return getTokens(Phase3Parser.ElseIf); }
		public TerminalNode ElseIf(int i) {
			return getToken(Phase3Parser.ElseIf, i);
		}
		public TerminalNode Else() { return getToken(Phase3Parser.Else, 0); }
		public CondStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).enterCondStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).exitCondStmt(this);
		}
	}

	public final CondStmtContext condStmt() throws RecognitionException {
		CondStmtContext _localctx = new CondStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(If);
			setState(96);
			match(OpenParenthesis);
			setState(97);
			expr(0);
			setState(98);
			match(CloseParenthesis);
			setState(99);
			block();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ElseIf) {
				{
				{
				setState(100);
				match(ElseIf);
				setState(101);
				match(OpenParenthesis);
				setState(102);
				expr(0);
				setState(103);
				match(CloseParenthesis);
				setState(104);
				block();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(111);
				match(Else);
				setState(112);
				block();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Phase3Parser.ID, 0); }
		public TerminalNode Decrement() { return getToken(Phase3Parser.Decrement, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Increment() { return getToken(Phase3Parser.Increment, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		return variable(0);
	}

	private VariableContext variable(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariableContext _localctx = new VariableContext(_ctx, _parentState);
		VariableContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_variable, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(116);
				match(ID);
				}
				break;
			case Decrement:
				{
				setState(117);
				match(Decrement);
				setState(118);
				variable(4);
				}
				break;
			case Increment:
				{
				setState(119);
				match(Increment);
				setState(120);
				variable(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new VariableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variable);
						setState(123);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(124);
						match(Decrement);
						}
						break;
					case 2:
						{
						_localctx = new VariableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variable);
						setState(125);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(126);
						match(Increment);
						}
						break;
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Assignment() { return getToken(Phase3Parser.Assignment, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			variable(0);
			setState(133);
			match(Assignment);
			setState(134);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(Phase3Parser.SemiColon, 0); }
		public CondStmtContext condStmt() {
			return getRuleContext(CondStmtContext.class,0);
		}
		public LoopStmtContext loopStmt() {
			return getRuleContext(LoopStmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Break() { return getToken(Phase3Parser.Break, 0); }
		public TerminalNode Continue() { return getToken(Phase3Parser.Continue, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				assignment();
				setState(137);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				condStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				loopStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				expr(0);
				setState(142);
				match(SemiColon);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				match(Break);
				setState(145);
				match(SemiColon);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
				match(Continue);
				setState(147);
				match(SemiColon);
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
		public TerminalNode Int() { return getToken(Phase3Parser.Int, 0); }
		public TerminalNode Boolean() { return getToken(Phase3Parser.Boolean, 0); }
		public TerminalNode Float() { return getToken(Phase3Parser.Float, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Int) | (1L << Float))) != 0)) ) {
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

	public static class VarDeclCntContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Assignment() { return getToken(Phase3Parser.Assignment, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclCntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclCnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).enterVarDeclCnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).exitVarDeclCnt(this);
		}
	}

	public final VarDeclCntContext varDeclCnt() throws RecognitionException {
		VarDeclCntContext _localctx = new VarDeclCntContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varDeclCnt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			variable(0);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assignment) {
				{
				setState(153);
				match(Assignment);
				setState(154);
				expr(0);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclCntContext varDeclCnt() {
			return getRuleContext(VarDeclCntContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			type();
			setState(158);
			varDeclCnt();
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
		public TerminalNode OpenCurlyBrace() { return getToken(Phase3Parser.OpenCurlyBrace, 0); }
		public TerminalNode CloseCurlyBrace() { return getToken(Phase3Parser.CloseCurlyBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(Phase3Parser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(Phase3Parser.SemiColon, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Phase3Listener ) ((Phase3Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(OpenCurlyBrace);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Zero) | (1L << One) | (1L << Boolean) | (1L << Int) | (1L << Float) | (1L << While) | (1L << For) | (1L << If) | (1L << Continue) | (1L << Break) | (1L << True) | (1L << False) | (1L << Not) | (1L << Subtraction) | (1L << Increment) | (1L << Decrement) | (1L << OpenParenthesis) | (1L << ID) | (1L << IntConst) | (1L << FloatConst))) != 0)) {
				{
				setState(165);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Zero:
				case One:
				case While:
				case For:
				case If:
				case Continue:
				case Break:
				case True:
				case False:
				case Not:
				case Subtraction:
				case Increment:
				case Decrement:
				case OpenParenthesis:
				case ID:
				case IntConst:
				case FloatConst:
					{
					setState(161);
					statement();
					}
					break;
				case Boolean:
				case Int:
				case Float:
					{
					setState(162);
					varDecl();
					setState(163);
					match(SemiColon);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(CloseCurlyBrace);
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
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 9:
			return variable_sempred((VariableContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean variable_sempred(VariableContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\5\4*\n\4\3\5\3\5\3\6\3\6\3\7\3\7\5\7\62\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b?\n\b\3\b\3\b\3\b\3\b\7\bE\n\b"+
		"\f\b\16\bH\13\b\3\t\3\t\3\t\5\tM\n\t\3\t\3\t\5\tQ\n\t\3\t\3\t\3\t\5\t"+
		"V\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t`\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\nm\n\n\f\n\16\np\13\n\3\n\3\n\5\nt\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13|\n\13\3\13\3\13\3\13\3\13\7\13\u0082\n\13\f"+
		"\13\16\13\u0085\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0097\n\r\3\16\3\16\3\17\3\17\3\17\5\17\u009e\n\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u00a8\n\21\f\21\16\21\u00ab"+
		"\13\21\3\21\3\21\3\21\2\4\16\24\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \2\6\4\2\4\5\20\21\5\2\22\22\24\27))\5\2\31\32\34\"%%\3\2\6\b\2\u00b9"+
		"\2\"\3\2\2\2\4$\3\2\2\2\6)\3\2\2\2\b+\3\2\2\2\n-\3\2\2\2\f\61\3\2\2\2"+
		"\16>\3\2\2\2\20_\3\2\2\2\22a\3\2\2\2\24{\3\2\2\2\26\u0086\3\2\2\2\30\u0096"+
		"\3\2\2\2\32\u0098\3\2\2\2\34\u009a\3\2\2\2\36\u009f\3\2\2\2 \u00a2\3\2"+
		"\2\2\"#\5 \21\2#\3\3\2\2\2$%\t\2\2\2%\5\3\2\2\2&*\7-\2\2\'*\7.\2\2(*\5"+
		"\4\3\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\7\3\2\2\2+,\t\3\2\2,\t\3\2\2\2"+
		"-.\t\4\2\2.\13\3\2\2\2/\62\5\n\6\2\60\62\5\b\5\2\61/\3\2\2\2\61\60\3\2"+
		"\2\2\62\r\3\2\2\2\63\64\b\b\1\2\64\65\7&\2\2\65\66\5\16\b\2\66\67\7\'"+
		"\2\2\67?\3\2\2\28?\5\24\13\29?\5\6\4\2:;\7\32\2\2;?\5\16\b\4<=\7\30\2"+
		"\2=?\5\16\b\3>\63\3\2\2\2>8\3\2\2\2>9\3\2\2\2>:\3\2\2\2><\3\2\2\2?F\3"+
		"\2\2\2@A\f\b\2\2AB\5\f\7\2BC\5\16\b\tCE\3\2\2\2D@\3\2\2\2EH\3\2\2\2FD"+
		"\3\2\2\2FG\3\2\2\2G\17\3\2\2\2HF\3\2\2\2IJ\7\n\2\2JL\7&\2\2KM\5\34\17"+
		"\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NP\7(\2\2OQ\5\16\b\2PO\3\2\2\2PQ\3\2\2"+
		"\2QR\3\2\2\2RU\7(\2\2SV\5\26\f\2TV\5\16\b\2US\3\2\2\2UT\3\2\2\2UV\3\2"+
		"\2\2VW\3\2\2\2WX\7\'\2\2X`\5 \21\2YZ\7\t\2\2Z[\7&\2\2[\\\5\16\b\2\\]\7"+
		"\'\2\2]^\5 \21\2^`\3\2\2\2_I\3\2\2\2_Y\3\2\2\2`\21\3\2\2\2ab\7\13\2\2"+
		"bc\7&\2\2cd\5\16\b\2de\7\'\2\2en\5 \21\2fg\7\r\2\2gh\7&\2\2hi\5\16\b\2"+
		"ij\7\'\2\2jk\5 \21\2km\3\2\2\2lf\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2"+
		"os\3\2\2\2pn\3\2\2\2qr\7\f\2\2rt\5 \21\2sq\3\2\2\2st\3\2\2\2t\23\3\2\2"+
		"\2uv\b\13\1\2v|\7,\2\2wx\7$\2\2x|\5\24\13\6yz\7#\2\2z|\5\24\13\5{u\3\2"+
		"\2\2{w\3\2\2\2{y\3\2\2\2|\u0083\3\2\2\2}~\f\4\2\2~\u0082\7$\2\2\177\u0080"+
		"\f\3\2\2\u0080\u0082\7#\2\2\u0081}\3\2\2\2\u0081\177\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\25\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0087\5\24\13\2\u0087\u0088\7\23\2\2\u0088\u0089"+
		"\5\16\b\2\u0089\27\3\2\2\2\u008a\u008b\5\26\f\2\u008b\u008c\7(\2\2\u008c"+
		"\u0097\3\2\2\2\u008d\u0097\5\22\n\2\u008e\u0097\5\20\t\2\u008f\u0090\5"+
		"\16\b\2\u0090\u0091\7(\2\2\u0091\u0097\3\2\2\2\u0092\u0093\7\17\2\2\u0093"+
		"\u0097\7(\2\2\u0094\u0095\7\16\2\2\u0095\u0097\7(\2\2\u0096\u008a\3\2"+
		"\2\2\u0096\u008d\3\2\2\2\u0096\u008e\3\2\2\2\u0096\u008f\3\2\2\2\u0096"+
		"\u0092\3\2\2\2\u0096\u0094\3\2\2\2\u0097\31\3\2\2\2\u0098\u0099\t\5\2"+
		"\2\u0099\33\3\2\2\2\u009a\u009d\5\24\13\2\u009b\u009c\7\23\2\2\u009c\u009e"+
		"\5\16\b\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\35\3\2\2\2\u009f"+
		"\u00a0\5\32\16\2\u00a0\u00a1\5\34\17\2\u00a1\37\3\2\2\2\u00a2\u00a9\7"+
		"*\2\2\u00a3\u00a8\5\30\r\2\u00a4\u00a5\5\36\20\2\u00a5\u00a6\7(\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8\u00ab\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ac\u00ad\7+\2\2\u00ad!\3\2\2\2\23)\61>FLPU_ns{\u0081"+
		"\u0083\u0096\u009d\u00a7\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}