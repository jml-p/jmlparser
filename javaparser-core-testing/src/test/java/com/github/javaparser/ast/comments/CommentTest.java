/*
 * Copyright (C) 2007-2010 Júlio Vilmar Gesser.
 * Copyright (C) 2011, 2013-2019 The JavaParser Team.
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

package com.github.javaparser.ast.comments;

import static com.github.javaparser.StaticJavaParser.parse;
import static com.github.javaparser.utils.TestUtils.assertEqualsStringIgnoringEol;
import static com.github.javaparser.utils.Utils.SYSTEM_EOL;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.javadoc.Javadoc;
import com.github.javaparser.javadoc.description.JavadocDescription;
import com.github.javaparser.printer.configuration.DefaultConfigurationOption;
import com.github.javaparser.printer.configuration.DefaultPrinterConfiguration;
import com.github.javaparser.printer.configuration.DefaultPrinterConfiguration.ConfigOption;
import com.github.javaparser.printer.configuration.Indentation;
import com.github.javaparser.printer.configuration.Indentation.IndentType;
import com.github.javaparser.printer.configuration.PrinterConfiguration;

class CommentTest {

    private static final PrinterConfiguration PRETTY_PRINTER_CONFIG_TWO_INDENT = new DefaultPrinterConfiguration().addOption(new DefaultConfigurationOption(ConfigOption.INDENTATION, new Indentation(IndentType.SPACES, 2)));

    @Test
    void removeOrphanComment() {
        ClassOrInterfaceDeclaration decl = new ClassOrInterfaceDeclaration(new NodeList<>(), false, "A");
        Comment c = new LineComment("A comment");
        decl.addOrphanComment(c);
        assertEquals(1, decl.getOrphanComments().size());
        assertTrue(c.remove());
        assertEquals(0, decl.getOrphanComments().size());
    }

    @Test
    void removeAssociatedComment() {
        ClassOrInterfaceDeclaration decl = new ClassOrInterfaceDeclaration(new NodeList<>(), false, "A");
        Comment c = new LineComment("A comment");
        decl.setComment(c);
        assertTrue(decl.getComment().isPresent());
        assertTrue(c.remove());
        assertFalse(decl.getComment().isPresent());
    }

    @Test
    void cannotRemoveCommentNotUsedAnywhere() {
        Comment c = new LineComment("A comment");
        assertFalse(c.remove());
    }

    @Test
    void unicodeEscapesArePreservedInComments() {
        CompilationUnit cu = parse("// xxx\\u2122xxx");
        Comment comment = cu.getAllContainedComments().get(0);
        assertEquals(" xxx\\u2122xxx", comment.getContent());
    }

    @Test
    void testReplaceDuplicateJavaDocComment() {
        // Arrange
        CompilationUnit cu = parse("public class MyClass {" + SYSTEM_EOL +
                SYSTEM_EOL +
                "  /**" + SYSTEM_EOL +
                "   * Comment A" + SYSTEM_EOL +
                "   */" + SYSTEM_EOL +
                "  public void oneMethod() {" + SYSTEM_EOL +
                "  }" + SYSTEM_EOL +
                SYSTEM_EOL +
                "  /**" + SYSTEM_EOL +
                "   * Comment A" + SYSTEM_EOL +
                "   */" + SYSTEM_EOL +
                "  public void anotherMethod() {" + SYSTEM_EOL +
                "  }" + SYSTEM_EOL +
                "}" + SYSTEM_EOL);

        MethodDeclaration methodDeclaration = cu.findFirst(MethodDeclaration.class).get();

        // Act
        Javadoc javadoc = new Javadoc(JavadocDescription.parseText("Change Javadoc"));
        methodDeclaration.setJavadocComment("", javadoc);

        // Assert
        assertEqualsStringIgnoringEol("public class MyClass {\n" +
                "\n" +
                "  /**\n" +
                "   * Change Javadoc\n" +
                "   */\n" +
                "  public void oneMethod() {\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Comment A\n" +
                "   */\n" +
                "  public void anotherMethod() {\n" +
                "  }\n" +
                "}\n", cu.toString(PRETTY_PRINTER_CONFIG_TWO_INDENT));
    }

    @Test
    void testRemoveDuplicateComment() {
        // Arrange
        CompilationUnit cu = parse("public class MyClass {" + SYSTEM_EOL +
                SYSTEM_EOL +
                "  /**" + SYSTEM_EOL +
                "   * Comment A" + SYSTEM_EOL +
                "   */" + SYSTEM_EOL +
                "  public void oneMethod() {" + SYSTEM_EOL +
                "  }" + SYSTEM_EOL +
                SYSTEM_EOL +
                "  /**" + SYSTEM_EOL +
                "   * Comment A" + SYSTEM_EOL +
                "   */" + SYSTEM_EOL +
                "  public void anotherMethod() {" + SYSTEM_EOL +
                "  }" + SYSTEM_EOL +
                "}" +
                SYSTEM_EOL);

        MethodDeclaration methodDeclaration = cu.findFirst(MethodDeclaration.class).get();

        // Act
        methodDeclaration.removeComment();

        // Assert
        assertEqualsStringIgnoringEol("public class MyClass {\n" +
                "\n" +
                "  public void oneMethod() {\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Comment A\n" +
                "   */\n" +
                "  public void anotherMethod() {\n" +
                "  }\n" +
                "}\n", cu.toString(PRETTY_PRINTER_CONFIG_TWO_INDENT));
    }

    @Test
    void testRemoveDuplicateJavaDocComment() {
        // Arrange
        CompilationUnit cu = parse("public class MyClass {" + SYSTEM_EOL +
                SYSTEM_EOL +
                "  /**" + SYSTEM_EOL +
                "   * Comment A" + SYSTEM_EOL +
                "   */" + SYSTEM_EOL +
                "  public void oneMethod() {" + SYSTEM_EOL +
                "  }" + SYSTEM_EOL +
                SYSTEM_EOL +
                "  /**" + SYSTEM_EOL +
                "   * Comment A" + SYSTEM_EOL +
                "   */" + SYSTEM_EOL +
                "  public void anotherMethod() {" + SYSTEM_EOL +
                "  }" + SYSTEM_EOL +
                "}" +
                SYSTEM_EOL);

        MethodDeclaration methodDeclaration = cu.findAll(MethodDeclaration.class).get(1);

        // Act
        methodDeclaration.removeJavaDocComment();

        // Assert
        assertEqualsStringIgnoringEol("public class MyClass {\n" +
                "\n" +
                "  /**\n" +
                "   * Comment A\n" +
                "   */\n" +
                "  public void oneMethod() {\n" +
                "  }\n" +
                "\n" +
                "  public void anotherMethod() {\n" +
                "  }\n" +
                "}\n", cu.toString(PRETTY_PRINTER_CONFIG_TWO_INDENT));
    }

    @Test()
    void testVerifyOrphanCommentInsertedInEmptyBlock() {
        BlockStmt block = new BlockStmt();
        block.addOrphanComment(new LineComment("TODO"));
        assertTrue(block.toString().contains("TODO"));
    }
}
