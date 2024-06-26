/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtend.core.tests.typesystem;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.List;
import java.util.NoSuchElementException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.core.jvmmodel.IXtendJvmAssociations;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.typesystem.arguments.IFeatureCallArgumentSlot;
import org.eclipse.xtext.xbase.typesystem.arguments.IFeatureCallArguments;
import org.eclipse.xtext.xbase.typesystem.arguments.VarArgFeatureCallArguments;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class VarArgFeatureCallArgumentsTest extends AbstractTestingTypeReferenceOwner {
  @Inject
  @Extension
  private IXtendJvmAssociations _iXtendJvmAssociations;

  @Inject
  private TestableExpressionArgumentFactory factory;

  @Test
  public void test_01() {
    final IFeatureCallArguments arguments = this.toArgumentsWithoutReceiver("", "");
    Assert.assertFalse(arguments.hasUnprocessedArguments());
    Assert.assertEquals(0, arguments.getArgumentCount());
  }

  @Test(expected = NoSuchElementException.class)
  public void test_02() {
    final IFeatureCallArguments arguments = this.toArgumentsWithoutReceiver("", "");
    arguments.getNextUnprocessedArgumentSlot();
  }

  @Test
  public void test_03() {
    final IFeatureCallArguments arguments = this.toArgumentsWithoutReceiver("String s", "\"\"");
    Assert.assertTrue(arguments.hasUnprocessedArguments());
    Assert.assertEquals(1, arguments.getArgumentCount());
    final IFeatureCallArgumentSlot singleSlot = arguments.getNextUnprocessedArgumentSlot();
    Assert.assertTrue(singleSlot.isVarArg());
    Assert.assertFalse(singleSlot.isSuperfluous());
    XExpression _argumentExpression = singleSlot.getArgumentExpression();
    Assert.assertTrue((_argumentExpression instanceof XStringLiteral));
    Assert.assertEquals("String", singleSlot.getDeclaredType().getSimpleName());
    singleSlot.markProcessed();
    Assert.assertFalse(arguments.hasUnprocessedArguments());
  }

  @Test
  public void test_04() {
    final IFeatureCallArguments arguments = this.toArgumentsWithoutReceiver("String s, int i", "\"\", 1");
    Assert.assertEquals(2, arguments.getArgumentCount());
    Assert.assertTrue(arguments.hasUnprocessedArguments());
    final IFeatureCallArgumentSlot firstSlot = arguments.getNextUnprocessedArgumentSlot();
    Assert.assertFalse(firstSlot.isVarArg());
    Assert.assertFalse(firstSlot.isSuperfluous());
    XExpression _argumentExpression = firstSlot.getArgumentExpression();
    Assert.assertTrue((_argumentExpression instanceof XStringLiteral));
    Assert.assertEquals("String", firstSlot.getDeclaredType().getSimpleName());
    Assert.assertFalse(arguments.isProcessed(0));
    firstSlot.markProcessed();
    Assert.assertTrue(arguments.isProcessed(0));
    Assert.assertTrue(arguments.hasUnprocessedArguments());
    final IFeatureCallArgumentSlot secondSlot = arguments.getNextUnprocessedArgumentSlot();
    Assert.assertTrue(secondSlot.isVarArg());
    Assert.assertFalse(secondSlot.isSuperfluous());
    XExpression _argumentExpression_1 = secondSlot.getArgumentExpression();
    Assert.assertTrue((_argumentExpression_1 instanceof XNumberLiteral));
    Assert.assertEquals("int", secondSlot.getDeclaredType().getSimpleName());
    Assert.assertFalse(arguments.isProcessed(1));
    secondSlot.markProcessed();
    Assert.assertTrue(arguments.isProcessed(1));
    Assert.assertFalse(arguments.hasUnprocessedArguments());
  }

  @Test
  public void test_05() {
    final IFeatureCallArguments arguments = this.toArgumentsWithReceiver("", "");
    Assert.assertFalse(arguments.hasUnprocessedArguments());
    Assert.assertEquals(1, arguments.getArgumentCount());
  }

  @Test(expected = NoSuchElementException.class)
  public void test_06() {
    final IFeatureCallArguments arguments = this.toArgumentsWithReceiver("", "");
    arguments.getNextUnprocessedArgumentSlot();
  }

  @Test
  public void test_08() {
    final IFeatureCallArguments arguments = this.toArgumentsWithReceiver("String s, int i", "\"\", 1");
    Assert.assertEquals(3, arguments.getArgumentCount());
    Assert.assertTrue(arguments.hasUnprocessedArguments());
    final IFeatureCallArgumentSlot firstSlot = arguments.getNextUnprocessedArgumentSlot();
    Assert.assertFalse(firstSlot.isVarArg());
    Assert.assertFalse(firstSlot.isSuperfluous());
    XExpression _argumentExpression = firstSlot.getArgumentExpression();
    Assert.assertTrue((_argumentExpression instanceof XStringLiteral));
    Assert.assertEquals("String", firstSlot.getDeclaredType().getSimpleName());
    Assert.assertTrue(arguments.isProcessed(0));
    Assert.assertFalse(arguments.isProcessed(1));
    firstSlot.markProcessed();
    Assert.assertTrue(arguments.isProcessed(1));
    Assert.assertTrue(arguments.hasUnprocessedArguments());
    final IFeatureCallArgumentSlot secondSlot = arguments.getNextUnprocessedArgumentSlot();
    Assert.assertTrue(secondSlot.isVarArg());
    Assert.assertFalse(secondSlot.isSuperfluous());
    XExpression _argumentExpression_1 = secondSlot.getArgumentExpression();
    Assert.assertTrue((_argumentExpression_1 instanceof XNumberLiteral));
    Assert.assertEquals("int", secondSlot.getDeclaredType().getSimpleName());
    Assert.assertFalse(arguments.isProcessed(2));
    secondSlot.markProcessed();
    Assert.assertTrue(arguments.isProcessed(2));
    Assert.assertFalse(arguments.hasUnprocessedArguments());
  }

  @Test
  public void test_09() {
    final IFeatureCallArguments arguments = this.toArgumentsWithoutReceiver("String s", "\"\", 1");
    Assert.assertTrue(arguments.hasUnprocessedArguments());
    Assert.assertEquals(2, arguments.getArgumentCount());
    final IFeatureCallArgumentSlot valid = arguments.getNextUnprocessedArgumentSlot();
    Assert.assertTrue(valid.isVarArg());
    Assert.assertFalse(valid.isSuperfluous());
    final List<XExpression> expressions = valid.getArgumentExpressions();
    Assert.assertEquals(2, expressions.size());
    XExpression _head = IterableExtensions.<XExpression>head(expressions);
    Assert.assertTrue((_head instanceof XStringLiteral));
    XExpression _lastOrNull = IterableExtensions.<XExpression>lastOrNull(expressions);
    Assert.assertTrue((_lastOrNull instanceof XNumberLiteral));
    valid.markProcessed();
    Assert.assertTrue(arguments.isProcessed(0));
    Assert.assertTrue(arguments.isProcessed(1));
    Assert.assertFalse(arguments.hasUnprocessedArguments());
  }

  @Test
  public void test_10() {
    final IFeatureCallArguments arguments = this.toArgumentsWithReceiver("String s", "\"\", 1");
    Assert.assertTrue(arguments.hasUnprocessedArguments());
    Assert.assertEquals(3, arguments.getArgumentCount());
    final IFeatureCallArgumentSlot valid = arguments.getNextUnprocessedArgumentSlot();
    Assert.assertTrue(valid.isVarArg());
    Assert.assertFalse(valid.isSuperfluous());
    final List<XExpression> expressions = valid.getArgumentExpressions();
    Assert.assertEquals(2, expressions.size());
    XExpression _head = IterableExtensions.<XExpression>head(expressions);
    Assert.assertTrue((_head instanceof XStringLiteral));
    XExpression _lastOrNull = IterableExtensions.<XExpression>lastOrNull(expressions);
    Assert.assertTrue((_lastOrNull instanceof XNumberLiteral));
    Assert.assertTrue(arguments.isProcessed(0));
    Assert.assertFalse(arguments.isProcessed(1));
    Assert.assertFalse(arguments.isProcessed(2));
    valid.markProcessed();
    Assert.assertTrue(arguments.isProcessed(0));
    Assert.assertTrue(arguments.isProcessed(1));
    Assert.assertTrue(arguments.isProcessed(2));
    Assert.assertFalse(arguments.hasUnprocessedArguments());
  }

  @Test
  public void test_11() {
    final IFeatureCallArguments arguments = this.toArgumentsWithoutReceiver("String s", "");
    Assert.assertFalse(arguments.hasUnprocessedArguments());
  }

  @Test
  public void test_12() {
    this.toArgumentsWithoutReceiver("String s, int i", "\"\", []");
    this.toArgumentsWithReceiver("String s, int i", "\"\", [], []");
  }

  @Test
  public void test_13() {
    this.toArgumentsWithoutReceiver("String s, int i", "[]");
    this.toArgumentsWithReceiver("String s, int i", "[], [], []");
  }

  @Test
  public void testBug457779_01() {
    final IFeatureCallArguments arguments = this.toArgumentsWithReceiver("String s, int[] i", "\"\", 1, true");
    final XExpression first = arguments.getArgument(0);
    Assert.assertNull(first);
    final LightweightTypeReference firstType = arguments.getDeclaredTypeForLambda(0);
    Assert.assertNull(firstType);
    final XExpression second = arguments.getArgument(1);
    Assert.assertTrue((second instanceof XStringLiteral));
    final LightweightTypeReference secondType = arguments.getDeclaredTypeForLambda(1);
    Assert.assertEquals("String", secondType.getSimpleName());
    final XExpression third = arguments.getArgument(2);
    Assert.assertTrue((third instanceof XNumberLiteral));
    final LightweightTypeReference thirdType = arguments.getDeclaredTypeForLambda(2);
    Assert.assertEquals("int", thirdType.getSimpleName());
    final XExpression fourth = arguments.getArgument(3);
    Assert.assertTrue((fourth instanceof XBooleanLiteral));
    final LightweightTypeReference fourthType = arguments.getDeclaredTypeForLambda(3);
    Assert.assertEquals("int", fourthType.getSimpleName());
    try {
      arguments.getArgument(4);
      Assert.fail("Expected exception");
    } catch (final Throwable _t) {
      if (_t instanceof IndexOutOfBoundsException) {
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    try {
      arguments.getDeclaredTypeForLambda(4);
      Assert.fail("Expected exception");
    } catch (final Throwable _t) {
      if (_t instanceof IndexOutOfBoundsException) {
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }

  @Test
  public void testBug457779_02() {
    final IFeatureCallArguments arguments = this.toArgumentsWithReceiver("String s, int[] i", "\"\", 1");
    final XExpression first = arguments.getArgument(0);
    Assert.assertNull(first);
    final LightweightTypeReference firstType = arguments.getDeclaredTypeForLambda(0);
    Assert.assertNull(firstType);
    final XExpression second = arguments.getArgument(1);
    Assert.assertTrue((second instanceof XStringLiteral));
    final LightweightTypeReference secondType = arguments.getDeclaredTypeForLambda(1);
    Assert.assertEquals("String", secondType.getSimpleName());
    final XExpression third = arguments.getArgument(2);
    Assert.assertTrue((third instanceof XNumberLiteral));
    final LightweightTypeReference thirdType = arguments.getDeclaredTypeForLambda(2);
    Assert.assertEquals("int", thirdType.getSimpleName());
    try {
      arguments.getArgument(3);
      Assert.fail("Expected exception");
    } catch (final Throwable _t) {
      if (_t instanceof IndexOutOfBoundsException) {
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    try {
      arguments.getDeclaredTypeForLambda(3);
      Assert.fail("Expected exception");
    } catch (final Throwable _t) {
      if (_t instanceof IndexOutOfBoundsException) {
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }

  @Test
  public void testBug457779_03() {
    final IFeatureCallArguments arguments = this.toArgumentsWithReceiver("String s, int[] i", "\"\"");
    final XExpression first = arguments.getArgument(0);
    Assert.assertNull(first);
    final LightweightTypeReference firstType = arguments.getDeclaredTypeForLambda(0);
    Assert.assertNull(firstType);
    final XExpression second = arguments.getArgument(1);
    Assert.assertTrue((second instanceof XStringLiteral));
    final LightweightTypeReference secondType = arguments.getDeclaredTypeForLambda(1);
    Assert.assertEquals("String", secondType.getSimpleName());
    try {
      arguments.getArgument(2);
      Assert.fail("Expected exception");
    } catch (final Throwable _t) {
      if (_t instanceof IndexOutOfBoundsException) {
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    try {
      arguments.getDeclaredTypeForLambda(2);
      Assert.fail("Expected exception");
    } catch (final Throwable _t) {
      if (_t instanceof IndexOutOfBoundsException) {
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }

  protected IFeatureCallArguments toArgumentsWithoutReceiver(final String signature, final String invocation) {
    return this.toArguments(signature, invocation, false);
  }

  protected IFeatureCallArguments toArgumentsWithReceiver(final String signature, final String invocation) {
    return this.toArguments(signature, invocation, true);
  }

  protected IFeatureCallArguments toArguments(final String signature, final String invocation, final boolean receiver) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("def void m(");
      _builder.append(signature);
      _builder.append(") {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("m(");
      _builder.append(invocation, "\t");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      final String functionString = _builder.toString();
      final XtendFunction function = this.function(functionString);
      XExpression _expression = function.getExpression();
      final XBlockExpression body = ((XBlockExpression) _expression);
      XExpression _head = IterableExtensions.<XExpression>head(body.getExpressions());
      final XFeatureCall featureCall = ((XFeatureCall) _head);
      final EList<XExpression> arguments = featureCall.getFeatureCallArguments();
      final JvmOperation operation = this._iXtendJvmAssociations.getDirectlyInferredOperation(function);
      final IFeatureCallArguments result = this.factory.createVarArgArguments(arguments, operation.getParameters(), receiver, this.getOwner());
      Class<? extends IFeatureCallArguments> _class = result.getClass();
      boolean _equals = Objects.equal(_class, VarArgFeatureCallArguments.class);
      Assert.assertTrue(_equals);
      return result;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
