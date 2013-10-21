
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
BASENOTE: [a-gA-G];
REST : [z];
BAR : ([\|][\|])|([\|][':'])|([':'][\|])|([[][\|])|([\|][\]])|([\|]);
SHARP: [\^][\^]|[\^];
FLAT : [\_][\_]|[\_];
NEUTRAL : [=];
TIMES : [*];
NTH_REPEAT:  ([[][1])|([[][2]);
OCTAVE_HIGHER: ['];
OCTAVE_LOWER: [,];
DIGIT: [0-9];
SLASH: '/';
ILYRIC: 'w:';
SPACE: ' ';
LYRICAL_ELEMENT_TOKEN: ' '|'-'|'_'|'*'|'~'|'\-'|'|';
LYRIC_TEXT: [^\w'-]+; 
OPEN_BRACKET : '[';
CLOSE_BRACKET : ']';
OPEN_PAREN : '(';
COMMENTSIGN: '%';
TEXT: [a-zA-Z0-9.,'"?\-!& ]+;
EOL: [\r\n];
IVOICE: 'V:'[ \t]*;

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
abc_line: element+ EOL (lyric EOL)? | mid_tune_field | comment;
element: note_element | tuplet_element | BAR | NTH_REPEAT | SPACE;
note_element: note | multi_note;
note : note_or_rest note_length?;
note_or_rest : pitch | REST;
pitch: accidental? BASENOTE octave?;
octave: OCTAVE_LOWER+ | OCTAVE_HIGHER+;
note_length: (DIGIT+)? (SLASH (DIGIT+)?)?;
accidental : SHARP | FLAT | NEUTRAL;
tuplet_element: tuplet_spec note_element+;
tuplet_spec : OPEN_PAREN DIGIT;
multi_note : OPEN_BRACKET note+ CLOSE_BRACKET;
mid_tune_field : field_voice;

field_voice: IVOICE TEXT end_of_line;
lyric: ILYRIC lyrical_element*;
lyrical_element: LYRICAL_ELEMENT_TOKEN | LYRIC_TEXT;
literal: BASENOTE | REST | BAR;

comment: COMMENTSIGN TEXT EOL;
end_of_line: comment | EOL;
