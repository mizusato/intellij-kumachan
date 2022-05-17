package dev.kumachan.intellijkumachan;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class Highlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey
        KEYWORD = createTextAttributesKey(
            "KM_KEYWORD", DefaultLanguageHighlighterColors.
            KEYWORD
        );
    public static final TextAttributesKey
        SYMBOL = createTextAttributesKey(
            "KM_SYM_KEYWORD", DefaultLanguageHighlighterColors.
            INSTANCE_FIELD
        );
    public static final TextAttributesKey
        FUNC = createTextAttributesKey(
            "KM_FUNC", DefaultLanguageHighlighterColors.
            INSTANCE_METHOD
        );
    public static final TextAttributesKey
        CONST = createTextAttributesKey(
            "KM_CONST", DefaultLanguageHighlighterColors.
            INSTANCE_METHOD
        );
    public static final TextAttributesKey
        TYPE = createTextAttributesKey(
            "KM_TYPE", DefaultLanguageHighlighterColors.
            STRING
        );
    public static final TextAttributesKey
        NUMBER = createTextAttributesKey(
            "KM_NUMBER", DefaultLanguageHighlighterColors.
            NUMBER
        );
    public static final TextAttributesKey
        STRING = createTextAttributesKey(
            "KM_STRING", DefaultLanguageHighlighterColors.
            METADATA
        );
    public static final TextAttributesKey
        COMMENT = createTextAttributesKey(
            "KM_COMMENT", DefaultLanguageHighlighterColors.
            BLOCK_COMMENT
        );
    public static final TextAttributesKey
        DOC = createTextAttributesKey(
            "KM_COMMENT", DefaultLanguageHighlighterColors.
            DOC_COMMENT
        );
    public static final TextAttributesKey
        BAD_CHARACTER = createTextAttributesKey(
            "KM_BAD_CHARACTER", HighlighterColors.
            BAD_CHARACTER
        );
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new LexerAdapter();
    }
    HashSet<String> as_keyword = new HashSet<String>(Set.of(
        "SYM6400",
        "IF", "ELSE", "WHEN", "LET", "NEW",
        "namespace",
        "entry", "type", "function", "operator", "const", "method",
        "native", "record", "interface", "union", "enum",
        "default", "variadic"
    ));
    HashSet<String> as_symbol = new HashSet<String>(Set.of(
        "SYM4000", "SYM4100",
        "SYM9100", "SYM9300",
        "SYM12300", "SYM12500"
    ));
    HashMap<String,TextAttributesKey> mapping = new HashMap<String,TextAttributesKey>(Map.ofEntries(
        Map.entry("DOC", DOC),
        Map.entry("COMMENT", COMMENT),
        Map.entry("TOKEN_TEXT", STRING),
        Map.entry("INT", NUMBER),
        Map.entry("FLOAT", NUMBER),
        Map.entry("BYTE", NUMBER),
        Map.entry("CHAR", NUMBER)
    ));
    @Override public TextAttributesKey @NotNull []
    getTokenHighlights(IElementType tokenType) {
        if (tokenType instanceof Token) {
            var name = ((Token) tokenType).tokenName;
            if (as_keyword.contains(name)) {
                return new TextAttributesKey[] { KEYWORD };
            } else if (as_symbol.contains(name)) {
                return new TextAttributesKey[] { SYMBOL };
            } else {
                TextAttributesKey attr = mapping.get(name);
                if (attr != null) {
                    return new TextAttributesKey[] { attr };
                }
            }
        }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }
        return EMPTY_KEYS;
    }
}


