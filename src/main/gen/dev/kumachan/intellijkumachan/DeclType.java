// This is a generated file. Not intended for manual editing.
package dev.kumachan.intellijkumachan;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DeclType extends PsiElement {

  @Nullable
  Docs getDocs();

  @Nullable
  Impl getImpl();

  @NotNull
  NodeName getNodeName();

  @NotNull
  TypeDef getTypeDef();

  @Nullable
  TypeParams getTypeParams();

}
