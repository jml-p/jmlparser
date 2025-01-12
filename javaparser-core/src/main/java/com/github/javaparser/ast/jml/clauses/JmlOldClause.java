package com.github.javaparser.ast.jml.clauses;

import com.github.javaparser.TokenRange;
import com.github.javaparser.ast.AllFieldsConstructor;
import com.github.javaparser.ast.Generated;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.observer.ObservableProperty;
import com.github.javaparser.ast.visitor.CloneVisitor;
import com.github.javaparser.ast.visitor.GenericVisitor;
import com.github.javaparser.ast.visitor.VoidVisitor;
import com.github.javaparser.metamodel.JavaParserMetaModel;
import com.github.javaparser.metamodel.JmlOldClauseMetaModel;
import static com.github.javaparser.utils.Utils.assertNotNull;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.Objects;

import org.jspecify.annotations.NonNull;

/**
 * @author Alexander Weigl
 * @version 1 (12/12/21)
 */
public class JmlOldClause extends JmlClause {

    /* private SimpleName name;
    @OptionalProperty
    @NonEmptyProperty
    private Expression initializer;
    private Type type; */
    private VariableDeclarationExpr declarations;

    @AllFieldsConstructor
    public JmlOldClause(VariableDeclarationExpr declarations) {
        this(null, declarations);
    }

    /**
     * This constructor is used by the parser and is considered private.
     */
    @Generated("com.github.javaparser.generator.core.node.MainConstructorGenerator")
    public JmlOldClause(TokenRange tokenRange, VariableDeclarationExpr declarations) {
        super(tokenRange);
        setDeclarations(declarations);
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

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public VariableDeclarationExpr getDeclarations() {
        return declarations;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public JmlOldClause setDeclarations(final VariableDeclarationExpr declarations) {
        assertNotNull(declarations);
        if (declarations == this.declarations) {
            return this;
        }
        notifyPropertyChange(ObservableProperty.DECLARATIONS, this.declarations, declarations);
        if (this.declarations != null)
            this.declarations.setParentNode(null);
        this.declarations = declarations;
        setAsParentNodeOf(declarations);
        return this;
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.ReplaceMethodGenerator")
    public boolean replace(Node node, Node replacementNode) {
        if (node == null) {
            return false;
        }
        if (node == declarations) {
            setDeclarations((VariableDeclarationExpr) replacementNode);
            return true;
        }
        return super.replace(node, replacementNode);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.CloneGenerator")
    public JmlOldClause clone() {
        return (JmlOldClause) accept(new CloneVisitor(), null);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.GetMetaModelGenerator")
    public JmlOldClauseMetaModel getMetaModel() {
        return JavaParserMetaModel.jmlOldClauseMetaModel;
    }

    @Override
    public JmlClauseKind getKind() {
        return JmlClauseKind.OLD;
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isJmlOldClause() {
        return true;
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public JmlOldClause asJmlOldClause() {
        return this;
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<JmlOldClause> toJmlOldClause() {
        return Optional.of(this);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifJmlOldClause(Consumer<JmlOldClause> action) {
        action.accept(this);
    }

    @NonNull()
    public VariableDeclarationExpr declarations() {
        return Objects.requireNonNull(declarations);
    }
}
