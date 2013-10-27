// Generated from ABCMusic.g4 by ANTLR 4.0

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
public class ABCMusicParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'+'", "DIGIT", "INUMBER", "ITITLE", "ICOMPOSER", "ILENGTH", 
		"IMETER", "ITEMPO", "IVOICE", "IKEY", "EOL", "'m'", "ACCIDENTAL", "COMMENTSIGN", 
		"'/'", "'='", "BASENOTE", "REST", "BAR", "SHARP", "FLAT", "NEUTRAL", "TIMES", 
		"NTH_REPEAT", "OCTAVE_HIGHER", "OCTAVE_LOWER", "' '", "LYRICAL_ELEMENT_TOKEN", 
		"ILYRIC", "'['", "']'", "'('"
	};
	public static final int
		RULE_abc_tune = 0, RULE_abc_header = 1, RULE_field_number = 2, RULE_field_title = 3, 
		RULE_field_composer = 4, RULE_field_default_length = 5, RULE_field_meter = 6, 
		RULE_field_tempo = 7, RULE_field_voice = 8, RULE_other_fields = 9, RULE_field_key = 10, 
		RULE_key = 11, RULE_keynote = 12, RULE_note_length_strict = 13, RULE_note = 14, 
		RULE_note_or_rest = 15, RULE_pitch = 16, RULE_octave = 17, RULE_note_length = 18, 
		RULE_comment = 19, RULE_end_of_line = 20, RULE_abc_music = 21, RULE_abc_line = 22, 
		RULE_element = 23, RULE_note_element = 24, RULE_accidental = 25, RULE_tuplet_element = 26, 
		RULE_tuplet_spec = 27, RULE_multi_note = 28, RULE_mid_tune_field = 29, 
		RULE_lyric = 30, RULE_literal = 31;
	public static final String[] ruleNames = {
		"abc_tune", "abc_header", "field_number", "field_title", "field_composer", 
		"field_default_length", "field_meter", "field_tempo", "field_voice", "other_fields", 
		"field_key", "key", "keynote", "note_length_strict", "note", "note_or_rest", 
		"pitch", "octave", "note_length", "comment", "end_of_line", "abc_music", 
		"abc_line", "element", "note_element", "accidental", "tuplet_element", 
		"tuplet_spec", "multi_note", "mid_tune_field", "lyric", "literal"
	};

	@Override
	public String getGrammarFileName() { return "ABCMusic.g4"; }

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

	public ABCMusicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Abc_tuneContext extends ParserRuleContext {
		public Abc_musicContext abc_music() {
			return getRuleContext(Abc_musicContext.class,0);
		}
		public Abc_headerContext abc_header() {
			return getRuleContext(Abc_headerContext.class,0);
		}
		public Abc_tuneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_tune; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_tune(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_tune(this);
		}
	}

	public final Abc_tuneContext abc_tune() throws RecognitionException {
		Abc_tuneContext _localctx = new Abc_tuneContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abc_tune);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); abc_header();
			setState(65); abc_music();
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

	public static class Abc_headerContext extends ParserRuleContext {
		public Field_keyContext field_key() {
			return getRuleContext(Field_keyContext.class,0);
		}
		public List<Other_fieldsContext> other_fields() {
			return getRuleContexts(Other_fieldsContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Other_fieldsContext other_fields(int i) {
			return getRuleContext(Other_fieldsContext.class,i);
		}
		public Field_numberContext field_number() {
			return getRuleContext(Field_numberContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public Field_titleContext field_title() {
			return getRuleContext(Field_titleContext.class,0);
		}
		public Abc_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_header(this);
		}
	}

	public final Abc_headerContext abc_header() throws RecognitionException {
		Abc_headerContext _localctx = new Abc_headerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_abc_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); field_number();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENTSIGN) {
				{
				{
				setState(68); comment();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74); field_title();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ICOMPOSER) | (1L << ILENGTH) | (1L << IMETER) | (1L << ITEMPO) | (1L << IVOICE) | (1L << COMMENTSIGN))) != 0)) {
				{
				{
				setState(75); other_fields();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81); field_key();
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

	public static class Field_numberContext extends ParserRuleContext {
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode INUMBER() { return getToken(ABCMusicParser.INUMBER, 0); }
		public Field_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_number(this);
		}
	}

	public final Field_numberContext field_number() throws RecognitionException {
		Field_numberContext _localctx = new Field_numberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_field_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(INUMBER);
			setState(84); end_of_line();
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

	public static class Field_titleContext extends ParserRuleContext {
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode ITITLE() { return getToken(ABCMusicParser.ITITLE, 0); }
		public Field_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_title(this);
		}
	}

	public final Field_titleContext field_title() throws RecognitionException {
		Field_titleContext _localctx = new Field_titleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(ITITLE);
			setState(87); end_of_line();
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

	public static class Field_composerContext extends ParserRuleContext {
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode ICOMPOSER() { return getToken(ABCMusicParser.ICOMPOSER, 0); }
		public Field_composerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_composer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_composer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_composer(this);
		}
	}

	public final Field_composerContext field_composer() throws RecognitionException {
		Field_composerContext _localctx = new Field_composerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field_composer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(ICOMPOSER);
			setState(90); end_of_line();
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

	public static class Field_default_lengthContext extends ParserRuleContext {
		public Note_length_strictContext note_length_strict() {
			return getRuleContext(Note_length_strictContext.class,0);
		}
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public TerminalNode ILENGTH() { return getToken(ABCMusicParser.ILENGTH, 0); }
		public Field_default_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_default_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_default_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_default_length(this);
		}
	}

	public final Field_default_lengthContext field_default_length() throws RecognitionException {
		Field_default_lengthContext _localctx = new Field_default_lengthContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field_default_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(ILENGTH);
			setState(93); note_length_strict();
			setState(94); end_of_line();
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

	public static class Field_meterContext extends ParserRuleContext {
		public TerminalNode IMETER() { return getToken(ABCMusicParser.IMETER, 0); }
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public Field_meterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_meter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_meter(this);
		}
	}

	public final Field_meterContext field_meter() throws RecognitionException {
		Field_meterContext _localctx = new Field_meterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field_meter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(IMETER);
			setState(97); end_of_line();
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

	public static class Field_tempoContext extends ParserRuleContext {
		public TerminalNode ITEMPO() { return getToken(ABCMusicParser.ITEMPO, 0); }
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public Field_tempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_tempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_tempo(this);
		}
	}

	public final Field_tempoContext field_tempo() throws RecognitionException {
		Field_tempoContext _localctx = new Field_tempoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(ITEMPO);
			setState(100); end_of_line();
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

	public static class Field_voiceContext extends ParserRuleContext {
		public TerminalNode IVOICE() { return getToken(ABCMusicParser.IVOICE, 0); }
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public Field_voiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_voice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_voice(this);
		}
	}

	public final Field_voiceContext field_voice() throws RecognitionException {
		Field_voiceContext _localctx = new Field_voiceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field_voice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(IVOICE);
			setState(103); end_of_line();
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

	public static class Other_fieldsContext extends ParserRuleContext {
		public Field_tempoContext field_tempo() {
			return getRuleContext(Field_tempoContext.class,0);
		}
		public Field_default_lengthContext field_default_length() {
			return getRuleContext(Field_default_lengthContext.class,0);
		}
		public Field_meterContext field_meter() {
			return getRuleContext(Field_meterContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Field_composerContext field_composer() {
			return getRuleContext(Field_composerContext.class,0);
		}
		public Field_voiceContext field_voice() {
			return getRuleContext(Field_voiceContext.class,0);
		}
		public Other_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterOther_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitOther_fields(this);
		}
	}

	public final Other_fieldsContext other_fields() throws RecognitionException {
		Other_fieldsContext _localctx = new Other_fieldsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_other_fields);
		try {
			setState(111);
			switch (_input.LA(1)) {
			case ICOMPOSER:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); field_composer();
				}
				break;
			case ILENGTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); field_default_length();
				}
				break;
			case IMETER:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); field_meter();
				}
				break;
			case ITEMPO:
				enterOuterAlt(_localctx, 4);
				{
				setState(108); field_tempo();
				}
				break;
			case IVOICE:
				enterOuterAlt(_localctx, 5);
				{
				setState(109); field_voice();
				}
				break;
			case COMMENTSIGN:
				enterOuterAlt(_localctx, 6);
				{
				setState(110); comment();
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

	public static class Field_keyContext extends ParserRuleContext {
		public TerminalNode IKEY() { return getToken(ABCMusicParser.IKEY, 0); }
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public Field_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_key(this);
		}
	}

	public final Field_keyContext field_key() throws RecognitionException {
		Field_keyContext _localctx = new Field_keyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_field_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(IKEY);
			setState(114); key();
			setState(115); end_of_line();
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

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode MODEMINOR() { return getToken(ABCMusicParser.MODEMINOR, 0); }
		public KeynoteContext keynote() {
			return getRuleContext(KeynoteContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); keynote();
			setState(119);
			_la = _input.LA(1);
			if (_la==MODEMINOR) {
				{
				setState(118); match(MODEMINOR);
				}
			}

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

	public static class KeynoteContext extends ParserRuleContext {
		public TerminalNode BASENOTE() { return getToken(ABCMusicParser.BASENOTE, 0); }
		public TerminalNode ACCIDENTAL() { return getToken(ABCMusicParser.ACCIDENTAL, 0); }
		public KeynoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keynote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterKeynote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitKeynote(this);
		}
	}

	public final KeynoteContext keynote() throws RecognitionException {
		KeynoteContext _localctx = new KeynoteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_keynote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(BASENOTE);
			setState(123);
			_la = _input.LA(1);
			if (_la==ACCIDENTAL) {
				{
				setState(122); match(ACCIDENTAL);
				}
			}

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

	public static class Note_length_strictContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public TerminalNode SLASH() { return getToken(ABCMusicParser.SLASH, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
		public Note_length_strictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_length_strict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote_length_strict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote_length_strict(this);
		}
	}

	public final Note_length_strictContext note_length_strict() throws RecognitionException {
		Note_length_strictContext _localctx = new Note_length_strictContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_note_length_strict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125); match(DIGIT);
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(130); match(SLASH);
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131); match(DIGIT);
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class NoteContext extends ParserRuleContext {
		public Note_or_restContext note_or_rest() {
			return getRuleContext(Note_or_restContext.class,0);
		}
		public Note_lengthContext note_length() {
			return getRuleContext(Note_lengthContext.class,0);
		}
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); note_or_rest();
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(137); note_length();
				}
				break;
			}
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

	public static class Note_or_restContext extends ParserRuleContext {
		public TerminalNode REST() { return getToken(ABCMusicParser.REST, 0); }
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
		}
		public Note_or_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_or_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote_or_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote_or_rest(this);
		}
	}

	public final Note_or_restContext note_or_rest() throws RecognitionException {
		Note_or_restContext _localctx = new Note_or_restContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_note_or_rest);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case BASENOTE:
			case SHARP:
			case FLAT:
			case NEUTRAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(140); pitch();
				}
				break;
			case REST:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); match(REST);
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

	public static class PitchContext extends ParserRuleContext {
		public OctaveContext octave() {
			return getRuleContext(OctaveContext.class,0);
		}
		public TerminalNode BASENOTE() { return getToken(ABCMusicParser.BASENOTE, 0); }
		public AccidentalContext accidental() {
			return getRuleContext(AccidentalContext.class,0);
		}
		public PitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitPitch(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHARP) | (1L << FLAT) | (1L << NEUTRAL))) != 0)) {
				{
				setState(144); accidental();
				}
			}

			setState(147); match(BASENOTE);
			setState(149);
			_la = _input.LA(1);
			if (_la==OCTAVE_HIGHER || _la==OCTAVE_LOWER) {
				{
				setState(148); octave();
				}
			}

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

	public static class OctaveContext extends ParserRuleContext {
		public List<TerminalNode> OCTAVE_HIGHER() { return getTokens(ABCMusicParser.OCTAVE_HIGHER); }
		public List<TerminalNode> OCTAVE_LOWER() { return getTokens(ABCMusicParser.OCTAVE_LOWER); }
		public TerminalNode OCTAVE_LOWER(int i) {
			return getToken(ABCMusicParser.OCTAVE_LOWER, i);
		}
		public TerminalNode OCTAVE_HIGHER(int i) {
			return getToken(ABCMusicParser.OCTAVE_HIGHER, i);
		}
		public OctaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterOctave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitOctave(this);
		}
	}

	public final OctaveContext octave() throws RecognitionException {
		OctaveContext _localctx = new OctaveContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_octave);
		int _la;
		try {
			setState(161);
			switch (_input.LA(1)) {
			case OCTAVE_LOWER:
				enterOuterAlt(_localctx, 1);
				{
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(151); match(OCTAVE_LOWER);
					}
					}
					setState(154); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OCTAVE_LOWER );
				}
				break;
			case OCTAVE_HIGHER:
				enterOuterAlt(_localctx, 2);
				{
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(156); match(OCTAVE_HIGHER);
					}
					}
					setState(159); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OCTAVE_HIGHER );
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

	public static class Note_lengthContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public TerminalNode SLASH() { return getToken(ABCMusicParser.SLASH, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
		public Note_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote_length(this);
		}
	}

	public final Note_lengthContext note_length() throws RecognitionException {
		Note_lengthContext _localctx = new Note_lengthContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_note_length);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if (_la==DIGIT) {
				{
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(163); match(DIGIT);
					}
					}
					setState(166); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
			}

			setState(178);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(170); match(SLASH);
				setState(176);
				_la = _input.LA(1);
				if (_la==DIGIT) {
					{
					setState(172); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(171); match(DIGIT);
						}
						}
						setState(174); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==DIGIT );
					}
				}

				}
			}

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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(ABCMusicParser.EOL, 0); }
		public TerminalNode COMMENTSIGN() { return getToken(ABCMusicParser.COMMENTSIGN, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(COMMENTSIGN);
			setState(181); match(EOL);
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

	public static class End_of_lineContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(ABCMusicParser.EOL, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public End_of_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_of_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterEnd_of_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitEnd_of_line(this);
		}
	}

	public final End_of_lineContext end_of_line() throws RecognitionException {
		End_of_lineContext _localctx = new End_of_lineContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_end_of_line);
		try {
			setState(185);
			switch (_input.LA(1)) {
			case COMMENTSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(183); comment();
				}
				break;
			case EOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(184); match(EOL);
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

	public static class Abc_musicContext extends ParserRuleContext {
		public Abc_lineContext abc_line(int i) {
			return getRuleContext(Abc_lineContext.class,i);
		}
		public List<Abc_lineContext> abc_line() {
			return getRuleContexts(Abc_lineContext.class);
		}
		public Abc_musicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_music; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_music(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_music(this);
		}
	}

	public final Abc_musicContext abc_music() throws RecognitionException {
		Abc_musicContext _localctx = new Abc_musicContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_abc_music);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187); abc_line();
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IVOICE) | (1L << COMMENTSIGN) | (1L << BASENOTE) | (1L << REST) | (1L << BAR) | (1L << SHARP) | (1L << FLAT) | (1L << NEUTRAL) | (1L << NTH_REPEAT) | (1L << SPACE) | (1L << OPEN_BRACKET) | (1L << OPEN_PAREN))) != 0) );
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

	public static class Abc_lineContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public LyricContext lyric() {
			return getRuleContext(LyricContext.class,0);
		}
		public Mid_tune_fieldContext mid_tune_field() {
			return getRuleContext(Mid_tune_fieldContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(ABCMusicParser.EOL); }
		public TerminalNode EOF(int i) {
			return getToken(ABCMusicParser.EOF, i);
		}
		public List<TerminalNode> EOF() { return getTokens(ABCMusicParser.EOF); }
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TerminalNode EOL(int i) {
			return getToken(ABCMusicParser.EOL, i);
		}
		public Abc_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_line(this);
		}
	}

	public final Abc_lineContext abc_line() throws RecognitionException {
		Abc_lineContext _localctx = new Abc_lineContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_abc_line);
		int _la;
		try {
			setState(205);
			switch (_input.LA(1)) {
			case BASENOTE:
			case REST:
			case BAR:
			case SHARP:
			case FLAT:
			case NEUTRAL:
			case NTH_REPEAT:
			case SPACE:
			case OPEN_BRACKET:
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(192); element();
					}
					}
					setState(195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASENOTE) | (1L << REST) | (1L << BAR) | (1L << SHARP) | (1L << FLAT) | (1L << NEUTRAL) | (1L << NTH_REPEAT) | (1L << SPACE) | (1L << OPEN_BRACKET) | (1L << OPEN_PAREN))) != 0) );
				setState(197);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==EOL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(201);
				_la = _input.LA(1);
				if (_la==ILYRIC) {
					{
					setState(198); lyric();
					setState(199);
					_la = _input.LA(1);
					if ( !(_la==EOF || _la==EOL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				}
				break;
			case IVOICE:
				enterOuterAlt(_localctx, 2);
				{
				setState(203); mid_tune_field();
				}
				break;
			case COMMENTSIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(204); comment();
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode NTH_REPEAT() { return getToken(ABCMusicParser.NTH_REPEAT, 0); }
		public TerminalNode SPACE() { return getToken(ABCMusicParser.SPACE, 0); }
		public Note_elementContext note_element() {
			return getRuleContext(Note_elementContext.class,0);
		}
		public TerminalNode BAR() { return getToken(ABCMusicParser.BAR, 0); }
		public Tuplet_elementContext tuplet_element() {
			return getRuleContext(Tuplet_elementContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_element);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case BASENOTE:
			case REST:
			case SHARP:
			case FLAT:
			case NEUTRAL:
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(207); note_element();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(208); tuplet_element();
				}
				break;
			case BAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(209); match(BAR);
				}
				break;
			case NTH_REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(210); match(NTH_REPEAT);
				}
				break;
			case SPACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(211); match(SPACE);
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

	public static class Note_elementContext extends ParserRuleContext {
		public Multi_noteContext multi_note() {
			return getRuleContext(Multi_noteContext.class,0);
		}
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public Note_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote_element(this);
		}
	}

	public final Note_elementContext note_element() throws RecognitionException {
		Note_elementContext _localctx = new Note_elementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_note_element);
		try {
			setState(216);
			switch (_input.LA(1)) {
			case BASENOTE:
			case REST:
			case SHARP:
			case FLAT:
			case NEUTRAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(214); note();
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(215); multi_note();
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

	public static class AccidentalContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(ABCMusicParser.SHARP, 0); }
		public TerminalNode FLAT() { return getToken(ABCMusicParser.FLAT, 0); }
		public TerminalNode NEUTRAL() { return getToken(ABCMusicParser.NEUTRAL, 0); }
		public AccidentalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accidental; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAccidental(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAccidental(this);
		}
	}

	public final AccidentalContext accidental() throws RecognitionException {
		AccidentalContext _localctx = new AccidentalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_accidental);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHARP) | (1L << FLAT) | (1L << NEUTRAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Tuplet_elementContext extends ParserRuleContext {
		public Note_elementContext note_element(int i) {
			return getRuleContext(Note_elementContext.class,i);
		}
		public List<Note_elementContext> note_element() {
			return getRuleContexts(Note_elementContext.class);
		}
		public Tuplet_specContext tuplet_spec() {
			return getRuleContext(Tuplet_specContext.class,0);
		}
		public Tuplet_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTuplet_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTuplet_element(this);
		}
	}

	public final Tuplet_elementContext tuplet_element() throws RecognitionException {
		Tuplet_elementContext _localctx = new Tuplet_elementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tuplet_element);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220); tuplet_spec();
			setState(222); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(221); note_element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(224); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class Tuplet_specContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(ABCMusicParser.OPEN_PAREN, 0); }
		public TerminalNode DIGIT() { return getToken(ABCMusicParser.DIGIT, 0); }
		public Tuplet_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTuplet_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTuplet_spec(this);
		}
	}

	public final Tuplet_specContext tuplet_spec() throws RecognitionException {
		Tuplet_specContext _localctx = new Tuplet_specContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tuplet_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); match(OPEN_PAREN);
			setState(227); match(DIGIT);
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

	public static class Multi_noteContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(ABCMusicParser.OPEN_BRACKET, 0); }
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public Note_lengthContext note_length() {
			return getRuleContext(Note_lengthContext.class,0);
		}
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(ABCMusicParser.CLOSE_BRACKET, 0); }
		public Multi_noteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMulti_note(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMulti_note(this);
		}
	}

	public final Multi_noteContext multi_note() throws RecognitionException {
		Multi_noteContext _localctx = new Multi_noteContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_multi_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); match(OPEN_BRACKET);
			setState(231); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(230); note();
				}
				}
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASENOTE) | (1L << REST) | (1L << SHARP) | (1L << FLAT) | (1L << NEUTRAL))) != 0) );
			setState(235); match(CLOSE_BRACKET);
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(236); note_length();
				}
				break;
			}
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

	public static class Mid_tune_fieldContext extends ParserRuleContext {
		public Field_voiceContext field_voice() {
			return getRuleContext(Field_voiceContext.class,0);
		}
		public Mid_tune_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mid_tune_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMid_tune_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMid_tune_field(this);
		}
	}

	public final Mid_tune_fieldContext mid_tune_field() throws RecognitionException {
		Mid_tune_fieldContext _localctx = new Mid_tune_fieldContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mid_tune_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); field_voice();
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

	public static class LyricContext extends ParserRuleContext {
		public TerminalNode ILYRIC() { return getToken(ABCMusicParser.ILYRIC, 0); }
		public LyricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyric(this);
		}
	}

	public final LyricContext lyric() throws RecognitionException {
		LyricContext _localctx = new LyricContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_lyric);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); match(ILYRIC);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode BASENOTE() { return getToken(ABCMusicParser.BASENOTE, 0); }
		public TerminalNode REST() { return getToken(ABCMusicParser.REST, 0); }
		public TerminalNode BAR() { return getToken(ABCMusicParser.BAR, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASENOTE) | (1L << REST) | (1L << BAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\2\3\"\u00f8\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\3\2\3\2\3\2\3\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\3"+
		"\3\3\7\3O\n\3\f\3\16\3R\13\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13r\n\13\3\f\3\f\3\f\3\f\3\r\3\r\5\rz\n\r\3\16\3\16"+
		"\5\16~\n\16\3\17\6\17\u0081\n\17\r\17\16\17\u0082\3\17\3\17\6\17\u0087"+
		"\n\17\r\17\16\17\u0088\3\20\3\20\5\20\u008d\n\20\3\21\3\21\5\21\u0091"+
		"\n\21\3\22\5\22\u0094\n\22\3\22\3\22\5\22\u0098\n\22\3\23\6\23\u009b\n"+
		"\23\r\23\16\23\u009c\3\23\6\23\u00a0\n\23\r\23\16\23\u00a1\5\23\u00a4"+
		"\n\23\3\24\6\24\u00a7\n\24\r\24\16\24\u00a8\5\24\u00ab\n\24\3\24\3\24"+
		"\6\24\u00af\n\24\r\24\16\24\u00b0\5\24\u00b3\n\24\5\24\u00b5\n\24\3\25"+
		"\3\25\3\25\3\26\3\26\5\26\u00bc\n\26\3\27\6\27\u00bf\n\27\r\27\16\27\u00c0"+
		"\3\30\6\30\u00c4\n\30\r\30\16\30\u00c5\3\30\3\30\3\30\3\30\5\30\u00cc"+
		"\n\30\3\30\3\30\5\30\u00d0\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u00d7\n"+
		"\31\3\32\3\32\5\32\u00db\n\32\3\33\3\33\3\34\3\34\6\34\u00e1\n\34\r\34"+
		"\16\34\u00e2\3\35\3\35\3\35\3\36\3\36\6\36\u00ea\n\36\r\36\16\36\u00eb"+
		"\3\36\3\36\5\36\u00f0\n\36\3\37\3\37\3 \3 \3!\3!\3!\2\"\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\6\4\1\1\r\r\4\1\1"+
		"\r\r\3\26\30\3\23\25\u00fc\2B\3\2\2\2\4E\3\2\2\2\6U\3\2\2\2\bX\3\2\2\2"+
		"\n[\3\2\2\2\f^\3\2\2\2\16b\3\2\2\2\20e\3\2\2\2\22h\3\2\2\2\24q\3\2\2\2"+
		"\26s\3\2\2\2\30w\3\2\2\2\32{\3\2\2\2\34\u0080\3\2\2\2\36\u008a\3\2\2\2"+
		" \u0090\3\2\2\2\"\u0093\3\2\2\2$\u00a3\3\2\2\2&\u00aa\3\2\2\2(\u00b6\3"+
		"\2\2\2*\u00bb\3\2\2\2,\u00be\3\2\2\2.\u00cf\3\2\2\2\60\u00d6\3\2\2\2\62"+
		"\u00da\3\2\2\2\64\u00dc\3\2\2\2\66\u00de\3\2\2\28\u00e4\3\2\2\2:\u00e7"+
		"\3\2\2\2<\u00f1\3\2\2\2>\u00f3\3\2\2\2@\u00f5\3\2\2\2BC\5\4\3\2CD\5,\27"+
		"\2D\3\3\2\2\2EI\5\6\4\2FH\5(\25\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2"+
		"\2\2JL\3\2\2\2KI\3\2\2\2LP\5\b\5\2MO\5\24\13\2NM\3\2\2\2OR\3\2\2\2PN\3"+
		"\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\5\26\f\2T\5\3\2\2\2UV\7\5\2\2V"+
		"W\5*\26\2W\7\3\2\2\2XY\7\6\2\2YZ\5*\26\2Z\t\3\2\2\2[\\\7\7\2\2\\]\5*\26"+
		"\2]\13\3\2\2\2^_\7\b\2\2_`\5\34\17\2`a\5*\26\2a\r\3\2\2\2bc\7\t\2\2cd"+
		"\5*\26\2d\17\3\2\2\2ef\7\n\2\2fg\5*\26\2g\21\3\2\2\2hi\7\13\2\2ij\5*\26"+
		"\2j\23\3\2\2\2kr\5\n\6\2lr\5\f\7\2mr\5\16\b\2nr\5\20\t\2or\5\22\n\2pr"+
		"\5(\25\2qk\3\2\2\2ql\3\2\2\2qm\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r"+
		"\25\3\2\2\2st\7\f\2\2tu\5\30\r\2uv\5*\26\2v\27\3\2\2\2wy\5\32\16\2xz\7"+
		"\16\2\2yx\3\2\2\2yz\3\2\2\2z\31\3\2\2\2{}\7\23\2\2|~\7\17\2\2}|\3\2\2"+
		"\2}~\3\2\2\2~\33\3\2\2\2\177\u0081\7\4\2\2\u0080\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\7\21\2\2\u0085\u0087\7\4\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\35\3\2\2\2\u008a"+
		"\u008c\5 \21\2\u008b\u008d\5&\24\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\37\3\2\2\2\u008e\u0091\5\"\22\2\u008f\u0091\7\24\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091!\3\2\2\2\u0092\u0094\5\64\33"+
		"\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097"+
		"\7\23\2\2\u0096\u0098\5$\23\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2"+
		"\u0098#\3\2\2\2\u0099\u009b\7\34\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a4\3\2\2\2\u009e"+
		"\u00a0\7\33\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u009a\3\2\2\2\u00a3"+
		"\u009f\3\2\2\2\u00a4%\3\2\2\2\u00a5\u00a7\7\4\2\2\u00a6\u00a5\3\2\2\2"+
		"\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab"+
		"\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b4\3\2\2\2\u00ac"+
		"\u00b2\7\21\2\2\u00ad\u00af\7\4\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3"+
		"\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2"+
		"\u00ae\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ac\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\'\3\2\2\2\u00b6\u00b7\7\20\2\2\u00b7\u00b8"+
		"\7\r\2\2\u00b8)\3\2\2\2\u00b9\u00bc\5(\25\2\u00ba\u00bc\7\r\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc+\3\2\2\2\u00bd\u00bf\5.\30\2"+
		"\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1-\3\2\2\2\u00c2\u00c4\5\60\31\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00cb\t\2\2\2\u00c8\u00c9\5> \2\u00c9\u00ca\t\3\2\2\u00ca\u00cc"+
		"\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d0\3\2\2\2\u00cd"+
		"\u00d0\5<\37\2\u00ce\u00d0\5(\25\2\u00cf\u00c3\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00ce\3\2\2\2\u00d0/\3\2\2\2\u00d1\u00d7\5\62\32\2\u00d2\u00d7"+
		"\5\66\34\2\u00d3\u00d7\7\25\2\2\u00d4\u00d7\7\32\2\2\u00d5\u00d7\7\35"+
		"\2\2\u00d6\u00d1\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\61\3\2\2\2\u00d8\u00db\5\36\20"+
		"\2\u00d9\u00db\5:\36\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\63"+
		"\3\2\2\2\u00dc\u00dd\t\4\2\2\u00dd\65\3\2\2\2\u00de\u00e0\58\35\2\u00df"+
		"\u00e1\5\62\32\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3"+
		"\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\67\3\2\2\2\u00e4\u00e5\7\"\2\2\u00e5"+
		"\u00e6\7\4\2\2\u00e69\3\2\2\2\u00e7\u00e9\7 \2\2\u00e8\u00ea\5\36\20\2"+
		"\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\7!\2\2\u00ee\u00f0\5&\24\2\u00ef"+
		"\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0;\3\2\2\2\u00f1\u00f2\5\22\n\2"+
		"\u00f2=\3\2\2\2\u00f3\u00f4\7\37\2\2\u00f4?\3\2\2\2\u00f5\u00f6\t\5\2"+
		"\2\u00f6A\3\2\2\2\37IPqy}\u0082\u0088\u008c\u0090\u0093\u0097\u009c\u00a1"+
		"\u00a3\u00a8\u00aa\u00b0\u00b2\u00b4\u00bb\u00c0\u00c5\u00cb\u00cf\u00d6"+
		"\u00da\u00e2\u00eb\u00ef";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}