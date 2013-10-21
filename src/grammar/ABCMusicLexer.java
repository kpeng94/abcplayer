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
		COMMENTSIGN=15, SLASH=16, EQUALS=17, BASENOTE=18, COMMON=19, REST=20, 
		BAR=21, SHARP=22, FLAT=23, NEUTRAL=24, TIMES=25, NTH_REPEAT=26, OCTAVE_HIGHER=27, 
		OPEN_BRACKET=28, CLOSE_BRACKET=29, OPEN_PAREN=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'+'", "DIGIT", "TEXT", "INUMBER", "ITITLE", "ICOMPOSER", "ILENGTH", "IMETER", 
		"ITEMPO", "IVOICE", "IKEY", "EOL", "'m'", "ACCIDENTAL", "'%'", "'/'", 
		"EQUALS", "BASENOTE", "COMMON", "'z'", "BAR", "SHARP", "FLAT", "NEUTRAL", 
		"'*'", "NTH_REPEAT", "OCTAVE_HIGHER", "'['", "']'", "'('"
	};
	public static final String[] ruleNames = {
		"PLUS", "DIGIT", "TEXT", "INUMBER", "ITITLE", "ICOMPOSER", "ILENGTH", 
		"IMETER", "ITEMPO", "IVOICE", "IKEY", "EOL", "MODEMINOR", "ACCIDENTAL", 
		"COMMENTSIGN", "SLASH", "EQUALS", "BASENOTE", "COMMON", "REST", "BAR", 
		"SHARP", "FLAT", "NEUTRAL", "TIMES", "NTH_REPEAT", "OCTAVE_HIGHER", "OPEN_BRACKET", 
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

	public static final String _serializedATN =
		"\2\4 \u012f\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\3\2\3\2\3\3\3\3\3\4\6\4E\n\4\r\4\16\4F\3\5\3\5\3\5\3\5"+
		"\6\5M\n\5\r\5\16\5N\5\5Q\n\5\3\6\3\6\3\6\3\6\6\6W\n\6\r\6\16\6X\5\6[\n"+
		"\6\3\7\3\7\3\7\3\7\6\7a\n\7\r\7\16\7b\5\7e\n\7\3\b\3\b\3\b\3\b\6\bk\n"+
		"\b\r\b\16\bl\5\bo\n\b\3\t\3\t\3\t\3\t\6\tu\n\t\r\t\16\tv\5\ty\n\t\3\n"+
		"\3\n\3\n\3\n\6\n\177\n\n\r\n\16\n\u0080\5\n\u0083\n\n\3\13\3\13\3\13\3"+
		"\13\6\13\u0089\n\13\r\13\16\13\u008a\5\13\u008d\n\13\3\f\3\f\3\f\3\f\6"+
		"\f\u0093\n\f\r\f\16\f\u0094\5\f\u0097\n\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00b6\n\26\3\27\3\27"+
		"\3\27\5\27\u00bb\n\27\3\30\3\30\3\30\5\30\u00c0\n\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\5\33\u00ca\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\6\34\u0126\n\34\r\34\16\34\u0127\3\35\3\35\3\36\3\36\3\37\3\37\2 \3\3"+
		"\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1"+
		"\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1"+
		"-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1\3\2\20\3"+
		"\62;\7\"\"\60\60\62;C\\c|\4\13\13\"\"\4\13\13\"\"\4\13\13\"\"\4\13\13"+
		"\"\"\4\13\13\"\"\4\13\13\"\"\4\13\13\"\"\4\13\13\"\"\4\f\f\17\17\4%%d"+
		"d\4CIci\5AAEE~~\u0148\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7D\3\2\2"+
		"\2\tH\3\2\2\2\13R\3\2\2\2\r\\\3\2\2\2\17f\3\2\2\2\21p\3\2\2\2\23z\3\2"+
		"\2\2\25\u0084\3\2\2\2\27\u008e\3\2\2\2\31\u0098\3\2\2\2\33\u009a\3\2\2"+
		"\2\35\u009c\3\2\2\2\37\u009e\3\2\2\2!\u00a0\3\2\2\2#\u00a2\3\2\2\2%\u00a4"+
		"\3\2\2\2\'\u00a6\3\2\2\2)\u00a8\3\2\2\2+\u00b5\3\2\2\2-\u00ba\3\2\2\2"+
		"/\u00bf\3\2\2\2\61\u00c1\3\2\2\2\63\u00c3\3\2\2\2\65\u00c9\3\2\2\2\67"+
		"\u00cb\3\2\2\29\u0129\3\2\2\2;\u012b\3\2\2\2=\u012d\3\2\2\2?@\7-\2\2@"+
		"\4\3\2\2\2AB\t\2\2\2B\6\3\2\2\2CE\t\3\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2"+
		"\2FG\3\2\2\2G\b\3\2\2\2HI\7Z\2\2IJ\7<\2\2JP\3\2\2\2KM\t\4\2\2LK\3\2\2"+
		"\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PL\3\2\2\2PQ\3\2\2\2Q\n\3\2"+
		"\2\2RS\7V\2\2ST\7<\2\2TZ\3\2\2\2UW\t\5\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2"+
		"\2XY\3\2\2\2Y[\3\2\2\2ZV\3\2\2\2Z[\3\2\2\2[\f\3\2\2\2\\]\7E\2\2]^\7<\2"+
		"\2^d\3\2\2\2_a\t\6\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2"+
		"\2d`\3\2\2\2de\3\2\2\2e\16\3\2\2\2fg\7N\2\2gh\7<\2\2hn\3\2\2\2ik\t\7\2"+
		"\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nj\3\2\2\2no\3\2\2"+
		"\2o\20\3\2\2\2pq\7O\2\2qr\7<\2\2rx\3\2\2\2su\t\b\2\2ts\3\2\2\2uv\3\2\2"+
		"\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xt\3\2\2\2xy\3\2\2\2y\22\3\2\2\2z{\7S"+
		"\2\2{|\7<\2\2|\u0082\3\2\2\2}\177\t\t\2\2~}\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082~\3\2\2\2"+
		"\u0082\u0083\3\2\2\2\u0083\24\3\2\2\2\u0084\u0085\7X\2\2\u0085\u0086\7"+
		"<\2\2\u0086\u008c\3\2\2\2\u0087\u0089\t\n\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2"+
		"\2\2\u008c\u0088\3\2\2\2\u008c\u008d\3\2\2\2\u008d\26\3\2\2\2\u008e\u008f"+
		"\7M\2\2\u008f\u0090\7<\2\2\u0090\u0096\3\2\2\2\u0091\u0093\t\13\2\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0097\3\2\2\2\u0096\u0092\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\30\3\2\2\2\u0098\u0099\t\f\2\2\u0099\32\3\2\2\2\u009a\u009b\7o\2\2\u009b"+
		"\34\3\2\2\2\u009c\u009d\t\r\2\2\u009d\36\3\2\2\2\u009e\u009f\7\'\2\2\u009f"+
		" \3\2\2\2\u00a0\u00a1\7\61\2\2\u00a1\"\3\2\2\2\u00a2\u00a3\7?\2\2\u00a3"+
		"$\3\2\2\2\u00a4\u00a5\t\16\2\2\u00a5&\3\2\2\2\u00a6\u00a7\t\17\2\2\u00a7"+
		"(\3\2\2\2\u00a8\u00a9\7|\2\2\u00a9*\3\2\2\2\u00aa\u00b6\7~\2\2\u00ab\u00ac"+
		"\7~\2\2\u00ac\u00b6\7~\2\2\u00ad\u00ae\7]\2\2\u00ae\u00b6\7~\2\2\u00af"+
		"\u00b0\7~\2\2\u00b0\u00b6\7_\2\2\u00b1\u00b2\7<\2\2\u00b2\u00b6\7~\2\2"+
		"\u00b3\u00b4\7~\2\2\u00b4\u00b6\7<\2\2\u00b5\u00aa\3\2\2\2\u00b5\u00ab"+
		"\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6,\3\2\2\2\u00b7\u00bb\7`\2\2\u00b8\u00b9\7`\2\2\u00b9"+
		"\u00bb\7`\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb.\3\2\2\2\u00bc"+
		"\u00c0\7a\2\2\u00bd\u00be\7a\2\2\u00be\u00c0\7a\2\2\u00bf\u00bc\3\2\2"+
		"\2\u00bf\u00bd\3\2\2\2\u00c0\60\3\2\2\2\u00c1\u00c2\7?\2\2\u00c2\62\3"+
		"\2\2\2\u00c3\u00c4\7,\2\2\u00c4\64\3\2\2\2\u00c5\u00c6\7]\2\2\u00c6\u00ca"+
		"\7\63\2\2\u00c7\u00c8\7]\2\2\u00c8\u00ca\7\64\2\2\u00c9\u00c5\3\2\2\2"+
		"\u00c9\u00c7\3\2\2\2\u00ca\66\3\2\2\2\u00cb\u00cc\7$\2\2\u00cc\u00cd\7"+
		"=\2\2\u00cd\u00ce\7\f\2\2\u00ce\u00cf\7Q\2\2\u00cf\u00d0\7E\2\2\u00d0"+
		"\u00d1\7V\2\2\u00d1\u00d2\7C\2\2\u00d2\u00d3\7X\2\2\u00d3\u00d4\7G\2\2"+
		"\u00d4\u00d5\7a\2\2\u00d5\u00d6\7N\2\2\u00d6\u00d7\7Q\2\2\u00d7\u00d8"+
		"\7Y\2\2\u00d8\u00d9\7G\2\2\u00d9\u00da\7T\2\2\u00da\u00db\7<\2\2\u00db"+
		"\u00dc\7\"\2\2\u00dc\u00dd\7$\2\2\u00dd\u00de\7.\2\2\u00de\u00df\7$\2"+
		"\2\u00df\u00e0\7=\2\2\u00e0\u00e1\7\f\2\2\u00e1\u00e2\7F\2\2\u00e2\u00e3"+
		"\7K\2\2\u00e3\u00e4\7I\2\2\u00e4\u00e5\7K\2\2\u00e5\u00e6\7V\2\2\u00e6"+
		"\u00e7\7<\2\2\u00e7\u00e8\7\"\2\2\u00e8\u00e9\7]\2\2\u00e9\u00ea\7\62"+
		"\2\2\u00ea\u00eb\7/\2\2\u00eb\u00ec\7;\2\2\u00ec\u00ed\7_\2\2\u00ed\u00ee"+
		"\7=\2\2\u00ee\u00ef\7\f\2\2\u00ef\u00f0\7D\2\2\u00f0\u00f1\7C\2\2\u00f1"+
		"\u00f2\7E\2\2\u00f2\u00f3\7M\2\2\u00f3\u00f4\7U\2\2\u00f4\u00f5\7N\2\2"+
		"\u00f5\u00f6\7C\2\2\u00f6\u00f7\7U\2\2\u00f7\u00f8\7J\2\2\u00f8\u00f9"+
		"\7<\2\2\u00f9\u00fa\7\"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7=\2\2\u00fc"+
		"\u00fd\7\f\2\2\u00fd\u00fe\7K\2\2\u00fe\u00ff\7N\2\2\u00ff\u0100\7[\2"+
		"\2\u0100\u0101\7T\2\2\u0101\u0102\7K\2\2\u0102\u0103\7E\2\2\u0103\u0104"+
		"\7<\2\2\u0104\u0105\7\"\2\2\u0105\u0106\7$\2\2\u0106\u0107\7y\2\2\u0107"+
		"\u0108\7<\2\2\u0108\u0109\7$\2\2\u0109\u010a\7=\2\2\u010a\u010b\7\f\2"+
		"\2\u010b\u010c\7U\2\2\u010c\u010d\7R\2\2\u010d\u010e\7C\2\2\u010e\u010f"+
		"\7E\2\2\u010f\u0110\7G\2\2\u0110\u0111\7<\2\2\u0111\u0112\7\"\2\2\u0112"+
		"\u0125\3\2\2\2\u0113\u0114\7=\2\2\u0114\u0115\7\f\2\2\u0115\u0116\7N\2"+
		"\2\u0116\u0117\7[\2\2\u0117\u0118\7T\2\2\u0118\u0119\7K\2\2\u0119\u011a"+
		"\7E\2\2\u011a\u011b\7a\2\2\u011b\u011c\7V\2\2\u011c\u011d\7G\2\2\u011d"+
		"\u011e\7Z\2\2\u011e\u011f\7V\2\2\u011f\u0120\7<\2\2\u0120\u0121\7\"\2"+
		"\2\u0121\u0122\7]\2\2\u0122\u0123\7`\2\2\u0123\u0124\7^\2\2\u0124\u0126"+
		"\7y\2\2\u0125\u0113\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u01288\3\2\2\2\u0129\u012a\7]\2\2\u012a:\3\2\2\2\u012b"+
		"\u012c\7_\2\2\u012c<\3\2\2\2\u012d\u012e\7*\2\2\u012e>\3\2\2\2\31\2FN"+
		"PXZbdlnvx\u0080\u0082\u008a\u008c\u0094\u0096\u00b5\u00ba\u00bf\u00c9"+
		"\u0127";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}