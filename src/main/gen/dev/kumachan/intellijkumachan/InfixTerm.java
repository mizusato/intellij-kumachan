// This is a generated file. Not intended for manual editing.
package dev.kumachan.intellijkumachan;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface InfixTerm extends PsiElement {

  @NotNull
  InfixLeft getInfixLeft();

  @NotNull
  InfixRight getInfixRight();

  @NotNull
  NodeOperator getNodeOperator();

  @NotNull
  PsiElement getSym0();

  @NotNull
  PsiElement getSym1();

}