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

package com.github.javaparser.generator.metamodel;

import static com.github.javaparser.StaticJavaParser.parseStatement;
import static com.github.javaparser.ast.Modifier.DefaultKeyword.PUBLIC;
import static com.github.javaparser.generator.metamodel.MetaModelGenerator.isNode;
import static com.github.javaparser.generator.metamodel.MetaModelGenerator.nodeMetaModelName;
import static com.github.javaparser.utils.CodeGenerationUtils.*;
import static com.github.javaparser.utils.Utils.decapitalize;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.metamodel.NonEmptyProperty;
import com.github.javaparser.metamodel.OptionalProperty;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class InitializePropertyMetaModelsStatementsGenerator {
    void generate(
            Field field,
            ClassOrInterfaceDeclaration nodeMetaModelClass,
            String nodeMetaModelFieldName,
            NodeList<Statement> initializePropertyMetaModelsStatements) {
        final AstTypeAnalysis fieldTypeAnalysis = new AstTypeAnalysis(field.getGenericType());

        final Class<?> fieldType = fieldTypeAnalysis.innerType;
        final String typeName = fieldType.getTypeName().replace('$', '.');
        final String propertyMetaModelFieldName = field.getName() + "PropertyMetaModel";
        nodeMetaModelClass.addField("PropertyMetaModel", propertyMetaModelFieldName, PUBLIC);
        final String propertyInitializer = f(
                "new PropertyMetaModel(%s, \"%s\", %s.class, %s, %s, %s, %s, %s)",
                nodeMetaModelFieldName,
                field.getName(),
                typeName,
                optionalOf(decapitalize(nodeMetaModelName(fieldType)), isNode(fieldType)),
                isOptional(field),
                isNonEmpty(field),
                fieldTypeAnalysis.isNodeList,
                fieldTypeAnalysis.isSelfType);
        final String fieldSetting =
                f("%s.%s=%s;", nodeMetaModelFieldName, propertyMetaModelFieldName, propertyInitializer);
        final String fieldAddition = f(
                "%s.getDeclaredPropertyMetaModels().add(%s.%s);",
                nodeMetaModelFieldName, nodeMetaModelFieldName, propertyMetaModelFieldName);

        initializePropertyMetaModelsStatements.add(parseStatement(fieldSetting));
        initializePropertyMetaModelsStatements.add(parseStatement(fieldAddition));
    }

    void generateDerivedProperty(
            Method method,
            ClassOrInterfaceDeclaration nodeMetaModelClass,
            String nodeMetaModelFieldName,
            NodeList<Statement> initializePropertyMetaModelsStatements) {
        final AstTypeAnalysis returnTypeAnalysis = new AstTypeAnalysis(method.getGenericReturnType());

        final Class<?> innermostReturnType = returnTypeAnalysis.innerType;
        final String typeName = innermostReturnType.getTypeName().replace('$', '.');
        final String propertyMetaModelFieldName = getterToPropertyName(method.getName()) + "PropertyMetaModel";
        nodeMetaModelClass.addField("PropertyMetaModel", propertyMetaModelFieldName, PUBLIC);
        final String propertyInitializer = f(
                "new PropertyMetaModel(%s, \"%s\", %s.class, %s, %s, %s, %s, %s)",
                nodeMetaModelFieldName,
                getterToPropertyName(method.getName()),
                typeName,
                optionalOf(decapitalize(nodeMetaModelName(innermostReturnType)), isNode(innermostReturnType)),
                returnTypeAnalysis.isOptional,
                isNonEmpty(method),
                returnTypeAnalysis.isNodeList,
                returnTypeAnalysis.isSelfType);
        final String fieldSetting =
                f("%s.%s=%s;", nodeMetaModelFieldName, propertyMetaModelFieldName, propertyInitializer);
        final String fieldAddition = f(
                "%s.getDerivedPropertyMetaModels().add(%s.%s);",
                nodeMetaModelFieldName, nodeMetaModelFieldName, propertyMetaModelFieldName);

        initializePropertyMetaModelsStatements.add(parseStatement(fieldSetting));
        initializePropertyMetaModelsStatements.add(parseStatement(fieldAddition));
    }

    private boolean isNonEmpty(Field field) {
        return field.isAnnotationPresent(NonEmptyProperty.class);
    }

    private boolean isNonEmpty(Method method) {
        return method.isAnnotationPresent(NonEmptyProperty.class);
    }

    private boolean isOptional(Field field) {
        return field.isAnnotationPresent(OptionalProperty.class);
    }
}
