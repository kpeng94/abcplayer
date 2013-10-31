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
		PLUS=1, INUMBER=2, ITITLE=3, ICOMPOSER=4, ILENGTH=5, IMETER=6, ITEMPO=7, 
		IVOICE=8, IKEY=9, EOL=10, COMMENTSIGN=11, BASENOTE=12, REST=13, BAR=14, 
		SHARP=15, FLAT=16, NEUTRAL=17, NTH_REPEAT=18, OCTAVE=19, NUMBER=20, SLASH=21, 
		SPACE=22, LYRICAL_ELEMENT_TOKEN=23, ILYRIC=24, OPEN_BRACKET=25, CLOSE_BRACKET=26, 
		TUPLET_SPEC=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'+'", "INUMBER", "ITITLE", "ICOMPOSER", "ILENGTH", "IMETER", "ITEMPO", 
		"IVOICE", "IKEY", "EOL", "COMMENTSIGN", "BASENOTE", "REST", "BAR", "SHARP", 
		"FLAT", "NEUTRAL", "NTH_REPEAT", "OCTAVE", "NUMBER", "'/'", "' '", "LYRICAL_ELEMENT_TOKEN", 
		"ILYRIC", "'['", "']'", "TUPLET_SPEC"
	};
	public static final String[] ruleNames = {
		"PLUS", "INUMBER", "ITITLE", "ICOMPOSER", "ILENGTH", "IMETER", "ITEMPO", 
		"IVOICE", "IKEY", "EOL", "COMMENTSIGN", "BASENOTE", "REST", "BAR", "SHARP", 
		"FLAT", "NEUTRAL", "NTH_REPEAT", "OCTAVE", "NUMBER", "SLASH", "SPACE", 
		"LYRICAL_ELEMENT_TOKEN", "ILYRIC", "OPEN_BRACKET", "CLOSE_BRACKET", "TUPLET_SPEC"
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
		"\2\4\35\u0133\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\7\3@\n\3\f\3\16\3C\13\3\3\3\6\3F\n\3\r\3\16\3G\3\4\3\4\3\4"+
		"\3\4\7\4N\n\4\f\4\16\4Q\13\4\3\4\6\4T\n\4\r\4\16\4U\3\5\3\5\3\5\3\5\7"+
		"\5\\\n\5\f\5\16\5_\13\5\3\5\6\5b\n\5\r\5\16\5c\3\6\3\6\3\6\3\6\7\6j\n"+
		"\6\f\6\16\6m\13\6\3\6\6\6p\n\6\r\6\16\6q\3\6\3\6\6\6v\n\6\r\6\16\6w\3"+
		"\7\3\7\3\7\3\7\7\7~\n\7\f\7\16\7\u0081\13\7\3\7\3\7\3\7\5\7\u0086\n\7"+
		"\3\7\6\7\u0089\n\7\r\7\16\7\u008a\3\7\3\7\6\7\u008f\n\7\r\7\16\7\u0090"+
		"\5\7\u0093\n\7\3\b\3\b\3\b\3\b\7\b\u0099\n\b\f\b\16\b\u009c\13\b\3\b\3"+
		"\b\3\b\5\b\u00a1\n\b\3\b\6\b\u00a4\n\b\r\b\16\b\u00a5\3\b\3\b\6\b\u00aa"+
		"\n\b\r\b\16\b\u00ab\3\b\3\b\6\b\u00b0\n\b\r\b\16\b\u00b1\7\b\u00b4\n\b"+
		"\f\b\16\b\u00b7\13\b\5\b\u00b9\n\b\3\t\3\t\3\t\3\t\7\t\u00bf\n\t\f\t\16"+
		"\t\u00c2\13\t\3\t\6\t\u00c5\n\t\r\t\16\t\u00c6\3\n\3\n\3\n\3\n\7\n\u00cd"+
		"\n\n\f\n\16\n\u00d0\13\n\3\n\3\n\5\n\u00d4\n\n\3\n\5\n\u00d7\n\n\3\13"+
		"\3\13\3\f\3\f\7\f\u00dd\n\f\f\f\16\f\u00e0\13\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f1\n\17\3\20"+
		"\3\20\3\20\5\20\u00f6\n\20\3\21\3\21\3\21\5\21\u00fb\n\21\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\5\23\u0103\n\23\3\24\6\24\u0106\n\24\r\24\16\24\u0107"+
		"\3\25\6\25\u010b\n\25\r\25\16\25\u010c\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\5\30\u0117\n\30\3\31\3\31\3\31\3\31\7\31\u011d\n\31\f\31\16\31"+
		"\u0120\13\31\3\31\6\31\u0123\n\31\r\31\16\31\u0124\3\31\7\31\u0128\n\31"+
		"\f\31\16\31\u012b\13\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\2\35\3\3\1"+
		"\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31"+
		"\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30"+
		"\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\1\3\2>\4\13\13\"\"\3\62;\4\13\13"+
		"\"\"\t\"%().;=>@\\^^c|\4\13\13\"\"\t\"%().;=>@\\^^c|\4\13\13\"\"\3\62"+
		";\3\62;\4\13\13\"\"\3EE\4^^~~\3EE\3\62;\3\62;\4\13\13\"\"\3EE\4^^~~\3"+
		"EE\3\62;\3\62;\3\62;\4\13\13\"\"\t\"%().;=>@\\^^c|\4\13\13\"\"\3Ci\4%"+
		"%dd\3oo\4\f\f\17\17\t\"%().;=>@\\^^c|\4CIci\3||\4^^~~\4^^~~\4^^~~\3<<"+
		"\3<<\4^^~~\3]]\4^^~~\4^^~~\3^_\4^^~~\4^^``\4^^``\4^^``\4^^aa\4^^aa\4^"+
		"^aa\3??\3]]\3\63\63\3]]\3\64\64\4))..\3\62;\7\"\",,//aa\u0080\u0080\4"+
		"\13\13\"\"\13##%&(+..\60\60\62;A\\^^c|\3\63;\u015d\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7I\3\2\2\2\tW\3"+
		"\2\2\2\13e\3\2\2\2\ry\3\2\2\2\17\u0094\3\2\2\2\21\u00ba\3\2\2\2\23\u00c8"+
		"\3\2\2\2\25\u00d8\3\2\2\2\27\u00da\3\2\2\2\31\u00e1\3\2\2\2\33\u00e3\3"+
		"\2\2\2\35\u00f0\3\2\2\2\37\u00f5\3\2\2\2!\u00fa\3\2\2\2#\u00fc\3\2\2\2"+
		"%\u0102\3\2\2\2\'\u0105\3\2\2\2)\u010a\3\2\2\2+\u010e\3\2\2\2-\u0110\3"+
		"\2\2\2/\u0116\3\2\2\2\61\u0118\3\2\2\2\63\u012c\3\2\2\2\65\u012e\3\2\2"+
		"\2\67\u0130\3\2\2\29:\7-\2\2:\4\3\2\2\2;<\7Z\2\2<=\7<\2\2=A\3\2\2\2>@"+
		"\t\2\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BE\3\2\2\2CA\3\2\2\2D"+
		"F\t\3\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\6\3\2\2\2IJ\7V\2\2"+
		"JK\7<\2\2KO\3\2\2\2LN\t\4\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2"+
		"PS\3\2\2\2QO\3\2\2\2RT\t\5\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2"+
		"V\b\3\2\2\2WX\7E\2\2XY\7<\2\2Y]\3\2\2\2Z\\\t\6\2\2[Z\3\2\2\2\\_\3\2\2"+
		"\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2`b\t\7\2\2a`\3\2\2\2bc\3\2\2"+
		"\2ca\3\2\2\2cd\3\2\2\2d\n\3\2\2\2ef\7N\2\2fg\7<\2\2gk\3\2\2\2hj\t\b\2"+
		"\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2np\t\t\2"+
		"\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\7\61\2\2tv\t\n"+
		"\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\f\3\2\2\2yz\7O\2\2z{\7<"+
		"\2\2{\177\3\2\2\2|~\t\13\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0092\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\t\f\2"+
		"\2\u0083\u0086\t\r\2\2\u0084\u0086\t\16\2\2\u0085\u0082\3\2\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0093\3\2\2\2\u0087\u0089\t\17\2\2\u0088\u0087\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\7\61\2\2\u008d\u008f\t\20\2\2\u008e\u008d\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0085\3\2\2\2\u0092\u0088\3\2\2\2\u0093\16\3\2\2"+
		"\2\u0094\u0095\7S\2\2\u0095\u0096\7<\2\2\u0096\u009a\3\2\2\2\u0097\u0099"+
		"\t\21\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2"+
		"\u009a\u009b\3\2\2\2\u009b\u00b8\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e"+
		"\t\22\2\2\u009e\u00a1\t\23\2\2\u009f\u00a1\t\24\2\2\u00a0\u009d\3\2\2"+
		"\2\u00a0\u009f\3\2\2\2\u00a1\u00b9\3\2\2\2\u00a2\u00a4\t\25\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\7\61\2\2\u00a8\u00aa\t\26\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00b5\3\2\2\2\u00ad\u00af\7?\2\2\u00ae\u00b0\t\27\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b8\u00a0\3\2\2\2\u00b8\u00a3\3\2\2\2\u00b9\20\3\2\2\2\u00ba\u00bb"+
		"\7X\2\2\u00bb\u00bc\7<\2\2\u00bc\u00c0\3\2\2\2\u00bd\u00bf\t\30\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\t\31\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\22\3\2\2\2\u00c8\u00c9\7M\2\2\u00c9\u00ca\7<\2\2\u00ca\u00ce"+
		"\3\2\2\2\u00cb\u00cd\t\32\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2"+
		"\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d1\u00d3\t\33\2\2\u00d2\u00d4\t\34\2\2\u00d3\u00d2\3\2\2\2"+
		"\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d7\t\35\2\2\u00d6\u00d5"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\24\3\2\2\2\u00d8\u00d9\t\36\2\2\u00d9"+
		"\26\3\2\2\2\u00da\u00de\7\'\2\2\u00db\u00dd\t\37\2\2\u00dc\u00db\3\2\2"+
		"\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\30"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\t \2\2\u00e2\32\3\2\2\2\u00e3"+
		"\u00e4\t!\2\2\u00e4\34\3\2\2\2\u00e5\u00e6\t\"\2\2\u00e6\u00f1\t#\2\2"+
		"\u00e7\u00e8\t$\2\2\u00e8\u00f1\t%\2\2\u00e9\u00ea\t&\2\2\u00ea\u00f1"+
		"\t\'\2\2\u00eb\u00ec\t(\2\2\u00ec\u00f1\t)\2\2\u00ed\u00ee\t*\2\2\u00ee"+
		"\u00f1\t+\2\2\u00ef\u00f1\t,\2\2\u00f0\u00e5\3\2\2\2\u00f0\u00e7\3\2\2"+
		"\2\u00f0\u00e9\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f0\u00ef"+
		"\3\2\2\2\u00f1\36\3\2\2\2\u00f2\u00f3\t-\2\2\u00f3\u00f6\t.\2\2\u00f4"+
		"\u00f6\t/\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6 \3\2\2\2\u00f7"+
		"\u00f8\t\60\2\2\u00f8\u00fb\t\61\2\2\u00f9\u00fb\t\62\2\2\u00fa\u00f7"+
		"\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\"\3\2\2\2\u00fc\u00fd\t\63\2\2\u00fd"+
		"$\3\2\2\2\u00fe\u00ff\t\64\2\2\u00ff\u0103\t\65\2\2\u0100\u0101\t\66\2"+
		"\2\u0101\u0103\t\67\2\2\u0102\u00fe\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"&\3\2\2\2\u0104\u0106\t8\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108(\3\2\2\2\u0109\u010b\t9\2\2\u010a"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d*\3\2\2\2\u010e\u010f\7\61\2\2\u010f,\3\2\2\2\u0110\u0111\7"+
		"\"\2\2\u0111.\3\2\2\2\u0112\u0117\t:\2\2\u0113\u0114\7^\2\2\u0114\u0117"+
		"\7/\2\2\u0115\u0117\7~\2\2\u0116\u0112\3\2\2\2\u0116\u0113\3\2\2\2\u0116"+
		"\u0115\3\2\2\2\u0117\60\3\2\2\2\u0118\u0119\7y\2\2\u0119\u011a\7<\2\2"+
		"\u011a\u011e\3\2\2\2\u011b\u011d\t;\2\2\u011c\u011b\3\2\2\2\u011d\u0120"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0129\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0123\t<\2\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0128\5/\30\2\u0127\u0122\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\62\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012c\u012d\7]\2\2\u012d\64\3\2\2\2\u012e\u012f\7_\2\2\u012f"+
		"\66\3\2\2\2\u0130\u0131\7*\2\2\u0131\u0132\t=\2\2\u01328\3\2\2\2*\2AG"+
		"OU]ckqw\177\u0085\u008a\u0090\u0092\u009a\u00a0\u00a5\u00ab\u00b1\u00b5"+
		"\u00b8\u00c0\u00c6\u00ce\u00d3\u00d6\u00de\u00f0\u00f5\u00fa\u0102\u0105"+
		"\u0107\u010c\u0116\u011e\u0124\u0127\u0129";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}