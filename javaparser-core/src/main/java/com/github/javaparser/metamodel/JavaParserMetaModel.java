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
package com.github.javaparser.metamodel;

import com.github.javaparser.ast.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Warning: The content of this class is partially or completely generated - manual edits risk being overwritten.
 */
public final class JavaParserMetaModel {

    private JavaParserMetaModel() {
    }

    private static final List<BaseNodeMetaModel> nodeMetaModels = new ArrayList<>();

    @Generated("com.github.javaparser.generator.metamodel.MetaModelGenerator")
    private static void initializeConstructorParameters() {
        bodyDeclarationMetaModel.getConstructorParameters().add(bodyDeclarationMetaModel.annotationsPropertyMetaModel);
        callableDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.modifiersPropertyMetaModel);
        callableDeclarationMetaModel.getConstructorParameters().add(bodyDeclarationMetaModel.annotationsPropertyMetaModel);
        callableDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.typeParametersPropertyMetaModel);
        callableDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.namePropertyMetaModel);
        callableDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.parametersPropertyMetaModel);
        callableDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.thrownExceptionsPropertyMetaModel);
        callableDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.receiverParameterPropertyMetaModel);
        callableDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.contractsPropertyMetaModel);
        typeMetaModel.getConstructorParameters().add(typeMetaModel.annotationsPropertyMetaModel);
        annotationExprMetaModel.getConstructorParameters().add(annotationExprMetaModel.namePropertyMetaModel);
        referenceTypeMetaModel.getConstructorParameters().add(typeMetaModel.annotationsPropertyMetaModel);
        typeDeclarationMetaModel.getConstructorParameters().add(typeDeclarationMetaModel.modifiersPropertyMetaModel);
        typeDeclarationMetaModel.getConstructorParameters().add(bodyDeclarationMetaModel.annotationsPropertyMetaModel);
        typeDeclarationMetaModel.getConstructorParameters().add(typeDeclarationMetaModel.namePropertyMetaModel);
        typeDeclarationMetaModel.getConstructorParameters().add(typeDeclarationMetaModel.membersPropertyMetaModel);
        literalStringValueExprMetaModel.getConstructorParameters().add(literalStringValueExprMetaModel.valuePropertyMetaModel);
        stringLiteralExprMetaModel.getConstructorParameters().add(literalStringValueExprMetaModel.valuePropertyMetaModel);
        moduleDeclarationMetaModel.getConstructorParameters().add(moduleDeclarationMetaModel.annotationsPropertyMetaModel);
        moduleDeclarationMetaModel.getConstructorParameters().add(moduleDeclarationMetaModel.namePropertyMetaModel);
        moduleDeclarationMetaModel.getConstructorParameters().add(moduleDeclarationMetaModel.isOpenPropertyMetaModel);
        moduleDeclarationMetaModel.getConstructorParameters().add(moduleDeclarationMetaModel.directivesPropertyMetaModel);
        arrayCreationLevelMetaModel.getConstructorParameters().add(arrayCreationLevelMetaModel.dimensionPropertyMetaModel);
        arrayCreationLevelMetaModel.getConstructorParameters().add(arrayCreationLevelMetaModel.annotationsPropertyMetaModel);
        compilationUnitMetaModel.getConstructorParameters().add(compilationUnitMetaModel.packageDeclarationPropertyMetaModel);
        compilationUnitMetaModel.getConstructorParameters().add(compilationUnitMetaModel.importsPropertyMetaModel);
        compilationUnitMetaModel.getConstructorParameters().add(compilationUnitMetaModel.typesPropertyMetaModel);
        compilationUnitMetaModel.getConstructorParameters().add(compilationUnitMetaModel.modulePropertyMetaModel);
        importDeclarationMetaModel.getConstructorParameters().add(importDeclarationMetaModel.namePropertyMetaModel);
        importDeclarationMetaModel.getConstructorParameters().add(importDeclarationMetaModel.isStaticPropertyMetaModel);
        importDeclarationMetaModel.getConstructorParameters().add(importDeclarationMetaModel.isAsteriskPropertyMetaModel);
        importDeclarationMetaModel.getConstructorParameters().add(importDeclarationMetaModel.isJmlModelPropertyMetaModel);
        modifierMetaModel.getConstructorParameters().add(modifierMetaModel.keywordPropertyMetaModel);
        packageDeclarationMetaModel.getConstructorParameters().add(packageDeclarationMetaModel.annotationsPropertyMetaModel);
        packageDeclarationMetaModel.getConstructorParameters().add(packageDeclarationMetaModel.namePropertyMetaModel);
        annotationDeclarationMetaModel.getConstructorParameters().add(typeDeclarationMetaModel.modifiersPropertyMetaModel);
        annotationDeclarationMetaModel.getConstructorParameters().add(bodyDeclarationMetaModel.annotationsPropertyMetaModel);
        annotationDeclarationMetaModel.getConstructorParameters().add(typeDeclarationMetaModel.namePropertyMetaModel);
        annotationDeclarationMetaModel.getConstructorParameters().add(typeDeclarationMetaModel.membersPropertyMetaModel);
        annotationMemberDeclarationMetaModel.getConstructorParameters().add(annotationMemberDeclarationMetaModel.modifiersPropertyMetaModel);
        annotationMemberDeclarationMetaModel.getConstructorParameters().add(bodyDeclarationMetaModel.annotationsPropertyMetaModel);
        annotationMemberDeclarationMetaModel.getConstructorParameters().add(annotationMemberDeclarationMetaModel.typePropertyMetaModel);
        annotationMemberDeclarationMetaModel.getConstructorParameters().add(annotationMemberDeclarationMetaModel.namePropertyMetaModel);
        annotationMemberDeclarationMetaModel.getConstructorParameters().add(annotationMemberDeclarationMetaModel.defaultValuePropertyMetaModel);
        classOrInterfaceDeclarationMetaModel.getConstructorParameters().add(typeDeclarationMetaModel.modifiersPropertyMetaModel);
        classOrInterfaceDeclarationMetaModel.getConstructorParameters().add(bodyDeclarationMetaModel.annotationsPropertyMetaModel);
        classOrInterfaceDeclarationMetaModel.getConstructorParameters().add(classOrInterfaceDeclarationMetaModel.isInterfacePropertyMetaModel);
        classOrInterfaceDeclarationMetaModel.getConstructorParameters().add(typeDeclarationMetaModel.namePropertyMetaModel);
        classOrInterfaceDeclarationMetaModel.getConstructorParameters().add(classOrInterfaceDeclarationMetaModel.typeParametersPropertyMetaModel);
        classOrInterfaceDeclarationMetaModel.getConstructorParameters().add(classOrInterfaceDeclarationMetaModel.extendedTypesPropertyMetaModel);
        classOrInterfaceDeclarationMetaModel.getConstructorParameters().add(classOrInterfaceDeclarationMetaModel.implementedTypesPropertyMetaModel);
        classOrInterfaceDeclarationMetaModel.getConstructorParameters().add(classOrInterfaceDeclarationMetaModel.permittedTypesPropertyMetaModel);
        classOrInterfaceDeclarationMetaModel.getConstructorParameters().add(typeDeclarationMetaModel.membersPropertyMetaModel);
        constructorDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.modifiersPropertyMetaModel);
        constructorDeclarationMetaModel.getConstructorParameters().add(bodyDeclarationMetaModel.annotationsPropertyMetaModel);
        constructorDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.typeParametersPropertyMetaModel);
        constructorDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.namePropertyMetaModel);
        constructorDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.parametersPropertyMetaModel);
        constructorDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.thrownExceptionsPropertyMetaModel);
        constructorDeclarationMetaModel.getConstructorParameters().add(constructorDeclarationMetaModel.bodyPropertyMetaModel);
        constructorDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.receiverParameterPropertyMetaModel);
        constructorDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.contractsPropertyMetaModel);
        enumConstantDeclarationMetaModel.getConstructorParameters().add(bodyDeclarationMetaModel.annotationsPropertyMetaModel);
        enumConstantDeclarationMetaModel.getConstructorParameters().add(enumConstantDeclarationMetaModel.namePropertyMetaModel);
        enumConstantDeclarationMetaModel.getConstructorParameters().add(enumConstantDeclarationMetaModel.argumentsPropertyMetaModel);
        enumConstantDeclarationMetaModel.getConstructorParameters().add(enumConstantDeclarationMetaModel.classBodyPropertyMetaModel);
        enumDeclarationMetaModel.getConstructorParameters().add(typeDeclarationMetaModel.modifiersPropertyMetaModel);
        enumDeclarationMetaModel.getConstructorParameters().add(bodyDeclarationMetaModel.annotationsPropertyMetaModel);
        enumDeclarationMetaModel.getConstructorParameters().add(typeDeclarationMetaModel.namePropertyMetaModel);
        enumDeclarationMetaModel.getConstructorParameters().add(enumDeclarationMetaModel.implementedTypesPropertyMetaModel);
        enumDeclarationMetaModel.getConstructorParameters().add(enumDeclarationMetaModel.entriesPropertyMetaModel);
        enumDeclarationMetaModel.getConstructorParameters().add(typeDeclarationMetaModel.membersPropertyMetaModel);
        fieldDeclarationMetaModel.getConstructorParameters().add(fieldDeclarationMetaModel.modifiersPropertyMetaModel);
        fieldDeclarationMetaModel.getConstructorParameters().add(bodyDeclarationMetaModel.annotationsPropertyMetaModel);
        fieldDeclarationMetaModel.getConstructorParameters().add(fieldDeclarationMetaModel.variablesPropertyMetaModel);
        initializerDeclarationMetaModel.getConstructorParameters().add(initializerDeclarationMetaModel.isStaticPropertyMetaModel);
        initializerDeclarationMetaModel.getConstructorParameters().add(initializerDeclarationMetaModel.bodyPropertyMetaModel);
        methodDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.modifiersPropertyMetaModel);
        methodDeclarationMetaModel.getConstructorParameters().add(bodyDeclarationMetaModel.annotationsPropertyMetaModel);
        methodDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.typeParametersPropertyMetaModel);
        methodDeclarationMetaModel.getConstructorParameters().add(methodDeclarationMetaModel.typePropertyMetaModel);
        methodDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.namePropertyMetaModel);
        methodDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.parametersPropertyMetaModel);
        methodDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.thrownExceptionsPropertyMetaModel);
        methodDeclarationMetaModel.getConstructorParameters().add(methodDeclarationMetaModel.bodyPropertyMetaModel);
        methodDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.receiverParameterPropertyMetaModel);
        methodDeclarationMetaModel.getConstructorParameters().add(callableDeclarationMetaModel.contractsPropertyMetaModel);
        parameterMetaModel.getConstructorParameters().add(parameterMetaModel.modifiersPropertyMetaModel);
        parameterMetaModel.getConstructorParameters().add(parameterMetaModel.annotationsPropertyMetaModel);
        parameterMetaModel.getConstructorParameters().add(parameterMetaModel.typePropertyMetaModel);
        parameterMetaModel.getConstructorParameters().add(parameterMetaModel.isVarArgsPropertyMetaModel);
        parameterMetaModel.getConstructorParameters().add(parameterMetaModel.varArgsAnnotationsPropertyMetaModel);
        parameterMetaModel.getConstructorParameters().add(parameterMetaModel.namePropertyMetaModel);
        receiverParameterMetaModel.getConstructorParameters().add(receiverParameterMetaModel.annotationsPropertyMetaModel);
        receiverParameterMetaModel.getConstructorParameters().add(receiverParameterMetaModel.typePropertyMetaModel);
        receiverParameterMetaModel.getConstructorParameters().add(receiverParameterMetaModel.namePropertyMetaModel);
        recordDeclarationMetaModel.getConstructorParameters().add(typeDeclarationMetaModel.modifiersPropertyMetaModel);
        recordDeclarationMetaModel.getConstructorParameters().add(bodyDeclarationMetaModel.annotationsPropertyMetaModel);
        recordDeclarationMetaModel.getConstructorParameters().add(typeDeclarationMetaModel.namePropertyMetaModel);
        recordDeclarationMetaModel.getConstructorParameters().add(recordDeclarationMetaModel.parametersPropertyMetaModel);
        recordDeclarationMetaModel.getConstructorParameters().add(recordDeclarationMetaModel.typeParametersPropertyMetaModel);
        recordDeclarationMetaModel.getConstructorParameters().add(recordDeclarationMetaModel.implementedTypesPropertyMetaModel);
        recordDeclarationMetaModel.getConstructorParameters().add(typeDeclarationMetaModel.membersPropertyMetaModel);
        recordDeclarationMetaModel.getConstructorParameters().add(recordDeclarationMetaModel.receiverParameterPropertyMetaModel);
        compactConstructorDeclarationMetaModel.getConstructorParameters().add(compactConstructorDeclarationMetaModel.modifiersPropertyMetaModel);
        compactConstructorDeclarationMetaModel.getConstructorParameters().add(bodyDeclarationMetaModel.annotationsPropertyMetaModel);
        compactConstructorDeclarationMetaModel.getConstructorParameters().add(compactConstructorDeclarationMetaModel.typeParametersPropertyMetaModel);
        compactConstructorDeclarationMetaModel.getConstructorParameters().add(compactConstructorDeclarationMetaModel.namePropertyMetaModel);
        compactConstructorDeclarationMetaModel.getConstructorParameters().add(compactConstructorDeclarationMetaModel.thrownExceptionsPropertyMetaModel);
        compactConstructorDeclarationMetaModel.getConstructorParameters().add(compactConstructorDeclarationMetaModel.bodyPropertyMetaModel);
        variableDeclaratorMetaModel.getConstructorParameters().add(variableDeclaratorMetaModel.typePropertyMetaModel);
        variableDeclaratorMetaModel.getConstructorParameters().add(variableDeclaratorMetaModel.namePropertyMetaModel);
        variableDeclaratorMetaModel.getConstructorParameters().add(variableDeclaratorMetaModel.initializerPropertyMetaModel);
        commentMetaModel.getConstructorParameters().add(commentMetaModel.contentPropertyMetaModel);
        blockCommentMetaModel.getConstructorParameters().add(commentMetaModel.contentPropertyMetaModel);
        javadocCommentMetaModel.getConstructorParameters().add(commentMetaModel.contentPropertyMetaModel);
        lineCommentMetaModel.getConstructorParameters().add(commentMetaModel.contentPropertyMetaModel);
        arrayAccessExprMetaModel.getConstructorParameters().add(arrayAccessExprMetaModel.namePropertyMetaModel);
        arrayAccessExprMetaModel.getConstructorParameters().add(arrayAccessExprMetaModel.indexPropertyMetaModel);
        arrayCreationExprMetaModel.getConstructorParameters().add(arrayCreationExprMetaModel.elementTypePropertyMetaModel);
        arrayCreationExprMetaModel.getConstructorParameters().add(arrayCreationExprMetaModel.levelsPropertyMetaModel);
        arrayCreationExprMetaModel.getConstructorParameters().add(arrayCreationExprMetaModel.initializerPropertyMetaModel);
        arrayInitializerExprMetaModel.getConstructorParameters().add(arrayInitializerExprMetaModel.valuesPropertyMetaModel);
        assignExprMetaModel.getConstructorParameters().add(assignExprMetaModel.targetPropertyMetaModel);
        assignExprMetaModel.getConstructorParameters().add(assignExprMetaModel.valuePropertyMetaModel);
        assignExprMetaModel.getConstructorParameters().add(assignExprMetaModel.operatorPropertyMetaModel);
        binaryExprMetaModel.getConstructorParameters().add(binaryExprMetaModel.leftPropertyMetaModel);
        binaryExprMetaModel.getConstructorParameters().add(binaryExprMetaModel.rightPropertyMetaModel);
        binaryExprMetaModel.getConstructorParameters().add(binaryExprMetaModel.operatorPropertyMetaModel);
        booleanLiteralExprMetaModel.getConstructorParameters().add(booleanLiteralExprMetaModel.valuePropertyMetaModel);
        castExprMetaModel.getConstructorParameters().add(castExprMetaModel.typePropertyMetaModel);
        castExprMetaModel.getConstructorParameters().add(castExprMetaModel.expressionPropertyMetaModel);
        charLiteralExprMetaModel.getConstructorParameters().add(literalStringValueExprMetaModel.valuePropertyMetaModel);
        classExprMetaModel.getConstructorParameters().add(classExprMetaModel.typePropertyMetaModel);
        conditionalExprMetaModel.getConstructorParameters().add(conditionalExprMetaModel.conditionPropertyMetaModel);
        conditionalExprMetaModel.getConstructorParameters().add(conditionalExprMetaModel.thenExprPropertyMetaModel);
        conditionalExprMetaModel.getConstructorParameters().add(conditionalExprMetaModel.elseExprPropertyMetaModel);
        doubleLiteralExprMetaModel.getConstructorParameters().add(literalStringValueExprMetaModel.valuePropertyMetaModel);
        enclosedExprMetaModel.getConstructorParameters().add(enclosedExprMetaModel.innerPropertyMetaModel);
        fieldAccessExprMetaModel.getConstructorParameters().add(fieldAccessExprMetaModel.scopePropertyMetaModel);
        fieldAccessExprMetaModel.getConstructorParameters().add(fieldAccessExprMetaModel.typeArgumentsPropertyMetaModel);
        fieldAccessExprMetaModel.getConstructorParameters().add(fieldAccessExprMetaModel.namePropertyMetaModel);
        instanceOfExprMetaModel.getConstructorParameters().add(instanceOfExprMetaModel.expressionPropertyMetaModel);
        instanceOfExprMetaModel.getConstructorParameters().add(instanceOfExprMetaModel.typePropertyMetaModel);
        instanceOfExprMetaModel.getConstructorParameters().add(instanceOfExprMetaModel.patternPropertyMetaModel);
        integerLiteralExprMetaModel.getConstructorParameters().add(literalStringValueExprMetaModel.valuePropertyMetaModel);
        lambdaExprMetaModel.getConstructorParameters().add(lambdaExprMetaModel.parametersPropertyMetaModel);
        lambdaExprMetaModel.getConstructorParameters().add(lambdaExprMetaModel.bodyPropertyMetaModel);
        lambdaExprMetaModel.getConstructorParameters().add(lambdaExprMetaModel.isEnclosingParametersPropertyMetaModel);
        longLiteralExprMetaModel.getConstructorParameters().add(literalStringValueExprMetaModel.valuePropertyMetaModel);
        markerAnnotationExprMetaModel.getConstructorParameters().add(annotationExprMetaModel.namePropertyMetaModel);
        memberValuePairMetaModel.getConstructorParameters().add(memberValuePairMetaModel.namePropertyMetaModel);
        memberValuePairMetaModel.getConstructorParameters().add(memberValuePairMetaModel.valuePropertyMetaModel);
        methodCallExprMetaModel.getConstructorParameters().add(methodCallExprMetaModel.scopePropertyMetaModel);
        methodCallExprMetaModel.getConstructorParameters().add(methodCallExprMetaModel.typeArgumentsPropertyMetaModel);
        methodCallExprMetaModel.getConstructorParameters().add(methodCallExprMetaModel.namePropertyMetaModel);
        methodCallExprMetaModel.getConstructorParameters().add(methodCallExprMetaModel.argumentsPropertyMetaModel);
        methodReferenceExprMetaModel.getConstructorParameters().add(methodReferenceExprMetaModel.scopePropertyMetaModel);
        methodReferenceExprMetaModel.getConstructorParameters().add(methodReferenceExprMetaModel.typeArgumentsPropertyMetaModel);
        methodReferenceExprMetaModel.getConstructorParameters().add(methodReferenceExprMetaModel.identifierPropertyMetaModel);
        nameExprMetaModel.getConstructorParameters().add(nameExprMetaModel.namePropertyMetaModel);
        nameMetaModel.getConstructorParameters().add(nameMetaModel.qualifierPropertyMetaModel);
        nameMetaModel.getConstructorParameters().add(nameMetaModel.identifierPropertyMetaModel);
        normalAnnotationExprMetaModel.getConstructorParameters().add(annotationExprMetaModel.namePropertyMetaModel);
        normalAnnotationExprMetaModel.getConstructorParameters().add(normalAnnotationExprMetaModel.pairsPropertyMetaModel);
        objectCreationExprMetaModel.getConstructorParameters().add(objectCreationExprMetaModel.scopePropertyMetaModel);
        objectCreationExprMetaModel.getConstructorParameters().add(objectCreationExprMetaModel.typePropertyMetaModel);
        objectCreationExprMetaModel.getConstructorParameters().add(objectCreationExprMetaModel.typeArgumentsPropertyMetaModel);
        objectCreationExprMetaModel.getConstructorParameters().add(objectCreationExprMetaModel.argumentsPropertyMetaModel);
        objectCreationExprMetaModel.getConstructorParameters().add(objectCreationExprMetaModel.anonymousClassBodyPropertyMetaModel);
        patternExprMetaModel.getConstructorParameters().add(patternExprMetaModel.typePropertyMetaModel);
        recordPatternExprMetaModel.getConstructorParameters().add(recordPatternExprMetaModel.modifiersPropertyMetaModel);
        recordPatternExprMetaModel.getConstructorParameters().add(patternExprMetaModel.typePropertyMetaModel);
        recordPatternExprMetaModel.getConstructorParameters().add(recordPatternExprMetaModel.patternListPropertyMetaModel);
        singleMemberAnnotationExprMetaModel.getConstructorParameters().add(annotationExprMetaModel.namePropertyMetaModel);
        singleMemberAnnotationExprMetaModel.getConstructorParameters().add(singleMemberAnnotationExprMetaModel.memberValuePropertyMetaModel);
        simpleNameMetaModel.getConstructorParameters().add(simpleNameMetaModel.identifierPropertyMetaModel);
        superExprMetaModel.getConstructorParameters().add(superExprMetaModel.typeNamePropertyMetaModel);
        switchExprMetaModel.getConstructorParameters().add(switchExprMetaModel.selectorPropertyMetaModel);
        switchExprMetaModel.getConstructorParameters().add(switchExprMetaModel.entriesPropertyMetaModel);
        textBlockLiteralExprMetaModel.getConstructorParameters().add(literalStringValueExprMetaModel.valuePropertyMetaModel);
        thisExprMetaModel.getConstructorParameters().add(thisExprMetaModel.typeNamePropertyMetaModel);
        typeExprMetaModel.getConstructorParameters().add(typeExprMetaModel.typePropertyMetaModel);
        typePatternExprMetaModel.getConstructorParameters().add(typePatternExprMetaModel.modifiersPropertyMetaModel);
        typePatternExprMetaModel.getConstructorParameters().add(patternExprMetaModel.typePropertyMetaModel);
        typePatternExprMetaModel.getConstructorParameters().add(typePatternExprMetaModel.namePropertyMetaModel);
        unaryExprMetaModel.getConstructorParameters().add(unaryExprMetaModel.expressionPropertyMetaModel);
        unaryExprMetaModel.getConstructorParameters().add(unaryExprMetaModel.operatorPropertyMetaModel);
        variableDeclarationExprMetaModel.getConstructorParameters().add(variableDeclarationExprMetaModel.modifiersPropertyMetaModel);
        variableDeclarationExprMetaModel.getConstructorParameters().add(variableDeclarationExprMetaModel.annotationsPropertyMetaModel);
        variableDeclarationExprMetaModel.getConstructorParameters().add(variableDeclarationExprMetaModel.variablesPropertyMetaModel);
        jmlDocMetaModel.getConstructorParameters().add(jmlDocMetaModel.contentPropertyMetaModel);
        jmlDocDeclarationMetaModel.getConstructorParameters().add(jmlDocDeclarationMetaModel.jmlCommentsPropertyMetaModel);
        jmlDocStmtMetaModel.getConstructorParameters().add(jmlDocStmtMetaModel.jmlCommentsPropertyMetaModel);
        jmlDocTypeMetaModel.getConstructorParameters().add(typeDeclarationMetaModel.modifiersPropertyMetaModel);
        jmlDocTypeMetaModel.getConstructorParameters().add(bodyDeclarationMetaModel.annotationsPropertyMetaModel);
        jmlDocTypeMetaModel.getConstructorParameters().add(typeDeclarationMetaModel.namePropertyMetaModel);
        jmlDocTypeMetaModel.getConstructorParameters().add(typeDeclarationMetaModel.membersPropertyMetaModel);
        jmlDocTypeMetaModel.getConstructorParameters().add(jmlDocTypeMetaModel.jmlCommentsPropertyMetaModel);
        jmlQuantifiedExprMetaModel.getConstructorParameters().add(jmlQuantifiedExprMetaModel.binderPropertyMetaModel);
        jmlQuantifiedExprMetaModel.getConstructorParameters().add(jmlQuantifiedExprMetaModel.variablesPropertyMetaModel);
        jmlQuantifiedExprMetaModel.getConstructorParameters().add(jmlQuantifiedExprMetaModel.expressionsPropertyMetaModel);
        jmlTypeExprMetaModel.getConstructorParameters().add(jmlTypeExprMetaModel.typePropertyMetaModel);
        jmlBinaryInfixExprMetaModel.getConstructorParameters().add(jmlBinaryInfixExprMetaModel.leftPropertyMetaModel);
        jmlBinaryInfixExprMetaModel.getConstructorParameters().add(jmlBinaryInfixExprMetaModel.rightPropertyMetaModel);
        jmlBinaryInfixExprMetaModel.getConstructorParameters().add(jmlBinaryInfixExprMetaModel.operatorPropertyMetaModel);
        jmlLetExprMetaModel.getConstructorParameters().add(jmlLetExprMetaModel.variablesPropertyMetaModel);
        jmlLetExprMetaModel.getConstructorParameters().add(jmlLetExprMetaModel.bodyPropertyMetaModel);
        jmlMultiCompareExprMetaModel.getConstructorParameters().add(jmlMultiCompareExprMetaModel.expressionsPropertyMetaModel);
        jmlMultiCompareExprMetaModel.getConstructorParameters().add(jmlMultiCompareExprMetaModel.operatorsPropertyMetaModel);
        jmlLabelExprMetaModel.getConstructorParameters().add(jmlLabelExprMetaModel.kindPropertyMetaModel);
        jmlLabelExprMetaModel.getConstructorParameters().add(jmlLabelExprMetaModel.labelPropertyMetaModel);
        jmlLabelExprMetaModel.getConstructorParameters().add(jmlLabelExprMetaModel.expressionPropertyMetaModel);
        jmlSetComprehensionExprMetaModel.getConstructorParameters().add(jmlSetComprehensionExprMetaModel.bindingPropertyMetaModel);
        jmlSetComprehensionExprMetaModel.getConstructorParameters().add(jmlSetComprehensionExprMetaModel.predicatePropertyMetaModel);
        assertStmtMetaModel.getConstructorParameters().add(assertStmtMetaModel.checkPropertyMetaModel);
        assertStmtMetaModel.getConstructorParameters().add(assertStmtMetaModel.messagePropertyMetaModel);
        blockStmtMetaModel.getConstructorParameters().add(blockStmtMetaModel.statementsPropertyMetaModel);
        blockStmtMetaModel.getConstructorParameters().add(blockStmtMetaModel.contractsPropertyMetaModel);
        breakStmtMetaModel.getConstructorParameters().add(breakStmtMetaModel.labelPropertyMetaModel);
        catchClauseMetaModel.getConstructorParameters().add(catchClauseMetaModel.parameterPropertyMetaModel);
        catchClauseMetaModel.getConstructorParameters().add(catchClauseMetaModel.bodyPropertyMetaModel);
        continueStmtMetaModel.getConstructorParameters().add(continueStmtMetaModel.labelPropertyMetaModel);
        doStmtMetaModel.getConstructorParameters().add(doStmtMetaModel.bodyPropertyMetaModel);
        doStmtMetaModel.getConstructorParameters().add(doStmtMetaModel.conditionPropertyMetaModel);
        doStmtMetaModel.getConstructorParameters().add(doStmtMetaModel.contractsPropertyMetaModel);
        explicitConstructorInvocationStmtMetaModel.getConstructorParameters().add(explicitConstructorInvocationStmtMetaModel.typeArgumentsPropertyMetaModel);
        explicitConstructorInvocationStmtMetaModel.getConstructorParameters().add(explicitConstructorInvocationStmtMetaModel.isThisPropertyMetaModel);
        explicitConstructorInvocationStmtMetaModel.getConstructorParameters().add(explicitConstructorInvocationStmtMetaModel.expressionPropertyMetaModel);
        explicitConstructorInvocationStmtMetaModel.getConstructorParameters().add(explicitConstructorInvocationStmtMetaModel.argumentsPropertyMetaModel);
        expressionStmtMetaModel.getConstructorParameters().add(expressionStmtMetaModel.expressionPropertyMetaModel);
        forEachStmtMetaModel.getConstructorParameters().add(forEachStmtMetaModel.variablePropertyMetaModel);
        forEachStmtMetaModel.getConstructorParameters().add(forEachStmtMetaModel.iterablePropertyMetaModel);
        forEachStmtMetaModel.getConstructorParameters().add(forEachStmtMetaModel.bodyPropertyMetaModel);
        forEachStmtMetaModel.getConstructorParameters().add(forEachStmtMetaModel.contractsPropertyMetaModel);
        forStmtMetaModel.getConstructorParameters().add(forStmtMetaModel.initializationPropertyMetaModel);
        forStmtMetaModel.getConstructorParameters().add(forStmtMetaModel.comparePropertyMetaModel);
        forStmtMetaModel.getConstructorParameters().add(forStmtMetaModel.updatePropertyMetaModel);
        forStmtMetaModel.getConstructorParameters().add(forStmtMetaModel.bodyPropertyMetaModel);
        forStmtMetaModel.getConstructorParameters().add(forStmtMetaModel.contractsPropertyMetaModel);
        ifStmtMetaModel.getConstructorParameters().add(ifStmtMetaModel.conditionPropertyMetaModel);
        ifStmtMetaModel.getConstructorParameters().add(ifStmtMetaModel.thenStmtPropertyMetaModel);
        ifStmtMetaModel.getConstructorParameters().add(ifStmtMetaModel.elseStmtPropertyMetaModel);
        labeledStmtMetaModel.getConstructorParameters().add(labeledStmtMetaModel.labelPropertyMetaModel);
        labeledStmtMetaModel.getConstructorParameters().add(labeledStmtMetaModel.statementPropertyMetaModel);
        localClassDeclarationStmtMetaModel.getConstructorParameters().add(localClassDeclarationStmtMetaModel.classDeclarationPropertyMetaModel);
        localRecordDeclarationStmtMetaModel.getConstructorParameters().add(localRecordDeclarationStmtMetaModel.recordDeclarationPropertyMetaModel);
        returnStmtMetaModel.getConstructorParameters().add(returnStmtMetaModel.expressionPropertyMetaModel);
        switchEntryMetaModel.getConstructorParameters().add(switchEntryMetaModel.labelsPropertyMetaModel);
        switchEntryMetaModel.getConstructorParameters().add(switchEntryMetaModel.typePropertyMetaModel);
        switchEntryMetaModel.getConstructorParameters().add(switchEntryMetaModel.statementsPropertyMetaModel);
        switchEntryMetaModel.getConstructorParameters().add(switchEntryMetaModel.isDefaultPropertyMetaModel);
        switchStmtMetaModel.getConstructorParameters().add(switchStmtMetaModel.selectorPropertyMetaModel);
        switchStmtMetaModel.getConstructorParameters().add(switchStmtMetaModel.entriesPropertyMetaModel);
        synchronizedStmtMetaModel.getConstructorParameters().add(synchronizedStmtMetaModel.expressionPropertyMetaModel);
        synchronizedStmtMetaModel.getConstructorParameters().add(synchronizedStmtMetaModel.bodyPropertyMetaModel);
        throwStmtMetaModel.getConstructorParameters().add(throwStmtMetaModel.expressionPropertyMetaModel);
        tryStmtMetaModel.getConstructorParameters().add(tryStmtMetaModel.resourcesPropertyMetaModel);
        tryStmtMetaModel.getConstructorParameters().add(tryStmtMetaModel.tryBlockPropertyMetaModel);
        tryStmtMetaModel.getConstructorParameters().add(tryStmtMetaModel.catchClausesPropertyMetaModel);
        tryStmtMetaModel.getConstructorParameters().add(tryStmtMetaModel.finallyBlockPropertyMetaModel);
        whileStmtMetaModel.getConstructorParameters().add(whileStmtMetaModel.conditionPropertyMetaModel);
        whileStmtMetaModel.getConstructorParameters().add(whileStmtMetaModel.bodyPropertyMetaModel);
        whileStmtMetaModel.getConstructorParameters().add(whileStmtMetaModel.contractsPropertyMetaModel);
        yieldStmtMetaModel.getConstructorParameters().add(yieldStmtMetaModel.expressionPropertyMetaModel);
        jmlGhostStmtMetaModel.getConstructorParameters().add(jmlGhostStmtMetaModel.jmlTagsPropertyMetaModel);
        jmlGhostStmtMetaModel.getConstructorParameters().add(jmlGhostStmtMetaModel.statementPropertyMetaModel);
        jmlExpressionStmtMetaModel.getConstructorParameters().add(jmlExpressionStmtMetaModel.jmlTagsPropertyMetaModel);
        jmlExpressionStmtMetaModel.getConstructorParameters().add(jmlExpressionStmtMetaModel.kindPropertyMetaModel);
        jmlExpressionStmtMetaModel.getConstructorParameters().add(jmlExpressionStmtMetaModel.expressionPropertyMetaModel);
        jmlRefiningStmtMetaModel.getConstructorParameters().add(jmlRefiningStmtMetaModel.jmlTagsPropertyMetaModel);
        jmlUnreachableStmtMetaModel.getConstructorParameters().add(jmlUnreachableStmtMetaModel.jmlTagsPropertyMetaModel);
        jmlLabelStmtMetaModel.getConstructorParameters().add(jmlLabelStmtMetaModel.jmlTagsPropertyMetaModel);
        jmlLabelStmtMetaModel.getConstructorParameters().add(jmlLabelStmtMetaModel.labelPropertyMetaModel);
        jmlBeginStmtMetaModel.getConstructorParameters().add(jmlBeginStmtMetaModel.jmlTagsPropertyMetaModel);
        jmlEndStmtMetaModel.getConstructorParameters().add(jmlEndStmtMetaModel.jmlTagsPropertyMetaModel);
        jmlMethodDeclarationMetaModel.getConstructorParameters().add(jmlMethodDeclarationMetaModel.jmlTagsPropertyMetaModel);
        jmlMethodDeclarationMetaModel.getConstructorParameters().add(jmlMethodDeclarationMetaModel.methodDeclarationPropertyMetaModel);
        jmlMethodDeclarationMetaModel.getConstructorParameters().add(jmlMethodDeclarationMetaModel.contractPropertyMetaModel);
        jmlFieldDeclarationMetaModel.getConstructorParameters().add(jmlFieldDeclarationMetaModel.jmlTagsPropertyMetaModel);
        jmlFieldDeclarationMetaModel.getConstructorParameters().add(jmlFieldDeclarationMetaModel.declPropertyMetaModel);
        jmlClauseMetaModel.getConstructorParameters().add(jmlClauseMetaModel.namePropertyMetaModel);
        jmlSimpleExprClauseMetaModel.getConstructorParameters().add(jmlSimpleExprClauseMetaModel.kindPropertyMetaModel);
        jmlSimpleExprClauseMetaModel.getConstructorParameters().add(jmlClauseMetaModel.namePropertyMetaModel);
        jmlSimpleExprClauseMetaModel.getConstructorParameters().add(jmlSimpleExprClauseMetaModel.heapsPropertyMetaModel);
        jmlSimpleExprClauseMetaModel.getConstructorParameters().add(jmlSimpleExprClauseMetaModel.expressionPropertyMetaModel);
        jmlMultiExprClauseMetaModel.getConstructorParameters().add(jmlMultiExprClauseMetaModel.kindPropertyMetaModel);
        jmlMultiExprClauseMetaModel.getConstructorParameters().add(jmlClauseMetaModel.namePropertyMetaModel);
        jmlMultiExprClauseMetaModel.getConstructorParameters().add(jmlMultiExprClauseMetaModel.heapsPropertyMetaModel);
        jmlMultiExprClauseMetaModel.getConstructorParameters().add(jmlMultiExprClauseMetaModel.expressionsPropertyMetaModel);
        jmlSignalsClauseMetaModel.getConstructorParameters().add(jmlClauseMetaModel.namePropertyMetaModel);
        jmlSignalsClauseMetaModel.getConstructorParameters().add(jmlSignalsClauseMetaModel.parameterPropertyMetaModel);
        jmlSignalsClauseMetaModel.getConstructorParameters().add(jmlSignalsClauseMetaModel.expressionPropertyMetaModel);
        jmlSignalsOnlyClauseMetaModel.getConstructorParameters().add(jmlSignalsOnlyClauseMetaModel.typesPropertyMetaModel);
        jmlClauseLabelMetaModel.getConstructorParameters().add(jmlClauseLabelMetaModel.kindPropertyMetaModel);
        jmlClauseLabelMetaModel.getConstructorParameters().add(jmlClauseLabelMetaModel.labelPropertyMetaModel);
        jmlClauseLabelMetaModel.getConstructorParameters().add(jmlClauseLabelMetaModel.exprPropertyMetaModel);
        jmlForallClauseMetaModel.getConstructorParameters().add(jmlForallClauseMetaModel.boundedVariablesPropertyMetaModel);
        jmlOldClauseMetaModel.getConstructorParameters().add(jmlOldClauseMetaModel.declarationsPropertyMetaModel);
        jmlCallableClauseMetaModel.getConstructorParameters().add(jmlClauseMetaModel.namePropertyMetaModel);
        jmlCallableClauseMetaModel.getConstructorParameters().add(jmlCallableClauseMetaModel.methodSignaturesPropertyMetaModel);
        jmlClauseIfMetaModel.getConstructorParameters().add(jmlClauseMetaModel.namePropertyMetaModel);
        jmlClauseIfMetaModel.getConstructorParameters().add(jmlClauseIfMetaModel.conditionPropertyMetaModel);
        jmlClauseIfMetaModel.getConstructorParameters().add(jmlClauseIfMetaModel.kindPropertyMetaModel);
        jmlClauseIfMetaModel.getConstructorParameters().add(jmlClauseIfMetaModel.thenPropertyMetaModel);
        jmlMethodSignatureMetaModel.getConstructorParameters().add(jmlMethodSignatureMetaModel.receiverPropertyMetaModel);
        jmlMethodSignatureMetaModel.getConstructorParameters().add(jmlMethodSignatureMetaModel.namePropertyMetaModel);
        jmlMethodSignatureMetaModel.getConstructorParameters().add(jmlMethodSignatureMetaModel.argumentTypesPropertyMetaModel);
        jmlContractMetaModel.getConstructorParameters().add(jmlContractMetaModel.jmlTagsPropertyMetaModel);
        jmlContractMetaModel.getConstructorParameters().add(jmlContractMetaModel.typePropertyMetaModel);
        jmlContractMetaModel.getConstructorParameters().add(jmlContractMetaModel.behaviorPropertyMetaModel);
        jmlContractMetaModel.getConstructorParameters().add(jmlContractMetaModel.namePropertyMetaModel);
        jmlContractMetaModel.getConstructorParameters().add(jmlContractMetaModel.modifiersPropertyMetaModel);
        jmlContractMetaModel.getConstructorParameters().add(jmlContractMetaModel.clausesPropertyMetaModel);
        jmlContractMetaModel.getConstructorParameters().add(jmlContractMetaModel.subContractsPropertyMetaModel);
        jmlClassExprDeclarationMetaModel.getConstructorParameters().add(jmlClassExprDeclarationMetaModel.jmlTagsPropertyMetaModel);
        jmlClassExprDeclarationMetaModel.getConstructorParameters().add(jmlClassExprDeclarationMetaModel.modifiersPropertyMetaModel);
        jmlClassExprDeclarationMetaModel.getConstructorParameters().add(jmlClassExprDeclarationMetaModel.kindPropertyMetaModel);
        jmlClassExprDeclarationMetaModel.getConstructorParameters().add(jmlClassExprDeclarationMetaModel.namePropertyMetaModel);
        jmlClassExprDeclarationMetaModel.getConstructorParameters().add(jmlClassExprDeclarationMetaModel.invariantPropertyMetaModel);
        jmlRepresentsDeclarationMetaModel.getConstructorParameters().add(jmlRepresentsDeclarationMetaModel.jmlTagsPropertyMetaModel);
        jmlRepresentsDeclarationMetaModel.getConstructorParameters().add(jmlRepresentsDeclarationMetaModel.modifiersPropertyMetaModel);
        jmlRepresentsDeclarationMetaModel.getConstructorParameters().add(jmlRepresentsDeclarationMetaModel.namePropertyMetaModel);
        jmlRepresentsDeclarationMetaModel.getConstructorParameters().add(jmlRepresentsDeclarationMetaModel.exprPropertyMetaModel);
        jmlClassAccessibleDeclarationMetaModel.getConstructorParameters().add(jmlClassAccessibleDeclarationMetaModel.jmlTagsPropertyMetaModel);
        jmlClassAccessibleDeclarationMetaModel.getConstructorParameters().add(jmlClassAccessibleDeclarationMetaModel.modifiersPropertyMetaModel);
        jmlClassAccessibleDeclarationMetaModel.getConstructorParameters().add(jmlClassAccessibleDeclarationMetaModel.variablePropertyMetaModel);
        jmlClassAccessibleDeclarationMetaModel.getConstructorParameters().add(jmlClassAccessibleDeclarationMetaModel.expressionsPropertyMetaModel);
        jmlClassAccessibleDeclarationMetaModel.getConstructorParameters().add(jmlClassAccessibleDeclarationMetaModel.measuredByPropertyMetaModel);
        arrayTypeMetaModel.getConstructorParameters().add(arrayTypeMetaModel.componentTypePropertyMetaModel);
        arrayTypeMetaModel.getConstructorParameters().add(arrayTypeMetaModel.originPropertyMetaModel);
        arrayTypeMetaModel.getConstructorParameters().add(typeMetaModel.annotationsPropertyMetaModel);
        classOrInterfaceTypeMetaModel.getConstructorParameters().add(classOrInterfaceTypeMetaModel.scopePropertyMetaModel);
        classOrInterfaceTypeMetaModel.getConstructorParameters().add(classOrInterfaceTypeMetaModel.namePropertyMetaModel);
        classOrInterfaceTypeMetaModel.getConstructorParameters().add(classOrInterfaceTypeMetaModel.typeArgumentsPropertyMetaModel);
        classOrInterfaceTypeMetaModel.getConstructorParameters().add(typeMetaModel.annotationsPropertyMetaModel);
        intersectionTypeMetaModel.getConstructorParameters().add(intersectionTypeMetaModel.elementsPropertyMetaModel);
        primitiveTypeMetaModel.getConstructorParameters().add(primitiveTypeMetaModel.typePropertyMetaModel);
        primitiveTypeMetaModel.getConstructorParameters().add(typeMetaModel.annotationsPropertyMetaModel);
        typeParameterMetaModel.getConstructorParameters().add(typeParameterMetaModel.namePropertyMetaModel);
        typeParameterMetaModel.getConstructorParameters().add(typeParameterMetaModel.typeBoundPropertyMetaModel);
        typeParameterMetaModel.getConstructorParameters().add(typeMetaModel.annotationsPropertyMetaModel);
        unionTypeMetaModel.getConstructorParameters().add(unionTypeMetaModel.elementsPropertyMetaModel);
        wildcardTypeMetaModel.getConstructorParameters().add(wildcardTypeMetaModel.extendedTypePropertyMetaModel);
        wildcardTypeMetaModel.getConstructorParameters().add(wildcardTypeMetaModel.superTypePropertyMetaModel);
        wildcardTypeMetaModel.getConstructorParameters().add(typeMetaModel.annotationsPropertyMetaModel);
        moduleExportsDirectiveMetaModel.getConstructorParameters().add(moduleExportsDirectiveMetaModel.namePropertyMetaModel);
        moduleExportsDirectiveMetaModel.getConstructorParameters().add(moduleExportsDirectiveMetaModel.moduleNamesPropertyMetaModel);
        moduleOpensDirectiveMetaModel.getConstructorParameters().add(moduleOpensDirectiveMetaModel.namePropertyMetaModel);
        moduleOpensDirectiveMetaModel.getConstructorParameters().add(moduleOpensDirectiveMetaModel.moduleNamesPropertyMetaModel);
        moduleProvidesDirectiveMetaModel.getConstructorParameters().add(moduleProvidesDirectiveMetaModel.namePropertyMetaModel);
        moduleProvidesDirectiveMetaModel.getConstructorParameters().add(moduleProvidesDirectiveMetaModel.withPropertyMetaModel);
        moduleRequiresDirectiveMetaModel.getConstructorParameters().add(moduleRequiresDirectiveMetaModel.modifiersPropertyMetaModel);
        moduleRequiresDirectiveMetaModel.getConstructorParameters().add(moduleRequiresDirectiveMetaModel.namePropertyMetaModel);
        moduleUsesDirectiveMetaModel.getConstructorParameters().add(moduleUsesDirectiveMetaModel.namePropertyMetaModel);
    }

    public static List<BaseNodeMetaModel> getNodeMetaModels() {
        return nodeMetaModels;
    }

    @Generated("com.github.javaparser.generator.metamodel.MetaModelGenerator")
    private static void initializeNodeMetaModels() {
        nodeMetaModels.add(annotationDeclarationMetaModel);
        nodeMetaModels.add(annotationExprMetaModel);
        nodeMetaModels.add(annotationMemberDeclarationMetaModel);
        nodeMetaModels.add(arrayAccessExprMetaModel);
        nodeMetaModels.add(arrayCreationExprMetaModel);
        nodeMetaModels.add(arrayCreationLevelMetaModel);
        nodeMetaModels.add(arrayInitializerExprMetaModel);
        nodeMetaModels.add(arrayTypeMetaModel);
        nodeMetaModels.add(assertStmtMetaModel);
        nodeMetaModels.add(assignExprMetaModel);
        nodeMetaModels.add(binaryExprMetaModel);
        nodeMetaModels.add(blockCommentMetaModel);
        nodeMetaModels.add(blockStmtMetaModel);
        nodeMetaModels.add(bodyDeclarationMetaModel);
        nodeMetaModels.add(booleanLiteralExprMetaModel);
        nodeMetaModels.add(breakStmtMetaModel);
        nodeMetaModels.add(callableDeclarationMetaModel);
        nodeMetaModels.add(castExprMetaModel);
        nodeMetaModels.add(catchClauseMetaModel);
        nodeMetaModels.add(charLiteralExprMetaModel);
        nodeMetaModels.add(classExprMetaModel);
        nodeMetaModels.add(classOrInterfaceDeclarationMetaModel);
        nodeMetaModels.add(classOrInterfaceTypeMetaModel);
        nodeMetaModels.add(commentMetaModel);
        nodeMetaModels.add(compactConstructorDeclarationMetaModel);
        nodeMetaModels.add(compilationUnitMetaModel);
        nodeMetaModels.add(conditionalExprMetaModel);
        nodeMetaModels.add(constructorDeclarationMetaModel);
        nodeMetaModels.add(continueStmtMetaModel);
        nodeMetaModels.add(doStmtMetaModel);
        nodeMetaModels.add(doubleLiteralExprMetaModel);
        nodeMetaModels.add(emptyStmtMetaModel);
        nodeMetaModels.add(enclosedExprMetaModel);
        nodeMetaModels.add(enumConstantDeclarationMetaModel);
        nodeMetaModels.add(enumDeclarationMetaModel);
        nodeMetaModels.add(explicitConstructorInvocationStmtMetaModel);
        nodeMetaModels.add(expressionMetaModel);
        nodeMetaModels.add(expressionStmtMetaModel);
        nodeMetaModels.add(fieldAccessExprMetaModel);
        nodeMetaModels.add(fieldDeclarationMetaModel);
        nodeMetaModels.add(forEachStmtMetaModel);
        nodeMetaModels.add(forStmtMetaModel);
        nodeMetaModels.add(ifStmtMetaModel);
        nodeMetaModels.add(importDeclarationMetaModel);
        nodeMetaModels.add(initializerDeclarationMetaModel);
        nodeMetaModels.add(instanceOfExprMetaModel);
        nodeMetaModels.add(integerLiteralExprMetaModel);
        nodeMetaModels.add(intersectionTypeMetaModel);
        nodeMetaModels.add(javadocCommentMetaModel);
        nodeMetaModels.add(jmlBeginStmtMetaModel);
        nodeMetaModels.add(jmlBinaryInfixExprMetaModel);
        nodeMetaModels.add(jmlCallableClauseMetaModel);
        nodeMetaModels.add(jmlClassAccessibleDeclarationMetaModel);
        nodeMetaModels.add(jmlClassExprDeclarationMetaModel);
        nodeMetaModels.add(jmlClassLevelDeclarationMetaModel);
        nodeMetaModels.add(jmlClauseIfMetaModel);
        nodeMetaModels.add(jmlClauseLabelMetaModel);
        nodeMetaModels.add(jmlClauseMetaModel);
        nodeMetaModels.add(jmlContractMetaModel);
        nodeMetaModels.add(jmlDocDeclarationMetaModel);
        nodeMetaModels.add(jmlDocMetaModel);
        nodeMetaModels.add(jmlDocStmtMetaModel);
        nodeMetaModels.add(jmlDocTypeMetaModel);
        nodeMetaModels.add(jmlEndStmtMetaModel);
        nodeMetaModels.add(jmlExpressionStmtMetaModel);
        nodeMetaModels.add(jmlFieldDeclarationMetaModel);
        nodeMetaModels.add(jmlForallClauseMetaModel);
        nodeMetaModels.add(jmlGhostStmtMetaModel);
        nodeMetaModels.add(jmlLabelExprMetaModel);
        nodeMetaModels.add(jmlLabelStmtMetaModel);
        nodeMetaModels.add(jmlLetExprMetaModel);
        nodeMetaModels.add(jmlMethodDeclarationMetaModel);
        nodeMetaModels.add(jmlMethodSignatureMetaModel);
        nodeMetaModels.add(jmlMultiCompareExprMetaModel);
        nodeMetaModels.add(jmlMultiExprClauseMetaModel);
        nodeMetaModels.add(jmlOldClauseMetaModel);
        nodeMetaModels.add(jmlQuantifiedExprMetaModel);
        nodeMetaModels.add(jmlRefiningStmtMetaModel);
        nodeMetaModels.add(jmlRepresentsDeclarationMetaModel);
        nodeMetaModels.add(jmlSetComprehensionExprMetaModel);
        nodeMetaModels.add(jmlSignalsClauseMetaModel);
        nodeMetaModels.add(jmlSignalsOnlyClauseMetaModel);
        nodeMetaModels.add(jmlSimpleExprClauseMetaModel);
        nodeMetaModels.add(jmlStatementMetaModel);
        nodeMetaModels.add(jmlTypeExprMetaModel);
        nodeMetaModels.add(jmlUnreachableStmtMetaModel);
        nodeMetaModels.add(labeledStmtMetaModel);
        nodeMetaModels.add(lambdaExprMetaModel);
        nodeMetaModels.add(lineCommentMetaModel);
        nodeMetaModels.add(literalExprMetaModel);
        nodeMetaModels.add(literalStringValueExprMetaModel);
        nodeMetaModels.add(localClassDeclarationStmtMetaModel);
        nodeMetaModels.add(localRecordDeclarationStmtMetaModel);
        nodeMetaModels.add(longLiteralExprMetaModel);
        nodeMetaModels.add(markerAnnotationExprMetaModel);
        nodeMetaModels.add(memberValuePairMetaModel);
        nodeMetaModels.add(methodCallExprMetaModel);
        nodeMetaModels.add(methodDeclarationMetaModel);
        nodeMetaModels.add(methodReferenceExprMetaModel);
        nodeMetaModels.add(modifierMetaModel);
        nodeMetaModels.add(moduleDeclarationMetaModel);
        nodeMetaModels.add(moduleDirectiveMetaModel);
        nodeMetaModels.add(moduleExportsDirectiveMetaModel);
        nodeMetaModels.add(moduleOpensDirectiveMetaModel);
        nodeMetaModels.add(moduleProvidesDirectiveMetaModel);
        nodeMetaModels.add(moduleRequiresDirectiveMetaModel);
        nodeMetaModels.add(moduleUsesDirectiveMetaModel);
        nodeMetaModels.add(nameExprMetaModel);
        nodeMetaModels.add(nameMetaModel);
        nodeMetaModels.add(nodeMetaModel);
        nodeMetaModels.add(normalAnnotationExprMetaModel);
        nodeMetaModels.add(nullLiteralExprMetaModel);
        nodeMetaModels.add(objectCreationExprMetaModel);
        nodeMetaModels.add(packageDeclarationMetaModel);
        nodeMetaModels.add(parameterMetaModel);
        nodeMetaModels.add(patternExprMetaModel);
        nodeMetaModels.add(primitiveTypeMetaModel);
        nodeMetaModels.add(receiverParameterMetaModel);
        nodeMetaModels.add(recordDeclarationMetaModel);
        nodeMetaModels.add(recordPatternExprMetaModel);
        nodeMetaModels.add(referenceTypeMetaModel);
        nodeMetaModels.add(returnStmtMetaModel);
        nodeMetaModels.add(simpleNameMetaModel);
        nodeMetaModels.add(singleMemberAnnotationExprMetaModel);
        nodeMetaModels.add(statementMetaModel);
        nodeMetaModels.add(stringLiteralExprMetaModel);
        nodeMetaModels.add(superExprMetaModel);
        nodeMetaModels.add(switchEntryMetaModel);
        nodeMetaModels.add(switchExprMetaModel);
        nodeMetaModels.add(switchStmtMetaModel);
        nodeMetaModels.add(synchronizedStmtMetaModel);
        nodeMetaModels.add(textBlockLiteralExprMetaModel);
        nodeMetaModels.add(thisExprMetaModel);
        nodeMetaModels.add(throwStmtMetaModel);
        nodeMetaModels.add(tryStmtMetaModel);
        nodeMetaModels.add(typeDeclarationMetaModel);
        nodeMetaModels.add(typeExprMetaModel);
        nodeMetaModels.add(typeMetaModel);
        nodeMetaModels.add(typeParameterMetaModel);
        nodeMetaModels.add(typePatternExprMetaModel);
        nodeMetaModels.add(unaryExprMetaModel);
        nodeMetaModels.add(unionTypeMetaModel);
        nodeMetaModels.add(unknownTypeMetaModel);
        nodeMetaModels.add(unparsableStmtMetaModel);
        nodeMetaModels.add(varTypeMetaModel);
        nodeMetaModels.add(variableDeclarationExprMetaModel);
        nodeMetaModels.add(variableDeclaratorMetaModel);
        nodeMetaModels.add(voidTypeMetaModel);
        nodeMetaModels.add(whileStmtMetaModel);
        nodeMetaModels.add(wildcardTypeMetaModel);
        nodeMetaModels.add(yieldStmtMetaModel);
    }

    @Generated("com.github.javaparser.generator.metamodel.MetaModelGenerator")
    private static void initializePropertyMetaModels() {
        nodeMetaModel.commentPropertyMetaModel = new PropertyMetaModel(nodeMetaModel, "comment", com.github.javaparser.ast.comments.Comment.class, Optional.of(commentMetaModel), true, false, false, false);
        nodeMetaModel.getDeclaredPropertyMetaModels().add(nodeMetaModel.commentPropertyMetaModel);
        bodyDeclarationMetaModel.annotationsPropertyMetaModel = new PropertyMetaModel(bodyDeclarationMetaModel, "annotations", com.github.javaparser.ast.expr.AnnotationExpr.class, Optional.of(annotationExprMetaModel), false, false, true, false);
        bodyDeclarationMetaModel.getDeclaredPropertyMetaModels().add(bodyDeclarationMetaModel.annotationsPropertyMetaModel);
        callableDeclarationMetaModel.contractsPropertyMetaModel = new PropertyMetaModel(callableDeclarationMetaModel, "contracts", com.github.javaparser.ast.jml.clauses.JmlContract.class, Optional.of(jmlContractMetaModel), false, false, true, false);
        callableDeclarationMetaModel.getDeclaredPropertyMetaModels().add(callableDeclarationMetaModel.contractsPropertyMetaModel);
        callableDeclarationMetaModel.modifiersPropertyMetaModel = new PropertyMetaModel(callableDeclarationMetaModel, "modifiers", com.github.javaparser.ast.Modifier.class, Optional.of(modifierMetaModel), false, false, true, false);
        callableDeclarationMetaModel.getDeclaredPropertyMetaModels().add(callableDeclarationMetaModel.modifiersPropertyMetaModel);
        callableDeclarationMetaModel.namePropertyMetaModel = new PropertyMetaModel(callableDeclarationMetaModel, "name", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        callableDeclarationMetaModel.getDeclaredPropertyMetaModels().add(callableDeclarationMetaModel.namePropertyMetaModel);
        callableDeclarationMetaModel.parametersPropertyMetaModel = new PropertyMetaModel(callableDeclarationMetaModel, "parameters", com.github.javaparser.ast.body.Parameter.class, Optional.of(parameterMetaModel), false, false, true, false);
        callableDeclarationMetaModel.getDeclaredPropertyMetaModels().add(callableDeclarationMetaModel.parametersPropertyMetaModel);
        callableDeclarationMetaModel.receiverParameterPropertyMetaModel = new PropertyMetaModel(callableDeclarationMetaModel, "receiverParameter", com.github.javaparser.ast.body.ReceiverParameter.class, Optional.of(receiverParameterMetaModel), true, false, false, false);
        callableDeclarationMetaModel.getDeclaredPropertyMetaModels().add(callableDeclarationMetaModel.receiverParameterPropertyMetaModel);
        callableDeclarationMetaModel.thrownExceptionsPropertyMetaModel = new PropertyMetaModel(callableDeclarationMetaModel, "thrownExceptions", com.github.javaparser.ast.type.ReferenceType.class, Optional.of(referenceTypeMetaModel), false, false, true, false);
        callableDeclarationMetaModel.getDeclaredPropertyMetaModels().add(callableDeclarationMetaModel.thrownExceptionsPropertyMetaModel);
        callableDeclarationMetaModel.typeParametersPropertyMetaModel = new PropertyMetaModel(callableDeclarationMetaModel, "typeParameters", com.github.javaparser.ast.type.TypeParameter.class, Optional.of(typeParameterMetaModel), false, false, true, false);
        callableDeclarationMetaModel.getDeclaredPropertyMetaModels().add(callableDeclarationMetaModel.typeParametersPropertyMetaModel);
        typeMetaModel.annotationsPropertyMetaModel = new PropertyMetaModel(typeMetaModel, "annotations", com.github.javaparser.ast.expr.AnnotationExpr.class, Optional.of(annotationExprMetaModel), false, false, true, false);
        typeMetaModel.getDeclaredPropertyMetaModels().add(typeMetaModel.annotationsPropertyMetaModel);
        annotationExprMetaModel.namePropertyMetaModel = new PropertyMetaModel(annotationExprMetaModel, "name", com.github.javaparser.ast.expr.Name.class, Optional.of(nameMetaModel), false, false, false, false);
        annotationExprMetaModel.getDeclaredPropertyMetaModels().add(annotationExprMetaModel.namePropertyMetaModel);
        typeDeclarationMetaModel.membersPropertyMetaModel = new PropertyMetaModel(typeDeclarationMetaModel, "members", com.github.javaparser.ast.body.BodyDeclaration.class, Optional.of(bodyDeclarationMetaModel), false, false, true, true);
        typeDeclarationMetaModel.getDeclaredPropertyMetaModels().add(typeDeclarationMetaModel.membersPropertyMetaModel);
        typeDeclarationMetaModel.modifiersPropertyMetaModel = new PropertyMetaModel(typeDeclarationMetaModel, "modifiers", com.github.javaparser.ast.Modifier.class, Optional.of(modifierMetaModel), false, false, true, false);
        typeDeclarationMetaModel.getDeclaredPropertyMetaModels().add(typeDeclarationMetaModel.modifiersPropertyMetaModel);
        typeDeclarationMetaModel.namePropertyMetaModel = new PropertyMetaModel(typeDeclarationMetaModel, "name", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        typeDeclarationMetaModel.getDeclaredPropertyMetaModels().add(typeDeclarationMetaModel.namePropertyMetaModel);
        literalStringValueExprMetaModel.valuePropertyMetaModel = new PropertyMetaModel(literalStringValueExprMetaModel, "value", java.lang.String.class, Optional.empty(), false, false, false, false);
        literalStringValueExprMetaModel.getDeclaredPropertyMetaModels().add(literalStringValueExprMetaModel.valuePropertyMetaModel);
        moduleDeclarationMetaModel.annotationsPropertyMetaModel = new PropertyMetaModel(moduleDeclarationMetaModel, "annotations", com.github.javaparser.ast.expr.AnnotationExpr.class, Optional.of(annotationExprMetaModel), false, false, true, false);
        moduleDeclarationMetaModel.getDeclaredPropertyMetaModels().add(moduleDeclarationMetaModel.annotationsPropertyMetaModel);
        moduleDeclarationMetaModel.directivesPropertyMetaModel = new PropertyMetaModel(moduleDeclarationMetaModel, "directives", com.github.javaparser.ast.modules.ModuleDirective.class, Optional.of(moduleDirectiveMetaModel), false, false, true, false);
        moduleDeclarationMetaModel.getDeclaredPropertyMetaModels().add(moduleDeclarationMetaModel.directivesPropertyMetaModel);
        moduleDeclarationMetaModel.isOpenPropertyMetaModel = new PropertyMetaModel(moduleDeclarationMetaModel, "isOpen", boolean.class, Optional.empty(), false, false, false, false);
        moduleDeclarationMetaModel.getDeclaredPropertyMetaModels().add(moduleDeclarationMetaModel.isOpenPropertyMetaModel);
        moduleDeclarationMetaModel.namePropertyMetaModel = new PropertyMetaModel(moduleDeclarationMetaModel, "name", com.github.javaparser.ast.expr.Name.class, Optional.of(nameMetaModel), false, false, false, false);
        moduleDeclarationMetaModel.getDeclaredPropertyMetaModels().add(moduleDeclarationMetaModel.namePropertyMetaModel);
        arrayCreationLevelMetaModel.annotationsPropertyMetaModel = new PropertyMetaModel(arrayCreationLevelMetaModel, "annotations", com.github.javaparser.ast.expr.AnnotationExpr.class, Optional.of(annotationExprMetaModel), false, false, true, false);
        arrayCreationLevelMetaModel.getDeclaredPropertyMetaModels().add(arrayCreationLevelMetaModel.annotationsPropertyMetaModel);
        arrayCreationLevelMetaModel.dimensionPropertyMetaModel = new PropertyMetaModel(arrayCreationLevelMetaModel, "dimension", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), true, false, false, false);
        arrayCreationLevelMetaModel.getDeclaredPropertyMetaModels().add(arrayCreationLevelMetaModel.dimensionPropertyMetaModel);
        compilationUnitMetaModel.importsPropertyMetaModel = new PropertyMetaModel(compilationUnitMetaModel, "imports", com.github.javaparser.ast.ImportDeclaration.class, Optional.of(importDeclarationMetaModel), false, false, true, false);
        compilationUnitMetaModel.getDeclaredPropertyMetaModels().add(compilationUnitMetaModel.importsPropertyMetaModel);
        compilationUnitMetaModel.modulePropertyMetaModel = new PropertyMetaModel(compilationUnitMetaModel, "module", com.github.javaparser.ast.modules.ModuleDeclaration.class, Optional.of(moduleDeclarationMetaModel), true, false, false, false);
        compilationUnitMetaModel.getDeclaredPropertyMetaModels().add(compilationUnitMetaModel.modulePropertyMetaModel);
        compilationUnitMetaModel.packageDeclarationPropertyMetaModel = new PropertyMetaModel(compilationUnitMetaModel, "packageDeclaration", com.github.javaparser.ast.PackageDeclaration.class, Optional.of(packageDeclarationMetaModel), true, false, false, false);
        compilationUnitMetaModel.getDeclaredPropertyMetaModels().add(compilationUnitMetaModel.packageDeclarationPropertyMetaModel);
        compilationUnitMetaModel.typesPropertyMetaModel = new PropertyMetaModel(compilationUnitMetaModel, "types", com.github.javaparser.ast.body.TypeDeclaration.class, Optional.of(typeDeclarationMetaModel), false, false, true, true);
        compilationUnitMetaModel.getDeclaredPropertyMetaModels().add(compilationUnitMetaModel.typesPropertyMetaModel);
        importDeclarationMetaModel.isAsteriskPropertyMetaModel = new PropertyMetaModel(importDeclarationMetaModel, "isAsterisk", boolean.class, Optional.empty(), false, false, false, false);
        importDeclarationMetaModel.getDeclaredPropertyMetaModels().add(importDeclarationMetaModel.isAsteriskPropertyMetaModel);
        importDeclarationMetaModel.isJmlModelPropertyMetaModel = new PropertyMetaModel(importDeclarationMetaModel, "isJmlModel", boolean.class, Optional.empty(), false, false, false, false);
        importDeclarationMetaModel.getDeclaredPropertyMetaModels().add(importDeclarationMetaModel.isJmlModelPropertyMetaModel);
        importDeclarationMetaModel.isStaticPropertyMetaModel = new PropertyMetaModel(importDeclarationMetaModel, "isStatic", boolean.class, Optional.empty(), false, false, false, false);
        importDeclarationMetaModel.getDeclaredPropertyMetaModels().add(importDeclarationMetaModel.isStaticPropertyMetaModel);
        importDeclarationMetaModel.namePropertyMetaModel = new PropertyMetaModel(importDeclarationMetaModel, "name", com.github.javaparser.ast.expr.Name.class, Optional.of(nameMetaModel), false, false, false, false);
        importDeclarationMetaModel.getDeclaredPropertyMetaModels().add(importDeclarationMetaModel.namePropertyMetaModel);
        modifierMetaModel.keywordPropertyMetaModel = new PropertyMetaModel(modifierMetaModel, "keyword", com.github.javaparser.ast.Modifier.Keyword.class, Optional.empty(), false, false, false, false);
        modifierMetaModel.getDeclaredPropertyMetaModels().add(modifierMetaModel.keywordPropertyMetaModel);
        packageDeclarationMetaModel.annotationsPropertyMetaModel = new PropertyMetaModel(packageDeclarationMetaModel, "annotations", com.github.javaparser.ast.expr.AnnotationExpr.class, Optional.of(annotationExprMetaModel), false, false, true, false);
        packageDeclarationMetaModel.getDeclaredPropertyMetaModels().add(packageDeclarationMetaModel.annotationsPropertyMetaModel);
        packageDeclarationMetaModel.namePropertyMetaModel = new PropertyMetaModel(packageDeclarationMetaModel, "name", com.github.javaparser.ast.expr.Name.class, Optional.of(nameMetaModel), false, false, false, false);
        packageDeclarationMetaModel.getDeclaredPropertyMetaModels().add(packageDeclarationMetaModel.namePropertyMetaModel);
        annotationMemberDeclarationMetaModel.defaultValuePropertyMetaModel = new PropertyMetaModel(annotationMemberDeclarationMetaModel, "defaultValue", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), true, false, false, false);
        annotationMemberDeclarationMetaModel.getDeclaredPropertyMetaModels().add(annotationMemberDeclarationMetaModel.defaultValuePropertyMetaModel);
        annotationMemberDeclarationMetaModel.modifiersPropertyMetaModel = new PropertyMetaModel(annotationMemberDeclarationMetaModel, "modifiers", com.github.javaparser.ast.Modifier.class, Optional.of(modifierMetaModel), false, false, true, false);
        annotationMemberDeclarationMetaModel.getDeclaredPropertyMetaModels().add(annotationMemberDeclarationMetaModel.modifiersPropertyMetaModel);
        annotationMemberDeclarationMetaModel.namePropertyMetaModel = new PropertyMetaModel(annotationMemberDeclarationMetaModel, "name", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        annotationMemberDeclarationMetaModel.getDeclaredPropertyMetaModels().add(annotationMemberDeclarationMetaModel.namePropertyMetaModel);
        annotationMemberDeclarationMetaModel.typePropertyMetaModel = new PropertyMetaModel(annotationMemberDeclarationMetaModel, "type", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), false, false, false, false);
        annotationMemberDeclarationMetaModel.getDeclaredPropertyMetaModels().add(annotationMemberDeclarationMetaModel.typePropertyMetaModel);
        classOrInterfaceDeclarationMetaModel.extendedTypesPropertyMetaModel = new PropertyMetaModel(classOrInterfaceDeclarationMetaModel, "extendedTypes", com.github.javaparser.ast.type.ClassOrInterfaceType.class, Optional.of(classOrInterfaceTypeMetaModel), false, false, true, false);
        classOrInterfaceDeclarationMetaModel.getDeclaredPropertyMetaModels().add(classOrInterfaceDeclarationMetaModel.extendedTypesPropertyMetaModel);
        classOrInterfaceDeclarationMetaModel.implementedTypesPropertyMetaModel = new PropertyMetaModel(classOrInterfaceDeclarationMetaModel, "implementedTypes", com.github.javaparser.ast.type.ClassOrInterfaceType.class, Optional.of(classOrInterfaceTypeMetaModel), false, false, true, false);
        classOrInterfaceDeclarationMetaModel.getDeclaredPropertyMetaModels().add(classOrInterfaceDeclarationMetaModel.implementedTypesPropertyMetaModel);
        classOrInterfaceDeclarationMetaModel.isInterfacePropertyMetaModel = new PropertyMetaModel(classOrInterfaceDeclarationMetaModel, "isInterface", boolean.class, Optional.empty(), false, false, false, false);
        classOrInterfaceDeclarationMetaModel.getDeclaredPropertyMetaModels().add(classOrInterfaceDeclarationMetaModel.isInterfacePropertyMetaModel);
        classOrInterfaceDeclarationMetaModel.permittedTypesPropertyMetaModel = new PropertyMetaModel(classOrInterfaceDeclarationMetaModel, "permittedTypes", com.github.javaparser.ast.type.ClassOrInterfaceType.class, Optional.of(classOrInterfaceTypeMetaModel), false, false, true, false);
        classOrInterfaceDeclarationMetaModel.getDeclaredPropertyMetaModels().add(classOrInterfaceDeclarationMetaModel.permittedTypesPropertyMetaModel);
        classOrInterfaceDeclarationMetaModel.typeParametersPropertyMetaModel = new PropertyMetaModel(classOrInterfaceDeclarationMetaModel, "typeParameters", com.github.javaparser.ast.type.TypeParameter.class, Optional.of(typeParameterMetaModel), false, false, true, false);
        classOrInterfaceDeclarationMetaModel.getDeclaredPropertyMetaModels().add(classOrInterfaceDeclarationMetaModel.typeParametersPropertyMetaModel);
        constructorDeclarationMetaModel.bodyPropertyMetaModel = new PropertyMetaModel(constructorDeclarationMetaModel, "body", com.github.javaparser.ast.stmt.BlockStmt.class, Optional.of(blockStmtMetaModel), false, false, false, false);
        constructorDeclarationMetaModel.getDeclaredPropertyMetaModels().add(constructorDeclarationMetaModel.bodyPropertyMetaModel);
        enumConstantDeclarationMetaModel.argumentsPropertyMetaModel = new PropertyMetaModel(enumConstantDeclarationMetaModel, "arguments", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, true, false);
        enumConstantDeclarationMetaModel.getDeclaredPropertyMetaModels().add(enumConstantDeclarationMetaModel.argumentsPropertyMetaModel);
        enumConstantDeclarationMetaModel.classBodyPropertyMetaModel = new PropertyMetaModel(enumConstantDeclarationMetaModel, "classBody", com.github.javaparser.ast.body.BodyDeclaration.class, Optional.of(bodyDeclarationMetaModel), false, false, true, true);
        enumConstantDeclarationMetaModel.getDeclaredPropertyMetaModels().add(enumConstantDeclarationMetaModel.classBodyPropertyMetaModel);
        enumConstantDeclarationMetaModel.namePropertyMetaModel = new PropertyMetaModel(enumConstantDeclarationMetaModel, "name", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        enumConstantDeclarationMetaModel.getDeclaredPropertyMetaModels().add(enumConstantDeclarationMetaModel.namePropertyMetaModel);
        enumDeclarationMetaModel.entriesPropertyMetaModel = new PropertyMetaModel(enumDeclarationMetaModel, "entries", com.github.javaparser.ast.body.EnumConstantDeclaration.class, Optional.of(enumConstantDeclarationMetaModel), false, false, true, false);
        enumDeclarationMetaModel.getDeclaredPropertyMetaModels().add(enumDeclarationMetaModel.entriesPropertyMetaModel);
        enumDeclarationMetaModel.implementedTypesPropertyMetaModel = new PropertyMetaModel(enumDeclarationMetaModel, "implementedTypes", com.github.javaparser.ast.type.ClassOrInterfaceType.class, Optional.of(classOrInterfaceTypeMetaModel), false, false, true, false);
        enumDeclarationMetaModel.getDeclaredPropertyMetaModels().add(enumDeclarationMetaModel.implementedTypesPropertyMetaModel);
        fieldDeclarationMetaModel.modifiersPropertyMetaModel = new PropertyMetaModel(fieldDeclarationMetaModel, "modifiers", com.github.javaparser.ast.Modifier.class, Optional.of(modifierMetaModel), false, false, true, false);
        fieldDeclarationMetaModel.getDeclaredPropertyMetaModels().add(fieldDeclarationMetaModel.modifiersPropertyMetaModel);
        fieldDeclarationMetaModel.variablesPropertyMetaModel = new PropertyMetaModel(fieldDeclarationMetaModel, "variables", com.github.javaparser.ast.body.VariableDeclarator.class, Optional.of(variableDeclaratorMetaModel), false, true, true, false);
        fieldDeclarationMetaModel.getDeclaredPropertyMetaModels().add(fieldDeclarationMetaModel.variablesPropertyMetaModel);
        fieldDeclarationMetaModel.maximumCommonTypePropertyMetaModel = new PropertyMetaModel(fieldDeclarationMetaModel, "maximumCommonType", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), true, false, false, false);
        fieldDeclarationMetaModel.getDerivedPropertyMetaModels().add(fieldDeclarationMetaModel.maximumCommonTypePropertyMetaModel);
        initializerDeclarationMetaModel.bodyPropertyMetaModel = new PropertyMetaModel(initializerDeclarationMetaModel, "body", com.github.javaparser.ast.stmt.BlockStmt.class, Optional.of(blockStmtMetaModel), false, false, false, false);
        initializerDeclarationMetaModel.getDeclaredPropertyMetaModels().add(initializerDeclarationMetaModel.bodyPropertyMetaModel);
        initializerDeclarationMetaModel.isStaticPropertyMetaModel = new PropertyMetaModel(initializerDeclarationMetaModel, "isStatic", boolean.class, Optional.empty(), false, false, false, false);
        initializerDeclarationMetaModel.getDeclaredPropertyMetaModels().add(initializerDeclarationMetaModel.isStaticPropertyMetaModel);
        methodDeclarationMetaModel.bodyPropertyMetaModel = new PropertyMetaModel(methodDeclarationMetaModel, "body", com.github.javaparser.ast.stmt.BlockStmt.class, Optional.of(blockStmtMetaModel), true, false, false, false);
        methodDeclarationMetaModel.getDeclaredPropertyMetaModels().add(methodDeclarationMetaModel.bodyPropertyMetaModel);
        methodDeclarationMetaModel.typePropertyMetaModel = new PropertyMetaModel(methodDeclarationMetaModel, "type", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), false, false, false, false);
        methodDeclarationMetaModel.getDeclaredPropertyMetaModels().add(methodDeclarationMetaModel.typePropertyMetaModel);
        parameterMetaModel.annotationsPropertyMetaModel = new PropertyMetaModel(parameterMetaModel, "annotations", com.github.javaparser.ast.expr.AnnotationExpr.class, Optional.of(annotationExprMetaModel), false, false, true, false);
        parameterMetaModel.getDeclaredPropertyMetaModels().add(parameterMetaModel.annotationsPropertyMetaModel);
        parameterMetaModel.isVarArgsPropertyMetaModel = new PropertyMetaModel(parameterMetaModel, "isVarArgs", boolean.class, Optional.empty(), false, false, false, false);
        parameterMetaModel.getDeclaredPropertyMetaModels().add(parameterMetaModel.isVarArgsPropertyMetaModel);
        parameterMetaModel.modifiersPropertyMetaModel = new PropertyMetaModel(parameterMetaModel, "modifiers", com.github.javaparser.ast.Modifier.class, Optional.of(modifierMetaModel), false, false, true, false);
        parameterMetaModel.getDeclaredPropertyMetaModels().add(parameterMetaModel.modifiersPropertyMetaModel);
        parameterMetaModel.namePropertyMetaModel = new PropertyMetaModel(parameterMetaModel, "name", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        parameterMetaModel.getDeclaredPropertyMetaModels().add(parameterMetaModel.namePropertyMetaModel);
        parameterMetaModel.typePropertyMetaModel = new PropertyMetaModel(parameterMetaModel, "type", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), false, false, false, false);
        parameterMetaModel.getDeclaredPropertyMetaModels().add(parameterMetaModel.typePropertyMetaModel);
        parameterMetaModel.varArgsAnnotationsPropertyMetaModel = new PropertyMetaModel(parameterMetaModel, "varArgsAnnotations", com.github.javaparser.ast.expr.AnnotationExpr.class, Optional.of(annotationExprMetaModel), false, false, true, false);
        parameterMetaModel.getDeclaredPropertyMetaModels().add(parameterMetaModel.varArgsAnnotationsPropertyMetaModel);
        receiverParameterMetaModel.annotationsPropertyMetaModel = new PropertyMetaModel(receiverParameterMetaModel, "annotations", com.github.javaparser.ast.expr.AnnotationExpr.class, Optional.of(annotationExprMetaModel), false, false, true, false);
        receiverParameterMetaModel.getDeclaredPropertyMetaModels().add(receiverParameterMetaModel.annotationsPropertyMetaModel);
        receiverParameterMetaModel.namePropertyMetaModel = new PropertyMetaModel(receiverParameterMetaModel, "name", com.github.javaparser.ast.expr.Name.class, Optional.of(nameMetaModel), false, false, false, false);
        receiverParameterMetaModel.getDeclaredPropertyMetaModels().add(receiverParameterMetaModel.namePropertyMetaModel);
        receiverParameterMetaModel.typePropertyMetaModel = new PropertyMetaModel(receiverParameterMetaModel, "type", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), false, false, false, false);
        receiverParameterMetaModel.getDeclaredPropertyMetaModels().add(receiverParameterMetaModel.typePropertyMetaModel);
        recordDeclarationMetaModel.implementedTypesPropertyMetaModel = new PropertyMetaModel(recordDeclarationMetaModel, "implementedTypes", com.github.javaparser.ast.type.ClassOrInterfaceType.class, Optional.of(classOrInterfaceTypeMetaModel), false, false, true, false);
        recordDeclarationMetaModel.getDeclaredPropertyMetaModels().add(recordDeclarationMetaModel.implementedTypesPropertyMetaModel);
        recordDeclarationMetaModel.parametersPropertyMetaModel = new PropertyMetaModel(recordDeclarationMetaModel, "parameters", com.github.javaparser.ast.body.Parameter.class, Optional.of(parameterMetaModel), false, false, true, false);
        recordDeclarationMetaModel.getDeclaredPropertyMetaModels().add(recordDeclarationMetaModel.parametersPropertyMetaModel);
        recordDeclarationMetaModel.receiverParameterPropertyMetaModel = new PropertyMetaModel(recordDeclarationMetaModel, "receiverParameter", com.github.javaparser.ast.body.ReceiverParameter.class, Optional.of(receiverParameterMetaModel), true, false, false, false);
        recordDeclarationMetaModel.getDeclaredPropertyMetaModels().add(recordDeclarationMetaModel.receiverParameterPropertyMetaModel);
        recordDeclarationMetaModel.typeParametersPropertyMetaModel = new PropertyMetaModel(recordDeclarationMetaModel, "typeParameters", com.github.javaparser.ast.type.TypeParameter.class, Optional.of(typeParameterMetaModel), false, false, true, false);
        recordDeclarationMetaModel.getDeclaredPropertyMetaModels().add(recordDeclarationMetaModel.typeParametersPropertyMetaModel);
        compactConstructorDeclarationMetaModel.bodyPropertyMetaModel = new PropertyMetaModel(compactConstructorDeclarationMetaModel, "body", com.github.javaparser.ast.stmt.BlockStmt.class, Optional.of(blockStmtMetaModel), false, false, false, false);
        compactConstructorDeclarationMetaModel.getDeclaredPropertyMetaModels().add(compactConstructorDeclarationMetaModel.bodyPropertyMetaModel);
        compactConstructorDeclarationMetaModel.modifiersPropertyMetaModel = new PropertyMetaModel(compactConstructorDeclarationMetaModel, "modifiers", com.github.javaparser.ast.Modifier.class, Optional.of(modifierMetaModel), false, false, true, false);
        compactConstructorDeclarationMetaModel.getDeclaredPropertyMetaModels().add(compactConstructorDeclarationMetaModel.modifiersPropertyMetaModel);
        compactConstructorDeclarationMetaModel.namePropertyMetaModel = new PropertyMetaModel(compactConstructorDeclarationMetaModel, "name", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        compactConstructorDeclarationMetaModel.getDeclaredPropertyMetaModels().add(compactConstructorDeclarationMetaModel.namePropertyMetaModel);
        compactConstructorDeclarationMetaModel.thrownExceptionsPropertyMetaModel = new PropertyMetaModel(compactConstructorDeclarationMetaModel, "thrownExceptions", com.github.javaparser.ast.type.ReferenceType.class, Optional.of(referenceTypeMetaModel), false, false, true, false);
        compactConstructorDeclarationMetaModel.getDeclaredPropertyMetaModels().add(compactConstructorDeclarationMetaModel.thrownExceptionsPropertyMetaModel);
        compactConstructorDeclarationMetaModel.typeParametersPropertyMetaModel = new PropertyMetaModel(compactConstructorDeclarationMetaModel, "typeParameters", com.github.javaparser.ast.type.TypeParameter.class, Optional.of(typeParameterMetaModel), false, false, true, false);
        compactConstructorDeclarationMetaModel.getDeclaredPropertyMetaModels().add(compactConstructorDeclarationMetaModel.typeParametersPropertyMetaModel);
        variableDeclaratorMetaModel.initializerPropertyMetaModel = new PropertyMetaModel(variableDeclaratorMetaModel, "initializer", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), true, true, false, false);
        variableDeclaratorMetaModel.getDeclaredPropertyMetaModels().add(variableDeclaratorMetaModel.initializerPropertyMetaModel);
        variableDeclaratorMetaModel.namePropertyMetaModel = new PropertyMetaModel(variableDeclaratorMetaModel, "name", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        variableDeclaratorMetaModel.getDeclaredPropertyMetaModels().add(variableDeclaratorMetaModel.namePropertyMetaModel);
        variableDeclaratorMetaModel.typePropertyMetaModel = new PropertyMetaModel(variableDeclaratorMetaModel, "type", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), false, false, false, false);
        variableDeclaratorMetaModel.getDeclaredPropertyMetaModels().add(variableDeclaratorMetaModel.typePropertyMetaModel);
        commentMetaModel.contentPropertyMetaModel = new PropertyMetaModel(commentMetaModel, "content", java.lang.String.class, Optional.empty(), false, false, false, false);
        commentMetaModel.getDeclaredPropertyMetaModels().add(commentMetaModel.contentPropertyMetaModel);
        arrayAccessExprMetaModel.indexPropertyMetaModel = new PropertyMetaModel(arrayAccessExprMetaModel, "index", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        arrayAccessExprMetaModel.getDeclaredPropertyMetaModels().add(arrayAccessExprMetaModel.indexPropertyMetaModel);
        arrayAccessExprMetaModel.namePropertyMetaModel = new PropertyMetaModel(arrayAccessExprMetaModel, "name", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        arrayAccessExprMetaModel.getDeclaredPropertyMetaModels().add(arrayAccessExprMetaModel.namePropertyMetaModel);
        arrayCreationExprMetaModel.elementTypePropertyMetaModel = new PropertyMetaModel(arrayCreationExprMetaModel, "elementType", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), false, false, false, false);
        arrayCreationExprMetaModel.getDeclaredPropertyMetaModels().add(arrayCreationExprMetaModel.elementTypePropertyMetaModel);
        arrayCreationExprMetaModel.initializerPropertyMetaModel = new PropertyMetaModel(arrayCreationExprMetaModel, "initializer", com.github.javaparser.ast.expr.ArrayInitializerExpr.class, Optional.of(arrayInitializerExprMetaModel), true, false, false, false);
        arrayCreationExprMetaModel.getDeclaredPropertyMetaModels().add(arrayCreationExprMetaModel.initializerPropertyMetaModel);
        arrayCreationExprMetaModel.levelsPropertyMetaModel = new PropertyMetaModel(arrayCreationExprMetaModel, "levels", com.github.javaparser.ast.ArrayCreationLevel.class, Optional.of(arrayCreationLevelMetaModel), false, true, true, false);
        arrayCreationExprMetaModel.getDeclaredPropertyMetaModels().add(arrayCreationExprMetaModel.levelsPropertyMetaModel);
        arrayInitializerExprMetaModel.valuesPropertyMetaModel = new PropertyMetaModel(arrayInitializerExprMetaModel, "values", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, true, false);
        arrayInitializerExprMetaModel.getDeclaredPropertyMetaModels().add(arrayInitializerExprMetaModel.valuesPropertyMetaModel);
        assignExprMetaModel.operatorPropertyMetaModel = new PropertyMetaModel(assignExprMetaModel, "operator", com.github.javaparser.ast.expr.AssignExpr.Operator.class, Optional.empty(), false, false, false, false);
        assignExprMetaModel.getDeclaredPropertyMetaModels().add(assignExprMetaModel.operatorPropertyMetaModel);
        assignExprMetaModel.targetPropertyMetaModel = new PropertyMetaModel(assignExprMetaModel, "target", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        assignExprMetaModel.getDeclaredPropertyMetaModels().add(assignExprMetaModel.targetPropertyMetaModel);
        assignExprMetaModel.valuePropertyMetaModel = new PropertyMetaModel(assignExprMetaModel, "value", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        assignExprMetaModel.getDeclaredPropertyMetaModels().add(assignExprMetaModel.valuePropertyMetaModel);
        binaryExprMetaModel.leftPropertyMetaModel = new PropertyMetaModel(binaryExprMetaModel, "left", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        binaryExprMetaModel.getDeclaredPropertyMetaModels().add(binaryExprMetaModel.leftPropertyMetaModel);
        binaryExprMetaModel.operatorPropertyMetaModel = new PropertyMetaModel(binaryExprMetaModel, "operator", com.github.javaparser.ast.expr.BinaryExpr.Operator.class, Optional.empty(), false, false, false, false);
        binaryExprMetaModel.getDeclaredPropertyMetaModels().add(binaryExprMetaModel.operatorPropertyMetaModel);
        binaryExprMetaModel.rightPropertyMetaModel = new PropertyMetaModel(binaryExprMetaModel, "right", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        binaryExprMetaModel.getDeclaredPropertyMetaModels().add(binaryExprMetaModel.rightPropertyMetaModel);
        booleanLiteralExprMetaModel.valuePropertyMetaModel = new PropertyMetaModel(booleanLiteralExprMetaModel, "value", boolean.class, Optional.empty(), false, false, false, false);
        booleanLiteralExprMetaModel.getDeclaredPropertyMetaModels().add(booleanLiteralExprMetaModel.valuePropertyMetaModel);
        castExprMetaModel.expressionPropertyMetaModel = new PropertyMetaModel(castExprMetaModel, "expression", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        castExprMetaModel.getDeclaredPropertyMetaModels().add(castExprMetaModel.expressionPropertyMetaModel);
        castExprMetaModel.typePropertyMetaModel = new PropertyMetaModel(castExprMetaModel, "type", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), false, false, false, false);
        castExprMetaModel.getDeclaredPropertyMetaModels().add(castExprMetaModel.typePropertyMetaModel);
        classExprMetaModel.typePropertyMetaModel = new PropertyMetaModel(classExprMetaModel, "type", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), false, false, false, false);
        classExprMetaModel.getDeclaredPropertyMetaModels().add(classExprMetaModel.typePropertyMetaModel);
        conditionalExprMetaModel.conditionPropertyMetaModel = new PropertyMetaModel(conditionalExprMetaModel, "condition", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        conditionalExprMetaModel.getDeclaredPropertyMetaModels().add(conditionalExprMetaModel.conditionPropertyMetaModel);
        conditionalExprMetaModel.elseExprPropertyMetaModel = new PropertyMetaModel(conditionalExprMetaModel, "elseExpr", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        conditionalExprMetaModel.getDeclaredPropertyMetaModels().add(conditionalExprMetaModel.elseExprPropertyMetaModel);
        conditionalExprMetaModel.thenExprPropertyMetaModel = new PropertyMetaModel(conditionalExprMetaModel, "thenExpr", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        conditionalExprMetaModel.getDeclaredPropertyMetaModels().add(conditionalExprMetaModel.thenExprPropertyMetaModel);
        enclosedExprMetaModel.innerPropertyMetaModel = new PropertyMetaModel(enclosedExprMetaModel, "inner", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        enclosedExprMetaModel.getDeclaredPropertyMetaModels().add(enclosedExprMetaModel.innerPropertyMetaModel);
        fieldAccessExprMetaModel.namePropertyMetaModel = new PropertyMetaModel(fieldAccessExprMetaModel, "name", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        fieldAccessExprMetaModel.getDeclaredPropertyMetaModels().add(fieldAccessExprMetaModel.namePropertyMetaModel);
        fieldAccessExprMetaModel.scopePropertyMetaModel = new PropertyMetaModel(fieldAccessExprMetaModel, "scope", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        fieldAccessExprMetaModel.getDeclaredPropertyMetaModels().add(fieldAccessExprMetaModel.scopePropertyMetaModel);
        fieldAccessExprMetaModel.typeArgumentsPropertyMetaModel = new PropertyMetaModel(fieldAccessExprMetaModel, "typeArguments", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), true, false, true, false);
        fieldAccessExprMetaModel.getDeclaredPropertyMetaModels().add(fieldAccessExprMetaModel.typeArgumentsPropertyMetaModel);
        fieldAccessExprMetaModel.usingDiamondOperatorPropertyMetaModel = new PropertyMetaModel(fieldAccessExprMetaModel, "usingDiamondOperator", boolean.class, Optional.empty(), false, false, false, false);
        fieldAccessExprMetaModel.getDerivedPropertyMetaModels().add(fieldAccessExprMetaModel.usingDiamondOperatorPropertyMetaModel);
        instanceOfExprMetaModel.expressionPropertyMetaModel = new PropertyMetaModel(instanceOfExprMetaModel, "expression", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        instanceOfExprMetaModel.getDeclaredPropertyMetaModels().add(instanceOfExprMetaModel.expressionPropertyMetaModel);
        instanceOfExprMetaModel.patternPropertyMetaModel = new PropertyMetaModel(instanceOfExprMetaModel, "pattern", com.github.javaparser.ast.expr.PatternExpr.class, Optional.of(patternExprMetaModel), true, false, false, false);
        instanceOfExprMetaModel.getDeclaredPropertyMetaModels().add(instanceOfExprMetaModel.patternPropertyMetaModel);
        instanceOfExprMetaModel.typePropertyMetaModel = new PropertyMetaModel(instanceOfExprMetaModel, "type", com.github.javaparser.ast.type.ReferenceType.class, Optional.of(referenceTypeMetaModel), false, false, false, false);
        instanceOfExprMetaModel.getDeclaredPropertyMetaModels().add(instanceOfExprMetaModel.typePropertyMetaModel);
        lambdaExprMetaModel.bodyPropertyMetaModel = new PropertyMetaModel(lambdaExprMetaModel, "body", com.github.javaparser.ast.stmt.Statement.class, Optional.of(statementMetaModel), false, false, false, false);
        lambdaExprMetaModel.getDeclaredPropertyMetaModels().add(lambdaExprMetaModel.bodyPropertyMetaModel);
        lambdaExprMetaModel.contractsPropertyMetaModel = new PropertyMetaModel(lambdaExprMetaModel, "contracts", com.github.javaparser.ast.jml.clauses.JmlContract.class, Optional.of(jmlContractMetaModel), false, false, true, false);
        lambdaExprMetaModel.getDeclaredPropertyMetaModels().add(lambdaExprMetaModel.contractsPropertyMetaModel);
        lambdaExprMetaModel.isEnclosingParametersPropertyMetaModel = new PropertyMetaModel(lambdaExprMetaModel, "isEnclosingParameters", boolean.class, Optional.empty(), false, false, false, false);
        lambdaExprMetaModel.getDeclaredPropertyMetaModels().add(lambdaExprMetaModel.isEnclosingParametersPropertyMetaModel);
        lambdaExprMetaModel.parametersPropertyMetaModel = new PropertyMetaModel(lambdaExprMetaModel, "parameters", com.github.javaparser.ast.body.Parameter.class, Optional.of(parameterMetaModel), false, false, true, false);
        lambdaExprMetaModel.getDeclaredPropertyMetaModels().add(lambdaExprMetaModel.parametersPropertyMetaModel);
        lambdaExprMetaModel.expressionBodyPropertyMetaModel = new PropertyMetaModel(lambdaExprMetaModel, "expressionBody", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), true, false, false, false);
        lambdaExprMetaModel.getDerivedPropertyMetaModels().add(lambdaExprMetaModel.expressionBodyPropertyMetaModel);
        memberValuePairMetaModel.namePropertyMetaModel = new PropertyMetaModel(memberValuePairMetaModel, "name", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        memberValuePairMetaModel.getDeclaredPropertyMetaModels().add(memberValuePairMetaModel.namePropertyMetaModel);
        memberValuePairMetaModel.valuePropertyMetaModel = new PropertyMetaModel(memberValuePairMetaModel, "value", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        memberValuePairMetaModel.getDeclaredPropertyMetaModels().add(memberValuePairMetaModel.valuePropertyMetaModel);
        methodCallExprMetaModel.argumentsPropertyMetaModel = new PropertyMetaModel(methodCallExprMetaModel, "arguments", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, true, false);
        methodCallExprMetaModel.getDeclaredPropertyMetaModels().add(methodCallExprMetaModel.argumentsPropertyMetaModel);
        methodCallExprMetaModel.namePropertyMetaModel = new PropertyMetaModel(methodCallExprMetaModel, "name", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        methodCallExprMetaModel.getDeclaredPropertyMetaModels().add(methodCallExprMetaModel.namePropertyMetaModel);
        methodCallExprMetaModel.scopePropertyMetaModel = new PropertyMetaModel(methodCallExprMetaModel, "scope", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), true, false, false, false);
        methodCallExprMetaModel.getDeclaredPropertyMetaModels().add(methodCallExprMetaModel.scopePropertyMetaModel);
        methodCallExprMetaModel.typeArgumentsPropertyMetaModel = new PropertyMetaModel(methodCallExprMetaModel, "typeArguments", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), true, false, true, false);
        methodCallExprMetaModel.getDeclaredPropertyMetaModels().add(methodCallExprMetaModel.typeArgumentsPropertyMetaModel);
        methodCallExprMetaModel.usingDiamondOperatorPropertyMetaModel = new PropertyMetaModel(methodCallExprMetaModel, "usingDiamondOperator", boolean.class, Optional.empty(), false, false, false, false);
        methodCallExprMetaModel.getDerivedPropertyMetaModels().add(methodCallExprMetaModel.usingDiamondOperatorPropertyMetaModel);
        methodReferenceExprMetaModel.identifierPropertyMetaModel = new PropertyMetaModel(methodReferenceExprMetaModel, "identifier", java.lang.String.class, Optional.empty(), false, true, false, false);
        methodReferenceExprMetaModel.getDeclaredPropertyMetaModels().add(methodReferenceExprMetaModel.identifierPropertyMetaModel);
        methodReferenceExprMetaModel.scopePropertyMetaModel = new PropertyMetaModel(methodReferenceExprMetaModel, "scope", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        methodReferenceExprMetaModel.getDeclaredPropertyMetaModels().add(methodReferenceExprMetaModel.scopePropertyMetaModel);
        methodReferenceExprMetaModel.typeArgumentsPropertyMetaModel = new PropertyMetaModel(methodReferenceExprMetaModel, "typeArguments", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), true, false, true, false);
        methodReferenceExprMetaModel.getDeclaredPropertyMetaModels().add(methodReferenceExprMetaModel.typeArgumentsPropertyMetaModel);
        methodReferenceExprMetaModel.usingDiamondOperatorPropertyMetaModel = new PropertyMetaModel(methodReferenceExprMetaModel, "usingDiamondOperator", boolean.class, Optional.empty(), false, false, false, false);
        methodReferenceExprMetaModel.getDerivedPropertyMetaModels().add(methodReferenceExprMetaModel.usingDiamondOperatorPropertyMetaModel);
        nameExprMetaModel.namePropertyMetaModel = new PropertyMetaModel(nameExprMetaModel, "name", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        nameExprMetaModel.getDeclaredPropertyMetaModels().add(nameExprMetaModel.namePropertyMetaModel);
        nameMetaModel.identifierPropertyMetaModel = new PropertyMetaModel(nameMetaModel, "identifier", java.lang.String.class, Optional.empty(), false, true, false, false);
        nameMetaModel.getDeclaredPropertyMetaModels().add(nameMetaModel.identifierPropertyMetaModel);
        nameMetaModel.qualifierPropertyMetaModel = new PropertyMetaModel(nameMetaModel, "qualifier", com.github.javaparser.ast.expr.Name.class, Optional.of(nameMetaModel), true, false, false, false);
        nameMetaModel.getDeclaredPropertyMetaModels().add(nameMetaModel.qualifierPropertyMetaModel);
        normalAnnotationExprMetaModel.pairsPropertyMetaModel = new PropertyMetaModel(normalAnnotationExprMetaModel, "pairs", com.github.javaparser.ast.expr.MemberValuePair.class, Optional.of(memberValuePairMetaModel), false, false, true, false);
        normalAnnotationExprMetaModel.getDeclaredPropertyMetaModels().add(normalAnnotationExprMetaModel.pairsPropertyMetaModel);
        objectCreationExprMetaModel.anonymousClassBodyPropertyMetaModel = new PropertyMetaModel(objectCreationExprMetaModel, "anonymousClassBody", com.github.javaparser.ast.body.BodyDeclaration.class, Optional.of(bodyDeclarationMetaModel), true, false, true, true);
        objectCreationExprMetaModel.getDeclaredPropertyMetaModels().add(objectCreationExprMetaModel.anonymousClassBodyPropertyMetaModel);
        objectCreationExprMetaModel.argumentsPropertyMetaModel = new PropertyMetaModel(objectCreationExprMetaModel, "arguments", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, true, false);
        objectCreationExprMetaModel.getDeclaredPropertyMetaModels().add(objectCreationExprMetaModel.argumentsPropertyMetaModel);
        objectCreationExprMetaModel.scopePropertyMetaModel = new PropertyMetaModel(objectCreationExprMetaModel, "scope", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), true, false, false, false);
        objectCreationExprMetaModel.getDeclaredPropertyMetaModels().add(objectCreationExprMetaModel.scopePropertyMetaModel);
        objectCreationExprMetaModel.typePropertyMetaModel = new PropertyMetaModel(objectCreationExprMetaModel, "type", com.github.javaparser.ast.type.ClassOrInterfaceType.class, Optional.of(classOrInterfaceTypeMetaModel), false, false, false, false);
        objectCreationExprMetaModel.getDeclaredPropertyMetaModels().add(objectCreationExprMetaModel.typePropertyMetaModel);
        objectCreationExprMetaModel.typeArgumentsPropertyMetaModel = new PropertyMetaModel(objectCreationExprMetaModel, "typeArguments", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), true, false, true, false);
        objectCreationExprMetaModel.getDeclaredPropertyMetaModels().add(objectCreationExprMetaModel.typeArgumentsPropertyMetaModel);
        objectCreationExprMetaModel.usingDiamondOperatorPropertyMetaModel = new PropertyMetaModel(objectCreationExprMetaModel, "usingDiamondOperator", boolean.class, Optional.empty(), false, false, false, false);
        objectCreationExprMetaModel.getDerivedPropertyMetaModels().add(objectCreationExprMetaModel.usingDiamondOperatorPropertyMetaModel);
        patternExprMetaModel.typePropertyMetaModel = new PropertyMetaModel(patternExprMetaModel, "type", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), false, false, false, false);
        patternExprMetaModel.getDeclaredPropertyMetaModels().add(patternExprMetaModel.typePropertyMetaModel);
        recordPatternExprMetaModel.modifiersPropertyMetaModel = new PropertyMetaModel(recordPatternExprMetaModel, "modifiers", com.github.javaparser.ast.Modifier.class, Optional.of(modifierMetaModel), false, false, true, false);
        recordPatternExprMetaModel.getDeclaredPropertyMetaModels().add(recordPatternExprMetaModel.modifiersPropertyMetaModel);
        recordPatternExprMetaModel.patternListPropertyMetaModel = new PropertyMetaModel(recordPatternExprMetaModel, "patternList", com.github.javaparser.ast.expr.PatternExpr.class, Optional.of(patternExprMetaModel), false, false, true, false);
        recordPatternExprMetaModel.getDeclaredPropertyMetaModels().add(recordPatternExprMetaModel.patternListPropertyMetaModel);
        singleMemberAnnotationExprMetaModel.memberValuePropertyMetaModel = new PropertyMetaModel(singleMemberAnnotationExprMetaModel, "memberValue", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        singleMemberAnnotationExprMetaModel.getDeclaredPropertyMetaModels().add(singleMemberAnnotationExprMetaModel.memberValuePropertyMetaModel);
        simpleNameMetaModel.identifierPropertyMetaModel = new PropertyMetaModel(simpleNameMetaModel, "identifier", java.lang.String.class, Optional.empty(), false, true, false, false);
        simpleNameMetaModel.getDeclaredPropertyMetaModels().add(simpleNameMetaModel.identifierPropertyMetaModel);
        superExprMetaModel.typeNamePropertyMetaModel = new PropertyMetaModel(superExprMetaModel, "typeName", com.github.javaparser.ast.expr.Name.class, Optional.of(nameMetaModel), true, false, false, false);
        superExprMetaModel.getDeclaredPropertyMetaModels().add(superExprMetaModel.typeNamePropertyMetaModel);
        switchExprMetaModel.entriesPropertyMetaModel = new PropertyMetaModel(switchExprMetaModel, "entries", com.github.javaparser.ast.stmt.SwitchEntry.class, Optional.of(switchEntryMetaModel), false, false, true, false);
        switchExprMetaModel.getDeclaredPropertyMetaModels().add(switchExprMetaModel.entriesPropertyMetaModel);
        switchExprMetaModel.selectorPropertyMetaModel = new PropertyMetaModel(switchExprMetaModel, "selector", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        switchExprMetaModel.getDeclaredPropertyMetaModels().add(switchExprMetaModel.selectorPropertyMetaModel);
        thisExprMetaModel.typeNamePropertyMetaModel = new PropertyMetaModel(thisExprMetaModel, "typeName", com.github.javaparser.ast.expr.Name.class, Optional.of(nameMetaModel), true, false, false, false);
        thisExprMetaModel.getDeclaredPropertyMetaModels().add(thisExprMetaModel.typeNamePropertyMetaModel);
        typeExprMetaModel.typePropertyMetaModel = new PropertyMetaModel(typeExprMetaModel, "type", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), false, false, false, false);
        typeExprMetaModel.getDeclaredPropertyMetaModels().add(typeExprMetaModel.typePropertyMetaModel);
        typePatternExprMetaModel.modifiersPropertyMetaModel = new PropertyMetaModel(typePatternExprMetaModel, "modifiers", com.github.javaparser.ast.Modifier.class, Optional.of(modifierMetaModel), false, false, true, false);
        typePatternExprMetaModel.getDeclaredPropertyMetaModels().add(typePatternExprMetaModel.modifiersPropertyMetaModel);
        typePatternExprMetaModel.namePropertyMetaModel = new PropertyMetaModel(typePatternExprMetaModel, "name", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        typePatternExprMetaModel.getDeclaredPropertyMetaModels().add(typePatternExprMetaModel.namePropertyMetaModel);
        unaryExprMetaModel.expressionPropertyMetaModel = new PropertyMetaModel(unaryExprMetaModel, "expression", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        unaryExprMetaModel.getDeclaredPropertyMetaModels().add(unaryExprMetaModel.expressionPropertyMetaModel);
        unaryExprMetaModel.operatorPropertyMetaModel = new PropertyMetaModel(unaryExprMetaModel, "operator", com.github.javaparser.ast.expr.UnaryExpr.Operator.class, Optional.empty(), false, false, false, false);
        unaryExprMetaModel.getDeclaredPropertyMetaModels().add(unaryExprMetaModel.operatorPropertyMetaModel);
        unaryExprMetaModel.postfixPropertyMetaModel = new PropertyMetaModel(unaryExprMetaModel, "postfix", boolean.class, Optional.empty(), false, false, false, false);
        unaryExprMetaModel.getDerivedPropertyMetaModels().add(unaryExprMetaModel.postfixPropertyMetaModel);
        unaryExprMetaModel.prefixPropertyMetaModel = new PropertyMetaModel(unaryExprMetaModel, "prefix", boolean.class, Optional.empty(), false, false, false, false);
        unaryExprMetaModel.getDerivedPropertyMetaModels().add(unaryExprMetaModel.prefixPropertyMetaModel);
        variableDeclarationExprMetaModel.annotationsPropertyMetaModel = new PropertyMetaModel(variableDeclarationExprMetaModel, "annotations", com.github.javaparser.ast.expr.AnnotationExpr.class, Optional.of(annotationExprMetaModel), false, false, true, false);
        variableDeclarationExprMetaModel.getDeclaredPropertyMetaModels().add(variableDeclarationExprMetaModel.annotationsPropertyMetaModel);
        variableDeclarationExprMetaModel.modifiersPropertyMetaModel = new PropertyMetaModel(variableDeclarationExprMetaModel, "modifiers", com.github.javaparser.ast.Modifier.class, Optional.of(modifierMetaModel), false, false, true, false);
        variableDeclarationExprMetaModel.getDeclaredPropertyMetaModels().add(variableDeclarationExprMetaModel.modifiersPropertyMetaModel);
        variableDeclarationExprMetaModel.variablesPropertyMetaModel = new PropertyMetaModel(variableDeclarationExprMetaModel, "variables", com.github.javaparser.ast.body.VariableDeclarator.class, Optional.of(variableDeclaratorMetaModel), false, true, true, false);
        variableDeclarationExprMetaModel.getDeclaredPropertyMetaModels().add(variableDeclarationExprMetaModel.variablesPropertyMetaModel);
        variableDeclarationExprMetaModel.maximumCommonTypePropertyMetaModel = new PropertyMetaModel(variableDeclarationExprMetaModel, "maximumCommonType", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), true, false, false, false);
        variableDeclarationExprMetaModel.getDerivedPropertyMetaModels().add(variableDeclarationExprMetaModel.maximumCommonTypePropertyMetaModel);
        jmlDocMetaModel.contentPropertyMetaModel = new PropertyMetaModel(jmlDocMetaModel, "content", com.github.javaparser.JavaToken.class, Optional.empty(), false, false, false, false);
        jmlDocMetaModel.getDeclaredPropertyMetaModels().add(jmlDocMetaModel.contentPropertyMetaModel);
        jmlDocDeclarationMetaModel.jmlCommentsPropertyMetaModel = new PropertyMetaModel(jmlDocDeclarationMetaModel, "jmlComments", com.github.javaparser.ast.jml.doc.JmlDoc.class, Optional.of(jmlDocMetaModel), false, false, true, false);
        jmlDocDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlDocDeclarationMetaModel.jmlCommentsPropertyMetaModel);
        jmlDocStmtMetaModel.jmlCommentsPropertyMetaModel = new PropertyMetaModel(jmlDocStmtMetaModel, "jmlComments", com.github.javaparser.ast.jml.doc.JmlDoc.class, Optional.of(jmlDocMetaModel), false, false, true, false);
        jmlDocStmtMetaModel.getDeclaredPropertyMetaModels().add(jmlDocStmtMetaModel.jmlCommentsPropertyMetaModel);
        jmlDocTypeMetaModel.jmlCommentsPropertyMetaModel = new PropertyMetaModel(jmlDocTypeMetaModel, "jmlComments", com.github.javaparser.ast.jml.doc.JmlDoc.class, Optional.of(jmlDocMetaModel), false, false, true, false);
        jmlDocTypeMetaModel.getDeclaredPropertyMetaModels().add(jmlDocTypeMetaModel.jmlCommentsPropertyMetaModel);
        jmlQuantifiedExprMetaModel.binderPropertyMetaModel = new PropertyMetaModel(jmlQuantifiedExprMetaModel, "binder", com.github.javaparser.ast.jml.expr.JmlQuantifiedExpr.JmlBinder.class, Optional.empty(), false, false, false, false);
        jmlQuantifiedExprMetaModel.getDeclaredPropertyMetaModels().add(jmlQuantifiedExprMetaModel.binderPropertyMetaModel);
        jmlQuantifiedExprMetaModel.expressionsPropertyMetaModel = new PropertyMetaModel(jmlQuantifiedExprMetaModel, "expressions", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, true, true, false);
        jmlQuantifiedExprMetaModel.getDeclaredPropertyMetaModels().add(jmlQuantifiedExprMetaModel.expressionsPropertyMetaModel);
        jmlQuantifiedExprMetaModel.variablesPropertyMetaModel = new PropertyMetaModel(jmlQuantifiedExprMetaModel, "variables", com.github.javaparser.ast.body.Parameter.class, Optional.of(parameterMetaModel), false, true, true, false);
        jmlQuantifiedExprMetaModel.getDeclaredPropertyMetaModels().add(jmlQuantifiedExprMetaModel.variablesPropertyMetaModel);
        jmlTypeExprMetaModel.typePropertyMetaModel = new PropertyMetaModel(jmlTypeExprMetaModel, "type", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), false, false, false, false);
        jmlTypeExprMetaModel.getDeclaredPropertyMetaModels().add(jmlTypeExprMetaModel.typePropertyMetaModel);
        jmlBinaryInfixExprMetaModel.leftPropertyMetaModel = new PropertyMetaModel(jmlBinaryInfixExprMetaModel, "left", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        jmlBinaryInfixExprMetaModel.getDeclaredPropertyMetaModels().add(jmlBinaryInfixExprMetaModel.leftPropertyMetaModel);
        jmlBinaryInfixExprMetaModel.operatorPropertyMetaModel = new PropertyMetaModel(jmlBinaryInfixExprMetaModel, "operator", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        jmlBinaryInfixExprMetaModel.getDeclaredPropertyMetaModels().add(jmlBinaryInfixExprMetaModel.operatorPropertyMetaModel);
        jmlBinaryInfixExprMetaModel.rightPropertyMetaModel = new PropertyMetaModel(jmlBinaryInfixExprMetaModel, "right", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        jmlBinaryInfixExprMetaModel.getDeclaredPropertyMetaModels().add(jmlBinaryInfixExprMetaModel.rightPropertyMetaModel);
        jmlLetExprMetaModel.bodyPropertyMetaModel = new PropertyMetaModel(jmlLetExprMetaModel, "body", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        jmlLetExprMetaModel.getDeclaredPropertyMetaModels().add(jmlLetExprMetaModel.bodyPropertyMetaModel);
        jmlLetExprMetaModel.variablesPropertyMetaModel = new PropertyMetaModel(jmlLetExprMetaModel, "variables", com.github.javaparser.ast.expr.VariableDeclarationExpr.class, Optional.of(variableDeclarationExprMetaModel), false, false, false, false);
        jmlLetExprMetaModel.getDeclaredPropertyMetaModels().add(jmlLetExprMetaModel.variablesPropertyMetaModel);
        jmlMultiCompareExprMetaModel.expressionsPropertyMetaModel = new PropertyMetaModel(jmlMultiCompareExprMetaModel, "expressions", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, true, true, false);
        jmlMultiCompareExprMetaModel.getDeclaredPropertyMetaModels().add(jmlMultiCompareExprMetaModel.expressionsPropertyMetaModel);
        jmlMultiCompareExprMetaModel.operatorsPropertyMetaModel = new PropertyMetaModel(jmlMultiCompareExprMetaModel, "operators", com.github.javaparser.ast.jml.expr.JmlMultiCompareExpr.Operators.class, Optional.empty(), false, false, false, false);
        jmlMultiCompareExprMetaModel.getDeclaredPropertyMetaModels().add(jmlMultiCompareExprMetaModel.operatorsPropertyMetaModel);
        jmlLabelExprMetaModel.expressionPropertyMetaModel = new PropertyMetaModel(jmlLabelExprMetaModel, "expression", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        jmlLabelExprMetaModel.getDeclaredPropertyMetaModels().add(jmlLabelExprMetaModel.expressionPropertyMetaModel);
        jmlLabelExprMetaModel.kindPropertyMetaModel = new PropertyMetaModel(jmlLabelExprMetaModel, "kind", com.github.javaparser.ast.jml.expr.JmlLabelExpr.Kind.class, Optional.empty(), false, false, false, false);
        jmlLabelExprMetaModel.getDeclaredPropertyMetaModels().add(jmlLabelExprMetaModel.kindPropertyMetaModel);
        jmlLabelExprMetaModel.labelPropertyMetaModel = new PropertyMetaModel(jmlLabelExprMetaModel, "label", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        jmlLabelExprMetaModel.getDeclaredPropertyMetaModels().add(jmlLabelExprMetaModel.labelPropertyMetaModel);
        jmlSetComprehensionExprMetaModel.bindingPropertyMetaModel = new PropertyMetaModel(jmlSetComprehensionExprMetaModel, "binding", com.github.javaparser.ast.body.VariableDeclarator.class, Optional.of(variableDeclaratorMetaModel), false, false, false, false);
        jmlSetComprehensionExprMetaModel.getDeclaredPropertyMetaModels().add(jmlSetComprehensionExprMetaModel.bindingPropertyMetaModel);
        jmlSetComprehensionExprMetaModel.predicatePropertyMetaModel = new PropertyMetaModel(jmlSetComprehensionExprMetaModel, "predicate", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        jmlSetComprehensionExprMetaModel.getDeclaredPropertyMetaModels().add(jmlSetComprehensionExprMetaModel.predicatePropertyMetaModel);
        assertStmtMetaModel.checkPropertyMetaModel = new PropertyMetaModel(assertStmtMetaModel, "check", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        assertStmtMetaModel.getDeclaredPropertyMetaModels().add(assertStmtMetaModel.checkPropertyMetaModel);
        assertStmtMetaModel.messagePropertyMetaModel = new PropertyMetaModel(assertStmtMetaModel, "message", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), true, false, false, false);
        assertStmtMetaModel.getDeclaredPropertyMetaModels().add(assertStmtMetaModel.messagePropertyMetaModel);
        blockStmtMetaModel.contractsPropertyMetaModel = new PropertyMetaModel(blockStmtMetaModel, "contracts", com.github.javaparser.ast.jml.clauses.JmlContract.class, Optional.of(jmlContractMetaModel), false, false, true, false);
        blockStmtMetaModel.getDeclaredPropertyMetaModels().add(blockStmtMetaModel.contractsPropertyMetaModel);
        blockStmtMetaModel.statementsPropertyMetaModel = new PropertyMetaModel(blockStmtMetaModel, "statements", com.github.javaparser.ast.stmt.Statement.class, Optional.of(statementMetaModel), false, false, true, false);
        blockStmtMetaModel.getDeclaredPropertyMetaModels().add(blockStmtMetaModel.statementsPropertyMetaModel);
        breakStmtMetaModel.labelPropertyMetaModel = new PropertyMetaModel(breakStmtMetaModel, "label", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), true, false, false, false);
        breakStmtMetaModel.getDeclaredPropertyMetaModels().add(breakStmtMetaModel.labelPropertyMetaModel);
        catchClauseMetaModel.bodyPropertyMetaModel = new PropertyMetaModel(catchClauseMetaModel, "body", com.github.javaparser.ast.stmt.BlockStmt.class, Optional.of(blockStmtMetaModel), false, false, false, false);
        catchClauseMetaModel.getDeclaredPropertyMetaModels().add(catchClauseMetaModel.bodyPropertyMetaModel);
        catchClauseMetaModel.parameterPropertyMetaModel = new PropertyMetaModel(catchClauseMetaModel, "parameter", com.github.javaparser.ast.body.Parameter.class, Optional.of(parameterMetaModel), false, false, false, false);
        catchClauseMetaModel.getDeclaredPropertyMetaModels().add(catchClauseMetaModel.parameterPropertyMetaModel);
        continueStmtMetaModel.labelPropertyMetaModel = new PropertyMetaModel(continueStmtMetaModel, "label", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), true, false, false, false);
        continueStmtMetaModel.getDeclaredPropertyMetaModels().add(continueStmtMetaModel.labelPropertyMetaModel);
        doStmtMetaModel.bodyPropertyMetaModel = new PropertyMetaModel(doStmtMetaModel, "body", com.github.javaparser.ast.stmt.Statement.class, Optional.of(statementMetaModel), false, false, false, false);
        doStmtMetaModel.getDeclaredPropertyMetaModels().add(doStmtMetaModel.bodyPropertyMetaModel);
        doStmtMetaModel.conditionPropertyMetaModel = new PropertyMetaModel(doStmtMetaModel, "condition", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        doStmtMetaModel.getDeclaredPropertyMetaModels().add(doStmtMetaModel.conditionPropertyMetaModel);
        doStmtMetaModel.contractsPropertyMetaModel = new PropertyMetaModel(doStmtMetaModel, "contracts", com.github.javaparser.ast.jml.clauses.JmlContract.class, Optional.of(jmlContractMetaModel), false, false, true, false);
        doStmtMetaModel.getDeclaredPropertyMetaModels().add(doStmtMetaModel.contractsPropertyMetaModel);
        explicitConstructorInvocationStmtMetaModel.argumentsPropertyMetaModel = new PropertyMetaModel(explicitConstructorInvocationStmtMetaModel, "arguments", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, true, false);
        explicitConstructorInvocationStmtMetaModel.getDeclaredPropertyMetaModels().add(explicitConstructorInvocationStmtMetaModel.argumentsPropertyMetaModel);
        explicitConstructorInvocationStmtMetaModel.expressionPropertyMetaModel = new PropertyMetaModel(explicitConstructorInvocationStmtMetaModel, "expression", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), true, false, false, false);
        explicitConstructorInvocationStmtMetaModel.getDeclaredPropertyMetaModels().add(explicitConstructorInvocationStmtMetaModel.expressionPropertyMetaModel);
        explicitConstructorInvocationStmtMetaModel.isThisPropertyMetaModel = new PropertyMetaModel(explicitConstructorInvocationStmtMetaModel, "isThis", boolean.class, Optional.empty(), false, false, false, false);
        explicitConstructorInvocationStmtMetaModel.getDeclaredPropertyMetaModels().add(explicitConstructorInvocationStmtMetaModel.isThisPropertyMetaModel);
        explicitConstructorInvocationStmtMetaModel.typeArgumentsPropertyMetaModel = new PropertyMetaModel(explicitConstructorInvocationStmtMetaModel, "typeArguments", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), true, false, true, false);
        explicitConstructorInvocationStmtMetaModel.getDeclaredPropertyMetaModels().add(explicitConstructorInvocationStmtMetaModel.typeArgumentsPropertyMetaModel);
        explicitConstructorInvocationStmtMetaModel.usingDiamondOperatorPropertyMetaModel = new PropertyMetaModel(explicitConstructorInvocationStmtMetaModel, "usingDiamondOperator", boolean.class, Optional.empty(), false, false, false, false);
        explicitConstructorInvocationStmtMetaModel.getDerivedPropertyMetaModels().add(explicitConstructorInvocationStmtMetaModel.usingDiamondOperatorPropertyMetaModel);
        expressionStmtMetaModel.expressionPropertyMetaModel = new PropertyMetaModel(expressionStmtMetaModel, "expression", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        expressionStmtMetaModel.getDeclaredPropertyMetaModels().add(expressionStmtMetaModel.expressionPropertyMetaModel);
        forEachStmtMetaModel.bodyPropertyMetaModel = new PropertyMetaModel(forEachStmtMetaModel, "body", com.github.javaparser.ast.stmt.Statement.class, Optional.of(statementMetaModel), false, false, false, false);
        forEachStmtMetaModel.getDeclaredPropertyMetaModels().add(forEachStmtMetaModel.bodyPropertyMetaModel);
        forEachStmtMetaModel.contractsPropertyMetaModel = new PropertyMetaModel(forEachStmtMetaModel, "contracts", com.github.javaparser.ast.jml.clauses.JmlContract.class, Optional.of(jmlContractMetaModel), false, false, true, false);
        forEachStmtMetaModel.getDeclaredPropertyMetaModels().add(forEachStmtMetaModel.contractsPropertyMetaModel);
        forEachStmtMetaModel.iterablePropertyMetaModel = new PropertyMetaModel(forEachStmtMetaModel, "iterable", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        forEachStmtMetaModel.getDeclaredPropertyMetaModels().add(forEachStmtMetaModel.iterablePropertyMetaModel);
        forEachStmtMetaModel.variablePropertyMetaModel = new PropertyMetaModel(forEachStmtMetaModel, "variable", com.github.javaparser.ast.expr.VariableDeclarationExpr.class, Optional.of(variableDeclarationExprMetaModel), false, false, false, false);
        forEachStmtMetaModel.getDeclaredPropertyMetaModels().add(forEachStmtMetaModel.variablePropertyMetaModel);
        forStmtMetaModel.bodyPropertyMetaModel = new PropertyMetaModel(forStmtMetaModel, "body", com.github.javaparser.ast.stmt.Statement.class, Optional.of(statementMetaModel), false, false, false, false);
        forStmtMetaModel.getDeclaredPropertyMetaModels().add(forStmtMetaModel.bodyPropertyMetaModel);
        forStmtMetaModel.comparePropertyMetaModel = new PropertyMetaModel(forStmtMetaModel, "compare", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), true, false, false, false);
        forStmtMetaModel.getDeclaredPropertyMetaModels().add(forStmtMetaModel.comparePropertyMetaModel);
        forStmtMetaModel.contractsPropertyMetaModel = new PropertyMetaModel(forStmtMetaModel, "contracts", com.github.javaparser.ast.jml.clauses.JmlContract.class, Optional.of(jmlContractMetaModel), false, false, true, false);
        forStmtMetaModel.getDeclaredPropertyMetaModels().add(forStmtMetaModel.contractsPropertyMetaModel);
        forStmtMetaModel.initializationPropertyMetaModel = new PropertyMetaModel(forStmtMetaModel, "initialization", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, true, false);
        forStmtMetaModel.getDeclaredPropertyMetaModels().add(forStmtMetaModel.initializationPropertyMetaModel);
        forStmtMetaModel.updatePropertyMetaModel = new PropertyMetaModel(forStmtMetaModel, "update", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, true, false);
        forStmtMetaModel.getDeclaredPropertyMetaModels().add(forStmtMetaModel.updatePropertyMetaModel);
        ifStmtMetaModel.conditionPropertyMetaModel = new PropertyMetaModel(ifStmtMetaModel, "condition", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        ifStmtMetaModel.getDeclaredPropertyMetaModels().add(ifStmtMetaModel.conditionPropertyMetaModel);
        ifStmtMetaModel.elseStmtPropertyMetaModel = new PropertyMetaModel(ifStmtMetaModel, "elseStmt", com.github.javaparser.ast.stmt.Statement.class, Optional.of(statementMetaModel), true, false, false, false);
        ifStmtMetaModel.getDeclaredPropertyMetaModels().add(ifStmtMetaModel.elseStmtPropertyMetaModel);
        ifStmtMetaModel.thenStmtPropertyMetaModel = new PropertyMetaModel(ifStmtMetaModel, "thenStmt", com.github.javaparser.ast.stmt.Statement.class, Optional.of(statementMetaModel), false, false, false, false);
        ifStmtMetaModel.getDeclaredPropertyMetaModels().add(ifStmtMetaModel.thenStmtPropertyMetaModel);
        ifStmtMetaModel.cascadingIfStmtPropertyMetaModel = new PropertyMetaModel(ifStmtMetaModel, "cascadingIfStmt", boolean.class, Optional.empty(), false, false, false, false);
        ifStmtMetaModel.getDerivedPropertyMetaModels().add(ifStmtMetaModel.cascadingIfStmtPropertyMetaModel);
        ifStmtMetaModel.elseBlockPropertyMetaModel = new PropertyMetaModel(ifStmtMetaModel, "elseBlock", boolean.class, Optional.empty(), false, false, false, false);
        ifStmtMetaModel.getDerivedPropertyMetaModels().add(ifStmtMetaModel.elseBlockPropertyMetaModel);
        ifStmtMetaModel.elseBranchPropertyMetaModel = new PropertyMetaModel(ifStmtMetaModel, "elseBranch", boolean.class, Optional.empty(), false, false, false, false);
        ifStmtMetaModel.getDerivedPropertyMetaModels().add(ifStmtMetaModel.elseBranchPropertyMetaModel);
        ifStmtMetaModel.thenBlockPropertyMetaModel = new PropertyMetaModel(ifStmtMetaModel, "thenBlock", boolean.class, Optional.empty(), false, false, false, false);
        ifStmtMetaModel.getDerivedPropertyMetaModels().add(ifStmtMetaModel.thenBlockPropertyMetaModel);
        labeledStmtMetaModel.labelPropertyMetaModel = new PropertyMetaModel(labeledStmtMetaModel, "label", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        labeledStmtMetaModel.getDeclaredPropertyMetaModels().add(labeledStmtMetaModel.labelPropertyMetaModel);
        labeledStmtMetaModel.statementPropertyMetaModel = new PropertyMetaModel(labeledStmtMetaModel, "statement", com.github.javaparser.ast.stmt.Statement.class, Optional.of(statementMetaModel), false, false, false, false);
        labeledStmtMetaModel.getDeclaredPropertyMetaModels().add(labeledStmtMetaModel.statementPropertyMetaModel);
        localClassDeclarationStmtMetaModel.classDeclarationPropertyMetaModel = new PropertyMetaModel(localClassDeclarationStmtMetaModel, "classDeclaration", com.github.javaparser.ast.body.ClassOrInterfaceDeclaration.class, Optional.of(classOrInterfaceDeclarationMetaModel), false, false, false, false);
        localClassDeclarationStmtMetaModel.getDeclaredPropertyMetaModels().add(localClassDeclarationStmtMetaModel.classDeclarationPropertyMetaModel);
        localRecordDeclarationStmtMetaModel.recordDeclarationPropertyMetaModel = new PropertyMetaModel(localRecordDeclarationStmtMetaModel, "recordDeclaration", com.github.javaparser.ast.body.RecordDeclaration.class, Optional.of(recordDeclarationMetaModel), false, false, false, false);
        localRecordDeclarationStmtMetaModel.getDeclaredPropertyMetaModels().add(localRecordDeclarationStmtMetaModel.recordDeclarationPropertyMetaModel);
        returnStmtMetaModel.expressionPropertyMetaModel = new PropertyMetaModel(returnStmtMetaModel, "expression", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), true, false, false, false);
        returnStmtMetaModel.getDeclaredPropertyMetaModels().add(returnStmtMetaModel.expressionPropertyMetaModel);
        switchEntryMetaModel.guardPropertyMetaModel = new PropertyMetaModel(switchEntryMetaModel, "guard", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), true, false, false, false);
        switchEntryMetaModel.getDeclaredPropertyMetaModels().add(switchEntryMetaModel.guardPropertyMetaModel);
        switchEntryMetaModel.isDefaultPropertyMetaModel = new PropertyMetaModel(switchEntryMetaModel, "isDefault", boolean.class, Optional.empty(), false, false, false, false);
        switchEntryMetaModel.getDeclaredPropertyMetaModels().add(switchEntryMetaModel.isDefaultPropertyMetaModel);
        switchEntryMetaModel.labelsPropertyMetaModel = new PropertyMetaModel(switchEntryMetaModel, "labels", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, true, false);
        switchEntryMetaModel.getDeclaredPropertyMetaModels().add(switchEntryMetaModel.labelsPropertyMetaModel);
        switchEntryMetaModel.statementsPropertyMetaModel = new PropertyMetaModel(switchEntryMetaModel, "statements", com.github.javaparser.ast.stmt.Statement.class, Optional.of(statementMetaModel), false, false, true, false);
        switchEntryMetaModel.getDeclaredPropertyMetaModels().add(switchEntryMetaModel.statementsPropertyMetaModel);
        switchEntryMetaModel.typePropertyMetaModel = new PropertyMetaModel(switchEntryMetaModel, "type", com.github.javaparser.ast.stmt.SwitchEntry.Type.class, Optional.empty(), false, false, false, false);
        switchEntryMetaModel.getDeclaredPropertyMetaModels().add(switchEntryMetaModel.typePropertyMetaModel);
        switchEntryMetaModel.switchStatementEntryPropertyMetaModel = new PropertyMetaModel(switchEntryMetaModel, "switchStatementEntry", boolean.class, Optional.empty(), false, false, false, false);
        switchEntryMetaModel.getDerivedPropertyMetaModels().add(switchEntryMetaModel.switchStatementEntryPropertyMetaModel);
        switchStmtMetaModel.entriesPropertyMetaModel = new PropertyMetaModel(switchStmtMetaModel, "entries", com.github.javaparser.ast.stmt.SwitchEntry.class, Optional.of(switchEntryMetaModel), false, false, true, false);
        switchStmtMetaModel.getDeclaredPropertyMetaModels().add(switchStmtMetaModel.entriesPropertyMetaModel);
        switchStmtMetaModel.selectorPropertyMetaModel = new PropertyMetaModel(switchStmtMetaModel, "selector", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        switchStmtMetaModel.getDeclaredPropertyMetaModels().add(switchStmtMetaModel.selectorPropertyMetaModel);
        synchronizedStmtMetaModel.bodyPropertyMetaModel = new PropertyMetaModel(synchronizedStmtMetaModel, "body", com.github.javaparser.ast.stmt.BlockStmt.class, Optional.of(blockStmtMetaModel), false, false, false, false);
        synchronizedStmtMetaModel.getDeclaredPropertyMetaModels().add(synchronizedStmtMetaModel.bodyPropertyMetaModel);
        synchronizedStmtMetaModel.expressionPropertyMetaModel = new PropertyMetaModel(synchronizedStmtMetaModel, "expression", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        synchronizedStmtMetaModel.getDeclaredPropertyMetaModels().add(synchronizedStmtMetaModel.expressionPropertyMetaModel);
        throwStmtMetaModel.expressionPropertyMetaModel = new PropertyMetaModel(throwStmtMetaModel, "expression", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        throwStmtMetaModel.getDeclaredPropertyMetaModels().add(throwStmtMetaModel.expressionPropertyMetaModel);
        tryStmtMetaModel.catchClausesPropertyMetaModel = new PropertyMetaModel(tryStmtMetaModel, "catchClauses", com.github.javaparser.ast.stmt.CatchClause.class, Optional.of(catchClauseMetaModel), false, false, true, false);
        tryStmtMetaModel.getDeclaredPropertyMetaModels().add(tryStmtMetaModel.catchClausesPropertyMetaModel);
        tryStmtMetaModel.finallyBlockPropertyMetaModel = new PropertyMetaModel(tryStmtMetaModel, "finallyBlock", com.github.javaparser.ast.stmt.BlockStmt.class, Optional.of(blockStmtMetaModel), true, false, false, false);
        tryStmtMetaModel.getDeclaredPropertyMetaModels().add(tryStmtMetaModel.finallyBlockPropertyMetaModel);
        tryStmtMetaModel.resourcesPropertyMetaModel = new PropertyMetaModel(tryStmtMetaModel, "resources", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, true, false);
        tryStmtMetaModel.getDeclaredPropertyMetaModels().add(tryStmtMetaModel.resourcesPropertyMetaModel);
        tryStmtMetaModel.tryBlockPropertyMetaModel = new PropertyMetaModel(tryStmtMetaModel, "tryBlock", com.github.javaparser.ast.stmt.BlockStmt.class, Optional.of(blockStmtMetaModel), false, false, false, false);
        tryStmtMetaModel.getDeclaredPropertyMetaModels().add(tryStmtMetaModel.tryBlockPropertyMetaModel);
        whileStmtMetaModel.bodyPropertyMetaModel = new PropertyMetaModel(whileStmtMetaModel, "body", com.github.javaparser.ast.stmt.Statement.class, Optional.of(statementMetaModel), false, false, false, false);
        whileStmtMetaModel.getDeclaredPropertyMetaModels().add(whileStmtMetaModel.bodyPropertyMetaModel);
        whileStmtMetaModel.conditionPropertyMetaModel = new PropertyMetaModel(whileStmtMetaModel, "condition", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        whileStmtMetaModel.getDeclaredPropertyMetaModels().add(whileStmtMetaModel.conditionPropertyMetaModel);
        whileStmtMetaModel.contractsPropertyMetaModel = new PropertyMetaModel(whileStmtMetaModel, "contracts", com.github.javaparser.ast.jml.clauses.JmlContract.class, Optional.of(jmlContractMetaModel), false, false, true, false);
        whileStmtMetaModel.getDeclaredPropertyMetaModels().add(whileStmtMetaModel.contractsPropertyMetaModel);
        yieldStmtMetaModel.expressionPropertyMetaModel = new PropertyMetaModel(yieldStmtMetaModel, "expression", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        yieldStmtMetaModel.getDeclaredPropertyMetaModels().add(yieldStmtMetaModel.expressionPropertyMetaModel);
        jmlGhostStmtMetaModel.jmlTagsPropertyMetaModel = new PropertyMetaModel(jmlGhostStmtMetaModel, "jmlTags", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, true, false);
        jmlGhostStmtMetaModel.getDeclaredPropertyMetaModels().add(jmlGhostStmtMetaModel.jmlTagsPropertyMetaModel);
        jmlGhostStmtMetaModel.statementPropertyMetaModel = new PropertyMetaModel(jmlGhostStmtMetaModel, "statement", com.github.javaparser.ast.stmt.Statement.class, Optional.of(statementMetaModel), false, false, false, false);
        jmlGhostStmtMetaModel.getDeclaredPropertyMetaModels().add(jmlGhostStmtMetaModel.statementPropertyMetaModel);
        jmlExpressionStmtMetaModel.expressionPropertyMetaModel = new PropertyMetaModel(jmlExpressionStmtMetaModel, "expression", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        jmlExpressionStmtMetaModel.getDeclaredPropertyMetaModels().add(jmlExpressionStmtMetaModel.expressionPropertyMetaModel);
        jmlExpressionStmtMetaModel.jmlTagsPropertyMetaModel = new PropertyMetaModel(jmlExpressionStmtMetaModel, "jmlTags", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, true, false);
        jmlExpressionStmtMetaModel.getDeclaredPropertyMetaModels().add(jmlExpressionStmtMetaModel.jmlTagsPropertyMetaModel);
        jmlExpressionStmtMetaModel.kindPropertyMetaModel = new PropertyMetaModel(jmlExpressionStmtMetaModel, "kind", com.github.javaparser.ast.jml.stmt.JmlExpressionStmt.JmlStmtKind.class, Optional.empty(), false, false, false, false);
        jmlExpressionStmtMetaModel.getDeclaredPropertyMetaModels().add(jmlExpressionStmtMetaModel.kindPropertyMetaModel);
        jmlRefiningStmtMetaModel.jmlTagsPropertyMetaModel = new PropertyMetaModel(jmlRefiningStmtMetaModel, "jmlTags", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, true, false);
        jmlRefiningStmtMetaModel.getDeclaredPropertyMetaModels().add(jmlRefiningStmtMetaModel.jmlTagsPropertyMetaModel);
        jmlUnreachableStmtMetaModel.jmlTagsPropertyMetaModel = new PropertyMetaModel(jmlUnreachableStmtMetaModel, "jmlTags", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, true, false);
        jmlUnreachableStmtMetaModel.getDeclaredPropertyMetaModels().add(jmlUnreachableStmtMetaModel.jmlTagsPropertyMetaModel);
        jmlLabelStmtMetaModel.jmlTagsPropertyMetaModel = new PropertyMetaModel(jmlLabelStmtMetaModel, "jmlTags", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, true, false);
        jmlLabelStmtMetaModel.getDeclaredPropertyMetaModels().add(jmlLabelStmtMetaModel.jmlTagsPropertyMetaModel);
        jmlLabelStmtMetaModel.labelPropertyMetaModel = new PropertyMetaModel(jmlLabelStmtMetaModel, "label", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        jmlLabelStmtMetaModel.getDeclaredPropertyMetaModels().add(jmlLabelStmtMetaModel.labelPropertyMetaModel);
        jmlBeginStmtMetaModel.jmlTagsPropertyMetaModel = new PropertyMetaModel(jmlBeginStmtMetaModel, "jmlTags", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, true, false);
        jmlBeginStmtMetaModel.getDeclaredPropertyMetaModels().add(jmlBeginStmtMetaModel.jmlTagsPropertyMetaModel);
        jmlEndStmtMetaModel.jmlTagsPropertyMetaModel = new PropertyMetaModel(jmlEndStmtMetaModel, "jmlTags", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, true, false);
        jmlEndStmtMetaModel.getDeclaredPropertyMetaModels().add(jmlEndStmtMetaModel.jmlTagsPropertyMetaModel);
        jmlMethodDeclarationMetaModel.contractPropertyMetaModel = new PropertyMetaModel(jmlMethodDeclarationMetaModel, "contract", com.github.javaparser.ast.jml.clauses.JmlContract.class, Optional.of(jmlContractMetaModel), true, false, false, false);
        jmlMethodDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlMethodDeclarationMetaModel.contractPropertyMetaModel);
        jmlMethodDeclarationMetaModel.jmlTagsPropertyMetaModel = new PropertyMetaModel(jmlMethodDeclarationMetaModel, "jmlTags", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, true, false);
        jmlMethodDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlMethodDeclarationMetaModel.jmlTagsPropertyMetaModel);
        jmlMethodDeclarationMetaModel.methodDeclarationPropertyMetaModel = new PropertyMetaModel(jmlMethodDeclarationMetaModel, "methodDeclaration", com.github.javaparser.ast.body.MethodDeclaration.class, Optional.of(methodDeclarationMetaModel), false, false, false, false);
        jmlMethodDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlMethodDeclarationMetaModel.methodDeclarationPropertyMetaModel);
        jmlFieldDeclarationMetaModel.declPropertyMetaModel = new PropertyMetaModel(jmlFieldDeclarationMetaModel, "decl", com.github.javaparser.ast.body.FieldDeclaration.class, Optional.of(fieldDeclarationMetaModel), false, false, false, false);
        jmlFieldDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlFieldDeclarationMetaModel.declPropertyMetaModel);
        jmlFieldDeclarationMetaModel.jmlTagsPropertyMetaModel = new PropertyMetaModel(jmlFieldDeclarationMetaModel, "jmlTags", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, true, false);
        jmlFieldDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlFieldDeclarationMetaModel.jmlTagsPropertyMetaModel);
        jmlClauseMetaModel.namePropertyMetaModel = new PropertyMetaModel(jmlClauseMetaModel, "name", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), true, false, false, false);
        jmlClauseMetaModel.getDeclaredPropertyMetaModels().add(jmlClauseMetaModel.namePropertyMetaModel);
        jmlSimpleExprClauseMetaModel.expressionPropertyMetaModel = new PropertyMetaModel(jmlSimpleExprClauseMetaModel, "expression", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        jmlSimpleExprClauseMetaModel.getDeclaredPropertyMetaModels().add(jmlSimpleExprClauseMetaModel.expressionPropertyMetaModel);
        jmlSimpleExprClauseMetaModel.heapsPropertyMetaModel = new PropertyMetaModel(jmlSimpleExprClauseMetaModel, "heaps", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), true, false, true, false);
        jmlSimpleExprClauseMetaModel.getDeclaredPropertyMetaModels().add(jmlSimpleExprClauseMetaModel.heapsPropertyMetaModel);
        jmlSimpleExprClauseMetaModel.kindPropertyMetaModel = new PropertyMetaModel(jmlSimpleExprClauseMetaModel, "kind", com.github.javaparser.ast.jml.clauses.JmlClauseKind.class, Optional.empty(), false, false, false, false);
        jmlSimpleExprClauseMetaModel.getDeclaredPropertyMetaModels().add(jmlSimpleExprClauseMetaModel.kindPropertyMetaModel);
        jmlMultiExprClauseMetaModel.expressionsPropertyMetaModel = new PropertyMetaModel(jmlMultiExprClauseMetaModel, "expressions", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, true, false);
        jmlMultiExprClauseMetaModel.getDeclaredPropertyMetaModels().add(jmlMultiExprClauseMetaModel.expressionsPropertyMetaModel);
        jmlMultiExprClauseMetaModel.heapsPropertyMetaModel = new PropertyMetaModel(jmlMultiExprClauseMetaModel, "heaps", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), true, false, true, false);
        jmlMultiExprClauseMetaModel.getDeclaredPropertyMetaModels().add(jmlMultiExprClauseMetaModel.heapsPropertyMetaModel);
        jmlMultiExprClauseMetaModel.kindPropertyMetaModel = new PropertyMetaModel(jmlMultiExprClauseMetaModel, "kind", com.github.javaparser.ast.jml.clauses.JmlClauseKind.class, Optional.empty(), false, false, false, false);
        jmlMultiExprClauseMetaModel.getDeclaredPropertyMetaModels().add(jmlMultiExprClauseMetaModel.kindPropertyMetaModel);
        jmlSignalsClauseMetaModel.expressionPropertyMetaModel = new PropertyMetaModel(jmlSignalsClauseMetaModel, "expression", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        jmlSignalsClauseMetaModel.getDeclaredPropertyMetaModels().add(jmlSignalsClauseMetaModel.expressionPropertyMetaModel);
        jmlSignalsClauseMetaModel.parameterPropertyMetaModel = new PropertyMetaModel(jmlSignalsClauseMetaModel, "parameter", com.github.javaparser.ast.body.Parameter.class, Optional.of(parameterMetaModel), false, false, false, false);
        jmlSignalsClauseMetaModel.getDeclaredPropertyMetaModels().add(jmlSignalsClauseMetaModel.parameterPropertyMetaModel);
        jmlSignalsOnlyClauseMetaModel.typesPropertyMetaModel = new PropertyMetaModel(jmlSignalsOnlyClauseMetaModel, "types", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), false, false, true, false);
        jmlSignalsOnlyClauseMetaModel.getDeclaredPropertyMetaModels().add(jmlSignalsOnlyClauseMetaModel.typesPropertyMetaModel);
        jmlClauseLabelMetaModel.exprPropertyMetaModel = new PropertyMetaModel(jmlClauseLabelMetaModel, "expr", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        jmlClauseLabelMetaModel.getDeclaredPropertyMetaModels().add(jmlClauseLabelMetaModel.exprPropertyMetaModel);
        jmlClauseLabelMetaModel.kindPropertyMetaModel = new PropertyMetaModel(jmlClauseLabelMetaModel, "kind", com.github.javaparser.ast.jml.clauses.JmlClauseKind.class, Optional.empty(), false, false, false, false);
        jmlClauseLabelMetaModel.getDeclaredPropertyMetaModels().add(jmlClauseLabelMetaModel.kindPropertyMetaModel);
        jmlClauseLabelMetaModel.labelPropertyMetaModel = new PropertyMetaModel(jmlClauseLabelMetaModel, "label", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), true, false, false, false);
        jmlClauseLabelMetaModel.getDeclaredPropertyMetaModels().add(jmlClauseLabelMetaModel.labelPropertyMetaModel);
        jmlForallClauseMetaModel.boundedVariablesPropertyMetaModel = new PropertyMetaModel(jmlForallClauseMetaModel, "boundedVariables", com.github.javaparser.ast.body.Parameter.class, Optional.of(parameterMetaModel), false, false, true, false);
        jmlForallClauseMetaModel.getDeclaredPropertyMetaModels().add(jmlForallClauseMetaModel.boundedVariablesPropertyMetaModel);
        jmlOldClauseMetaModel.declarationsPropertyMetaModel = new PropertyMetaModel(jmlOldClauseMetaModel, "declarations", com.github.javaparser.ast.expr.VariableDeclarationExpr.class, Optional.of(variableDeclarationExprMetaModel), false, false, false, false);
        jmlOldClauseMetaModel.getDeclaredPropertyMetaModels().add(jmlOldClauseMetaModel.declarationsPropertyMetaModel);
        jmlCallableClauseMetaModel.methodSignaturesPropertyMetaModel = new PropertyMetaModel(jmlCallableClauseMetaModel, "methodSignatures", com.github.javaparser.ast.jml.clauses.JmlMethodSignature.class, Optional.of(jmlMethodSignatureMetaModel), false, false, true, false);
        jmlCallableClauseMetaModel.getDeclaredPropertyMetaModels().add(jmlCallableClauseMetaModel.methodSignaturesPropertyMetaModel);
        jmlClauseIfMetaModel.conditionPropertyMetaModel = new PropertyMetaModel(jmlClauseIfMetaModel, "condition", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        jmlClauseIfMetaModel.getDeclaredPropertyMetaModels().add(jmlClauseIfMetaModel.conditionPropertyMetaModel);
        jmlClauseIfMetaModel.kindPropertyMetaModel = new PropertyMetaModel(jmlClauseIfMetaModel, "kind", com.github.javaparser.ast.jml.clauses.JmlClauseKind.class, Optional.empty(), false, false, false, false);
        jmlClauseIfMetaModel.getDeclaredPropertyMetaModels().add(jmlClauseIfMetaModel.kindPropertyMetaModel);
        jmlClauseIfMetaModel.thenPropertyMetaModel = new PropertyMetaModel(jmlClauseIfMetaModel, "then", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        jmlClauseIfMetaModel.getDeclaredPropertyMetaModels().add(jmlClauseIfMetaModel.thenPropertyMetaModel);
        jmlMethodSignatureMetaModel.argumentTypesPropertyMetaModel = new PropertyMetaModel(jmlMethodSignatureMetaModel, "argumentTypes", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), false, false, true, false);
        jmlMethodSignatureMetaModel.getDeclaredPropertyMetaModels().add(jmlMethodSignatureMetaModel.argumentTypesPropertyMetaModel);
        jmlMethodSignatureMetaModel.namePropertyMetaModel = new PropertyMetaModel(jmlMethodSignatureMetaModel, "name", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        jmlMethodSignatureMetaModel.getDeclaredPropertyMetaModels().add(jmlMethodSignatureMetaModel.namePropertyMetaModel);
        jmlMethodSignatureMetaModel.receiverPropertyMetaModel = new PropertyMetaModel(jmlMethodSignatureMetaModel, "receiver", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), true, false, false, false);
        jmlMethodSignatureMetaModel.getDeclaredPropertyMetaModels().add(jmlMethodSignatureMetaModel.receiverPropertyMetaModel);
        jmlContractMetaModel.behaviorPropertyMetaModel = new PropertyMetaModel(jmlContractMetaModel, "behavior", com.github.javaparser.ast.stmt.Behavior.class, Optional.empty(), false, false, false, false);
        jmlContractMetaModel.getDeclaredPropertyMetaModels().add(jmlContractMetaModel.behaviorPropertyMetaModel);
        jmlContractMetaModel.clausesPropertyMetaModel = new PropertyMetaModel(jmlContractMetaModel, "clauses", com.github.javaparser.ast.jml.clauses.JmlClause.class, Optional.of(jmlClauseMetaModel), false, false, true, false);
        jmlContractMetaModel.getDeclaredPropertyMetaModels().add(jmlContractMetaModel.clausesPropertyMetaModel);
        jmlContractMetaModel.jmlTagsPropertyMetaModel = new PropertyMetaModel(jmlContractMetaModel, "jmlTags", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, true, false);
        jmlContractMetaModel.getDeclaredPropertyMetaModels().add(jmlContractMetaModel.jmlTagsPropertyMetaModel);
        jmlContractMetaModel.modifiersPropertyMetaModel = new PropertyMetaModel(jmlContractMetaModel, "modifiers", com.github.javaparser.ast.Modifier.class, Optional.of(modifierMetaModel), false, false, true, false);
        jmlContractMetaModel.getDeclaredPropertyMetaModels().add(jmlContractMetaModel.modifiersPropertyMetaModel);
        jmlContractMetaModel.namePropertyMetaModel = new PropertyMetaModel(jmlContractMetaModel, "name", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), true, false, false, false);
        jmlContractMetaModel.getDeclaredPropertyMetaModels().add(jmlContractMetaModel.namePropertyMetaModel);
        jmlContractMetaModel.subContractsPropertyMetaModel = new PropertyMetaModel(jmlContractMetaModel, "subContracts", com.github.javaparser.ast.jml.clauses.JmlContract.class, Optional.of(jmlContractMetaModel), false, false, true, false);
        jmlContractMetaModel.getDeclaredPropertyMetaModels().add(jmlContractMetaModel.subContractsPropertyMetaModel);
        jmlContractMetaModel.typePropertyMetaModel = new PropertyMetaModel(jmlContractMetaModel, "type", com.github.javaparser.ast.jml.clauses.ContractType.class, Optional.empty(), false, false, false, false);
        jmlContractMetaModel.getDeclaredPropertyMetaModels().add(jmlContractMetaModel.typePropertyMetaModel);
        jmlClassExprDeclarationMetaModel.invariantPropertyMetaModel = new PropertyMetaModel(jmlClassExprDeclarationMetaModel, "invariant", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        jmlClassExprDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlClassExprDeclarationMetaModel.invariantPropertyMetaModel);
        jmlClassExprDeclarationMetaModel.jmlTagsPropertyMetaModel = new PropertyMetaModel(jmlClassExprDeclarationMetaModel, "jmlTags", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, true, false);
        jmlClassExprDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlClassExprDeclarationMetaModel.jmlTagsPropertyMetaModel);
        jmlClassExprDeclarationMetaModel.kindPropertyMetaModel = new PropertyMetaModel(jmlClassExprDeclarationMetaModel, "kind", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        jmlClassExprDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlClassExprDeclarationMetaModel.kindPropertyMetaModel);
        jmlClassExprDeclarationMetaModel.modifiersPropertyMetaModel = new PropertyMetaModel(jmlClassExprDeclarationMetaModel, "modifiers", com.github.javaparser.ast.Modifier.class, Optional.of(modifierMetaModel), false, false, true, false);
        jmlClassExprDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlClassExprDeclarationMetaModel.modifiersPropertyMetaModel);
        jmlClassExprDeclarationMetaModel.namePropertyMetaModel = new PropertyMetaModel(jmlClassExprDeclarationMetaModel, "name", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), true, false, false, false);
        jmlClassExprDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlClassExprDeclarationMetaModel.namePropertyMetaModel);
        jmlRepresentsDeclarationMetaModel.exprPropertyMetaModel = new PropertyMetaModel(jmlRepresentsDeclarationMetaModel, "expr", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        jmlRepresentsDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlRepresentsDeclarationMetaModel.exprPropertyMetaModel);
        jmlRepresentsDeclarationMetaModel.jmlTagsPropertyMetaModel = new PropertyMetaModel(jmlRepresentsDeclarationMetaModel, "jmlTags", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, true, false);
        jmlRepresentsDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlRepresentsDeclarationMetaModel.jmlTagsPropertyMetaModel);
        jmlRepresentsDeclarationMetaModel.modifiersPropertyMetaModel = new PropertyMetaModel(jmlRepresentsDeclarationMetaModel, "modifiers", com.github.javaparser.ast.Modifier.class, Optional.of(modifierMetaModel), false, false, true, false);
        jmlRepresentsDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlRepresentsDeclarationMetaModel.modifiersPropertyMetaModel);
        jmlRepresentsDeclarationMetaModel.namePropertyMetaModel = new PropertyMetaModel(jmlRepresentsDeclarationMetaModel, "name", com.github.javaparser.ast.expr.Name.class, Optional.of(nameMetaModel), false, false, false, false);
        jmlRepresentsDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlRepresentsDeclarationMetaModel.namePropertyMetaModel);
        jmlClassAccessibleDeclarationMetaModel.expressionsPropertyMetaModel = new PropertyMetaModel(jmlClassAccessibleDeclarationMetaModel, "expressions", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, true, false);
        jmlClassAccessibleDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlClassAccessibleDeclarationMetaModel.expressionsPropertyMetaModel);
        jmlClassAccessibleDeclarationMetaModel.jmlTagsPropertyMetaModel = new PropertyMetaModel(jmlClassAccessibleDeclarationMetaModel, "jmlTags", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, true, false);
        jmlClassAccessibleDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlClassAccessibleDeclarationMetaModel.jmlTagsPropertyMetaModel);
        jmlClassAccessibleDeclarationMetaModel.measuredByPropertyMetaModel = new PropertyMetaModel(jmlClassAccessibleDeclarationMetaModel, "measuredBy", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), true, false, false, false);
        jmlClassAccessibleDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlClassAccessibleDeclarationMetaModel.measuredByPropertyMetaModel);
        jmlClassAccessibleDeclarationMetaModel.modifiersPropertyMetaModel = new PropertyMetaModel(jmlClassAccessibleDeclarationMetaModel, "modifiers", com.github.javaparser.ast.Modifier.class, Optional.of(modifierMetaModel), false, false, true, false);
        jmlClassAccessibleDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlClassAccessibleDeclarationMetaModel.modifiersPropertyMetaModel);
        jmlClassAccessibleDeclarationMetaModel.variablePropertyMetaModel = new PropertyMetaModel(jmlClassAccessibleDeclarationMetaModel, "variable", com.github.javaparser.ast.expr.Expression.class, Optional.of(expressionMetaModel), false, false, false, false);
        jmlClassAccessibleDeclarationMetaModel.getDeclaredPropertyMetaModels().add(jmlClassAccessibleDeclarationMetaModel.variablePropertyMetaModel);
        arrayTypeMetaModel.componentTypePropertyMetaModel = new PropertyMetaModel(arrayTypeMetaModel, "componentType", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), false, false, false, false);
        arrayTypeMetaModel.getDeclaredPropertyMetaModels().add(arrayTypeMetaModel.componentTypePropertyMetaModel);
        arrayTypeMetaModel.originPropertyMetaModel = new PropertyMetaModel(arrayTypeMetaModel, "origin", com.github.javaparser.ast.type.ArrayType.Origin.class, Optional.empty(), false, false, false, false);
        arrayTypeMetaModel.getDeclaredPropertyMetaModels().add(arrayTypeMetaModel.originPropertyMetaModel);
        classOrInterfaceTypeMetaModel.namePropertyMetaModel = new PropertyMetaModel(classOrInterfaceTypeMetaModel, "name", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        classOrInterfaceTypeMetaModel.getDeclaredPropertyMetaModels().add(classOrInterfaceTypeMetaModel.namePropertyMetaModel);
        classOrInterfaceTypeMetaModel.scopePropertyMetaModel = new PropertyMetaModel(classOrInterfaceTypeMetaModel, "scope", com.github.javaparser.ast.type.ClassOrInterfaceType.class, Optional.of(classOrInterfaceTypeMetaModel), true, false, false, false);
        classOrInterfaceTypeMetaModel.getDeclaredPropertyMetaModels().add(classOrInterfaceTypeMetaModel.scopePropertyMetaModel);
        classOrInterfaceTypeMetaModel.typeArgumentsPropertyMetaModel = new PropertyMetaModel(classOrInterfaceTypeMetaModel, "typeArguments", com.github.javaparser.ast.type.Type.class, Optional.of(typeMetaModel), true, false, true, false);
        classOrInterfaceTypeMetaModel.getDeclaredPropertyMetaModels().add(classOrInterfaceTypeMetaModel.typeArgumentsPropertyMetaModel);
        classOrInterfaceTypeMetaModel.usingDiamondOperatorPropertyMetaModel = new PropertyMetaModel(classOrInterfaceTypeMetaModel, "usingDiamondOperator", boolean.class, Optional.empty(), false, false, false, false);
        classOrInterfaceTypeMetaModel.getDerivedPropertyMetaModels().add(classOrInterfaceTypeMetaModel.usingDiamondOperatorPropertyMetaModel);
        intersectionTypeMetaModel.elementsPropertyMetaModel = new PropertyMetaModel(intersectionTypeMetaModel, "elements", com.github.javaparser.ast.type.ReferenceType.class, Optional.of(referenceTypeMetaModel), false, true, true, false);
        intersectionTypeMetaModel.getDeclaredPropertyMetaModels().add(intersectionTypeMetaModel.elementsPropertyMetaModel);
        primitiveTypeMetaModel.typePropertyMetaModel = new PropertyMetaModel(primitiveTypeMetaModel, "type", com.github.javaparser.ast.type.PrimitiveType.Primitive.class, Optional.empty(), false, false, false, false);
        primitiveTypeMetaModel.getDeclaredPropertyMetaModels().add(primitiveTypeMetaModel.typePropertyMetaModel);
        typeParameterMetaModel.namePropertyMetaModel = new PropertyMetaModel(typeParameterMetaModel, "name", com.github.javaparser.ast.expr.SimpleName.class, Optional.of(simpleNameMetaModel), false, false, false, false);
        typeParameterMetaModel.getDeclaredPropertyMetaModels().add(typeParameterMetaModel.namePropertyMetaModel);
        typeParameterMetaModel.typeBoundPropertyMetaModel = new PropertyMetaModel(typeParameterMetaModel, "typeBound", com.github.javaparser.ast.type.ClassOrInterfaceType.class, Optional.of(classOrInterfaceTypeMetaModel), false, false, true, false);
        typeParameterMetaModel.getDeclaredPropertyMetaModels().add(typeParameterMetaModel.typeBoundPropertyMetaModel);
        unionTypeMetaModel.elementsPropertyMetaModel = new PropertyMetaModel(unionTypeMetaModel, "elements", com.github.javaparser.ast.type.ReferenceType.class, Optional.of(referenceTypeMetaModel), false, true, true, false);
        unionTypeMetaModel.getDeclaredPropertyMetaModels().add(unionTypeMetaModel.elementsPropertyMetaModel);
        wildcardTypeMetaModel.extendedTypePropertyMetaModel = new PropertyMetaModel(wildcardTypeMetaModel, "extendedType", com.github.javaparser.ast.type.ReferenceType.class, Optional.of(referenceTypeMetaModel), true, false, false, false);
        wildcardTypeMetaModel.getDeclaredPropertyMetaModels().add(wildcardTypeMetaModel.extendedTypePropertyMetaModel);
        wildcardTypeMetaModel.superTypePropertyMetaModel = new PropertyMetaModel(wildcardTypeMetaModel, "superType", com.github.javaparser.ast.type.ReferenceType.class, Optional.of(referenceTypeMetaModel), true, false, false, false);
        wildcardTypeMetaModel.getDeclaredPropertyMetaModels().add(wildcardTypeMetaModel.superTypePropertyMetaModel);
        moduleExportsDirectiveMetaModel.moduleNamesPropertyMetaModel = new PropertyMetaModel(moduleExportsDirectiveMetaModel, "moduleNames", com.github.javaparser.ast.expr.Name.class, Optional.of(nameMetaModel), false, false, true, false);
        moduleExportsDirectiveMetaModel.getDeclaredPropertyMetaModels().add(moduleExportsDirectiveMetaModel.moduleNamesPropertyMetaModel);
        moduleExportsDirectiveMetaModel.namePropertyMetaModel = new PropertyMetaModel(moduleExportsDirectiveMetaModel, "name", com.github.javaparser.ast.expr.Name.class, Optional.of(nameMetaModel), false, false, false, false);
        moduleExportsDirectiveMetaModel.getDeclaredPropertyMetaModels().add(moduleExportsDirectiveMetaModel.namePropertyMetaModel);
        moduleOpensDirectiveMetaModel.moduleNamesPropertyMetaModel = new PropertyMetaModel(moduleOpensDirectiveMetaModel, "moduleNames", com.github.javaparser.ast.expr.Name.class, Optional.of(nameMetaModel), false, false, true, false);
        moduleOpensDirectiveMetaModel.getDeclaredPropertyMetaModels().add(moduleOpensDirectiveMetaModel.moduleNamesPropertyMetaModel);
        moduleOpensDirectiveMetaModel.namePropertyMetaModel = new PropertyMetaModel(moduleOpensDirectiveMetaModel, "name", com.github.javaparser.ast.expr.Name.class, Optional.of(nameMetaModel), false, false, false, false);
        moduleOpensDirectiveMetaModel.getDeclaredPropertyMetaModels().add(moduleOpensDirectiveMetaModel.namePropertyMetaModel);
        moduleProvidesDirectiveMetaModel.namePropertyMetaModel = new PropertyMetaModel(moduleProvidesDirectiveMetaModel, "name", com.github.javaparser.ast.expr.Name.class, Optional.of(nameMetaModel), false, false, false, false);
        moduleProvidesDirectiveMetaModel.getDeclaredPropertyMetaModels().add(moduleProvidesDirectiveMetaModel.namePropertyMetaModel);
        moduleProvidesDirectiveMetaModel.withPropertyMetaModel = new PropertyMetaModel(moduleProvidesDirectiveMetaModel, "with", com.github.javaparser.ast.expr.Name.class, Optional.of(nameMetaModel), false, false, true, false);
        moduleProvidesDirectiveMetaModel.getDeclaredPropertyMetaModels().add(moduleProvidesDirectiveMetaModel.withPropertyMetaModel);
        moduleRequiresDirectiveMetaModel.modifiersPropertyMetaModel = new PropertyMetaModel(moduleRequiresDirectiveMetaModel, "modifiers", com.github.javaparser.ast.Modifier.class, Optional.of(modifierMetaModel), false, false, true, false);
        moduleRequiresDirectiveMetaModel.getDeclaredPropertyMetaModels().add(moduleRequiresDirectiveMetaModel.modifiersPropertyMetaModel);
        moduleRequiresDirectiveMetaModel.namePropertyMetaModel = new PropertyMetaModel(moduleRequiresDirectiveMetaModel, "name", com.github.javaparser.ast.expr.Name.class, Optional.of(nameMetaModel), false, false, false, false);
        moduleRequiresDirectiveMetaModel.getDeclaredPropertyMetaModels().add(moduleRequiresDirectiveMetaModel.namePropertyMetaModel);
        moduleUsesDirectiveMetaModel.namePropertyMetaModel = new PropertyMetaModel(moduleUsesDirectiveMetaModel, "name", com.github.javaparser.ast.expr.Name.class, Optional.of(nameMetaModel), false, false, false, false);
        moduleUsesDirectiveMetaModel.getDeclaredPropertyMetaModels().add(moduleUsesDirectiveMetaModel.namePropertyMetaModel);
    }

    public static Optional<BaseNodeMetaModel> getNodeMetaModel(Class<?> c) {
        for (BaseNodeMetaModel nodeMetaModel : nodeMetaModels) {
            if (nodeMetaModel.getTypeName().equals(c.getSimpleName())) {
                return Optional.of(nodeMetaModel);
            }
        }
        return Optional.empty();
    }

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final NodeMetaModel nodeMetaModel = new NodeMetaModel(Optional.empty());

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final BodyDeclarationMetaModel bodyDeclarationMetaModel = new BodyDeclarationMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final CallableDeclarationMetaModel callableDeclarationMetaModel = new CallableDeclarationMetaModel(Optional.of(bodyDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ExpressionMetaModel expressionMetaModel = new ExpressionMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final StatementMetaModel statementMetaModel = new StatementMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final TypeMetaModel typeMetaModel = new TypeMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final AnnotationExprMetaModel annotationExprMetaModel = new AnnotationExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ReferenceTypeMetaModel referenceTypeMetaModel = new ReferenceTypeMetaModel(Optional.of(typeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final TypeDeclarationMetaModel typeDeclarationMetaModel = new TypeDeclarationMetaModel(Optional.of(bodyDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final LiteralExprMetaModel literalExprMetaModel = new LiteralExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final LiteralStringValueExprMetaModel literalStringValueExprMetaModel = new LiteralStringValueExprMetaModel(Optional.of(literalExprMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final StringLiteralExprMetaModel stringLiteralExprMetaModel = new StringLiteralExprMetaModel(Optional.of(literalStringValueExprMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ModuleDeclarationMetaModel moduleDeclarationMetaModel = new ModuleDeclarationMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ModuleDirectiveMetaModel moduleDirectiveMetaModel = new ModuleDirectiveMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ArrayCreationLevelMetaModel arrayCreationLevelMetaModel = new ArrayCreationLevelMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final CompilationUnitMetaModel compilationUnitMetaModel = new CompilationUnitMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ImportDeclarationMetaModel importDeclarationMetaModel = new ImportDeclarationMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ModifierMetaModel modifierMetaModel = new ModifierMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final PackageDeclarationMetaModel packageDeclarationMetaModel = new PackageDeclarationMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final AnnotationDeclarationMetaModel annotationDeclarationMetaModel = new AnnotationDeclarationMetaModel(Optional.of(typeDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final AnnotationMemberDeclarationMetaModel annotationMemberDeclarationMetaModel = new AnnotationMemberDeclarationMetaModel(Optional.of(bodyDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ClassOrInterfaceDeclarationMetaModel classOrInterfaceDeclarationMetaModel = new ClassOrInterfaceDeclarationMetaModel(Optional.of(typeDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ConstructorDeclarationMetaModel constructorDeclarationMetaModel = new ConstructorDeclarationMetaModel(Optional.of(callableDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final EnumConstantDeclarationMetaModel enumConstantDeclarationMetaModel = new EnumConstantDeclarationMetaModel(Optional.of(bodyDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final EnumDeclarationMetaModel enumDeclarationMetaModel = new EnumDeclarationMetaModel(Optional.of(typeDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final FieldDeclarationMetaModel fieldDeclarationMetaModel = new FieldDeclarationMetaModel(Optional.of(bodyDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final InitializerDeclarationMetaModel initializerDeclarationMetaModel = new InitializerDeclarationMetaModel(Optional.of(bodyDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final MethodDeclarationMetaModel methodDeclarationMetaModel = new MethodDeclarationMetaModel(Optional.of(callableDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ParameterMetaModel parameterMetaModel = new ParameterMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ReceiverParameterMetaModel receiverParameterMetaModel = new ReceiverParameterMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final RecordDeclarationMetaModel recordDeclarationMetaModel = new RecordDeclarationMetaModel(Optional.of(typeDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final CompactConstructorDeclarationMetaModel compactConstructorDeclarationMetaModel = new CompactConstructorDeclarationMetaModel(Optional.of(bodyDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final VariableDeclaratorMetaModel variableDeclaratorMetaModel = new VariableDeclaratorMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final CommentMetaModel commentMetaModel = new CommentMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final BlockCommentMetaModel blockCommentMetaModel = new BlockCommentMetaModel(Optional.of(commentMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JavadocCommentMetaModel javadocCommentMetaModel = new JavadocCommentMetaModel(Optional.of(commentMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final LineCommentMetaModel lineCommentMetaModel = new LineCommentMetaModel(Optional.of(commentMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ArrayAccessExprMetaModel arrayAccessExprMetaModel = new ArrayAccessExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ArrayCreationExprMetaModel arrayCreationExprMetaModel = new ArrayCreationExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ArrayInitializerExprMetaModel arrayInitializerExprMetaModel = new ArrayInitializerExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final AssignExprMetaModel assignExprMetaModel = new AssignExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final BinaryExprMetaModel binaryExprMetaModel = new BinaryExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final BooleanLiteralExprMetaModel booleanLiteralExprMetaModel = new BooleanLiteralExprMetaModel(Optional.of(literalExprMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final CastExprMetaModel castExprMetaModel = new CastExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final CharLiteralExprMetaModel charLiteralExprMetaModel = new CharLiteralExprMetaModel(Optional.of(literalStringValueExprMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ClassExprMetaModel classExprMetaModel = new ClassExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ConditionalExprMetaModel conditionalExprMetaModel = new ConditionalExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final DoubleLiteralExprMetaModel doubleLiteralExprMetaModel = new DoubleLiteralExprMetaModel(Optional.of(literalStringValueExprMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final EnclosedExprMetaModel enclosedExprMetaModel = new EnclosedExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final FieldAccessExprMetaModel fieldAccessExprMetaModel = new FieldAccessExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final InstanceOfExprMetaModel instanceOfExprMetaModel = new InstanceOfExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final IntegerLiteralExprMetaModel integerLiteralExprMetaModel = new IntegerLiteralExprMetaModel(Optional.of(literalStringValueExprMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final LambdaExprMetaModel lambdaExprMetaModel = new LambdaExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final LongLiteralExprMetaModel longLiteralExprMetaModel = new LongLiteralExprMetaModel(Optional.of(literalStringValueExprMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final MarkerAnnotationExprMetaModel markerAnnotationExprMetaModel = new MarkerAnnotationExprMetaModel(Optional.of(annotationExprMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final MemberValuePairMetaModel memberValuePairMetaModel = new MemberValuePairMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final MethodCallExprMetaModel methodCallExprMetaModel = new MethodCallExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final MethodReferenceExprMetaModel methodReferenceExprMetaModel = new MethodReferenceExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final NameExprMetaModel nameExprMetaModel = new NameExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final NameMetaModel nameMetaModel = new NameMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final NormalAnnotationExprMetaModel normalAnnotationExprMetaModel = new NormalAnnotationExprMetaModel(Optional.of(annotationExprMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final NullLiteralExprMetaModel nullLiteralExprMetaModel = new NullLiteralExprMetaModel(Optional.of(literalExprMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ObjectCreationExprMetaModel objectCreationExprMetaModel = new ObjectCreationExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final PatternExprMetaModel patternExprMetaModel = new PatternExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final RecordPatternExprMetaModel recordPatternExprMetaModel = new RecordPatternExprMetaModel(Optional.of(patternExprMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final SingleMemberAnnotationExprMetaModel singleMemberAnnotationExprMetaModel = new SingleMemberAnnotationExprMetaModel(Optional.of(annotationExprMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final SimpleNameMetaModel simpleNameMetaModel = new SimpleNameMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final SuperExprMetaModel superExprMetaModel = new SuperExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final SwitchExprMetaModel switchExprMetaModel = new SwitchExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final TextBlockLiteralExprMetaModel textBlockLiteralExprMetaModel = new TextBlockLiteralExprMetaModel(Optional.of(literalStringValueExprMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ThisExprMetaModel thisExprMetaModel = new ThisExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final TypeExprMetaModel typeExprMetaModel = new TypeExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final TypePatternExprMetaModel typePatternExprMetaModel = new TypePatternExprMetaModel(Optional.of(patternExprMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final UnaryExprMetaModel unaryExprMetaModel = new UnaryExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final VariableDeclarationExprMetaModel variableDeclarationExprMetaModel = new VariableDeclarationExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlDocMetaModel jmlDocMetaModel = new JmlDocMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlDocDeclarationMetaModel jmlDocDeclarationMetaModel = new JmlDocDeclarationMetaModel(Optional.of(bodyDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlDocStmtMetaModel jmlDocStmtMetaModel = new JmlDocStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlDocTypeMetaModel jmlDocTypeMetaModel = new JmlDocTypeMetaModel(Optional.of(typeDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlQuantifiedExprMetaModel jmlQuantifiedExprMetaModel = new JmlQuantifiedExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlTypeExprMetaModel jmlTypeExprMetaModel = new JmlTypeExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlBinaryInfixExprMetaModel jmlBinaryInfixExprMetaModel = new JmlBinaryInfixExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlLetExprMetaModel jmlLetExprMetaModel = new JmlLetExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlMultiCompareExprMetaModel jmlMultiCompareExprMetaModel = new JmlMultiCompareExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlLabelExprMetaModel jmlLabelExprMetaModel = new JmlLabelExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlSetComprehensionExprMetaModel jmlSetComprehensionExprMetaModel = new JmlSetComprehensionExprMetaModel(Optional.of(expressionMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final AssertStmtMetaModel assertStmtMetaModel = new AssertStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final BlockStmtMetaModel blockStmtMetaModel = new BlockStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final BreakStmtMetaModel breakStmtMetaModel = new BreakStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final CatchClauseMetaModel catchClauseMetaModel = new CatchClauseMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ContinueStmtMetaModel continueStmtMetaModel = new ContinueStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final DoStmtMetaModel doStmtMetaModel = new DoStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final EmptyStmtMetaModel emptyStmtMetaModel = new EmptyStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ExplicitConstructorInvocationStmtMetaModel explicitConstructorInvocationStmtMetaModel = new ExplicitConstructorInvocationStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ExpressionStmtMetaModel expressionStmtMetaModel = new ExpressionStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ForEachStmtMetaModel forEachStmtMetaModel = new ForEachStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ForStmtMetaModel forStmtMetaModel = new ForStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final IfStmtMetaModel ifStmtMetaModel = new IfStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final LabeledStmtMetaModel labeledStmtMetaModel = new LabeledStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final LocalClassDeclarationStmtMetaModel localClassDeclarationStmtMetaModel = new LocalClassDeclarationStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final LocalRecordDeclarationStmtMetaModel localRecordDeclarationStmtMetaModel = new LocalRecordDeclarationStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ReturnStmtMetaModel returnStmtMetaModel = new ReturnStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final SwitchEntryMetaModel switchEntryMetaModel = new SwitchEntryMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final SwitchStmtMetaModel switchStmtMetaModel = new SwitchStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final SynchronizedStmtMetaModel synchronizedStmtMetaModel = new SynchronizedStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ThrowStmtMetaModel throwStmtMetaModel = new ThrowStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final TryStmtMetaModel tryStmtMetaModel = new TryStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final UnparsableStmtMetaModel unparsableStmtMetaModel = new UnparsableStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final WhileStmtMetaModel whileStmtMetaModel = new WhileStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final YieldStmtMetaModel yieldStmtMetaModel = new YieldStmtMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlStatementMetaModel jmlStatementMetaModel = new JmlStatementMetaModel(Optional.of(statementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlGhostStmtMetaModel jmlGhostStmtMetaModel = new JmlGhostStmtMetaModel(Optional.of(jmlStatementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlExpressionStmtMetaModel jmlExpressionStmtMetaModel = new JmlExpressionStmtMetaModel(Optional.of(jmlStatementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlRefiningStmtMetaModel jmlRefiningStmtMetaModel = new JmlRefiningStmtMetaModel(Optional.of(jmlStatementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlUnreachableStmtMetaModel jmlUnreachableStmtMetaModel = new JmlUnreachableStmtMetaModel(Optional.of(jmlStatementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlLabelStmtMetaModel jmlLabelStmtMetaModel = new JmlLabelStmtMetaModel(Optional.of(jmlStatementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlBeginStmtMetaModel jmlBeginStmtMetaModel = new JmlBeginStmtMetaModel(Optional.of(jmlStatementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlEndStmtMetaModel jmlEndStmtMetaModel = new JmlEndStmtMetaModel(Optional.of(jmlStatementMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlClassLevelDeclarationMetaModel jmlClassLevelDeclarationMetaModel = new JmlClassLevelDeclarationMetaModel(Optional.of(bodyDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlMethodDeclarationMetaModel jmlMethodDeclarationMetaModel = new JmlMethodDeclarationMetaModel(Optional.of(jmlClassLevelDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlFieldDeclarationMetaModel jmlFieldDeclarationMetaModel = new JmlFieldDeclarationMetaModel(Optional.of(jmlClassLevelDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlClauseMetaModel jmlClauseMetaModel = new JmlClauseMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlSimpleExprClauseMetaModel jmlSimpleExprClauseMetaModel = new JmlSimpleExprClauseMetaModel(Optional.of(jmlClauseMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlMultiExprClauseMetaModel jmlMultiExprClauseMetaModel = new JmlMultiExprClauseMetaModel(Optional.of(jmlClauseMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlSignalsClauseMetaModel jmlSignalsClauseMetaModel = new JmlSignalsClauseMetaModel(Optional.of(jmlClauseMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlSignalsOnlyClauseMetaModel jmlSignalsOnlyClauseMetaModel = new JmlSignalsOnlyClauseMetaModel(Optional.of(jmlClauseMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlClauseLabelMetaModel jmlClauseLabelMetaModel = new JmlClauseLabelMetaModel(Optional.of(jmlClauseMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlForallClauseMetaModel jmlForallClauseMetaModel = new JmlForallClauseMetaModel(Optional.of(jmlClauseMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlOldClauseMetaModel jmlOldClauseMetaModel = new JmlOldClauseMetaModel(Optional.of(jmlClauseMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlCallableClauseMetaModel jmlCallableClauseMetaModel = new JmlCallableClauseMetaModel(Optional.of(jmlClauseMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlClauseIfMetaModel jmlClauseIfMetaModel = new JmlClauseIfMetaModel(Optional.of(jmlClauseMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlMethodSignatureMetaModel jmlMethodSignatureMetaModel = new JmlMethodSignatureMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlContractMetaModel jmlContractMetaModel = new JmlContractMetaModel(Optional.of(nodeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlClassExprDeclarationMetaModel jmlClassExprDeclarationMetaModel = new JmlClassExprDeclarationMetaModel(Optional.of(jmlClassLevelDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlRepresentsDeclarationMetaModel jmlRepresentsDeclarationMetaModel = new JmlRepresentsDeclarationMetaModel(Optional.of(jmlClassLevelDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final JmlClassAccessibleDeclarationMetaModel jmlClassAccessibleDeclarationMetaModel = new JmlClassAccessibleDeclarationMetaModel(Optional.of(jmlClassLevelDeclarationMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ArrayTypeMetaModel arrayTypeMetaModel = new ArrayTypeMetaModel(Optional.of(referenceTypeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ClassOrInterfaceTypeMetaModel classOrInterfaceTypeMetaModel = new ClassOrInterfaceTypeMetaModel(Optional.of(referenceTypeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final IntersectionTypeMetaModel intersectionTypeMetaModel = new IntersectionTypeMetaModel(Optional.of(typeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final PrimitiveTypeMetaModel primitiveTypeMetaModel = new PrimitiveTypeMetaModel(Optional.of(typeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final TypeParameterMetaModel typeParameterMetaModel = new TypeParameterMetaModel(Optional.of(referenceTypeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final UnionTypeMetaModel unionTypeMetaModel = new UnionTypeMetaModel(Optional.of(typeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final UnknownTypeMetaModel unknownTypeMetaModel = new UnknownTypeMetaModel(Optional.of(typeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final VarTypeMetaModel varTypeMetaModel = new VarTypeMetaModel(Optional.of(typeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final VoidTypeMetaModel voidTypeMetaModel = new VoidTypeMetaModel(Optional.of(typeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final WildcardTypeMetaModel wildcardTypeMetaModel = new WildcardTypeMetaModel(Optional.of(typeMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ModuleExportsDirectiveMetaModel moduleExportsDirectiveMetaModel = new ModuleExportsDirectiveMetaModel(Optional.of(moduleDirectiveMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ModuleOpensDirectiveMetaModel moduleOpensDirectiveMetaModel = new ModuleOpensDirectiveMetaModel(Optional.of(moduleDirectiveMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ModuleProvidesDirectiveMetaModel moduleProvidesDirectiveMetaModel = new ModuleProvidesDirectiveMetaModel(Optional.of(moduleDirectiveMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ModuleRequiresDirectiveMetaModel moduleRequiresDirectiveMetaModel = new ModuleRequiresDirectiveMetaModel(Optional.of(moduleDirectiveMetaModel));

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    public static final ModuleUsesDirectiveMetaModel moduleUsesDirectiveMetaModel = new ModuleUsesDirectiveMetaModel(Optional.of(moduleDirectiveMetaModel));

    static {
        initializeNodeMetaModels();
        initializePropertyMetaModels();
        initializeConstructorParameters();
    }
}
