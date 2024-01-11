grammar Phase3;

pogram 	: block ;
    
bool : True | False | One | Zero;

constValue : IntConst | FloatConst | bool;

conditional : Equals | NotEqual | GreaterEqual |LessEqual| Less | Greater;

arithmatic : Add | Subtraction | Multiplication | Division | Mod | ArtihmeticAnd | ArtihmeticOr | LogicalXor | LogicalAnd | LogicalOr;

binaryOp : arithmatic 
	 | conditional
	 ;
	 
expr : expr binaryOp expr
	| OpenParenthesis expr CloseParenthesis
	| variable
	| constValue
	| Subtraction expr
	| Not expr
	;
	
loopStmt : For OpenParenthesis (varDeclCnt)? SemiColon (expr)? SemiColon (assignment | expr)? CloseParenthesis block
	| While OpenParenthesis expr CloseParenthesis block
	;
	
condStmt : If OpenParenthesis expr CloseParenthesis block (ElseIf OpenParenthesis expr CloseParenthesis block)* (Else block)?;

variable : ID
	|Decrement variable
	|Increment variable
	|variable Decrement
	|variable Increment
	;		
	
assignment : variable Assignment expr;			

statement : assignment SemiColon
	| condStmt
	| loopStmt
	| expr SemiColon
	| Break SemiColon
	| Continue SemiColon
	;	
	
type : Int | Boolean | Float;

varDeclCnt : variable (Assignment expr)?;

varDecl : type varDeclCnt;

block 	: OpenCurlyBrace (statement | varDecl SemiColon )* CloseCurlyBrace;

WS: ( ' '| '\t' | '\r' | '\n') ->skip;
Zero: '0';
One: '1';
Boolean: 'boolean';
Int: 'int';
Float: 'float';
While: 'while';
For: 'for';
If: 'if';
Else: 'else';
ElseIf: 'else if';
Continue: 'continue';
Break: 'break';
True: 'true';
False: 'false';
Equals: '==';
Assignment: '=';
Greater: '>';
Less: '<';
GreaterEqual: '>=';
LessEqual: '<=';
Not: '!';
Add: '+';
Subtraction: '-';
BitwiseNegation: '~';
LogicalXor: '^';
ArtihmeticAnd: '&';
LogicalAnd: '&&';
ArtihmeticOr: '|';
LogicalOr: '||';
Multiplication: '*';
Division: '/';
Increment: '++';
Decrement: '--';
Mod: '%';
OpenParenthesis: '(';
CloseParenthesis: ')';
SemiColon: ';';
NotEqual: '!=';
OpenCurlyBrace: '{';
CloseCurlyBrace: '}';
ID  :	('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*;
IntConst: ('+'|'-')?'0'..'9'+;
FloatConst: ('0'..'9'+)'.'('0'..'9'+) | '.'('0'..'9'+) | ('0'..'9'+)'.';