/**
 * Copyright (c) 2014, 2024 itemis AG (http://www.itemis.eu) and others.
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
public class CompilerBug436230Test extends AbstractXtendCompilerTest {
  @Test
  public void test_01() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.List");
    _builder.newLine();
    _builder.append("class Foo {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("val List<CharSequence> list = newArrayList");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def foo(List<? extends Object> source) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("list += source.map[\'\']");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("import com.google.common.collect.Iterables;");
    _builder_1.newLine();
    _builder_1.append("import java.util.List;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.CollectionLiterals;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.Functions.Function1;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.ListExtensions;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class Foo {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("private final List<CharSequence> list = CollectionLiterals.<CharSequence>newArrayList();");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public boolean foo(final List<?> source) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("final Function1<Object, String> _function = (Object it) -> {");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("return \"\";");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("};");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("List<String> _map = ListExtensions.map(source, _function);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return Iterables.<CharSequence>addAll(this.list, _map);");
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
    _builder.append("import java.util.List");
    _builder.newLine();
    _builder.append("class C {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def m() { ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val List<CharSequence> res = null");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val Iterable<? extends Object> obj = null");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("res += obj.map[\"\"]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("import com.google.common.collect.Iterables;");
    _builder_1.newLine();
    _builder_1.append("import java.util.List;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.Functions.Function1;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.IterableExtensions;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class C {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public boolean m() {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("boolean _xblockexpression = false;");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("{");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("final List<CharSequence> res = null;");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("final Iterable<?> obj = null;");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("final Function1<Object, String> _function = (Object it) -> {");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("return \"\";");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("};");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("Iterable<String> _map = IterableExtensions.map(obj, _function);");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("_xblockexpression = Iterables.<CharSequence>addAll(res, _map);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return _xblockexpression;");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCompilesTo(_builder, _builder_1);
  }

  @Test
  public void test_03() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.List");
    _builder.newLine();
    _builder.append("class C {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def m() { ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val List<? super CharSequence> res = null");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val Iterable<? extends Object> obj = null");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("res += obj.map[\"\"]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("import com.google.common.collect.Iterables;");
    _builder_1.newLine();
    _builder_1.append("import java.util.List;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.Functions.Function1;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.IterableExtensions;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class C {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public boolean m() {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("boolean _xblockexpression = false;");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("{");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("final List<? super CharSequence> res = null;");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("final Iterable<?> obj = null;");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("final Function1<Object, String> _function = (Object it) -> {");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("return \"\";");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("};");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("Iterable<? extends CharSequence> _map = IterableExtensions.map(obj, _function);");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("_xblockexpression = Iterables.addAll(res, _map);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return _xblockexpression;");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCompilesTo(_builder, _builder_1);
  }

  @Test
  public void test_04() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.List");
    _builder.newLine();
    _builder.append("class C {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def Iterable<? extends CharSequence> m() { ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val Iterable<? extends Object> obj = null");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("obj.map[\"\"]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.Functions.Function1;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.IterableExtensions;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class C {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public Iterable<? extends CharSequence> m() {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Iterable<String> _xblockexpression = null;");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("{");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("final Iterable<?> obj = null;");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("final Function1<Object, String> _function = (Object it) -> {");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("return \"\";");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("};");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("_xblockexpression = IterableExtensions.map(obj, _function);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return _xblockexpression;");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCompilesTo(_builder, _builder_1);
  }
}
