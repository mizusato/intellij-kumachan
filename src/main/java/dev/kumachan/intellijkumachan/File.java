package dev.kumachan.intellijkumachan;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class File extends PsiFileBase {
    public File(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, Lang.INSTANCE);
    }
    @NotNull @Override
    public com.intellij.openapi.fileTypes.FileType getFileType() {
        return FileType.INSTANCE;
    }
    @Override
    public String toString() {
        return "KumaChan File";
    }
}


