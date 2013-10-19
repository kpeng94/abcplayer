
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
BASENOTE     : 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b' ;
REST : 'z';
BAR : '|' | '||' | '[|' | '|]' | ':|' | '|:';
SHARP: '^' | '^^'
FLAT : '_' | '__'
NEUTRAL : '='
TIMES : '*';
NTH-REPEAT:  '[1' | '[2'


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
line     : PLUS EOF;
accidental : SHARP | FLAT | NEUTRAL
literal: BASENOTE | REST | BAR