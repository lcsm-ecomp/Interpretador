
import java_cup.runtime.*;
import java.io.*;
%%
%cup
%line
%column
%char
%class Scanner
%{

%}
%eofval{
    return new Symbol(sym.EOF);
%eofval}

%%
"escreva" { return new Symbol(sym.ESCREVA);}
"if" { return new Symbol(sym.IF);}
"then" { return new Symbol(sym.THEN);}
"else" { return new Symbol(sym.ELSE);}
"while" { return new Symbol(sym.WHILE);}
"do" { return new Symbol(sym.DO);}
"=" { return new Symbol(sym.EQUAL);}
"(" { return new Symbol(sym.APAR); }
")" { return new Symbol(sym.FPAR); }
"=="|"+"|"<"|"-"|">"|"*" { return new Symbol(sym.OP,yytext()); }
[a-zA-Z][a-zA-Z0-9]* { return new Symbol(sym.ID, yytext()); }
[0-9]+ { return new Symbol(sym.INT, Integer.parseInt(yytext())); }
[ \t\f\r\n] { /* ignore white space. */ }
. { System.err.println("Illegal character: "+yytext()); }
