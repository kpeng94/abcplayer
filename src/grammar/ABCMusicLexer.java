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
		OCTAVE_HIGHER=28, OCTAVE_LOWER=29, ILYRIC=30, SPACE=31, LYRICAL_ELEMENT=32, 
		LYRIC_TEXT=33, OPEN_BRACKET=34, CLOSE_BRACKET=35, OPEN_PAREN=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'+'", "DIGIT", "TEXT", "'X:([ \t]+)?'", "'T:([ \t]+)?'", "'C:([ \t]+)?'", 
		"'L:([ \t]+)?'", "'M:([ \t]+)?'", "'Q:([ \t]+)?'", "'V:([ \t]+)?'", "'K:([ \t]+)?'", 
		"EOL", "'m'", "ACCIDENTAL", "'%'", "'/'", "'='", "BASENOTE", "COMMON", 
		"WHITESPACE", "REST", "BAR", "SHARP", "FLAT", "NEUTRAL", "TIMES", "NTH_REPEAT", 
		"OCTAVE_HIGHER", "OCTAVE_LOWER", "'w:'", "' '", "LYRICAL_ELEMENT", "LYRIC_TEXT", 
		"'['", "']'", "'('"
	};
	public static final String[] ruleNames = {
		"PLUS", "DIGIT", "TEXT", "INUMBER", "ITITLE", "ICOMPOSER", "ILENGTH", 
		"IMETER", "ITEMPO", "IVOICE", "IKEY", "EOL", "MODEMINOR", "ACCIDENTAL", 
		"COMMENTSIGN", "SLASH", "EQUALS", "BASENOTE", "COMMON", "WHITESPACE", 
		"REST", "BAR", "SHARP", "FLAT", "NEUTRAL", "TIMES", "NTH_REPEAT", "OCTAVE_HIGHER", 
		"OCTAVE_LOWER", "ILYRIC", "SPACE", "LYRICAL_ELEMENT", "LYRIC_TEXT", "OPEN_BRACKET", 
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
		case 19: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4&\u00e7\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3"+
		"\3\4\6\4Q\n\4\r\4\16\4R\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\6\25\u00be\n\25\r\25"+
		"\16\25\u00bf\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\6\"\u00de\n\"\r\"\16\"\u00df\3#\3#\3$\3$\3%\3%\2&\3\3\1\5\4\1\7"+
		"\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33"+
		"\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\2+\27\1-\30\1/\31\1"+
		"\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1"+
		"I&\1\3\2\24\3\62;\7\"\"\60\60\62;C\\c|\4\f\f\17\17\4%%dd\4CIci\5AAEE~"+
		"~\4\13\13\"\"\3||\6)+<<]_~~\5*+``~~\5*+aa~~\3??\3,,\6*+\63\64]]~~\3))"+
		"\3..\b*,//^^aa~~\u0080\u0080\7))//^^``yy\u00e9\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2"+
		"\5M\3\2\2\2\7P\3\2\2\2\tT\3\2\2\2\13_\3\2\2\2\rj\3\2\2\2\17u\3\2\2\2\21"+
		"\u0080\3\2\2\2\23\u008b\3\2\2\2\25\u0096\3\2\2\2\27\u00a1\3\2\2\2\31\u00ac"+
		"\3\2\2\2\33\u00ae\3\2\2\2\35\u00b0\3\2\2\2\37\u00b2\3\2\2\2!\u00b4\3\2"+
		"\2\2#\u00b6\3\2\2\2%\u00b8\3\2\2\2\'\u00ba\3\2\2\2)\u00bd\3\2\2\2+\u00c3"+
		"\3\2\2\2-\u00c5\3\2\2\2/\u00c7\3\2\2\2\61\u00c9\3\2\2\2\63\u00cb\3\2\2"+
		"\2\65\u00cd\3\2\2\2\67\u00cf\3\2\2\29\u00d1\3\2\2\2;\u00d3\3\2\2\2=\u00d5"+
		"\3\2\2\2?\u00d8\3\2\2\2A\u00da\3\2\2\2C\u00dd\3\2\2\2E\u00e1\3\2\2\2G"+
		"\u00e3\3\2\2\2I\u00e5\3\2\2\2KL\7-\2\2L\4\3\2\2\2MN\t\2\2\2N\6\3\2\2\2"+
		"OQ\t\3\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\b\3\2\2\2TU\7Z\2\2"+
		"UV\7<\2\2VW\7*\2\2WX\7]\2\2XY\7\"\2\2YZ\7\13\2\2Z[\7_\2\2[\\\7-\2\2\\"+
		"]\7+\2\2]^\7A\2\2^\n\3\2\2\2_`\7V\2\2`a\7<\2\2ab\7*\2\2bc\7]\2\2cd\7\""+
		"\2\2de\7\13\2\2ef\7_\2\2fg\7-\2\2gh\7+\2\2hi\7A\2\2i\f\3\2\2\2jk\7E\2"+
		"\2kl\7<\2\2lm\7*\2\2mn\7]\2\2no\7\"\2\2op\7\13\2\2pq\7_\2\2qr\7-\2\2r"+
		"s\7+\2\2st\7A\2\2t\16\3\2\2\2uv\7N\2\2vw\7<\2\2wx\7*\2\2xy\7]\2\2yz\7"+
		"\"\2\2z{\7\13\2\2{|\7_\2\2|}\7-\2\2}~\7+\2\2~\177\7A\2\2\177\20\3\2\2"+
		"\2\u0080\u0081\7O\2\2\u0081\u0082\7<\2\2\u0082\u0083\7*\2\2\u0083\u0084"+
		"\7]\2\2\u0084\u0085\7\"\2\2\u0085\u0086\7\13\2\2\u0086\u0087\7_\2\2\u0087"+
		"\u0088\7-\2\2\u0088\u0089\7+\2\2\u0089\u008a\7A\2\2\u008a\22\3\2\2\2\u008b"+
		"\u008c\7S\2\2\u008c\u008d\7<\2\2\u008d\u008e\7*\2\2\u008e\u008f\7]\2\2"+
		"\u008f\u0090\7\"\2\2\u0090\u0091\7\13\2\2\u0091\u0092\7_\2\2\u0092\u0093"+
		"\7-\2\2\u0093\u0094\7+\2\2\u0094\u0095\7A\2\2\u0095\24\3\2\2\2\u0096\u0097"+
		"\7X\2\2\u0097\u0098\7<\2\2\u0098\u0099\7*\2\2\u0099\u009a\7]\2\2\u009a"+
		"\u009b\7\"\2\2\u009b\u009c\7\13\2\2\u009c\u009d\7_\2\2\u009d\u009e\7-"+
		"\2\2\u009e\u009f\7+\2\2\u009f\u00a0\7A\2\2\u00a0\26\3\2\2\2\u00a1\u00a2"+
		"\7M\2\2\u00a2\u00a3\7<\2\2\u00a3\u00a4\7*\2\2\u00a4\u00a5\7]\2\2\u00a5"+
		"\u00a6\7\"\2\2\u00a6\u00a7\7\13\2\2\u00a7\u00a8\7_\2\2\u00a8\u00a9\7-"+
		"\2\2\u00a9\u00aa\7+\2\2\u00aa\u00ab\7A\2\2\u00ab\30\3\2\2\2\u00ac\u00ad"+
		"\t\4\2\2\u00ad\32\3\2\2\2\u00ae\u00af\7o\2\2\u00af\34\3\2\2\2\u00b0\u00b1"+
		"\t\5\2\2\u00b1\36\3\2\2\2\u00b2\u00b3\7\'\2\2\u00b3 \3\2\2\2\u00b4\u00b5"+
		"\7\61\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\7?\2\2\u00b7$\3\2\2\2\u00b8\u00b9"+
		"\t\6\2\2\u00b9&\3\2\2\2\u00ba\u00bb\t\7\2\2\u00bb(\3\2\2\2\u00bc\u00be"+
		"\t\b\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\b\25\2\2\u00c2*\3\2\2\2"+
		"\u00c3\u00c4\t\t\2\2\u00c4,\3\2\2\2\u00c5\u00c6\t\n\2\2\u00c6.\3\2\2\2"+
		"\u00c7\u00c8\t\13\2\2\u00c8\60\3\2\2\2\u00c9\u00ca\t\f\2\2\u00ca\62\3"+
		"\2\2\2\u00cb\u00cc\t\r\2\2\u00cc\64\3\2\2\2\u00cd\u00ce\t\16\2\2\u00ce"+
		"\66\3\2\2\2\u00cf\u00d0\t\17\2\2\u00d08\3\2\2\2\u00d1\u00d2\t\20\2\2\u00d2"+
		":\3\2\2\2\u00d3\u00d4\t\21\2\2\u00d4<\3\2\2\2\u00d5\u00d6\7y\2\2\u00d6"+
		"\u00d7\7<\2\2\u00d7>\3\2\2\2\u00d8\u00d9\7\"\2\2\u00d9@\3\2\2\2\u00da"+
		"\u00db\t\22\2\2\u00dbB\3\2\2\2\u00dc\u00de\t\23\2\2\u00dd\u00dc\3\2\2"+
		"\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0D"+
		"\3\2\2\2\u00e1\u00e2\7]\2\2\u00e2F\3\2\2\2\u00e3\u00e4\7_\2\2\u00e4H\3"+
		"\2\2\2\u00e5\u00e6\7*\2\2\u00e6J\3\2\2\2\6\2R\u00bf\u00df";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}