// This is a generated file. Not intended for manual editing.
package dev.kumachan.intellijkumachan;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DeclFunc extends PsiElement {

  @NotNull
  Body getBody();

  @Nullable
  Docs getDocs();

  @NotNull
  NodeFunction getNodeFunction();

  @NotNull
  NodeName getNodeName();

  @Nullable
  NodeVariadic getNodeVariadic();

  @NotNull
  Sig getSig();

}
