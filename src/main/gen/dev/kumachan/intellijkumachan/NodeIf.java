// This is a generated file. Not intended for manual editing.
package dev.kumachan.intellijkumachan;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NodeIf extends PsiElement {

  @NotNull
  List<Cond> getCondList();

  @NotNull
  List<Elif> getElifList();

  @NotNull
  IfNo getIfNo();

  @NotNull
  IfYes getIfYes();

  @NotNull
  PsiElement getElse();

  @NotNull
  PsiElement getIf();

  @NotNull
  PsiElement getSym0();

  @NotNull
  PsiElement getSym1();

}
