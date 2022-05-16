// This is a generated file. Not intended for manual editing.
package dev.kumachan.intellijkumachan;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Term extends PsiElement {

  @Nullable
  Block getBlock();

  @Nullable
  Bytes getBytes();

  @Nullable
  InfixTerm getInfixTerm();

  @Nullable
  Lambda getLambda();

  @Nullable
  NodeChar getNodeChar();

  @Nullable
  NodeFloat getNodeFloat();

  @Nullable
  NodeIf getNodeIf();

  @Nullable
  NodeInt getNodeInt();

  @Nullable
  NodeString getNodeString();

  @Nullable
  NodeWhen getNodeWhen();

  @Nullable
  RefTerm getRefTerm();

}
