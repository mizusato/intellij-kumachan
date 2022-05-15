package dev.kumachan.intellijkumachan;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static dev.kumachan.intellijkumachan.Types.*;

%%

%{
  public _LangLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _LangLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

COMMENT=#.*

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "foo"              { return FOO; }
  "bar"              { return BAR; }

  {COMMENT}          { return COMMENT; }

}

[^] { return BAD_CHARACTER; }
