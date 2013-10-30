// Generated from ABCMusic.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ABCMusicListener extends ParseTreeListener {
	void enterAbc_music(ABCMusicParser.Abc_musicContext ctx);
	void exitAbc_music(ABCMusicParser.Abc_musicContext ctx);

	void enterOther_fields(ABCMusicParser.Other_fieldsContext ctx);
	void exitOther_fields(ABCMusicParser.Other_fieldsContext ctx);

	void enterAbc_header(ABCMusicParser.Abc_headerContext ctx);
	void exitAbc_header(ABCMusicParser.Abc_headerContext ctx);

	void enterMulti_note(ABCMusicParser.Multi_noteContext ctx);
	void exitMulti_note(ABCMusicParser.Multi_noteContext ctx);

	void enterNote_element(ABCMusicParser.Note_elementContext ctx);
	void exitNote_element(ABCMusicParser.Note_elementContext ctx);

	void enterNote_length(ABCMusicParser.Note_lengthContext ctx);
	void exitNote_length(ABCMusicParser.Note_lengthContext ctx);

	void enterAbc_tune(ABCMusicParser.Abc_tuneContext ctx);
	void exitAbc_tune(ABCMusicParser.Abc_tuneContext ctx);

	void enterField_key(ABCMusicParser.Field_keyContext ctx);
	void exitField_key(ABCMusicParser.Field_keyContext ctx);

	void enterAccidental(ABCMusicParser.AccidentalContext ctx);
	void exitAccidental(ABCMusicParser.AccidentalContext ctx);

	void enterTuplet_element(ABCMusicParser.Tuplet_elementContext ctx);
	void exitTuplet_element(ABCMusicParser.Tuplet_elementContext ctx);

	void enterNote(ABCMusicParser.NoteContext ctx);
	void exitNote(ABCMusicParser.NoteContext ctx);

	void enterField_tempo(ABCMusicParser.Field_tempoContext ctx);
	void exitField_tempo(ABCMusicParser.Field_tempoContext ctx);

	void enterElement(ABCMusicParser.ElementContext ctx);
	void exitElement(ABCMusicParser.ElementContext ctx);

	void enterMid_tune_field(ABCMusicParser.Mid_tune_fieldContext ctx);
	void exitMid_tune_field(ABCMusicParser.Mid_tune_fieldContext ctx);

	void enterEnd_of_line(ABCMusicParser.End_of_lineContext ctx);
	void exitEnd_of_line(ABCMusicParser.End_of_lineContext ctx);

	void enterAbc_line(ABCMusicParser.Abc_lineContext ctx);
	void exitAbc_line(ABCMusicParser.Abc_lineContext ctx);

	void enterField_composer(ABCMusicParser.Field_composerContext ctx);
	void exitField_composer(ABCMusicParser.Field_composerContext ctx);

	void enterNote_or_rest(ABCMusicParser.Note_or_restContext ctx);
	void exitNote_or_rest(ABCMusicParser.Note_or_restContext ctx);

	void enterField_default_length(ABCMusicParser.Field_default_lengthContext ctx);
	void exitField_default_length(ABCMusicParser.Field_default_lengthContext ctx);

	void enterField_meter(ABCMusicParser.Field_meterContext ctx);
	void exitField_meter(ABCMusicParser.Field_meterContext ctx);

	void enterField_number(ABCMusicParser.Field_numberContext ctx);
	void exitField_number(ABCMusicParser.Field_numberContext ctx);

	void enterComment(ABCMusicParser.CommentContext ctx);
	void exitComment(ABCMusicParser.CommentContext ctx);

	void enterField_title(ABCMusicParser.Field_titleContext ctx);
	void exitField_title(ABCMusicParser.Field_titleContext ctx);

	void enterPitch(ABCMusicParser.PitchContext ctx);
	void exitPitch(ABCMusicParser.PitchContext ctx);

	void enterLiteral(ABCMusicParser.LiteralContext ctx);
	void exitLiteral(ABCMusicParser.LiteralContext ctx);

	void enterField_voice(ABCMusicParser.Field_voiceContext ctx);
	void exitField_voice(ABCMusicParser.Field_voiceContext ctx);
}