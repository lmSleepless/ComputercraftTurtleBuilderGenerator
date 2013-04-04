// Generated from E:\Development\eclipseWorkspace\ComputercraftTurtleBuilderGenerator\src/sleepless/cctbg/language/TurtleBuildGrammer.g4 by ANTLR 4.0

package sleepless.cctbg.language;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TurtleBuildGrammerLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BUILD=1, FORWARD=2, DOWN=3, DATADICT=4, TIMES=5, NOTHING=6, INFINITE=7, 
		LINE=8, NEWLINE=9, COMMENT=10, COMMA=11, WHITESPACE=12, OPENBLOCK=13, 
		CLOSEBLOCK=14, COLON=15, SEMICOLON=16, WORD=17, NUMBER=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'BUILD'", "'FORWARD'", "'DOWN'", "'DATADICT'", "'TIMES'", "'NOTHING'", 
		"'INFINITE'", "'LINE'", "NEWLINE", "COMMENT", "','", "WHITESPACE", "'{'", 
		"'}'", "':'", "';'", "WORD", "NUMBER"
	};
	public static final String[] ruleNames = {
		"BUILD", "FORWARD", "DOWN", "DATADICT", "TIMES", "NOTHING", "INFINITE", 
		"LINE", "NEWLINE", "COMMENT", "COMMA", "WHITESPACE", "OPENBLOCK", "CLOSEBLOCK", 
		"COLON", "SEMICOLON", "WORD", "NUMBER"
	};


	public TurtleBuildGrammerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TurtleBuildGrammer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 8: NEWLINE_action((RuleContext)_localctx, actionIndex); break;

		case 9: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 11: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\24\u008c\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\7\13h\n\13\f\13\16\13k\13\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\6\ru\n\r\r\r\16\rv\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\6\22\u0084\n\22\r\22\16\22\u0085\3\23\6\23\u0089\n\23"+
		"\r\23\16\23\u008a\3i\24\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21"+
		"\n\1\23\13\2\25\f\3\27\r\1\31\16\4\33\17\1\35\20\1\37\21\1!\22\1#\23\1"+
		"%\24\1\3\2\6\5\f\f\17\17AA\4\13\13\"\"\4C\\c|\3\63;\u008f\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\3\'\3\2\2\2\5-\3\2\2\2\7\65\3\2\2\2\t:\3\2\2\2\13C\3\2\2\2\rI\3\2\2"+
		"\2\17Q\3\2\2\2\21Z\3\2\2\2\23_\3\2\2\2\25c\3\2\2\2\27q\3\2\2\2\31t\3\2"+
		"\2\2\33z\3\2\2\2\35|\3\2\2\2\37~\3\2\2\2!\u0080\3\2\2\2#\u0083\3\2\2\2"+
		"%\u0088\3\2\2\2\'(\7D\2\2()\7W\2\2)*\7K\2\2*+\7N\2\2+,\7F\2\2,\4\3\2\2"+
		"\2-.\7H\2\2./\7Q\2\2/\60\7T\2\2\60\61\7Y\2\2\61\62\7C\2\2\62\63\7T\2\2"+
		"\63\64\7F\2\2\64\6\3\2\2\2\65\66\7F\2\2\66\67\7Q\2\2\678\7Y\2\289\7P\2"+
		"\29\b\3\2\2\2:;\7F\2\2;<\7C\2\2<=\7V\2\2=>\7C\2\2>?\7F\2\2?@\7K\2\2@A"+
		"\7E\2\2AB\7V\2\2B\n\3\2\2\2CD\7V\2\2DE\7K\2\2EF\7O\2\2FG\7G\2\2GH\7U\2"+
		"\2H\f\3\2\2\2IJ\7P\2\2JK\7Q\2\2KL\7V\2\2LM\7J\2\2MN\7K\2\2NO\7P\2\2OP"+
		"\7I\2\2P\16\3\2\2\2QR\7K\2\2RS\7P\2\2ST\7H\2\2TU\7K\2\2UV\7P\2\2VW\7K"+
		"\2\2WX\7V\2\2XY\7G\2\2Y\20\3\2\2\2Z[\7N\2\2[\\\7K\2\2\\]\7P\2\2]^\7G\2"+
		"\2^\22\3\2\2\2_`\t\2\2\2`a\3\2\2\2ab\b\n\2\2b\24\3\2\2\2cd\7\61\2\2de"+
		"\7,\2\2ei\3\2\2\2fh\13\2\2\2gf\3\2\2\2hk\3\2\2\2ij\3\2\2\2ig\3\2\2\2j"+
		"l\3\2\2\2ki\3\2\2\2lm\7,\2\2mn\7\61\2\2no\3\2\2\2op\b\13\3\2p\26\3\2\2"+
		"\2qr\7.\2\2r\30\3\2\2\2su\t\3\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2"+
		"\2\2wx\3\2\2\2xy\b\r\4\2y\32\3\2\2\2z{\7}\2\2{\34\3\2\2\2|}\7\177\2\2"+
		"}\36\3\2\2\2~\177\7<\2\2\177 \3\2\2\2\u0080\u0081\7=\2\2\u0081\"\3\2\2"+
		"\2\u0082\u0084\t\4\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086$\3\2\2\2\u0087\u0089\t\5\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b&\3\2\2\2\7\2iv\u0085\u008a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}