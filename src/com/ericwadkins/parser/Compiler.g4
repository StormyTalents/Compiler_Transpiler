
/**
 *
 * java -jar ../../../../lib/antlr-4.5.3-complete.jar Compiler.g4
 *
 */

grammar Compiler;
import Configuration;


root: element* EOF;

element: basic_element | block_element;

basic_element: (statement_set | declaration_set | flow_statement) ';';

block_element: if_statement | else_if_statement | else_statement | for_loop | while_loop | do_while_loop
    | function | block /*| native_block*/;

statement_set: statement (',' statement)*;
statement: assignment | expression;

declaration_set: type declaration (',' declaration)*;
declaration: variable | direct_assign;

flow_statement: return_statement | break_statement | continue_statement;

block: '{' element* '}';
//native_block: NATIVE '<{' .*? '}>';

assignment: direct_assign | sum_assign | difference_assign | product_assign | quotient_assign | modulus_assign
    | power_assign | bit_left_assign | bit_right_assign | bit_and_assign | bit_xor_assign | bit_or_assign;

return_statement: RETURN expression;
break_statement: BREAK;
continue_statement: CONTINUE;

direct_assign: variable '=' expression;
sum_assign: variable '+=' expression;
difference_assign: variable '-=' expression;
product_assign: variable '*=' expression;
quotient_assign: variable '/=' expression;
modulus_assign: variable '%=' expression;
power_assign: variable '**=' expression;
bit_left_assign: variable '<<=' expression;
bit_right_assign: variable '<<=' expression;
bit_and_assign: variable '&=' expression;
bit_xor_assign: variable '^=' expression;
bit_or_assign: variable '|=' expression;

if_statement: IF '(' expression ')' element;
else_if_statement: ELSE IF '(' expression? ')' element;
else_statement: ELSE element;

for_loop: FOR '(' initialization? ';' condition? ';' update? ')' element;
while_loop: WHILE '(' condition? ')' element;
do_while_loop: DO element WHILE '(' condition? ')' ';';

initialization: statement_set | declaration_set;
condition: expression;
update: statement_set | declaration_set; // any basic_statement except declaration

function: type variable ('(' ((type variable ',')* type variable)? ')') element;

expression
    : '(' expression ')'
    | number | string | character | bool | array | variable
    | expression postfix_call_subscript
    | prefix_unary expression
    | cast expression
    | expression pow_root expression
    | expression mult_div_mod expression
    | expression add_sub expression
    | expression bitleft_right expression
    | expression less_greater expression
    | expression equal_notequal expression
    | expression bitand expression
    | expression bitxor expression
    | expression bitor expression
    | expression and expression
    | expression or expression;

postfix_call_subscript: '++' | '--' | '(' ((expression ',')* expression)? ')' | '[' expression ']';
prefix_unary: '++' | '--' | '+' | '-' | '!' | '~';
cast: '(' type ')';
pow_root: '**' | '//';
mult_div_mod: '*' | '/' | '%';
add_sub: '+' | '-';
bitleft_right: '<<' | '>>';
less_greater: '<' | '<=' | '>' | '>=';
equal_notequal: '==' | '!=' | '===';
bitand: '&';
bitxor: '^';
bitor: '|';
and: '&&';
or: '||';

NATIVE: 'native';
RETURN: 'return';
BREAK: 'break';
CONTINUE: 'continue';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
DO: 'do';

type: TYPE '[]'?;
variable: VARIABLE;
number: NUMBER;
string: STRING;
character: CHARACTER;
bool: BOOLEAN;
array: '[' ((expression ',')* expression)? ']';

TYPE: 'char' | 'signed char' | 'unsigned char' | 'wchar_t'
    | 'int' | 'signed' | 'signed int' | 'unsigned' | 'unsigned int'
    | 'short' | 'short int' | 'signed short' | 'signed short int' | 'unsigned short' | 'unsigned short int'
    | 'long' | 'long int' | 'signed long' | 'signed long int' | 'unsigned long' | 'unsigned long int'
    | 'float' | 'double' | 'long double'
    | 'boolean' | 'void'
    | 'string';

NUMBER: [0-9]+ (',' [0-9]+)* ('.' [0-9]*)?;
STRING: '"' ('\"' | .)*? ~[\\] '"' | '""'; // Matches anything in double quotes. Allows for escaped double quote character.
CHARACTER: '\'' '\\'? . '\'' | '\'\'';
BOOLEAN: 'true' | 'false';

// Must be at the end to allow catching of keywords first
VARIABLE: [_a-zA-Z] [_a-zA-Z0-9]*;

/* Tell Antlr to ignore spaces around tokens. */
WHITESPACE : [ \t\r\n]+ -> skip;
