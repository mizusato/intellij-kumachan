// This is a generated file. Not intended for manual editing.
package dev.kumachan.intellijkumachan;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NodeString extends PsiElement {

  @NotNull
  NodeText getNodeText();

  @NotNull
  List<StringPart> getStringPartList();

}
