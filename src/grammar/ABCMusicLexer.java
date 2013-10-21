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
		OCTAVE_LOWER=28, ILYRIC=29, SPACE=30, LYRICAL_ELEMENT_TOKEN=31, LYRIC_TEXT=32, 
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
		"LYRICAL_ELEMENT_TOKEN", "LYRIC_TEXT", "'['", "']'", "'('"
	};
	public static final String[] ruleNames = {
		"PLUS", "DIGIT", "TEXT", "INUMBER", "ITITLE", "ICOMPOSER", "ILENGTH", 
		"IMETER", "ITEMPO", "IVOICE", "IKEY", "EOL", "MODEMINOR", "ACCIDENTAL", 
		"COMMENTSIGN", "SLASH", "EQUALS", "BASENOTE", "COMMON", "REST", "BAR", 
		"SHARP", "FLAT", "NEUTRAL", "TIMES", "NTH_REPEAT", "OCTAVE_HIGHER", "OCTAVE_LOWER", 
		"ILYRIC", "SPACE", "LYRICAL_ELEMENT_TOKEN", "LYRIC_TEXT", "OPEN_BRACKET", 
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
		"\2\4%\u00ea\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\6"+
		"\4O\n\4\r\4\16\4P\3\5\3\5\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\3\6\3\6\3\6"+
		"\3\6\7\6`\n\6\f\6\16\6c\13\6\3\7\3\7\3\7\3\7\7\7i\n\7\f\7\16\7l\13\7\3"+
		"\b\3\b\3\b\3\b\7\br\n\b\f\b\16\bu\13\b\3\t\3\t\3\t\3\t\7\t{\n\t\f\t\16"+
		"\t~\13\t\3\n\3\n\3\n\3\n\7\n\u0084\n\n\f\n\16\n\u0087\13\n\3\13\3\13\3"+
		"\13\3\13\7\13\u008d\n\13\f\13\16\13\u0090\13\13\3\f\3\f\3\f\3\f\7\f\u0096"+
		"\n\f\f\f\16\f\u0099\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\5\24\u00ac\n\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00bb\n\26\3\27"+
		"\3\27\3\27\5\27\u00c0\n\27\3\30\3\30\3\30\5\30\u00c5\n\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\5\33\u00cf\n\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3 \3 \5 \u00de\n \3!\6!\u00e1\n!\r!\16!\u00e2"+
		"\3\"\3\"\3#\3#\3$\3$\2%\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21"+
		"\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1"+
		"%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\1"+
		"9\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1\3\2.\3\62;\t\"$().\60\62;AAC\\c"+
		"|\4\13\13\"\"\4\13\13\"\"\4\13\13\"\"\4\13\13\"\"\4\13\13\"\"\4\13\13"+
		"\"\"\4\13\13\"\"\4\13\13\"\"\4\f\f\17\17\4%%dd\4CIci\3EE\4^^~~\3EE\3|"+
		"|\4^^~~\4^^~~\4^^~~\4))<<\4))<<\4^^~~\3]]\4^^~~\4^^~~\3^_\4^^~~\4^^``"+
		"\4^^``\4^^``\4^^aa\4^^aa\4^^aa\3??\3,,\3]]\3\63\63\3]]\3\64\64\3))\3."+
		".\7\"\",,//aa\u0080\u0080\7))//^^``yy\u00fe\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7"+
		"N\3\2\2\2\tR\3\2\2\2\13[\3\2\2\2\rd\3\2\2\2\17m\3\2\2\2\21v\3\2\2\2\23"+
		"\177\3\2\2\2\25\u0088\3\2\2\2\27\u0091\3\2\2\2\31\u009a\3\2\2\2\33\u009c"+
		"\3\2\2\2\35\u009e\3\2\2\2\37\u00a0\3\2\2\2!\u00a2\3\2\2\2#\u00a4\3\2\2"+
		"\2%\u00a6\3\2\2\2\'\u00ab\3\2\2\2)\u00ad\3\2\2\2+\u00ba\3\2\2\2-\u00bf"+
		"\3\2\2\2/\u00c4\3\2\2\2\61\u00c6\3\2\2\2\63\u00c8\3\2\2\2\65\u00ce\3\2"+
		"\2\2\67\u00d0\3\2\2\29\u00d2\3\2\2\2;\u00d4\3\2\2\2=\u00d7\3\2\2\2?\u00dd"+
		"\3\2\2\2A\u00e0\3\2\2\2C\u00e4\3\2\2\2E\u00e6\3\2\2\2G\u00e8\3\2\2\2I"+
		"J\7-\2\2J\4\3\2\2\2KL\t\2\2\2L\6\3\2\2\2MO\t\3\2\2NM\3\2\2\2OP\3\2\2\2"+
		"PN\3\2\2\2PQ\3\2\2\2Q\b\3\2\2\2RS\7Z\2\2ST\7<\2\2TX\3\2\2\2UW\t\4\2\2"+
		"VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\n\3\2\2\2ZX\3\2\2\2[\\\7V\2"+
		"\2\\]\7<\2\2]a\3\2\2\2^`\t\5\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2"+
		"\2b\f\3\2\2\2ca\3\2\2\2de\7E\2\2ef\7<\2\2fj\3\2\2\2gi\t\6\2\2hg\3\2\2"+
		"\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\16\3\2\2\2lj\3\2\2\2mn\7N\2\2no\7<\2"+
		"\2os\3\2\2\2pr\t\7\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\20\3\2"+
		"\2\2us\3\2\2\2vw\7O\2\2wx\7<\2\2x|\3\2\2\2y{\t\b\2\2zy\3\2\2\2{~\3\2\2"+
		"\2|z\3\2\2\2|}\3\2\2\2}\22\3\2\2\2~|\3\2\2\2\177\u0080\7S\2\2\u0080\u0081"+
		"\7<\2\2\u0081\u0085\3\2\2\2\u0082\u0084\t\t\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\24\3\2\2"+
		"\2\u0087\u0085\3\2\2\2\u0088\u0089\7X\2\2\u0089\u008a\7<\2\2\u008a\u008e"+
		"\3\2\2\2\u008b\u008d\t\n\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\26\3\2\2\2\u0090\u008e\3\2\2"+
		"\2\u0091\u0092\7M\2\2\u0092\u0093\7<\2\2\u0093\u0097\3\2\2\2\u0094\u0096"+
		"\t\13\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\30\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b"+
		"\t\f\2\2\u009b\32\3\2\2\2\u009c\u009d\7o\2\2\u009d\34\3\2\2\2\u009e\u009f"+
		"\t\r\2\2\u009f\36\3\2\2\2\u00a0\u00a1\7\'\2\2\u00a1 \3\2\2\2\u00a2\u00a3"+
		"\7\61\2\2\u00a3\"\3\2\2\2\u00a4\u00a5\7?\2\2\u00a5$\3\2\2\2\u00a6\u00a7"+
		"\t\16\2\2\u00a7&\3\2\2\2\u00a8\u00a9\t\17\2\2\u00a9\u00ac\t\20\2\2\u00aa"+
		"\u00ac\t\21\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac(\3\2\2\2"+
		"\u00ad\u00ae\t\22\2\2\u00ae*\3\2\2\2\u00af\u00b0\t\23\2\2\u00b0\u00bb"+
		"\t\24\2\2\u00b1\u00b2\t\25\2\2\u00b2\u00bb\t\26\2\2\u00b3\u00b4\t\27\2"+
		"\2\u00b4\u00bb\t\30\2\2\u00b5\u00b6\t\31\2\2\u00b6\u00bb\t\32\2\2\u00b7"+
		"\u00b8\t\33\2\2\u00b8\u00bb\t\34\2\2\u00b9\u00bb\t\35\2\2\u00ba\u00af"+
		"\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b3\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba"+
		"\u00b7\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb,\3\2\2\2\u00bc\u00bd\t\36\2\2"+
		"\u00bd\u00c0\t\37\2\2\u00be\u00c0\t \2\2\u00bf\u00bc\3\2\2\2\u00bf\u00be"+
		"\3\2\2\2\u00c0.\3\2\2\2\u00c1\u00c2\t!\2\2\u00c2\u00c5\t\"\2\2\u00c3\u00c5"+
		"\t#\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\60\3\2\2\2\u00c6"+
		"\u00c7\t$\2\2\u00c7\62\3\2\2\2\u00c8\u00c9\t%\2\2\u00c9\64\3\2\2\2\u00ca"+
		"\u00cb\t&\2\2\u00cb\u00cf\t\'\2\2\u00cc\u00cd\t(\2\2\u00cd\u00cf\t)\2"+
		"\2\u00ce\u00ca\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\66\3\2\2\2\u00d0\u00d1"+
		"\t*\2\2\u00d18\3\2\2\2\u00d2\u00d3\t+\2\2\u00d3:\3\2\2\2\u00d4\u00d5\7"+
		"y\2\2\u00d5\u00d6\7<\2\2\u00d6<\3\2\2\2\u00d7\u00d8\7\"\2\2\u00d8>\3\2"+
		"\2\2\u00d9\u00de\t,\2\2\u00da\u00db\7^\2\2\u00db\u00de\7/\2\2\u00dc\u00de"+
		"\7~\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de"+
		"@\3\2\2\2\u00df\u00e1\t-\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3B\3\2\2\2\u00e4\u00e5\7]\2\2\u00e5"+
		"D\3\2\2\2\u00e6\u00e7\7_\2\2\u00e7F\3\2\2\2\u00e8\u00e9\7*\2\2\u00e9H"+
		"\3\2\2\2\23\2PXajs|\u0085\u008e\u0097\u00ab\u00ba\u00bf\u00c4\u00ce\u00dd"+
		"\u00e2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}