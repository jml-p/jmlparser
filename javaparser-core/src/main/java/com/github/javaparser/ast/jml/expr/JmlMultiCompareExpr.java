package com.github.javaparser.ast.jml.expr;

import com.github.javaparser.TokenRange;
import com.github.javaparser.ast.*;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.observer.ObservableProperty;
import com.github.javaparser.ast.visitor.CloneVisitor;
import com.github.javaparser.ast.visitor.GenericVisitor;
import com.github.javaparser.ast.visitor.VoidVisitor;
import com.github.javaparser.metamodel.JavaParserMetaModel;
import com.github.javaparser.metamodel.JmlMultiCompareExprMetaModel;
import com.github.javaparser.metamodel.NonEmptyProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import static com.github.javaparser.utils.Utils.assertNotNull;

import java.util.Objects;

import org.jspecify.annotations.NonNull;

/**
 * @author Alexander Weigl
 * @version 1 (2/21/21)
 */
public class JmlMultiCompareExpr extends Expression implements Jmlish {

    public JmlMultiCompareExpr(TokenRange range, NodeList<Expression> expressions, List<BinaryExpr.Operator> ops) {
        this(range, expressions, new Operators(ops));
    }

    public static class Operators extends ArrayList<BinaryExpr.Operator> {

        public Operators(List<BinaryExpr.Operator> ops) {
            super(ops);
        }
    }

    @NonEmptyProperty
    private NodeList<Expression> expressions;

    private Operators operators;

    @AllFieldsConstructor
    public JmlMultiCompareExpr(NodeList<Expression> expressions, Operators operators) {
        this(null, expressions, operators);
    }

    /**
     * This constructor is used by the parser and is considered private.
     */
    @Generated("com.github.javaparser.generator.core.node.MainConstructorGenerator")
    public JmlMultiCompareExpr(TokenRange tokenRange, NodeList<Expression> expressions, Operators operators) {
        super(tokenRange);
        setExpressions(expressions);
        setOperators(operators);
        customInitialization();
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.AcceptGenerator")
    public <R, A> R accept(final GenericVisitor<R, A> v, final A arg) {
        return v.visit(this, arg);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.AcceptGenerator")
    public <A> void accept(final VoidVisitor<A> v, final A arg) {
        v.visit(this, arg);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlMultiCompareExpr() {
        return true;
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public JmlMultiCompareExpr asJmlMultiCompareExpr() {
        return this;
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<JmlMultiCompareExpr> toJmlMultiCompareExpr() {
        return Optional.of(this);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifJmlMultiCompareExpr(Consumer<JmlMultiCompareExpr> action) {
        action.accept(this);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.CloneGenerator")
    public JmlMultiCompareExpr clone() {
        return (JmlMultiCompareExpr) accept(new CloneVisitor(), null);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.GetMetaModelGenerator")
    public JmlMultiCompareExprMetaModel getMetaModel() {
        return JavaParserMetaModel.jmlMultiCompareExprMetaModel;
    }

    /**
     * This constructor is used by the parser and is considered private.
     */
    @Generated("com.github.javaparser.generator.core.node.MainConstructorGenerator")
    public JmlMultiCompareExpr(TokenRange tokenRange) {
        super(tokenRange);
        customInitialization();
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public NodeList<Expression> getExpressions() {
        return expressions;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public JmlMultiCompareExpr setExpressions(final NodeList<Expression> expressions) {
        assertNotNull(expressions);
        if (expressions == this.expressions) {
            return this;
        }
        notifyPropertyChange(ObservableProperty.EXPRESSIONS, this.expressions, expressions);
        if (this.expressions != null)
            this.expressions.setParentNode(null);
        this.expressions = expressions;
        setAsParentNodeOf(expressions);
        return this;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public Operators getOperators() {
        return operators;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public JmlMultiCompareExpr setOperators(final Operators operators) {
        assertNotNull(operators);
        if (operators == this.operators) {
            return this;
        }
        notifyPropertyChange(ObservableProperty.OPERATORS, this.operators, operators);
        this.operators = operators;
        return this;
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.RemoveMethodGenerator")
    public boolean remove(Node node) {
        if (node == null) {
            return false;
        }
        for (int i = 0; i < expressions.size(); i++) {
            if (expressions.get(i) == node) {
                expressions.remove(i);
                return true;
            }
        }
        return super.remove(node);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.ReplaceMethodGenerator")
    public boolean replace(Node node, Node replacementNode) {
        if (node == null) {
            return false;
        }
        for (int i = 0; i < expressions.size(); i++) {
            if (expressions.get(i) == node) {
                expressions.set(i, (Expression) replacementNode);
                return true;
            }
        }
        return super.replace(node, replacementNode);
    }

    @NonNull()
    public NodeList<Expression> expressions() {
        return Objects.requireNonNull(expressions);
    }

    @NonNull()
    public Operators operators() {
        return Objects.requireNonNull(operators);
    }
}
