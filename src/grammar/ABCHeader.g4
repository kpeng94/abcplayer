
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
 * This puts "package grammar;" at the top of the output Java files.
 * Do not change these lines unless you know what you're doing.
 */
@header {
package grammar;
}

/*
 * This adds code to the generated lexer and parser. This makes the lexer and
 * parser throw errors if they encounter invalid input. Do not change these
 * lines unless you know what you're doing.
 */
@members {
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
}

/*
 * These are the lexical rules. They define the tokens used by the lexer.
 */
DIGIT: [0-9];
TEXT: [a-z]+;
INUMBER: 'X:';
ITITLE: 'T:';
ICOMPOSER: 'C:';
ILENGTH: 'L:';
IMETER: 'M:';
ITEMPO: 'Q:';
IVOICE: 'V:';
IKEY: 'K:';
EOL: [\r\n];
MODEMINOR: 'm';
ACCIDENTAL: [#b];
COMMENTSIGN: '%';
SLASH: '/';
EQUALS: '=';
BASENOTE: [abcdefgABCDEFG];
COMMON: [C|?];

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
field_number: INUMBER DIGIT+ end_of_line;
field_title: ITITLE TEXT end_of_line;
other_fields: field_composer | field_default_length | field_meter | field_tempo | field_voice | comment;
field_composer: ICOMPOSER TEXT end_of_line;
field_default_length: ILENGTH note_length_strict end_of_line;
field_meter: IMETER meter end_of_line;
field_tempo: ITEMPO tempo end_of_line;
field_voice: IVOICE TEXT end_of_line;
field_key: IKEY key end_of_line;

key: keynote MODEMINOR?;
keynote: BASENOTE ACCIDENTAL?;

meter: COMMON | meter_fraction;
meter_fraction: DIGIT+ SLASH DIGIT+;
note_length_strict: DIGIT+ SLASH DIGIT+;

tempo: meter_fraction EQUALS DIGIT+;

comment: COMMENTSIGN TEXT EOL;
end_of_line: comment | EOL;
