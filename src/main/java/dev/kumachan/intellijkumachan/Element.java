package dev.kumachan.intellijkumachan;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class Element extends IElementType {
    public Element(@NotNull @NonNls String debugName) {
        super(debugName, Lang.INSTANCE);
    }
}


