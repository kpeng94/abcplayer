// Generated from ABCLyric.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCLyricParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HYPHEN=1, UNDERSCORE=2, SPACES=3, ASTERISK=4, BAR=5, WORD=6, EOL=7;
	public static final String[] tokenNames = {
		"<INVALID>", "HYPHEN", "UNDERSCORE", "SPACES", "ASTERISK", "BAR", "WORD", 
		"EOL"
	};
	public static final int
		RULE_lyric = 0, RULE_word = 1;
	public static final String[] ruleNames = {
		"lyric", "word"
	};

	@Override
	public String getGrammarFileName() { return "ABCLyric.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public ABCLyricParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LyricContext extends ParserRuleContext {
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(ABCLyricParser.EOL); }
		public TerminalNode EOF() { return getToken(ABCLyricParser.EOF, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public TerminalNode EOL(int i) {
			return getToken(ABCLyricParser.EOL, i);
		}
		public LyricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCLyricListener ) ((ABCLyricListener)listener).enterLyric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCLyricListener ) ((ABCLyricListener)listener).exitLyric(this);
		}
	}

	public final LyricContext lyric() throws RecognitionException {
		LyricContext _localctx = new LyricContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lyric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4); word();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASTERISK) | (1L << BAR) | (1L << WORD))) != 0) );
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(9); match(EOL);
				}
				}
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(15); match(EOF);
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

	public static class WordContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ABCLyricParser.WORD, 0); }
		public TerminalNode UNDERSCORE() { return getToken(ABCLyricParser.UNDERSCORE, 0); }
		public TerminalNode HYPHEN() { return getToken(ABCLyricParser.HYPHEN, 0); }
		public TerminalNode SPACES() { return getToken(ABCLyricParser.SPACES, 0); }
		public TerminalNode BAR() { return getToken(ABCLyricParser.BAR, 0); }
		public TerminalNode ASTERISK() { return getToken(ABCLyricParser.ASTERISK, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCLyricListener ) ((ABCLyricListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCLyricListener ) ((ABCLyricListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_word);
		int _la;
		try {
			setState(37);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(17); match(WORD);
				setState(33);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					{
					setState(21);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACES) {
						{
						{
						setState(18); match(SPACES);
						}
						}
						setState(23);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==HYPHEN) {
						{
						{
						setState(24); match(HYPHEN);
						}
						}
						setState(29);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;

				case 2:
					{
					setState(31);
					_la = _input.LA(1);
					if (_la==UNDERSCORE) {
						{
						setState(30); match(UNDERSCORE);
						}
					}

					}
					break;
				}
				}
				}
				break;
			case ASTERISK:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(35); match(ASTERISK);
				}
				}
				break;
			case BAR:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(36); match(BAR);
				}
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

	public static final String _serializedATN =
		"\2\3\t*\4\2\t\2\4\3\t\3\3\2\6\2\b\n\2\r\2\16\2\t\3\2\7\2\r\n\2\f\2\16"+
		"\2\20\13\2\3\2\3\2\3\3\3\3\7\3\26\n\3\f\3\16\3\31\13\3\3\3\7\3\34\n\3"+
		"\f\3\16\3\37\13\3\3\3\5\3\"\n\3\5\3$\n\3\3\3\3\3\5\3(\n\3\3\3\2\4\2\4"+
		"\2\2/\2\7\3\2\2\2\4\'\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\t\3\2\2\2\t\7"+
		"\3\2\2\2\t\n\3\2\2\2\n\16\3\2\2\2\13\r\7\t\2\2\f\13\3\2\2\2\r\20\3\2\2"+
		"\2\16\f\3\2\2\2\16\17\3\2\2\2\17\21\3\2\2\2\20\16\3\2\2\2\21\22\7\1\2"+
		"\2\22\3\3\2\2\2\23#\7\b\2\2\24\26\7\5\2\2\25\24\3\2\2\2\26\31\3\2\2\2"+
		"\27\25\3\2\2\2\27\30\3\2\2\2\30\35\3\2\2\2\31\27\3\2\2\2\32\34\7\3\2\2"+
		"\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36$\3\2\2\2\37"+
		"\35\3\2\2\2 \"\7\4\2\2! \3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#\27\3\2\2\2#!\3"+
		"\2\2\2$(\3\2\2\2%(\7\6\2\2&(\7\7\2\2\'\23\3\2\2\2\'%\3\2\2\2\'&\3\2\2"+
		"\2(\5\3\2\2\2\t\t\16\27\35!#\'";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}