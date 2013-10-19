// Generated from ABCMusic.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ABCMusicListener extends ParseTreeListener {
	void enterField_tempo(ABCMusicParser.Field_tempoContext ctx);
	void exitField_tempo(ABCMusicParser.Field_tempoContext ctx);

	void enterNote_length_strict(ABCMusicParser.Note_length_strictContext ctx);
	void exitNote_length_strict(ABCMusicParser.Note_length_strictContext ctx);

	void enterOther_fields(ABCMusicParser.Other_fieldsContext ctx);
	void exitOther_fields(ABCMusicParser.Other_fieldsContext ctx);

	void enterAbc_header(ABCMusicParser.Abc_headerContext ctx);
	void exitAbc_header(ABCMusicParser.Abc_headerContext ctx);

	void enterEnd_of_line(ABCMusicParser.End_of_lineContext ctx);
	void exitEnd_of_line(ABCMusicParser.End_of_lineContext ctx);

	void enterTempo(ABCMusicParser.TempoContext ctx);
	void exitTempo(ABCMusicParser.TempoContext ctx);

	void enterLine(ABCMusicParser.LineContext ctx);
	void exitLine(ABCMusicParser.LineContext ctx);

	void enterField_composer(ABCMusicParser.Field_composerContext ctx);
	void exitField_composer(ABCMusicParser.Field_composerContext ctx);

	void enterField_key(ABCMusicParser.Field_keyContext ctx);
	void exitField_key(ABCMusicParser.Field_keyContext ctx);

	void enterMeter(ABCMusicParser.MeterContext ctx);
	void exitMeter(ABCMusicParser.MeterContext ctx);

	void enterField_default_length(ABCMusicParser.Field_default_lengthContext ctx);
	void exitField_default_length(ABCMusicParser.Field_default_lengthContext ctx);

	void enterField_meter(ABCMusicParser.Field_meterContext ctx);
	void exitField_meter(ABCMusicParser.Field_meterContext ctx);

	void enterMeter_fraction(ABCMusicParser.Meter_fractionContext ctx);
	void exitMeter_fraction(ABCMusicParser.Meter_fractionContext ctx);

	void enterField_number(ABCMusicParser.Field_numberContext ctx);
	void exitField_number(ABCMusicParser.Field_numberContext ctx);

	void enterComment(ABCMusicParser.CommentContext ctx);
	void exitComment(ABCMusicParser.CommentContext ctx);

	void enterField_title(ABCMusicParser.Field_titleContext ctx);
	void exitField_title(ABCMusicParser.Field_titleContext ctx);

	void enterKey(ABCMusicParser.KeyContext ctx);
	void exitKey(ABCMusicParser.KeyContext ctx);

	void enterKeynote(ABCMusicParser.KeynoteContext ctx);
	void exitKeynote(ABCMusicParser.KeynoteContext ctx);

	void enterField_voice(ABCMusicParser.Field_voiceContext ctx);
	void exitField_voice(ABCMusicParser.Field_voiceContext ctx);
}