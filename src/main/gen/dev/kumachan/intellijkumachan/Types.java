// This is a generated file. Not intended for manual editing.
package dev.kumachan.intellijkumachan;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import dev.kumachan.intellijkumachan.impl.*;

public interface Types {

  IElementType A = new Element("A");
  IElementType B = new Element("B");
  IElementType STMT = new Element("STMT");

  IElementType BAR = new Token("bar");
  IElementType COMMENT = new Token("COMMENT");
  IElementType FOO = new Token("foo");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == A) {
        return new AImpl(node);
      }
      else if (type == B) {
        return new BImpl(node);
      }
      else if (type == STMT) {
        return new StmtImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
