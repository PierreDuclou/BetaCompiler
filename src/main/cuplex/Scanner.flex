/**
 * Analyseur lexical
 *
 * Auteurs : 
 *      Jérémy Thomas,
 *      Ouafa Bourekhsas,
 *      Salme Ould Ahmed,
 *      Théo Cominolo,
 *      Pierre Duclou
 *
 * Version SNAPSHOT-1.0
 */

//--- Header ------------------------------------------------------------------

package generated.cuplex;

import java_cup.runtime.Symbol;

%%

//--- Options -----------------------------------------------------------------

%public
%cupsym Sym
%cup
%line

//--- Macros ------------------------------------------------------------------

Comment = {InlineComment} | {MultilineComment}
InlineComment = "//" [^\r\n]* (\r|\n|\r\n)?
MultilineComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
Identifier = [a-zA-Z_]+ [1-9_]*
Whitespaces = [\s\t\r\n]+
Value = [0-9]+

%%

//--- Lexems ------------------------------------------------------------------

// Verbose tokens
"int"         { return new Symbol(Sym.INT, yytext()); }
"void"        { return new Symbol(Sym.VOID, yytext()); }
"return"      { return new Symbol(Sym.RETURN); }
"if"          { return new Symbol(Sym.IF); }
"else"        { return new Symbol(Sym.ELSE); }
"while"       { return new Symbol(Sym.WHILE); }

// Delimiters
";"           { return new Symbol(Sym.SEMICOLON); }
","           { return new Symbol(Sym.COMMA); }
"->"          { return new Symbol(Sym.ARROW); }

// Operators
"+"           { return new Symbol(Sym.ADD); }
"-"           { return new Symbol(Sym.SUB); }
"/"           { return new Symbol(Sym.DIV); }
"*"           { return new Symbol(Sym.MUL); }
"="           { return new Symbol(Sym.ASSIGN); }
"<"           { return new Symbol(Sym.LT); }
">"           { return new Symbol(Sym.GT); }
">="          { return new Symbol(Sym.GE); }
"<="          { return new Symbol(Sym.LE); }
"=="          { return new Symbol(Sym.EQ); }
"!="          { return new Symbol(Sym.DIFF); }

// Wrappers
"("           { return new Symbol(Sym.OPEN_P); }
")"           { return new Symbol(Sym.CLOSE_P); }
"{"           { return new Symbol(Sym.OPEN_B); }
"}"           { return new Symbol(Sym.CLOSE_B); }

// Built-in function
"read"        { return new Symbol(Sym.READ); }
"write"       { return new Symbol(Sym.WRITE); }

// Custom tokens
{Identifier}  { return new Symbol(Sym.ID, yytext()); }
{Value}       { return new Symbol(Sym.VALUE, yytext()); }

// Ignored tokens
{Comment}     {}
{Whitespaces} {}

[^]           { throw new Error("Illegal character \""+yytext()+"\" at line "+ ((int) yyline+1));  }