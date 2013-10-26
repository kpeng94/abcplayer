
/**
 * This file is the grammar file used by ANTLR.
 *
 * In order to compile this file, navigate to this directory
 * (<src/grammar>) and run the following command:
 *
 * java -jar ../../antlr.jar ABCMusic.g4
 */

grammar ABCHeader;

/*
 * These are the lexical rules. They define the tokens used by the lexer.
 */
DIGIT: [0-9];
INUMBER: 'X:'[ \t]*[0-9]+;
ITITLE: 'T:'[ \t]*[a-zA-Z0-9.,'"?\-!& ]+;
ICOMPOSER: 'C:'[ \t]*[a-zA-Z0-9.,'"?\-!& ]+;
ILENGTH: 'L:'[ \t]*;
IMETER: 'M:'[ \t]*;
ITEMPO: 'Q:'[ \t]*[0-9]+'/'[0-9]+'='[0-9]+;
IVOICE: 'V:'[ \t]*[a-zA-Z0-9.,'"?\-!& ]+;
IKEY: 'K:'[ \t]*;
EOL: [\r\n];
MODEMINOR: 'm';
ACCIDENTAL: [#b];
COMMENTSIGN: '%'[a-zA-Z0-9.,'"?\-!& ]+;
SLASH: '/';
EQUALS: '=';
BASENOTE: [a-gA-G];
COMMON: ([C][\|])|[C];

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
abc_header: field_number comment* field_title other_fields* field_key;
field_number: INUMBER end_of_line;
field_title: ITITLE end_of_line;
field_composer: ICOMPOSER end_of_line;
field_default_length: ILENGTH note_length_strict end_of_line;
field_meter: IMETER meter end_of_line;
field_tempo: ITEMPO end_of_line;
field_voice: IVOICE end_of_line;
other_fields: field_composer | field_default_length | field_meter | field_tempo | field_voice | comment;
field_key: IKEY key end_of_line;

key: keynote MODEMINOR?;
keynote: BASENOTE ACCIDENTAL?;

meter: COMMON | meter_fraction;
meter_fraction: DIGIT+ SLASH DIGIT+;
note_length_strict: DIGIT+ SLASH DIGIT+;
note : note_or_rest note_length?;
note_or_rest : pitch | REST;
pitch: accidental? BASENOTE octave?;
octave: OCTAVE_LOWER+ | OCTAVE_HIGHER+;

note_length: (DIGIT+)? (SLASH (DIGIT+)?)?;

tempo: meter_fraction EQUALS DIGIT+;

comment: COMMENTSIGN EOL;
end_of_line: comment | EOL;
