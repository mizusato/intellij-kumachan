// This is a generated file. Not intended for manual editing.
package dev.kumachan.intellijkumachan;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Expr extends PsiElement {

  @NotNull
  List<Cast> getCastList();

  @NotNull
  List<Pipe> getPipeList();

  @NotNull
  Term getTerm();

}
