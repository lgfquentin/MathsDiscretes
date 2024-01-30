grammar PCF;

// règles syntaxiques

program : term EOF ;
term :
       term OP2 term                         # BinOp
     | term OP term                          # BinOp
     | IFZ term THEN term ELSE term    # Cond
     | '(' term ')'                          # Par
     | LET ID '=' term IN term         # Let
     | LIT                                   # Lit
     | ID                                    # Var
     ;

// règles lexicales
IFZ : 'ifz';
THEN : 'then';
ELSE : 'else';
LET : 'let';
IN : 'in';
OP  : '+' | '-' ;
OP2 : '*' | '/' ;
LIT : '0' | [1-9][0-9]* ;
ID  : [a-zA-Z_][a-zA-Z_0-9]* ;
WS : [ \t\n\r]+ -> channel(HIDDEN) ;
COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;
LINE_COMMENT : '//' ~'\n'* '\n' -> channel(HIDDEN) ;
