package dev.kumachan.intellijkumachan;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class FileType extends LanguageFileType {
    public static final FileType INSTANCE = new FileType();
    private FileType() {
        super(Lang.INSTANCE);
    }
    @NotNull @Override public String
    getName() { return "KumaChan"; }
    @NotNull @Override public String
    getDescription() { return "KumaChan source code file"; }
    @NotNull @Override public String
    getDefaultExtension() { return "km"; }
    @Nullable @Override public Icon
    getIcon() { return Icons.FILE; }
}


