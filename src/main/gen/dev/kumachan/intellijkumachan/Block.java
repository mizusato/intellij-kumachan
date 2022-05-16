// This is a generated file. Not intended for manual editing.
package dev.kumachan.intellijkumachan;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Block extends PsiElement {

  @NotNull
  List<Binding> getBindingList();

  @NotNull
  Expr getExpr();

  @NotNull
  PsiElement getSym4();

  @NotNull
  PsiElement getSym5();

}
