
/**
 * This file is the grammar file used by ANTLR.
 *
 * In order to compile this file, navigate to this directory
 * (<src/grammar>) and run the following command:
 *
 * java -jar ../../antlr.jar ABCMusic.g4
 */

grammar ABCBody;


/*
 * These are the lexical rules. They define the tokens used by the lexer.
 */
BASENOTE: [abcdefgABCDEFG];
REST : [z];
BAR : [(|)|(||)|([|)|(|\])|(':'|)|(|':')];
SHARP: [(^)|(^^)];
FLAT : [(_)|(__)];
NEUTRAL : [=];
TIMES : [*];
NTH_REPEAT:  [([1)|([2)];
OCTAVE_HIGHER: ['];
OCTAVE_LOWER: [,];
DIGIT: [0-9];
SLASH: '/';
ILYRIC: 'w:';
SPACE: ' ';
LYRICAL_ELEMENT: [(-)|(_)|(*)|(~)|(\-)|(\|)];
LYRIC_TEXT: [^\w'-]+; 
OPEN_BRACKET : '[';
CLOSE_BRACKET : ']';
OPEN_PAREN : '(';
COMMENTSIGN: '%';
TEXT: [a-zA-Z0-9. ]+;
EOL: [\r\n];
IVOICE: 'V:'([ \t]+)?;

/*
 * These are the parser rules. They define the structures used by the parser.
 *
 * You should make sure you have one rule that describes the entire input.
 * This is the "start rule". The start rule should end with the special
 * predefined token EOF so that it describes the entire input. Below, we've made
 * "line" the start rule.
 *
 * For more information, see
 * http://www.antlr.org/wiki/display/ANTLR4/Parser+Rules#ParserRules-StartRulesandEOF
 */

abc_music : abc_line+;
abc_line     : element* end_of_line (lyric end_of_line)? | mid_tune_field | comment;
mid_tune_field : FIELD_VOICE;
field_voice: IVOICE TEXT end_of_line;
element: note_element | tuplet_element | BAR | NTH_REPEAT | SPACE;
note_element: note | multi_note;
tuplet_element: tuplet_spec note_element+;
tuplet_spec : OPEN_PAREN DIGIT;
multi_note : OPEN_BRACKET note+ CLOSE_BRACKET;
lyric: ILYRIC (LYRICAL_ELEMENT | LYRIC_TEXT)*;
note : note_or_rest (note_length)*;
note_or_rest : pitch | REST;
pitch: accidental* BASENOTE octave*;
accidental : SHARP | FLAT | NEUTRAL;
octave: OCTAVE_LOWER* | OCTAVE_HIGHER*;
note_length: (DIGIT+)? (BACKSLASH DIGIT+)?;
literal: BASENOTE | REST | BAR;

comment: COMMENTSIGN TEXT EOL;
end_of_line: comment | EOL;
