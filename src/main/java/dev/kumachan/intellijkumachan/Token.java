package dev.kumachan.intellijkumachan;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class Token extends IElementType {
    public Token(@NotNull @NonNls String debugName) {
        super(debugName, Lang.INSTANCE);
        tokenName = debugName;
    }
    public String tokenName;
    @Override
    public String toString() {
        return ("Token." + super.toString());
    }
}


