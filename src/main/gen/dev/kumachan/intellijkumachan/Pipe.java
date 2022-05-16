// This is a generated file. Not intended for manual editing.
package dev.kumachan.intellijkumachan;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Pipe extends PsiElement {

  @Nullable
  PipeCall getPipeCall();

  @Nullable
  PipeCast getPipeCast();

  @Nullable
  PipeGet getPipeGet();

  @Nullable
  PipeInfix getPipeInfix();

  @Nullable
  PipeInterior getPipeInterior();

}
