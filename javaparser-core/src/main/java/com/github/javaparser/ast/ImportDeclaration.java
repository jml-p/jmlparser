/*
 * Copyright (C) 2007-2010 Júlio Vilmar Gesser.
 * Copyright (C) 2011, 2013-2024 The JavaParser Team.
 *
 * This file is part of JavaParser.
 *
 * JavaParser can be used either under the terms of
 * a) the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * b) the terms of the Apache License
 *
 * You should have received a copy of both licenses in LICENCE.LGPL and
 * LICENCE.APACHE. Please refer to those files for details.
 *
 * JavaParser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 */
package com.github.javaparser.ast;

import com.github.javaparser.TokenRange;
import com.github.javaparser.ast.expr.Name;
import com.github.javaparser.ast.nodeTypes.NodeWithName;
import com.github.javaparser.ast.observer.ObservableProperty;
import com.github.javaparser.ast.visitor.CloneVisitor;
import com.github.javaparser.ast.visitor.GenericVisitor;
import com.github.javaparser.ast.visitor.VoidVisitor;
import com.github.javaparser.metamodel.ImportDeclarationMetaModel;
import com.github.javaparser.metamodel.JavaParserMetaModel;
import static com.github.javaparser.StaticJavaParser.parseName;
import static com.github.javaparser.utils.Utils.assertNotNull;

/**
 * An import declaration.
 * <br>{@code import com.github.javaparser.JavaParser;}
 * <br>{@code import com.github.javaparser.*;}
 * <br>{@code import com.github.javaparser.JavaParser.*; }
 * <br>{@code import static com.github.javaparser.JavaParser.*;}
 * <br>{@code import static com.github.javaparser.JavaParser.parse;}
 *
 * <p>The name does not include the asterisk or the static keyword.</p>
 *
 * @author Julio Vilmar Gesser
 */
public class ImportDeclaration extends Node implements NodeWithName<ImportDeclaration> {

    private Name name;

    private boolean isStatic;

    private boolean isAsterisk;

    private boolean isJmlModel = false;

    private ImportDeclaration() {
        this(new Name(), false, false);
    }

    public ImportDeclaration(String name, boolean isStatic, boolean isAsterisk) {
        this(parseName(name), isStatic, isAsterisk);
    }

    public ImportDeclaration(Name name, boolean isStatic, boolean isAsterisk) {
        this(name, isStatic, isAsterisk, false);
    }

    @AllFieldsConstructor
    public ImportDeclaration(Name name, boolean isStatic, boolean isAsterisk, boolean isJmlModel) {
        this(null, name, isStatic, isAsterisk, isJmlModel);
    }

    /**
     * This constructor is used by the parser and is considered private.
     */
    @Generated("com.github.javaparser.generator.core.node.MainConstructorGenerator")
    public ImportDeclaration(TokenRange tokenRange, Name name, boolean isStatic, boolean isAsterisk, boolean isJmlModel) {
        super(tokenRange);
        setName(name);
        setStatic(isStatic);
        setAsterisk(isAsterisk);
        setJmlModel(isJmlModel);
        customInitialization();
    }

    public ImportDeclaration(TokenRange range, Name name, boolean isStatic, boolean isAsterisk) {
        this(range, name, isStatic, isAsterisk, false);
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

    /**
     * Retrieves the name of the import (.* is not included.)
     */
    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public Name getName() {
        return name;
    }

    /**
     * Return if the import ends with "*".
     */
    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public boolean isAsterisk() {
        return isAsterisk;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public boolean isStatic() {
        return isStatic;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public ImportDeclaration setAsterisk(final boolean isAsterisk) {
        if (isAsterisk == this.isAsterisk) {
            return this;
        }
        notifyPropertyChange(ObservableProperty.ASTERISK, this.isAsterisk, isAsterisk);
        this.isAsterisk = isAsterisk;
        return this;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public ImportDeclaration setName(final Name name) {
        assertNotNull(name);
        if (name == this.name) {
            return this;
        }
        notifyPropertyChange(ObservableProperty.NAME, this.name, name);
        if (this.name != null)
            this.name.setParentNode(null);
        this.name = name;
        setAsParentNodeOf(name);
        return this;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public ImportDeclaration setStatic(final boolean isStatic) {
        if (isStatic == this.isStatic) {
            return this;
        }
        notifyPropertyChange(ObservableProperty.STATIC, this.isStatic, isStatic);
        this.isStatic = isStatic;
        return this;
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.CloneGenerator")
    public ImportDeclaration clone() {
        return (ImportDeclaration) accept(new CloneVisitor(), null);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.GetMetaModelGenerator")
    public ImportDeclarationMetaModel getMetaModel() {
        return JavaParserMetaModel.importDeclarationMetaModel;
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.ReplaceMethodGenerator")
    public boolean replace(Node node, Node replacementNode) {
        if (node == null) {
            return false;
        }
        if (node == name) {
            setName((Name) replacementNode);
            return true;
        }
        return super.replace(node, replacementNode);
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public boolean isJmlModel() {
        return isJmlModel;
    }

    public void setIsJmlModel(boolean b) {
        this.isJmlModel = b;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public ImportDeclaration setJmlModel(final boolean isJmlModel) {
        if (isJmlModel == this.isJmlModel) {
            return this;
        }
        notifyPropertyChange(ObservableProperty.JML_MODEL, this.isJmlModel, isJmlModel);
        this.isJmlModel = isJmlModel;
        return this;
    }
}
