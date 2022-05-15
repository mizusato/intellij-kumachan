package dev.kumachan.intellijkumachan;

import com.intellij.lang.Language;

public class Lang extends Language {
    public static final Lang INSTANCE = new Lang();
    private Lang() { super("KumaChan"); }
}


