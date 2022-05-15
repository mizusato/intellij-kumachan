package dev.kumachan.intellijkumachan;

import com.intellij.lexer.FlexAdapter;

public class LexerAdapter extends FlexAdapter {
    public LexerAdapter() {
        super(new _LangLexer(null));
    }
}
