// Generated from E:\Development\ComputercraftTurtleBuilderGenerator_java\ComputercraftTurtleBuilderGenerator\src/language/TurtleBuildGrammer.g4 by ANTLR 4.0

package language;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TurtleBuildGrammerParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BUILD=1, FORWARD=2, DOWN=3, DATADICT=4, TIMES=5, NOTHING=6, INFINITE=7, 
		LINE=8, NEWLINE=9, COMMENT=10, COMMA=11, WHITESPACE=12, OPENBLOCK=13, 
		CLOSEBLOCK=14, COLON=15, SEMICOLON=16, WORD=17, NUMBER=18;
	public static final String[] tokenNames = {
		"<INVALID>", "'BUILD'", "'FORWARD'", "'DOWN'", "'DATADICT'", "'TIMES'", 
		"'NOTHING'", "'INFINITE'", "'LINE'", "NEWLINE", "COMMENT", "','", "WHITESPACE", 
		"'{'", "'}'", "':'", "';'", "WORD", "NUMBER"
	};
	public static final int
		RULE_prog = 0, RULE_gen_expr = 1, RULE_repeat_expr = 2, RULE_builddir = 3, 
		RULE_builddir_opt = 4, RULE_datadict_block = 5, RULE_datadict_decl_list = 6, 
		RULE_datadict_decl = 7, RULE_block_symbol = 8, RULE_block_meaning = 9, 
		RULE_repeat = 10, RULE_repeat_iterations = 11, RULE_build_set = 12, RULE_build_set_item = 13;
	public static final String[] ruleNames = {
		"prog", "gen_expr", "repeat_expr", "builddir", "builddir_opt", "datadict_block", 
		"datadict_decl_list", "datadict_decl", "block_symbol", "block_meaning", 
		"repeat", "repeat_iterations", "build_set", "build_set_item"
	};

	@Override
	public String getGrammarFileName() { return "TurtleBuildGrammer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public TurtleBuildGrammerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Gen_exprContext gen_expr(int i) {
			return getRuleContext(Gen_exprContext.class,i);
		}
		public List<Gen_exprContext> gen_expr() {
			return getRuleContexts(Gen_exprContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BUILD) | (1L << DATADICT) | (1L << INFINITE) | (1L << LINE) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(28); gen_expr();
				}
				}
				setState(33);
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

	public static class Gen_exprContext extends ParserRuleContext {
		public BuilddirContext builddir() {
			return getRuleContext(BuilddirContext.class,0);
		}
		public Build_setContext build_set() {
			return getRuleContext(Build_setContext.class,0);
		}
		public Datadict_blockContext datadict_block() {
			return getRuleContext(Datadict_blockContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public Gen_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gen_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).enterGen_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).exitGen_expr(this);
		}
	}

	public final Gen_exprContext gen_expr() throws RecognitionException {
		Gen_exprContext _localctx = new Gen_exprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_gen_expr);
		try {
			setState(38);
			switch (_input.LA(1)) {
			case BUILD:
				enterOuterAlt(_localctx, 1);
				{
				setState(34); builddir();
				}
				break;
			case DATADICT:
				enterOuterAlt(_localctx, 2);
				{
				setState(35); datadict_block();
				}
				break;
			case INFINITE:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(36); repeat();
				}
				break;
			case LINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(37); build_set();
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

	public static class Repeat_exprContext extends ParserRuleContext {
		public Build_setContext build_set() {
			return getRuleContext(Build_setContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public Repeat_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).enterRepeat_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).exitRepeat_expr(this);
		}
	}

	public final Repeat_exprContext repeat_expr() throws RecognitionException {
		Repeat_exprContext _localctx = new Repeat_exprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_repeat_expr);
		try {
			setState(42);
			switch (_input.LA(1)) {
			case INFINITE:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(40); repeat();
				}
				break;
			case LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(41); build_set();
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

	public static class BuilddirContext extends ParserRuleContext {
		public TerminalNode BUILD() { return getToken(TurtleBuildGrammerParser.BUILD, 0); }
		public Builddir_optContext builddir_opt() {
			return getRuleContext(Builddir_optContext.class,0);
		}
		public BuilddirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builddir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).enterBuilddir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).exitBuilddir(this);
		}
	}

	public final BuilddirContext builddir() throws RecognitionException {
		BuilddirContext _localctx = new BuilddirContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_builddir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(BUILD);
			setState(45); builddir_opt();
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

	public static class Builddir_optContext extends ParserRuleContext {
		public TerminalNode FORWARD() { return getToken(TurtleBuildGrammerParser.FORWARD, 0); }
		public TerminalNode DOWN() { return getToken(TurtleBuildGrammerParser.DOWN, 0); }
		public Builddir_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builddir_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).enterBuilddir_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).exitBuilddir_opt(this);
		}
	}

	public final Builddir_optContext builddir_opt() throws RecognitionException {
		Builddir_optContext _localctx = new Builddir_optContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_builddir_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !(_la==FORWARD || _la==DOWN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Datadict_blockContext extends ParserRuleContext {
		public Datadict_decl_listContext datadict_decl_list(int i) {
			return getRuleContext(Datadict_decl_listContext.class,i);
		}
		public TerminalNode CLOSEBLOCK() { return getToken(TurtleBuildGrammerParser.CLOSEBLOCK, 0); }
		public List<Datadict_decl_listContext> datadict_decl_list() {
			return getRuleContexts(Datadict_decl_listContext.class);
		}
		public TerminalNode OPENBLOCK() { return getToken(TurtleBuildGrammerParser.OPENBLOCK, 0); }
		public TerminalNode DATADICT() { return getToken(TurtleBuildGrammerParser.DATADICT, 0); }
		public Datadict_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datadict_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).enterDatadict_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).exitDatadict_block(this);
		}
	}

	public final Datadict_blockContext datadict_block() throws RecognitionException {
		Datadict_blockContext _localctx = new Datadict_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_datadict_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(DATADICT);
			setState(50); match(OPENBLOCK);
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51); datadict_decl_list();
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(56); match(CLOSEBLOCK);
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

	public static class Datadict_decl_listContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(TurtleBuildGrammerParser.COMMA, 0); }
		public Datadict_declContext datadict_decl() {
			return getRuleContext(Datadict_declContext.class,0);
		}
		public Datadict_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datadict_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).enterDatadict_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).exitDatadict_decl_list(this);
		}
	}

	public final Datadict_decl_listContext datadict_decl_list() throws RecognitionException {
		Datadict_decl_listContext _localctx = new Datadict_decl_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_datadict_decl_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); datadict_decl();
			setState(60);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(59); match(COMMA);
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

	public static class Datadict_declContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(TurtleBuildGrammerParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(TurtleBuildGrammerParser.COMMA, 0); }
		public Block_meaningContext block_meaning() {
			return getRuleContext(Block_meaningContext.class,0);
		}
		public Block_symbolContext block_symbol() {
			return getRuleContext(Block_symbolContext.class,0);
		}
		public Datadict_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datadict_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).enterDatadict_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).exitDatadict_decl(this);
		}
	}

	public final Datadict_declContext datadict_decl() throws RecognitionException {
		Datadict_declContext _localctx = new Datadict_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_datadict_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); block_symbol();
			setState(63); match(COLON);
			setState(64); block_meaning();
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(65); match(COMMA);
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

	public static class Block_symbolContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TurtleBuildGrammerParser.WORD, 0); }
		public Block_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).enterBlock_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).exitBlock_symbol(this);
		}
	}

	public final Block_symbolContext block_symbol() throws RecognitionException {
		Block_symbolContext _localctx = new Block_symbolContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(WORD);
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

	public static class Block_meaningContext extends ParserRuleContext {
		public TerminalNode NOTHING() { return getToken(TurtleBuildGrammerParser.NOTHING, 0); }
		public TerminalNode NUMBER() { return getToken(TurtleBuildGrammerParser.NUMBER, 0); }
		public Block_meaningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_meaning; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).enterBlock_meaning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).exitBlock_meaning(this);
		}
	}

	public final Block_meaningContext block_meaning() throws RecognitionException {
		Block_meaningContext _localctx = new Block_meaningContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block_meaning);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==NOTHING || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class RepeatContext extends ParserRuleContext {
		public Repeat_exprContext repeat_expr(int i) {
			return getRuleContext(Repeat_exprContext.class,i);
		}
		public TerminalNode CLOSEBLOCK() { return getToken(TurtleBuildGrammerParser.CLOSEBLOCK, 0); }
		public TerminalNode TIMES() { return getToken(TurtleBuildGrammerParser.TIMES, 0); }
		public Repeat_iterationsContext repeat_iterations() {
			return getRuleContext(Repeat_iterationsContext.class,0);
		}
		public List<Repeat_exprContext> repeat_expr() {
			return getRuleContexts(Repeat_exprContext.class);
		}
		public TerminalNode OPENBLOCK() { return getToken(TurtleBuildGrammerParser.OPENBLOCK, 0); }
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).exitRepeat(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); repeat_iterations();
			setState(73); match(TIMES);
			setState(74); match(OPENBLOCK);
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75); repeat_expr();
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFINITE) | (1L << LINE) | (1L << NUMBER))) != 0) );
			setState(80); match(CLOSEBLOCK);
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

	public static class Repeat_iterationsContext extends ParserRuleContext {
		public TerminalNode INFINITE() { return getToken(TurtleBuildGrammerParser.INFINITE, 0); }
		public TerminalNode NUMBER() { return getToken(TurtleBuildGrammerParser.NUMBER, 0); }
		public Repeat_iterationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_iterations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).enterRepeat_iterations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).exitRepeat_iterations(this);
		}
	}

	public final Repeat_iterationsContext repeat_iterations() throws RecognitionException {
		Repeat_iterationsContext _localctx = new Repeat_iterationsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_repeat_iterations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==INFINITE || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Build_setContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(TurtleBuildGrammerParser.SEMICOLON, 0); }
		public TerminalNode LINE() { return getToken(TurtleBuildGrammerParser.LINE, 0); }
		public Build_set_itemContext build_set_item(int i) {
			return getRuleContext(Build_set_itemContext.class,i);
		}
		public List<Build_set_itemContext> build_set_item() {
			return getRuleContexts(Build_set_itemContext.class);
		}
		public Build_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).enterBuild_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).exitBuild_set(this);
		}
	}

	public final Build_setContext build_set() throws RecognitionException {
		Build_setContext _localctx = new Build_setContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_build_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(LINE);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(85); build_set_item();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91); match(SEMICOLON);
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

	public static class Build_set_itemContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(TurtleBuildGrammerParser.COMMA, 0); }
		public Block_symbolContext block_symbol() {
			return getRuleContext(Block_symbolContext.class,0);
		}
		public Build_set_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_set_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).enterBuild_set_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleBuildGrammerListener ) ((TurtleBuildGrammerListener)listener).exitBuild_set_item(this);
		}
	}

	public final Build_set_itemContext build_set_item() throws RecognitionException {
		Build_set_itemContext _localctx = new Build_set_itemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_build_set_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); block_symbol();
			setState(95);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(94); match(COMMA);
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

	public static final String _serializedATN =
		"\2\3\24d\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2"+
		"\f\2\16\2#\13\2\3\3\3\3\3\3\3\3\5\3)\n\3\3\4\3\4\5\4-\n\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\6\7\67\n\7\r\7\16\78\3\7\3\7\3\b\3\b\5\b?\n\b\3\t"+
		"\3\t\3\t\3\t\5\tE\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\6\fO\n\f\r\f\16"+
		"\fP\3\f\3\f\3\r\3\r\3\16\3\16\7\16Y\n\16\f\16\16\16\\\13\16\3\16\3\16"+
		"\3\17\3\17\5\17b\n\17\3\17\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2"+
		"\5\3\4\5\4\b\b\24\24\4\t\t\24\24`\2!\3\2\2\2\4(\3\2\2\2\6,\3\2\2\2\b."+
		"\3\2\2\2\n\61\3\2\2\2\f\63\3\2\2\2\16<\3\2\2\2\20@\3\2\2\2\22F\3\2\2\2"+
		"\24H\3\2\2\2\26J\3\2\2\2\30T\3\2\2\2\32V\3\2\2\2\34_\3\2\2\2\36 \5\4\3"+
		"\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#!\3\2\2"+
		"\2$)\5\b\5\2%)\5\f\7\2&)\5\26\f\2\')\5\32\16\2($\3\2\2\2(%\3\2\2\2(&\3"+
		"\2\2\2(\'\3\2\2\2)\5\3\2\2\2*-\5\26\f\2+-\5\32\16\2,*\3\2\2\2,+\3\2\2"+
		"\2-\7\3\2\2\2./\7\3\2\2/\60\5\n\6\2\60\t\3\2\2\2\61\62\t\2\2\2\62\13\3"+
		"\2\2\2\63\64\7\6\2\2\64\66\7\17\2\2\65\67\5\16\b\2\66\65\3\2\2\2\678\3"+
		"\2\2\28\66\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\20\2\2;\r\3\2\2\2<>\5\20\t"+
		"\2=?\7\r\2\2>=\3\2\2\2>?\3\2\2\2?\17\3\2\2\2@A\5\22\n\2AB\7\21\2\2BD\5"+
		"\24\13\2CE\7\r\2\2DC\3\2\2\2DE\3\2\2\2E\21\3\2\2\2FG\7\23\2\2G\23\3\2"+
		"\2\2HI\t\3\2\2I\25\3\2\2\2JK\5\30\r\2KL\7\7\2\2LN\7\17\2\2MO\5\6\4\2N"+
		"M\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\20\2\2S\27\3\2\2"+
		"\2TU\t\4\2\2U\31\3\2\2\2VZ\7\n\2\2WY\5\34\17\2XW\3\2\2\2Y\\\3\2\2\2ZX"+
		"\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\22\2\2^\33\3\2\2\2_a\5\22"+
		"\n\2`b\7\r\2\2a`\3\2\2\2ab\3\2\2\2b\35\3\2\2\2\13!(,8>DPZa";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}