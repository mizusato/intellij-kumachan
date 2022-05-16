// This is a generated file. Not intended for manual editing.
package dev.kumachan.intellijkumachan.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dev.kumachan.intellijkumachan.Types.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import dev.kumachan.intellijkumachan.*;

public class TermImpl extends ASTWrapperPsiElement implements Term {

  public TermImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitTerm(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public Block getBlock() {
    return findChildByClass(Block.class);
  }

  @Override
  @Nullable
  public Bytes getBytes() {
    return findChildByClass(Bytes.class);
  }

  @Override
  @Nullable
  public InfixTerm getInfixTerm() {
    return findChildByClass(InfixTerm.class);
  }

  @Override
  @Nullable
  public Lambda getLambda() {
    return findChildByClass(Lambda.class);
  }

  @Override
  @Nullable
  public NodeChar getNodeChar() {
    return findChildByClass(NodeChar.class);
  }

  @Override
  @Nullable
  public NodeFloat getNodeFloat() {
    return findChildByClass(NodeFloat.class);
  }

  @Override
  @Nullable
  public NodeIf getNodeIf() {
    return findChildByClass(NodeIf.class);
  }

  @Override
  @Nullable
  public NodeInt getNodeInt() {
    return findChildByClass(NodeInt.class);
  }

  @Override
  @Nullable
  public NodeString getNodeString() {
    return findChildByClass(NodeString.class);
  }

  @Override
  @Nullable
  public NodeWhen getNodeWhen() {
    return findChildByClass(NodeWhen.class);
  }

  @Override
  @Nullable
  public RefTerm getRefTerm() {
    return findChildByClass(RefTerm.class);
  }

}
