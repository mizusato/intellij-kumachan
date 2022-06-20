package dev.kumachan.intellijkumachan;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import java.util.List;

public class CodeAnnotator implements Annotator {
    private void highlight(AnnotationHolder h, TextRange r, TextAttributesKey k) {
        h.newSilentAnnotation(HighlightSeverity.INFORMATION).
            range(r).
            textAttributes(k).
            create();
    }
    private void highlightRefBase(AnnotationHolder h, Ref r, TextAttributesKey k) {
        highlight(h, r.getRefBase().getTextRange(), k);
    }
    private void highlightName(AnnotationHolder h, NodeName n, TextAttributesKey k) {
        highlight(h, n.getTextRange(), k);
    }
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder h) {
        if (element instanceof BindingCps) {
            BindingCps el = ((BindingCps) element);
            highlightRefBase(h, el.getRef(), Highlighter.KEYWORD);
        } else if (element instanceof Expr) {
            Expr el = ((Expr) element);
            RefTerm ref_term = el.getTerm().getRefTerm();
            if (ref_term != null) {
                boolean is_new = (ref_term.getNodeNew() != null);
                Ref ref = ref_term.getRef();
                List<Pipe> pipes = el.getPipeList();
                if (pipes.size() > 0) {
                    Pipe pipe0 = pipes.get(0);
                    if (pipe0.getPipeCall() != null) {
                        if (is_new) {
                            highlightRefBase(h, ref, Highlighter.TYPE);
                        } else {
                            highlightRefBase(h, ref, Highlighter.FUNC);
                        }
                    }
                } else {
                    boolean has_ns = (ref.getRefBase().getNsPrefix() != null);
                    String base_text = ref.getRefBase().getText();
                    boolean upper0 = Character.isUpperCase(base_text.codePointAt(0));
                    boolean special = (base_text.length() >= 3 && base_text.startsWith("<"));
                    if (has_ns || upper0 || special) {
                        highlightRefBase(h, ref, Highlighter.CONST);
                    }
                }
            }
        } else if (element instanceof PipeInfix) {
            PipeInfix el = ((PipeInfix) element);
            highlightRefBase(h, el.getRef(), Highlighter.FUNC);
        } else if (element instanceof InfixTerm) {
            InfixTerm el = ((InfixTerm) element);
            highlightRefBase(h, el.getNodeOperator().getRef(), Highlighter.FUNC);
        } else if (element instanceof DeclFunc) {
            DeclFunc el = ((DeclFunc) element);
            highlightName(h, el.getNodeName(), Highlighter.FUNC);
        } else if (element instanceof DeclConst) {
            DeclConst el = ((DeclConst) element);
            highlightName(h, el.getNodeName(), Highlighter.CONST);
        } else if (element instanceof DeclMethod) {
            DeclMethod el = ((DeclMethod) element);
//            highlightName(h, el.getNodeName(), Highlighter.FUNC);
            TextRange r1 = el.getReceiver().getTextRange();
            TextRange r2 = el.getNodeName().getTextRange();
            TextRange r = r1.union(r2);
            highlight(h, r, Highlighter.FUNC);
        } else if (element instanceof NodeType) {
            NodeType el = ((NodeType) element);
            highlightRefBase(h, el.getRef(), Highlighter.TYPE);
        } else if (element instanceof DeclType) {
            DeclType el = ((DeclType) element);
            highlightName(h, el.getNodeName(), Highlighter.TYPE);
//        } else if (element instanceof Receiver) {
//            Receiver el = ((Receiver) element);
//            highlightName(h, el.getNodeName(), Highlighter.TYPE);
        } else if (element instanceof TypeParams) {
            TypeParams el = ((TypeParams) element);
            for (NodeName n : el.getNodeNameList()) {
                highlightName(h, n, Highlighter.TYPE);
            }
        } else if (element instanceof Case) {
            Case el = ((Case) element);
            for (NodeName n : el.getNodeNameList()) {
                highlightName(h, n, Highlighter.TYPE);
            }
        } else if (element instanceof Impl) {
            Impl el = ((Impl) element);
            for (RefBase b : el.getRefBaseList()) {
                var r = b.getTextRange();
                highlight(h, r, Highlighter.TYPE);
            }
        } else if (element instanceof NewTag) {
            NewTag el = ((NewTag) element);
            highlight(h, el.getTextRange(), Highlighter.KEYWORD);
        }
    }
}


