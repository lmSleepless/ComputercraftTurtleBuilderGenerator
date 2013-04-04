grammar TurtleBuildGrammer;

@header {
package language;
}

prog: gen_expr* ;
gen_expr: builddir
    | datadict_block
    | repeat
    | build_set;
repeat_expr: repeat
           | build_set;
builddir : BUILD builddir_opt ;
builddir_opt: FORWARD
            | DOWN;
datadict_block: DATADICT OPENBLOCK datadict_decl_list+ CLOSEBLOCK;
datadict_decl_list: datadict_decl COMMA?;
datadict_decl: block_symbol COLON block_meaning COMMA?;
block_symbol: WORD;
block_meaning: NUMBER
             | NOTHING;
repeat: repeat_iterations TIMES OPENBLOCK repeat_expr+ CLOSEBLOCK;
repeat_iterations: INFINITE
                 | NUMBER;
build_set: LINE build_set_item* SEMICOLON;
build_set_item: block_symbol COMMA?;
BUILD: 'BUILD';
FORWARD: 'FORWARD';
DOWN: 'DOWN';
DATADICT: 'DATADICT';
TIMES: 'TIMES';
NOTHING: 'NOTHING';
INFINITE: 'INFINITE';
LINE: 'LINE';
NEWLINE: [\r?\n] -> skip;
COMMENT: '/*' .*? '*/'-> skip;
COMMA: ',';
WHITESPACE: [ \t]+ -> skip;
OPENBLOCK: '{';
CLOSEBLOCK: '}';
COLON: ':';
SEMICOLON: ';';
WORD: [a-zA-Z]+;
NUMBER: [1-9]+;