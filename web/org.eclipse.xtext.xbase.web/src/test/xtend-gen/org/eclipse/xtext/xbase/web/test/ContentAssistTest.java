/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xbase.web.test;

import java.util.Collections;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.XtextServiceDispatcher;
import org.eclipse.xtext.web.server.contentassist.ContentAssistResult;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.web.test.AbstractXbaseWebTest;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class ContentAssistTest extends AbstractXbaseWebTest {
  protected void assertContentAssistResult(final CharSequence resourceContent, final CharSequence expectedResult) {
    String contentString = resourceContent.toString();
    final int cursorOffset = contentString.indexOf("|");
    if ((cursorOffset >= 0)) {
      String _substring = contentString.substring(0, cursorOffset);
      String _substring_1 = contentString.substring((cursorOffset + 1));
      String _plus = (_substring + _substring_1);
      contentString = _plus;
      this.assertContentAssistResult(contentString, cursorOffset, expectedResult);
    } else {
      this.assertContentAssistResult(resourceContent, 0, expectedResult);
    }
  }
  
  protected void assertContentAssistResult(final CharSequence resourceContent, final int offset, final CharSequence expectedResult) {
    Pair<String, String> _mappedTo = Pair.<String, String>of("requestType", "content-assist");
    String _string = resourceContent.toString();
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("fullText", _string);
    String _string_1 = Integer.valueOf(offset).toString();
    Pair<String, String> _mappedTo_2 = Pair.<String, String>of("caretOffset", _string_1);
    final XtextServiceDispatcher.ServiceDescriptor contentAssist = this.getService(
      Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo, _mappedTo_1, _mappedTo_2)));
    Function0<? extends IServiceResult> _service = contentAssist.getService();
    IServiceResult _apply = _service.apply();
    final ContentAssistResult result = ((ContentAssistResult) _apply);
    String _string_2 = expectedResult.toString();
    String _string_3 = result.toString();
    Assert.assertEquals(_string_2, _string_3);
  }
  
  @Test
  public void testExtendsType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ContentAssistResult [");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("stateId = \"-80000000\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("entries = ArrayList (");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ContentAssistEntry [");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("prefix = \"AbstractQu\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("proposal = \"AbstractQueue\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("description = \"java.util.AbstractQueue\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("escapePosition = 0");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("textReplacements = ArrayList (");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("replace region [0 / length: 0] \'");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("import java.util.AbstractQueue\'");
    _builder.newLine();
    _builder.append("      ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("editPositions = ArrayList ()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("],");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ContentAssistEntry [");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("prefix = \"AbstractQu\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("proposal = \"AbstractQueuedLongSynchronizer\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("description = \"java.util.concurrent.locks.AbstractQueuedLongSynchronizer\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("escapePosition = 0");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("textReplacements = ArrayList (");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("replace region [0 / length: 0] \'");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("import java.util.concurrent.locks.AbstractQueuedLongSynchronizer\'");
    _builder.newLine();
    _builder.append("      ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("editPositions = ArrayList ()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("],");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ContentAssistEntry [");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("prefix = \"AbstractQu\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("proposal = \"AbstractQueuedSynchronizer\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("description = \"java.util.concurrent.locks.AbstractQueuedSynchronizer\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("escapePosition = 0");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("textReplacements = ArrayList (");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("replace region [0 / length: 0] \'");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("import java.util.concurrent.locks.AbstractQueuedSynchronizer\'");
    _builder.newLine();
    _builder.append("      ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("editPositions = ArrayList ()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("]");
    _builder.newLine();
    _builder.append("  ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("]");
    this.assertContentAssistResult("entity Foo extends AbstractQu|", _builder);
  }
  
  @Test
  public void testPropertyType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ContentAssistResult [");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("stateId = \"-80000000\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("entries = ArrayList (");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ContentAssistEntry [");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("prefix = \"AbstractQu\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("proposal = \"AbstractQueue\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("description = \"java.util.AbstractQueue\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("escapePosition = 0");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("textReplacements = ArrayList (");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("replace region [0 / length: 0] \'");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("import java.util.AbstractQueue\'");
    _builder.newLine();
    _builder.append("      ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("editPositions = ArrayList ()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("],");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ContentAssistEntry [");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("prefix = \"AbstractQu\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("proposal = \"AbstractQueuedLongSynchronizer\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("description = \"java.util.concurrent.locks.AbstractQueuedLongSynchronizer\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("escapePosition = 0");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("textReplacements = ArrayList (");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("replace region [0 / length: 0] \'");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("import java.util.concurrent.locks.AbstractQueuedLongSynchronizer\'");
    _builder.newLine();
    _builder.append("      ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("editPositions = ArrayList ()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("],");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ContentAssistEntry [");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("prefix = \"AbstractQu\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("proposal = \"AbstractQueuedSynchronizer\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("description = \"java.util.concurrent.locks.AbstractQueuedSynchronizer\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("escapePosition = 0");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("textReplacements = ArrayList (");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("replace region [0 / length: 0] \'");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("import java.util.concurrent.locks.AbstractQueuedSynchronizer\'");
    _builder.newLine();
    _builder.append("      ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("editPositions = ArrayList ()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("]");
    _builder.newLine();
    _builder.append("  ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("]");
    this.assertContentAssistResult("entity Foo { bar: AbstractQu| }", _builder);
  }
  
  @Test
  public void testListMethods() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ContentAssistResult [");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("stateId = \"-80000000\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("entries = ArrayList (");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ContentAssistEntry [");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("prefix = \"add\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("proposal = \"add()\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("label = \"add(E arg0) : boolean\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("description = \"List\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("escapePosition = 45");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("textReplacements = ArrayList ()");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("editPositions = ArrayList (");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("[44:0]");
    _builder.newLine();
    _builder.append("      ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("],");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ContentAssistEntry [");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("prefix = \"add\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("proposal = \"add()\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("label = \"add(int arg0, E arg1) : void\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("description = \"List\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("escapePosition = 45");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("textReplacements = ArrayList ()");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("editPositions = ArrayList (");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("[44:0]");
    _builder.newLine();
    _builder.append("      ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("],");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ContentAssistEntry [");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("prefix = \"add\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("proposal = \"addAll()\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("label = \"addAll(Collection<? extends E> arg0) : boolean\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("description = \"List\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("escapePosition = 48");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("textReplacements = ArrayList ()");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("editPositions = ArrayList (");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("[47:0]");
    _builder.newLine();
    _builder.append("      ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("],");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ContentAssistEntry [");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("prefix = \"add\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("proposal = \"addAll()\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("label = \"addAll(Iterable<? extends T> arg1) : boolean\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("description = \"CollectionExtensions\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("escapePosition = 48");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("textReplacements = ArrayList ()");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("editPositions = ArrayList (");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("[47:0]");
    _builder.newLine();
    _builder.append("      ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("],");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ContentAssistEntry [");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("prefix = \"add\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("proposal = \"addAll()\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("label = \"addAll(T... arg1) : boolean\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("description = \"CollectionExtensions\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("escapePosition = 48");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("textReplacements = ArrayList ()");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("editPositions = ArrayList (");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("[47:0]");
    _builder.newLine();
    _builder.append("      ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("],");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ContentAssistEntry [");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("prefix = \"add\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("proposal = \"addAll()\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("label = \"addAll(int arg0, Collection<? extends E> arg1) : boolean\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("description = \"List\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("escapePosition = 48");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("textReplacements = ArrayList ()");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("editPositions = ArrayList (");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("[47:0]");
    _builder.newLine();
    _builder.append("      ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("]");
    _builder.newLine();
    _builder.append("  ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("]");
    this.assertContentAssistResult("entity Foo { op bar(): void { #[\'blub\'].add| } }", _builder);
  }
  
  @Test
  public void testMembers() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("entity Foo {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("foobar1: String");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op foobar2(): String {}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op baz(): void {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(foob|)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("ContentAssistResult [");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("stateId = \"-80000000\"");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("entries = ArrayList (");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("ContentAssistEntry [");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("prefix = \"foob\"");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("proposal = \"foobar1\"");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("label = \"foobar1 : String\"");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("description = \"Foo\"");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("escapePosition = 90");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("textReplacements = ArrayList ()");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("editPositions = ArrayList ()");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("],");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("ContentAssistEntry [");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("prefix = \"foob\"");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("proposal = \"foobar1 = value\"");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("label = \"foobar1 = value : void\"");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("description = \"Foo.setFoobar1()\"");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("escapePosition = 98");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("textReplacements = ArrayList ()");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("editPositions = ArrayList (");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("[93:5]");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append(")");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("],");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("ContentAssistEntry [");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("prefix = \"foob\"");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("proposal = \"foobar2\"");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("label = \"foobar2 : String\"");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("description = \"Foo.foobar2()\"");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("escapePosition = 90");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("textReplacements = ArrayList ()");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("editPositions = ArrayList ()");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("]");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append(")");
    _builder_1.newLine();
    _builder_1.append("]");
    this.assertContentAssistResult(_builder, _builder_1);
  }
}