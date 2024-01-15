grammar PCF;

// règles syntaxiques

program : term EOF ;
term : LIT                                   # Lit
     | term OP2 term                       # BinOp
     | term OP term                          # BinOp
     | 'ifz' term 'then' term 'else' term    # Cond
     | '(' term ')'                          # Par
     ;

// règles lexicales
OP  : '+' | '-' ;
OP2 : '*' | '/' ;
LIT : '0' | [1-9][0-9]* ;
LINE_COMMENT : '//' ~'\n'* '\n' -> channel(HIDDEN) ;
WS : [ \t\n\r]+ -> channel(HIDDEN) ;
