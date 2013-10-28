// Generated from ABCMusic.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCMusicLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, DIGIT=2, INUMBER=3, ITITLE=4, ICOMPOSER=5, ILENGTH=6, IMETER=7, 
		ITEMPO=8, IVOICE=9, IKEY=10, EOL=11, COMMENTSIGN=12, SLASH=13, BASENOTE=14, 
		REST=15, BAR=16, SHARP=17, FLAT=18, NEUTRAL=19, NTH_REPEAT=20, OCTAVE_HIGHER=21, 
		OCTAVE_LOWER=22, SPACE=23, LYRICAL_ELEMENT_TOKEN=24, ILYRIC=25, OPEN_BRACKET=26, 
		CLOSE_BRACKET=27, OPEN_PAREN=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'+'", "DIGIT", "INUMBER", "ITITLE", "ICOMPOSER", "ILENGTH", "IMETER", 
		"ITEMPO", "IVOICE", "IKEY", "EOL", "COMMENTSIGN", "'/'", "BASENOTE", "REST", 
		"BAR", "SHARP", "FLAT", "NEUTRAL", "NTH_REPEAT", "OCTAVE_HIGHER", "OCTAVE_LOWER", 
		"' '", "LYRICAL_ELEMENT_TOKEN", "ILYRIC", "'['", "']'", "'('"
	};
	public static final String[] ruleNames = {
		"PLUS", "DIGIT", "INUMBER", "ITITLE", "ICOMPOSER", "ILENGTH", "IMETER", 
		"ITEMPO", "IVOICE", "IKEY", "EOL", "COMMENTSIGN", "SLASH", "BASENOTE", 
		"REST", "BAR", "SHARP", "FLAT", "NEUTRAL", "NTH_REPEAT", "OCTAVE_HIGHER", 
		"OCTAVE_LOWER", "SPACE", "LYRICAL_ELEMENT_TOKEN", "ILYRIC", "OPEN_BRACKET", 
		"CLOSE_BRACKET", "OPEN_PAREN"
	};


	    // This method makes the lexer or parser stop running if it encounters
	    // invalid input and throw a RuntimeException.
	    public void reportErrorsAsExceptions() {
	        removeErrorListeners();
	        addErrorListener(new ExceptionThrowingErrorListener());
	    }

	    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
	        @Override
	        public void syntaxError(Recognizer<?, ?> recognizer,
	                Object offendingSymbol, int line, int charPositionInLine,
	                String msg, RecognitionException e) {
	            throw new RuntimeException(msg);
	        }
	    }


	public ABCMusicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ABCMusic.g4"; }

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
		case 22: SPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\36\u0132\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\7\4D\n\4\f\4\16\4G\13\4\3\4\6\4J\n\4\r\4"+
		"\16\4K\3\5\3\5\3\5\3\5\7\5R\n\5\f\5\16\5U\13\5\3\5\6\5X\n\5\r\5\16\5Y"+
		"\3\6\3\6\3\6\3\6\7\6`\n\6\f\6\16\6c\13\6\3\6\6\6f\n\6\r\6\16\6g\3\7\3"+
		"\7\3\7\3\7\7\7n\n\7\f\7\16\7q\13\7\3\7\6\7t\n\7\r\7\16\7u\3\7\3\7\6\7"+
		"z\n\7\r\7\16\7{\3\b\3\b\3\b\3\b\7\b\u0082\n\b\f\b\16\b\u0085\13\b\3\b"+
		"\3\b\3\b\5\b\u008a\n\b\3\b\6\b\u008d\n\b\r\b\16\b\u008e\3\b\3\b\6\b\u0093"+
		"\n\b\r\b\16\b\u0094\5\b\u0097\n\b\3\t\3\t\3\t\3\t\7\t\u009d\n\t\f\t\16"+
		"\t\u00a0\13\t\3\t\3\t\3\t\5\t\u00a5\n\t\3\t\6\t\u00a8\n\t\r\t\16\t\u00a9"+
		"\3\t\3\t\6\t\u00ae\n\t\r\t\16\t\u00af\3\t\3\t\6\t\u00b4\n\t\r\t\16\t\u00b5"+
		"\7\t\u00b8\n\t\f\t\16\t\u00bb\13\t\5\t\u00bd\n\t\3\n\3\n\3\n\3\n\7\n\u00c3"+
		"\n\n\f\n\16\n\u00c6\13\n\3\n\6\n\u00c9\n\n\r\n\16\n\u00ca\3\13\3\13\3"+
		"\13\3\13\7\13\u00d1\n\13\f\13\16\13\u00d4\13\13\3\13\3\13\5\13\u00d8\n"+
		"\13\3\13\5\13\u00db\n\13\3\f\3\f\3\r\3\r\7\r\u00e1\n\r\f\r\16\r\u00e4"+
		"\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00f7\n\21\3\22\3\22\3\22\5\22\u00fc\n\22\3"+
		"\23\3\23\3\23\5\23\u0101\n\23\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0109"+
		"\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31"+
		"\u0117\n\31\3\32\3\32\3\32\3\32\7\32\u011d\n\32\f\32\16\32\u0120\13\32"+
		"\3\32\6\32\u0123\n\32\r\32\16\32\u0124\3\32\7\32\u0128\n\32\f\32\16\32"+
		"\u012b\13\32\3\33\3\33\3\34\3\34\3\35\3\35\2\36\3\3\1\5\4\1\7\5\1\t\6"+
		"\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35"+
		"\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\2\61\32\1"+
		"\63\33\1\65\34\1\67\35\19\36\1\3\2>\3\62;\4\13\13\"\"\3\62;\4\13\13\""+
		"\"\t\"$().\60\62;AAC\\c|\4\13\13\"\"\t\"$().\60\62;AAC\\c|\4\13\13\"\""+
		"\3\62;\3\62;\4\13\13\"\"\3EE\4^^~~\3EE\3\62;\3\62;\4\13\13\"\"\3EE\4^"+
		"^~~\3EE\3\62;\3\62;\3\62;\4\13\13\"\"\t\"$().\60\62;AAC\\c|\4\13\13\""+
		"\"\3Ci\4%%dd\3oo\4\f\f\17\17\t\"$().\60\62;AAC\\c|\4CIci\3||\4^^~~\4^"+
		"^~~\4^^~~\4))<<\4))<<\4^^~~\3]]\4^^~~\4^^~~\3^_\4^^~~\4^^``\4^^``\4^^"+
		"``\4^^aa\4^^aa\4^^aa\3??\3]]\3\63\63\3]]\3\64\64\3))\3..\7\"\",,//aa\u0080"+
		"\u0080\4\13\13\"\"\13##%&(+..\60\60\62;A\\^^c|\u015a\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7"+
		"?\3\2\2\2\tM\3\2\2\2\13[\3\2\2\2\ri\3\2\2\2\17}\3\2\2\2\21\u0098\3\2\2"+
		"\2\23\u00be\3\2\2\2\25\u00cc\3\2\2\2\27\u00dc\3\2\2\2\31\u00de\3\2\2\2"+
		"\33\u00e5\3\2\2\2\35\u00e7\3\2\2\2\37\u00e9\3\2\2\2!\u00f6\3\2\2\2#\u00fb"+
		"\3\2\2\2%\u0100\3\2\2\2\'\u0102\3\2\2\2)\u0108\3\2\2\2+\u010a\3\2\2\2"+
		"-\u010c\3\2\2\2/\u010e\3\2\2\2\61\u0116\3\2\2\2\63\u0118\3\2\2\2\65\u012c"+
		"\3\2\2\2\67\u012e\3\2\2\29\u0130\3\2\2\2;<\7-\2\2<\4\3\2\2\2=>\t\2\2\2"+
		">\6\3\2\2\2?@\7Z\2\2@A\7<\2\2AE\3\2\2\2BD\t\3\2\2CB\3\2\2\2DG\3\2\2\2"+
		"EC\3\2\2\2EF\3\2\2\2FI\3\2\2\2GE\3\2\2\2HJ\t\4\2\2IH\3\2\2\2JK\3\2\2\2"+
		"KI\3\2\2\2KL\3\2\2\2L\b\3\2\2\2MN\7V\2\2NO\7<\2\2OS\3\2\2\2PR\t\5\2\2"+
		"QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TW\3\2\2\2US\3\2\2\2VX\t\6\2\2"+
		"WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\n\3\2\2\2[\\\7E\2\2\\]\7<\2"+
		"\2]a\3\2\2\2^`\t\7\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2"+
		"\2ca\3\2\2\2df\t\b\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\f\3\2"+
		"\2\2ij\7N\2\2jk\7<\2\2ko\3\2\2\2ln\t\t\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2"+
		"\2op\3\2\2\2ps\3\2\2\2qo\3\2\2\2rt\t\n\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2"+
		"\2uv\3\2\2\2vw\3\2\2\2wy\7\61\2\2xz\t\13\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2"+
		"\2\2{|\3\2\2\2|\16\3\2\2\2}~\7O\2\2~\177\7<\2\2\177\u0083\3\2\2\2\u0080"+
		"\u0082\t\f\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0096\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0087\t\r\2\2\u0087\u008a\t\16\2\2\u0088\u008a\t\17\2\2\u0089\u0086\3"+
		"\2\2\2\u0089\u0088\3\2\2\2\u008a\u0097\3\2\2\2\u008b\u008d\t\20\2\2\u008c"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0092\7\61\2\2\u0091\u0093\t\21\2\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0097\3\2\2\2\u0096\u0089\3\2\2\2\u0096\u008c\3\2\2\2\u0097"+
		"\20\3\2\2\2\u0098\u0099\7S\2\2\u0099\u009a\7<\2\2\u009a\u009e\3\2\2\2"+
		"\u009b\u009d\t\22\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00bc\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\t\23\2\2\u00a2\u00a5\t\24\2\2\u00a3\u00a5\t\25\2\2\u00a4\u00a1"+
		"\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00bd\3\2\2\2\u00a6\u00a8\t\26\2\2"+
		"\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\7\61\2\2\u00ac\u00ae\t\27\2\2"+
		"\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b9\3\2\2\2\u00b1\u00b3\7?\2\2\u00b2\u00b4\t\30\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bc\u00a4\3\2\2\2\u00bc\u00a7\3\2\2\2\u00bd\22\3\2\2\2\u00be\u00bf"+
		"\7X\2\2\u00bf\u00c0\7<\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00c3\t\31\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\t\32\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\24\3\2\2\2\u00cc\u00cd\7M\2\2\u00cd\u00ce\7<\2\2\u00ce\u00d2"+
		"\3\2\2\2\u00cf\u00d1\t\33\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2"+
		"\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\u00d7\t\34\2\2\u00d6\u00d8\t\35\2\2\u00d7\u00d6\3\2\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00db\t\36\2\2\u00da\u00d9"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\26\3\2\2\2\u00dc\u00dd\t\37\2\2\u00dd"+
		"\30\3\2\2\2\u00de\u00e2\7\'\2\2\u00df\u00e1\t \2\2\u00e0\u00df\3\2\2\2"+
		"\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\32"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\61\2\2\u00e6\34\3\2\2\2\u00e7"+
		"\u00e8\t!\2\2\u00e8\36\3\2\2\2\u00e9\u00ea\t\"\2\2\u00ea \3\2\2\2\u00eb"+
		"\u00ec\t#\2\2\u00ec\u00f7\t$\2\2\u00ed\u00ee\t%\2\2\u00ee\u00f7\t&\2\2"+
		"\u00ef\u00f0\t\'\2\2\u00f0\u00f7\t(\2\2\u00f1\u00f2\t)\2\2\u00f2\u00f7"+
		"\t*\2\2\u00f3\u00f4\t+\2\2\u00f4\u00f7\t,\2\2\u00f5\u00f7\t-\2\2\u00f6"+
		"\u00eb\3\2\2\2\u00f6\u00ed\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f6\u00f1\3\2"+
		"\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\"\3\2\2\2\u00f8\u00f9"+
		"\t.\2\2\u00f9\u00fc\t/\2\2\u00fa\u00fc\t\60\2\2\u00fb\u00f8\3\2\2\2\u00fb"+
		"\u00fa\3\2\2\2\u00fc$\3\2\2\2\u00fd\u00fe\t\61\2\2\u00fe\u0101\t\62\2"+
		"\2\u00ff\u0101\t\63\2\2\u0100\u00fd\3\2\2\2\u0100\u00ff\3\2\2\2\u0101"+
		"&\3\2\2\2\u0102\u0103\t\64\2\2\u0103(\3\2\2\2\u0104\u0105\t\65\2\2\u0105"+
		"\u0109\t\66\2\2\u0106\u0107\t\67\2\2\u0107\u0109\t8\2\2\u0108\u0104\3"+
		"\2\2\2\u0108\u0106\3\2\2\2\u0109*\3\2\2\2\u010a\u010b\t9\2\2\u010b,\3"+
		"\2\2\2\u010c\u010d\t:\2\2\u010d.\3\2\2\2\u010e\u010f\7\"\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0111\b\30\2\2\u0111\60\3\2\2\2\u0112\u0117\t;\2\2\u0113"+
		"\u0114\7^\2\2\u0114\u0117\7/\2\2\u0115\u0117\7~\2\2\u0116\u0112\3\2\2"+
		"\2\u0116\u0113\3\2\2\2\u0116\u0115\3\2\2\2\u0117\62\3\2\2\2\u0118\u0119"+
		"\7y\2\2\u0119\u011a\7<\2\2\u011a\u011e\3\2\2\2\u011b\u011d\t<\2\2\u011c"+
		"\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0129\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123\t=\2\2\u0122"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0128\3\2\2\2\u0126\u0128\5\61\31\2\u0127\u0122\3\2\2\2\u0127"+
		"\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\64\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7]\2\2\u012d\66"+
		"\3\2\2\2\u012e\u012f\7_\2\2\u012f8\3\2\2\2\u0130\u0131\7*\2\2\u0131:\3"+
		"\2\2\2\'\2EKSYagou{\u0083\u0089\u008e\u0094\u0096\u009e\u00a4\u00a9\u00af"+
		"\u00b5\u00b9\u00bc\u00c4\u00ca\u00d2\u00d7\u00da\u00e2\u00f6\u00fb\u0100"+
		"\u0108\u0116\u011e\u0124\u0127\u0129";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}