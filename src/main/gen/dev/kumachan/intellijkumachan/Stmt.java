// This is a generated file. Not intended for manual editing.
package dev.kumachan.intellijkumachan;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Stmt extends PsiElement {

  @Nullable
  DeclConst getDeclConst();

  @Nullable
  DeclEntry getDeclEntry();

  @Nullable
  DeclFunc getDeclFunc();

  @Nullable
  DeclMethod getDeclMethod();

  @Nullable
  DeclType getDeclType();

}
