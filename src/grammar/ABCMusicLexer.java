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
		OCTAVE_LOWER=28, ILYRIC=29, SPACE=30, LYRICAL_ELEMENT=31, LYRIC_TEXT=32, 
		OPEN_BRACKET=33, CLOSE_BRACKET=34, OPEN_PAREN=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'+'", "DIGIT", "TEXT", "INUMBER", "ITITLE", "ICOMPOSER", "ILENGTH", "IMETER", 
		"ITEMPO", "IVOICE", "IKEY", "EOL", "'m'", "ACCIDENTAL", "'%'", "'/'", 
		"'='", "BASENOTE", "COMMON", "REST", "BAR", "SHARP", "FLAT", "NEUTRAL", 
		"TIMES", "NTH_REPEAT", "OCTAVE_HIGHER", "OCTAVE_LOWER", "'w:'", "' '", 
		"LYRICAL_ELEMENT", "LYRIC_TEXT", "'['", "']'", "'('"
	};
	public static final String[] ruleNames = {
		"PLUS", "DIGIT", "TEXT", "INUMBER", "ITITLE", "ICOMPOSER", "ILENGTH", 
		"IMETER", "ITEMPO", "IVOICE", "IKEY", "EOL", "MODEMINOR", "ACCIDENTAL", 
		"COMMENTSIGN", "SLASH", "EQUALS", "BASENOTE", "COMMON", "REST", "BAR", 
		"SHARP", "FLAT", "NEUTRAL", "TIMES", "NTH_REPEAT", "OCTAVE_HIGHER", "OCTAVE_LOWER", 
		"ILYRIC", "SPACE", "LYRICAL_ELEMENT", "LYRIC_TEXT", "OPEN_BRACKET", "CLOSE_BRACKET", 
		"OPEN_PAREN"
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
		"\2\4%\u00d6\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\6"+
		"\4O\n\4\r\4\16\4P\3\5\3\5\3\5\3\5\6\5W\n\5\r\5\16\5X\5\5[\n\5\3\6\3\6"+
		"\3\6\3\6\6\6a\n\6\r\6\16\6b\5\6e\n\6\3\7\3\7\3\7\3\7\6\7k\n\7\r\7\16\7"+
		"l\5\7o\n\7\3\b\3\b\3\b\3\b\6\bu\n\b\r\b\16\bv\5\by\n\b\3\t\3\t\3\t\3\t"+
		"\6\t\177\n\t\r\t\16\t\u0080\5\t\u0083\n\t\3\n\3\n\3\n\3\n\6\n\u0089\n"+
		"\n\r\n\16\n\u008a\5\n\u008d\n\n\3\13\3\13\3\13\3\13\6\13\u0093\n\13\r"+
		"\13\16\13\u0094\5\13\u0097\n\13\3\f\3\f\3\f\3\f\6\f\u009d\n\f\r\f\16\f"+
		"\u009e\5\f\u00a1\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\6!\u00cd\n!\r!\16!\u00ce\3\"\3\"\3#\3#\3$\3$\2%\3\3\1\5\4"+
		"\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1"+
		"/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$"+
		"\1G%\1\3\2\33\3\62;\7\"\"\60\60\62;C\\c|\4\13\13\"\"\4\13\13\"\"\4\13"+
		"\13\"\"\4\13\13\"\"\4\13\13\"\"\4\13\13\"\"\4\13\13\"\"\4\13\13\"\"\4"+
		"\f\f\17\17\4%%dd\4CIci\5AAEE~~\3||\6)+<<]_~~\5*+``~~\5*+aa~~\3??\3,,\6"+
		"*+\63\64]]~~\3))\3..\b*,//^^aa~~\u0080\u0080\7))//^^``yy\u00e7\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3"+
		"\2\2\2\5K\3\2\2\2\7N\3\2\2\2\tR\3\2\2\2\13\\\3\2\2\2\rf\3\2\2\2\17p\3"+
		"\2\2\2\21z\3\2\2\2\23\u0084\3\2\2\2\25\u008e\3\2\2\2\27\u0098\3\2\2\2"+
		"\31\u00a2\3\2\2\2\33\u00a4\3\2\2\2\35\u00a6\3\2\2\2\37\u00a8\3\2\2\2!"+
		"\u00aa\3\2\2\2#\u00ac\3\2\2\2%\u00ae\3\2\2\2\'\u00b0\3\2\2\2)\u00b2\3"+
		"\2\2\2+\u00b4\3\2\2\2-\u00b6\3\2\2\2/\u00b8\3\2\2\2\61\u00ba\3\2\2\2\63"+
		"\u00bc\3\2\2\2\65\u00be\3\2\2\2\67\u00c0\3\2\2\29\u00c2\3\2\2\2;\u00c4"+
		"\3\2\2\2=\u00c7\3\2\2\2?\u00c9\3\2\2\2A\u00cc\3\2\2\2C\u00d0\3\2\2\2E"+
		"\u00d2\3\2\2\2G\u00d4\3\2\2\2IJ\7-\2\2J\4\3\2\2\2KL\t\2\2\2L\6\3\2\2\2"+
		"MO\t\3\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\b\3\2\2\2RS\7Z\2\2"+
		"ST\7<\2\2TZ\3\2\2\2UW\t\4\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2"+
		"Y[\3\2\2\2ZV\3\2\2\2Z[\3\2\2\2[\n\3\2\2\2\\]\7V\2\2]^\7<\2\2^d\3\2\2\2"+
		"_a\t\5\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2d`\3\2\2\2"+
		"de\3\2\2\2e\f\3\2\2\2fg\7E\2\2gh\7<\2\2hn\3\2\2\2ik\t\6\2\2ji\3\2\2\2"+
		"kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nj\3\2\2\2no\3\2\2\2o\16\3\2\2"+
		"\2pq\7N\2\2qr\7<\2\2rx\3\2\2\2su\t\7\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2"+
		"vw\3\2\2\2wy\3\2\2\2xt\3\2\2\2xy\3\2\2\2y\20\3\2\2\2z{\7O\2\2{|\7<\2\2"+
		"|\u0082\3\2\2\2}\177\t\b\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082~\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\22\3\2\2\2\u0084\u0085\7S\2\2\u0085\u0086\7<\2\2\u0086"+
		"\u008c\3\2\2\2\u0087\u0089\t\t\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u0088\3\2\2\2\u008c\u008d\3\2\2\2\u008d\24\3\2\2\2\u008e\u008f\7X\2\2"+
		"\u008f\u0090\7<\2\2\u0090\u0096\3\2\2\2\u0091\u0093\t\n\2\2\u0092\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0092\3\2\2\2\u0096\u0097\3\2\2\2\u0097\26\3\2\2"+
		"\2\u0098\u0099\7M\2\2\u0099\u009a\7<\2\2\u009a\u00a0\3\2\2\2\u009b\u009d"+
		"\t\13\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2"+
		"\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\t\f\2\2\u00a3\32\3\2\2\2\u00a4\u00a5"+
		"\7o\2\2\u00a5\34\3\2\2\2\u00a6\u00a7\t\r\2\2\u00a7\36\3\2\2\2\u00a8\u00a9"+
		"\7\'\2\2\u00a9 \3\2\2\2\u00aa\u00ab\7\61\2\2\u00ab\"\3\2\2\2\u00ac\u00ad"+
		"\7?\2\2\u00ad$\3\2\2\2\u00ae\u00af\t\16\2\2\u00af&\3\2\2\2\u00b0\u00b1"+
		"\t\17\2\2\u00b1(\3\2\2\2\u00b2\u00b3\t\20\2\2\u00b3*\3\2\2\2\u00b4\u00b5"+
		"\t\21\2\2\u00b5,\3\2\2\2\u00b6\u00b7\t\22\2\2\u00b7.\3\2\2\2\u00b8\u00b9"+
		"\t\23\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\t\24\2\2\u00bb\62\3\2\2\2\u00bc"+
		"\u00bd\t\25\2\2\u00bd\64\3\2\2\2\u00be\u00bf\t\26\2\2\u00bf\66\3\2\2\2"+
		"\u00c0\u00c1\t\27\2\2\u00c18\3\2\2\2\u00c2\u00c3\t\30\2\2\u00c3:\3\2\2"+
		"\2\u00c4\u00c5\7y\2\2\u00c5\u00c6\7<\2\2\u00c6<\3\2\2\2\u00c7\u00c8\7"+
		"\"\2\2\u00c8>\3\2\2\2\u00c9\u00ca\t\31\2\2\u00ca@\3\2\2\2\u00cb\u00cd"+
		"\t\32\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2"+
		"\u00ce\u00cf\3\2\2\2\u00cfB\3\2\2\2\u00d0\u00d1\7]\2\2\u00d1D\3\2\2\2"+
		"\u00d2\u00d3\7_\2\2\u00d3F\3\2\2\2\u00d4\u00d5\7*\2\2\u00d5H\3\2\2\2\25"+
		"\2PXZbdlnvx\u0080\u0082\u008a\u008c\u0094\u0096\u009e\u00a0\u00ce";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}