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
		ITEMPO=8, IVOICE=9, IKEY=10, EOL=11, MODEMINOR=12, ACCIDENTAL=13, COMMENTSIGN=14, 
		SLASH=15, EQUALS=16, BASENOTE=17, REST=18, BAR=19, SHARP=20, FLAT=21, 
		NEUTRAL=22, TIMES=23, NTH_REPEAT=24, OCTAVE_HIGHER=25, OCTAVE_LOWER=26, 
		SPACE=27, LYRICAL_ELEMENT_TOKEN=28, ILYRIC=29, OPEN_BRACKET=30, CLOSE_BRACKET=31, 
		OPEN_PAREN=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'+'", "DIGIT", "INUMBER", "ITITLE", "ICOMPOSER", "ILENGTH", "IMETER", 
		"ITEMPO", "IVOICE", "IKEY", "EOL", "'m'", "ACCIDENTAL", "COMMENTSIGN", 
		"'/'", "'='", "BASENOTE", "REST", "BAR", "SHARP", "FLAT", "NEUTRAL", "TIMES", 
		"NTH_REPEAT", "OCTAVE_HIGHER", "OCTAVE_LOWER", "' '", "LYRICAL_ELEMENT_TOKEN", 
		"ILYRIC", "'['", "']'", "'('"
	};
	public static final String[] ruleNames = {
		"PLUS", "DIGIT", "INUMBER", "ITITLE", "ICOMPOSER", "ILENGTH", "IMETER", 
		"ITEMPO", "IVOICE", "IKEY", "EOL", "MODEMINOR", "ACCIDENTAL", "COMMENTSIGN", 
		"SLASH", "EQUALS", "BASENOTE", "REST", "BAR", "SHARP", "FLAT", "NEUTRAL", 
		"TIMES", "NTH_REPEAT", "OCTAVE_HIGHER", "OCTAVE_LOWER", "SPACE", "LYRICAL_ELEMENT_TOKEN", 
		"ILYRIC", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PAREN"
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
		case 26: SPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\"\u012f\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\7\4L\n\4\f"+
		"\4\16\4O\13\4\3\4\6\4R\n\4\r\4\16\4S\3\5\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5"+
		"]\13\5\3\5\6\5`\n\5\r\5\16\5a\3\6\3\6\3\6\3\6\7\6h\n\6\f\6\16\6k\13\6"+
		"\3\6\6\6n\n\6\r\6\16\6o\3\7\3\7\3\7\3\7\7\7v\n\7\f\7\16\7y\13\7\3\b\3"+
		"\b\3\b\3\b\7\b\177\n\b\f\b\16\b\u0082\13\b\3\b\3\b\3\b\5\b\u0087\n\b\3"+
		"\b\6\b\u008a\n\b\r\b\16\b\u008b\3\b\3\b\6\b\u0090\n\b\r\b\16\b\u0091\5"+
		"\b\u0094\n\b\3\t\3\t\3\t\3\t\7\t\u009a\n\t\f\t\16\t\u009d\13\t\3\t\3\t"+
		"\3\t\5\t\u00a2\n\t\3\t\6\t\u00a5\n\t\r\t\16\t\u00a6\3\t\3\t\6\t\u00ab"+
		"\n\t\r\t\16\t\u00ac\3\t\3\t\6\t\u00b1\n\t\r\t\16\t\u00b2\7\t\u00b5\n\t"+
		"\f\t\16\t\u00b8\13\t\5\t\u00ba\n\t\3\n\3\n\3\n\3\n\7\n\u00c0\n\n\f\n\16"+
		"\n\u00c3\13\n\3\n\6\n\u00c6\n\n\r\n\16\n\u00c7\3\13\3\13\3\13\3\13\7\13"+
		"\u00ce\n\13\f\13\16\13\u00d1\13\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\6\17\u00db\n\17\r\17\16\17\u00dc\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f2"+
		"\n\24\3\25\3\25\3\25\5\25\u00f7\n\25\3\26\3\26\3\26\5\26\u00fc\n\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u0106\n\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u0114\n\35\3\36\3\36"+
		"\3\36\3\36\7\36\u011a\n\36\f\36\16\36\u011d\13\36\3\36\6\36\u0120\n\36"+
		"\r\36\16\36\u0121\3\36\7\36\u0125\n\36\f\36\16\36\u0128\13\36\3\37\3\37"+
		"\3 \3 \3!\3!\2\"\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23"+
		"\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1"+
		"\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\29\36\1"+
		";\37\1= \1?!\1A\"\1\3\2;\3\62;\4\13\13\"\"\3\62;\4\13\13\"\"\t\"$().\60"+
		"\62;AAC\\c|\4\13\13\"\"\t\"$().\60\62;AAC\\c|\4\13\13\"\"\4\13\13\"\""+
		"\3EE\4^^~~\3EE\3\62;\3\62;\4\13\13\"\"\3EE\4^^~~\3EE\3\62;\3\62;\3\62"+
		";\4\13\13\"\"\t\"$().\60\62;AAC\\c|\4\13\13\"\"\4\f\f\17\17\4%%dd\t\""+
		"$().\60\62;AAC\\c|\4CIci\3||\4^^~~\4^^~~\4^^~~\4))<<\4))<<\4^^~~\3]]\4"+
		"^^~~\4^^~~\3^_\4^^~~\4^^``\4^^``\4^^``\4^^aa\4^^aa\4^^aa\3??\3,,\3]]\3"+
		"\63\63\3]]\3\64\64\3))\3..\7\"\",,//aa\u0080\u0080\4\13\13\"\"\n##))."+
		".\60\60\62;C\\^^c|\u0153\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2"+
		"\2\5E\3\2\2\2\7G\3\2\2\2\tU\3\2\2\2\13c\3\2\2\2\rq\3\2\2\2\17z\3\2\2\2"+
		"\21\u0095\3\2\2\2\23\u00bb\3\2\2\2\25\u00c9\3\2\2\2\27\u00d2\3\2\2\2\31"+
		"\u00d4\3\2\2\2\33\u00d6\3\2\2\2\35\u00d8\3\2\2\2\37\u00de\3\2\2\2!\u00e0"+
		"\3\2\2\2#\u00e2\3\2\2\2%\u00e4\3\2\2\2\'\u00f1\3\2\2\2)\u00f6\3\2\2\2"+
		"+\u00fb\3\2\2\2-\u00fd\3\2\2\2/\u00ff\3\2\2\2\61\u0105\3\2\2\2\63\u0107"+
		"\3\2\2\2\65\u0109\3\2\2\2\67\u010b\3\2\2\29\u0113\3\2\2\2;\u0115\3\2\2"+
		"\2=\u0129\3\2\2\2?\u012b\3\2\2\2A\u012d\3\2\2\2CD\7-\2\2D\4\3\2\2\2EF"+
		"\t\2\2\2F\6\3\2\2\2GH\7Z\2\2HI\7<\2\2IM\3\2\2\2JL\t\3\2\2KJ\3\2\2\2LO"+
		"\3\2\2\2MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PR\t\4\2\2QP\3\2\2\2R"+
		"S\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\b\3\2\2\2UV\7V\2\2VW\7<\2\2W[\3\2\2\2X"+
		"Z\t\5\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2][\3\2\2"+
		"\2^`\t\6\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\n\3\2\2\2cd\7E\2"+
		"\2de\7<\2\2ei\3\2\2\2fh\t\7\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2"+
		"\2jm\3\2\2\2ki\3\2\2\2ln\t\b\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2"+
		"\2p\f\3\2\2\2qr\7N\2\2rs\7<\2\2sw\3\2\2\2tv\t\t\2\2ut\3\2\2\2vy\3\2\2"+
		"\2wu\3\2\2\2wx\3\2\2\2x\16\3\2\2\2yw\3\2\2\2z{\7O\2\2{|\7<\2\2|\u0080"+
		"\3\2\2\2}\177\t\n\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0093\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\t\13"+
		"\2\2\u0084\u0087\t\f\2\2\u0085\u0087\t\r\2\2\u0086\u0083\3\2\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\u0094\3\2\2\2\u0088\u008a\t\16\2\2\u0089\u0088\3"+
		"\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008f\7\61\2\2\u008e\u0090\t\17\2\2\u008f\u008e\3"+
		"\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\3\2\2\2\u0093\u0086\3\2\2\2\u0093\u0089\3\2\2\2\u0094\20\3\2\2"+
		"\2\u0095\u0096\7S\2\2\u0096\u0097\7<\2\2\u0097\u009b\3\2\2\2\u0098\u009a"+
		"\t\20\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\u00b9\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f"+
		"\t\21\2\2\u009f\u00a2\t\22\2\2\u00a0\u00a2\t\23\2\2\u00a1\u009e\3\2\2"+
		"\2\u00a1\u00a0\3\2\2\2\u00a2\u00ba\3\2\2\2\u00a3\u00a5\t\24\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\7\61\2\2\u00a9\u00ab\t\25\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00b6\3\2\2\2\u00ae\u00b0\7?\2\2\u00af\u00b1\t\26\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b9\u00a1\3\2\2\2\u00b9\u00a4\3\2\2\2\u00ba\22\3\2\2\2\u00bb\u00bc"+
		"\7X\2\2\u00bc\u00bd\7<\2\2\u00bd\u00c1\3\2\2\2\u00be\u00c0\t\27\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\t\30\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\24\3\2\2\2\u00c9\u00ca\7M\2\2\u00ca\u00cb\7<\2\2\u00cb\u00cf"+
		"\3\2\2\2\u00cc\u00ce\t\31\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2"+
		"\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\26\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d2\u00d3\t\32\2\2\u00d3\30\3\2\2\2\u00d4\u00d5\7o\2\2\u00d5"+
		"\32\3\2\2\2\u00d6\u00d7\t\33\2\2\u00d7\34\3\2\2\2\u00d8\u00da\7\'\2\2"+
		"\u00d9\u00db\t\34\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\36\3\2\2\2\u00de\u00df\7\61\2\2\u00df"+
		" \3\2\2\2\u00e0\u00e1\7?\2\2\u00e1\"\3\2\2\2\u00e2\u00e3\t\35\2\2\u00e3"+
		"$\3\2\2\2\u00e4\u00e5\t\36\2\2\u00e5&\3\2\2\2\u00e6\u00e7\t\37\2\2\u00e7"+
		"\u00f2\t \2\2\u00e8\u00e9\t!\2\2\u00e9\u00f2\t\"\2\2\u00ea\u00eb\t#\2"+
		"\2\u00eb\u00f2\t$\2\2\u00ec\u00ed\t%\2\2\u00ed\u00f2\t&\2\2\u00ee\u00ef"+
		"\t\'\2\2\u00ef\u00f2\t(\2\2\u00f0\u00f2\t)\2\2\u00f1\u00e6\3\2\2\2\u00f1"+
		"\u00e8\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1\u00ee\3\2"+
		"\2\2\u00f1\u00f0\3\2\2\2\u00f2(\3\2\2\2\u00f3\u00f4\t*\2\2\u00f4\u00f7"+
		"\t+\2\2\u00f5\u00f7\t,\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"*\3\2\2\2\u00f8\u00f9\t-\2\2\u00f9\u00fc\t.\2\2\u00fa\u00fc\t/\2\2\u00fb"+
		"\u00f8\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc,\3\2\2\2\u00fd\u00fe\t\60\2\2"+
		"\u00fe.\3\2\2\2\u00ff\u0100\t\61\2\2\u0100\60\3\2\2\2\u0101\u0102\t\62"+
		"\2\2\u0102\u0106\t\63\2\2\u0103\u0104\t\64\2\2\u0104\u0106\t\65\2\2\u0105"+
		"\u0101\3\2\2\2\u0105\u0103\3\2\2\2\u0106\62\3\2\2\2\u0107\u0108\t\66\2"+
		"\2\u0108\64\3\2\2\2\u0109\u010a\t\67\2\2\u010a\66\3\2\2\2\u010b\u010c"+
		"\7\"\2\2\u010c\u010d\3\2\2\2\u010d\u010e\b\34\2\2\u010e8\3\2\2\2\u010f"+
		"\u0114\t8\2\2\u0110\u0111\7^\2\2\u0111\u0114\7/\2\2\u0112\u0114\7~\2\2"+
		"\u0113\u010f\3\2\2\2\u0113\u0110\3\2\2\2\u0113\u0112\3\2\2\2\u0114:\3"+
		"\2\2\2\u0115\u0116\7y\2\2\u0116\u0117\7<\2\2\u0117\u011b\3\2\2\2\u0118"+
		"\u011a\t9\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011c\u0126\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u0120\t:\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0125\59\35\2\u0124"+
		"\u011f\3\2\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127<\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a"+
		"\7]\2\2\u012a>\3\2\2\2\u012b\u012c\7_\2\2\u012c@\3\2\2\2\u012d\u012e\7"+
		"*\2\2\u012eB\3\2\2\2#\2MS[aiow\u0080\u0086\u008b\u0091\u0093\u009b\u00a1"+
		"\u00a6\u00ac\u00b2\u00b6\u00b9\u00c1\u00c7\u00cf\u00dc\u00f1\u00f6\u00fb"+
		"\u0105\u0113\u011b\u0121\u0124\u0126";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}