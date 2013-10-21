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
		PLUS=1, DIGIT=2, TEXT=3, INUMBER=4, ITITLE=5, ICOMPOSER=6, ILENGTH=7, 
		IMETER=8, ITEMPO=9, IVOICE=10, IKEY=11, EOL=12, MODEMINOR=13, ACCIDENTAL=14, 
		COMMENTSIGN=15, SLASH=16, EQUALS=17, BASENOTE=18, COMMON=19, WHITESPACE=20, 
		REST=21, BAR=22, SHARP=23, FLAT=24, NEUTRAL=25, TIMES=26, NTH_REPEAT=27, 
		OCTAVE_HIGHER=28, OPEN_BRACKET=29, CLOSE_BRACKET=30, OPEN_PAREN=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'+'", "DIGIT", "TEXT", "'X:([ \t]+)?'", "'T:([ \t]+)?'", "'C:([ \t]+)?'", 
		"'L:([ \t]+)?'", "'M:([ \t]+)?'", "'Q:([ \t]+)?'", "'V:([ \t]+)?'", "'K:([ \t]+)?'", 
		"EOL", "'m'", "ACCIDENTAL", "'%'", "'/'", "EQUALS", "BASENOTE", "COMMON", 
		"WHITESPACE", "'z'", "BAR", "SHARP", "FLAT", "NEUTRAL", "'*'", "NTH_REPEAT", 
		"OCTAVE_HIGHER", "'['", "']'", "'('"
	};
	public static final String[] ruleNames = {
		"PLUS", "DIGIT", "TEXT", "INUMBER", "ITITLE", "ICOMPOSER", "ILENGTH", 
		"IMETER", "ITEMPO", "IVOICE", "IKEY", "EOL", "MODEMINOR", "ACCIDENTAL", 
		"COMMENTSIGN", "SLASH", "EQUALS", "BASENOTE", "COMMON", "WHITESPACE", 
		"REST", "BAR", "SHARP", "FLAT", "NEUTRAL", "TIMES", "NTH_REPEAT", "OCTAVE_HIGHER", 
		"OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PAREN"
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
		case 19: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4!\u0146\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \3\2\3\2\3\3\3\3\3\4\6\4G\n\4\r\4\16\4H\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\6\25\u00b4\n\25\r\25\16\25\u00b5\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00c7\n\27"+
		"\3\30\3\30\3\30\5\30\u00cc\n\30\3\31\3\31\3\31\5\31\u00d1\n\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u00db\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\6\35\u013d\n\35\r\35\16\35\u013e"+
		"\3\36\3\36\3\37\3\37\3 \3 \2!\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17"+
		"\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22"+
		"\1#\23\1%\24\1\'\25\1)\26\2+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1"+
		"\67\35\19\36\1;\37\1= \1?!\1\3\2\t\3\62;\7\"\"\60\60\62;C\\c|\4\f\f\17"+
		"\17\4%%dd\4CIci\5AAEE~~\4\13\13\"\"\u0150\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\3A\3\2\2\2\5C\3\2\2\2\7F\3\2\2\2\tJ\3\2\2\2\13U\3\2\2\2\r`\3\2\2\2\17"+
		"k\3\2\2\2\21v\3\2\2\2\23\u0081\3\2\2\2\25\u008c\3\2\2\2\27\u0097\3\2\2"+
		"\2\31\u00a2\3\2\2\2\33\u00a4\3\2\2\2\35\u00a6\3\2\2\2\37\u00a8\3\2\2\2"+
		"!\u00aa\3\2\2\2#\u00ac\3\2\2\2%\u00ae\3\2\2\2\'\u00b0\3\2\2\2)\u00b3\3"+
		"\2\2\2+\u00b9\3\2\2\2-\u00c6\3\2\2\2/\u00cb\3\2\2\2\61\u00d0\3\2\2\2\63"+
		"\u00d2\3\2\2\2\65\u00d4\3\2\2\2\67\u00da\3\2\2\29\u00dc\3\2\2\2;\u0140"+
		"\3\2\2\2=\u0142\3\2\2\2?\u0144\3\2\2\2AB\7-\2\2B\4\3\2\2\2CD\t\2\2\2D"+
		"\6\3\2\2\2EG\t\3\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\b\3\2\2"+
		"\2JK\7Z\2\2KL\7<\2\2LM\7*\2\2MN\7]\2\2NO\7\"\2\2OP\7\13\2\2PQ\7_\2\2Q"+
		"R\7-\2\2RS\7+\2\2ST\7A\2\2T\n\3\2\2\2UV\7V\2\2VW\7<\2\2WX\7*\2\2XY\7]"+
		"\2\2YZ\7\"\2\2Z[\7\13\2\2[\\\7_\2\2\\]\7-\2\2]^\7+\2\2^_\7A\2\2_\f\3\2"+
		"\2\2`a\7E\2\2ab\7<\2\2bc\7*\2\2cd\7]\2\2de\7\"\2\2ef\7\13\2\2fg\7_\2\2"+
		"gh\7-\2\2hi\7+\2\2ij\7A\2\2j\16\3\2\2\2kl\7N\2\2lm\7<\2\2mn\7*\2\2no\7"+
		"]\2\2op\7\"\2\2pq\7\13\2\2qr\7_\2\2rs\7-\2\2st\7+\2\2tu\7A\2\2u\20\3\2"+
		"\2\2vw\7O\2\2wx\7<\2\2xy\7*\2\2yz\7]\2\2z{\7\"\2\2{|\7\13\2\2|}\7_\2\2"+
		"}~\7-\2\2~\177\7+\2\2\177\u0080\7A\2\2\u0080\22\3\2\2\2\u0081\u0082\7"+
		"S\2\2\u0082\u0083\7<\2\2\u0083\u0084\7*\2\2\u0084\u0085\7]\2\2\u0085\u0086"+
		"\7\"\2\2\u0086\u0087\7\13\2\2\u0087\u0088\7_\2\2\u0088\u0089\7-\2\2\u0089"+
		"\u008a\7+\2\2\u008a\u008b\7A\2\2\u008b\24\3\2\2\2\u008c\u008d\7X\2\2\u008d"+
		"\u008e\7<\2\2\u008e\u008f\7*\2\2\u008f\u0090\7]\2\2\u0090\u0091\7\"\2"+
		"\2\u0091\u0092\7\13\2\2\u0092\u0093\7_\2\2\u0093\u0094\7-\2\2\u0094\u0095"+
		"\7+\2\2\u0095\u0096\7A\2\2\u0096\26\3\2\2\2\u0097\u0098\7M\2\2\u0098\u0099"+
		"\7<\2\2\u0099\u009a\7*\2\2\u009a\u009b\7]\2\2\u009b\u009c\7\"\2\2\u009c"+
		"\u009d\7\13\2\2\u009d\u009e\7_\2\2\u009e\u009f\7-\2\2\u009f\u00a0\7+\2"+
		"\2\u00a0\u00a1\7A\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\t\4\2\2\u00a3\32\3"+
		"\2\2\2\u00a4\u00a5\7o\2\2\u00a5\34\3\2\2\2\u00a6\u00a7\t\5\2\2\u00a7\36"+
		"\3\2\2\2\u00a8\u00a9\7\'\2\2\u00a9 \3\2\2\2\u00aa\u00ab\7\61\2\2\u00ab"+
		"\"\3\2\2\2\u00ac\u00ad\7?\2\2\u00ad$\3\2\2\2\u00ae\u00af\t\6\2\2\u00af"+
		"&\3\2\2\2\u00b0\u00b1\t\7\2\2\u00b1(\3\2\2\2\u00b2\u00b4\t\b\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\25\2\2\u00b8*\3\2\2\2\u00b9\u00ba"+
		"\7|\2\2\u00ba,\3\2\2\2\u00bb\u00c7\7~\2\2\u00bc\u00bd\7~\2\2\u00bd\u00c7"+
		"\7~\2\2\u00be\u00bf\7]\2\2\u00bf\u00c7\7~\2\2\u00c0\u00c1\7~\2\2\u00c1"+
		"\u00c7\7_\2\2\u00c2\u00c3\7<\2\2\u00c3\u00c7\7~\2\2\u00c4\u00c5\7~\2\2"+
		"\u00c5\u00c7\7<\2\2\u00c6\u00bb\3\2\2\2\u00c6\u00bc\3\2\2\2\u00c6\u00be"+
		"\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		".\3\2\2\2\u00c8\u00cc\7`\2\2\u00c9\u00ca\7`\2\2\u00ca\u00cc\7`\2\2\u00cb"+
		"\u00c8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\60\3\2\2\2\u00cd\u00d1\7a\2\2"+
		"\u00ce\u00cf\7a\2\2\u00cf\u00d1\7a\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d1\62\3\2\2\2\u00d2\u00d3\7?\2\2\u00d3\64\3\2\2\2\u00d4\u00d5"+
		"\7,\2\2\u00d5\66\3\2\2\2\u00d6\u00d7\7]\2\2\u00d7\u00db\7\63\2\2\u00d8"+
		"\u00d9\7]\2\2\u00d9\u00db\7\64\2\2\u00da\u00d6\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db8\3\2\2\2\u00dc\u00dd\7$\2\2\u00dd\u00de\7=\2\2\u00de\u00df"+
		"\7\17\2\2\u00df\u00e0\7\f\2\2\u00e0\u00e1\7Q\2\2\u00e1\u00e2\7E\2\2\u00e2"+
		"\u00e3\7V\2\2\u00e3\u00e4\7C\2\2\u00e4\u00e5\7X\2\2\u00e5\u00e6\7G\2\2"+
		"\u00e6\u00e7\7a\2\2\u00e7\u00e8\7N\2\2\u00e8\u00e9\7Q\2\2\u00e9\u00ea"+
		"\7Y\2\2\u00ea\u00eb\7G\2\2\u00eb\u00ec\7T\2\2\u00ec\u00ed\7<\2\2\u00ed"+
		"\u00ee\7\"\2\2\u00ee\u00ef\7$\2\2\u00ef\u00f0\7.\2\2\u00f0\u00f1\7$\2"+
		"\2\u00f1\u00f2\7=\2\2\u00f2\u00f3\7\17\2\2\u00f3\u00f4\7\f\2\2\u00f4\u00f5"+
		"\7F\2\2\u00f5\u00f6\7K\2\2\u00f6\u00f7\7I\2\2\u00f7\u00f8\7K\2\2\u00f8"+
		"\u00f9\7V\2\2\u00f9\u00fa\7<\2\2\u00fa\u00fb\7\"\2\2\u00fb\u00fc\7]\2"+
		"\2\u00fc\u00fd\7\62\2\2\u00fd\u00fe\7/\2\2\u00fe\u00ff\7;\2\2\u00ff\u0100"+
		"\7_\2\2\u0100\u0101\7=\2\2\u0101\u0102\7\17\2\2\u0102\u0103\7\f\2\2\u0103"+
		"\u0104\7D\2\2\u0104\u0105\7C\2\2\u0105\u0106\7E\2\2\u0106\u0107\7M\2\2"+
		"\u0107\u0108\7U\2\2\u0108\u0109\7N\2\2\u0109\u010a\7C\2\2\u010a\u010b"+
		"\7U\2\2\u010b\u010c\7J\2\2\u010c\u010d\7<\2\2\u010d\u010e\7\"\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0110\7=\2\2\u0110\u0111\7\17\2\2\u0111\u0112\7\f"+
		"\2\2\u0112\u0113\7K\2\2\u0113\u0114\7N\2\2\u0114\u0115\7[\2\2\u0115\u0116"+
		"\7T\2\2\u0116\u0117\7K\2\2\u0117\u0118\7E\2\2\u0118\u0119\7<\2\2\u0119"+
		"\u011a\7\"\2\2\u011a\u011b\7$\2\2\u011b\u011c\7y\2\2\u011c\u011d\7<\2"+
		"\2\u011d\u011e\7$\2\2\u011e\u011f\7=\2\2\u011f\u0120\7\17\2\2\u0120\u0121"+
		"\7\f\2\2\u0121\u0122\7U\2\2\u0122\u0123\7R\2\2\u0123\u0124\7C\2\2\u0124"+
		"\u0125\7E\2\2\u0125\u0126\7G\2\2\u0126\u0127\7<\2\2\u0127\u0128\7\"\2"+
		"\2\u0128\u013c\3\2\2\2\u0129\u012a\7=\2\2\u012a\u012b\7\17\2\2\u012b\u012c"+
		"\7\f\2\2\u012c\u012d\7N\2\2\u012d\u012e\7[\2\2\u012e\u012f\7T\2\2\u012f"+
		"\u0130\7K\2\2\u0130\u0131\7E\2\2\u0131\u0132\7a\2\2\u0132\u0133\7V\2\2"+
		"\u0133\u0134\7G\2\2\u0134\u0135\7Z\2\2\u0135\u0136\7V\2\2\u0136\u0137"+
		"\7<\2\2\u0137\u0138\7\"\2\2\u0138\u0139\7]\2\2\u0139\u013a\7`\2\2\u013a"+
		"\u013b\7^\2\2\u013b\u013d\7y\2\2\u013c\u0129\3\2\2\2\u013d\u013e\3\2\2"+
		"\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f:\3\2\2\2\u0140\u0141"+
		"\7]\2\2\u0141<\3\2\2\2\u0142\u0143\7_\2\2\u0143>\3\2\2\2\u0144\u0145\7"+
		"*\2\2\u0145@\3\2\2\2\n\2H\u00b5\u00c6\u00cb\u00d0\u00da\u013e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}