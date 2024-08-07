/**
 * Copyright (c) 2013, 2024 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtend.core.tests.compiler;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Test;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class OverloadedExtensionCompilerTest extends AbstractXtendCompilerTest {
  @Test
  public void test_01() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class C {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def method(MyIterable<? extends Number> list) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("list.m[ process(it) ]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("def void process(Number value) {}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("interface MyIterable<T> extends Iterable<T> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def void m(Consumer<? super T> c)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("interface Consumer<T> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def void consume(T t)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class C {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public void method(final MyIterable<? extends Number> list) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("final Consumer<Number> _function = (Number it) -> {");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("this.process(it);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("};");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("list.m(_function);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public void process(final Number value) {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCompilesTo(_builder, _builder_1);
  }

  @Test
  public void test_02() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class C {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def method(MyIterable<? extends Number> list) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("list.forEach2[ process ]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("def void process(Number value) {}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("interface MyIterable<T> extends Iterable<T> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def void forEach2(Consumer<? super T> c)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("interface Consumer<T> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def void consume(T t)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class C {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public void method(final MyIterable<? extends Number> list) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("final Consumer<Number> _function = (Number it) -> {");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("this.process(it);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("};");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("list.forEach2(_function);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public void process(final Number value) {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCompilesTo(_builder, _builder_1);
  }
}
