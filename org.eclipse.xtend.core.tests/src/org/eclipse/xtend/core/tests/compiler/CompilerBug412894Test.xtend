/*******************************************************************************
 * Copyright (c) 2014, 2016 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtend.core.tests.compiler

import org.junit.Test

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
class CompilerBug412894Test extends AbstractXtendCompilerTest {
	
	@Test def void test_01() {
		'''
			class C {
				def m()	{
					val list = newArrayList
					list.forEach [
						switch it {
							String: list.add(it)
						}
					]
				}
			}
		'''.assertCompilesTo('''
			import java.util.ArrayList;
			import java.util.function.Consumer;
			import org.eclipse.xtext.xbase.lib.CollectionLiterals;
			
			@SuppressWarnings("all")
			public class C {
			  public void m() {
			    final ArrayList<String> list = CollectionLiterals.<String>newArrayList();
			    final Consumer<String> _function = (String it) -> {
			      boolean _matched = false;
			      if (it instanceof String) {
			        _matched=true;
			        list.add(it);
			      }
			    };
			    list.forEach(_function);
			  }
			}
		''')
	}
	
	@Test def void test_02() {
		'''
			class C {
				def m()	{
					val list = newArrayList
					list.forEach [
						switch it {
							String: list.add(it)
							Number: list.add(it)
						}
					]
				}
			}
		'''.assertCompilesTo('''
			import java.io.Serializable;
			import java.util.ArrayList;
			import java.util.function.Consumer;
			import org.eclipse.xtext.xbase.lib.CollectionLiterals;
			
			@SuppressWarnings("all")
			public class C {
			  public void m() {
			    final ArrayList<Serializable> list = CollectionLiterals.<Serializable>newArrayList();
			    final Consumer<Serializable> _function = (Serializable it) -> {
			      boolean _matched = false;
			      if (it instanceof String) {
			        _matched=true;
			        list.add(it);
			      }
			      if (!_matched) {
			        if (it instanceof Number) {
			          _matched=true;
			          list.add(it);
			        }
			      }
			    };
			    list.forEach(_function);
			  }
			}
		''')
	}
	
	@Test def void test_03() {
		'''
			class C {
				def m()	{
					val list = newArrayList
					list.forEach [
						switch it {
							Number: list.add(it.toString)
						}
					]
				}
			}
		'''.assertCompilesTo('''
			import java.io.Serializable;
			import java.util.ArrayList;
			import java.util.function.Consumer;
			import org.eclipse.xtext.xbase.lib.CollectionLiterals;
			
			@SuppressWarnings("all")
			public class C {
			  public void m() {
			    final ArrayList<Serializable> list = CollectionLiterals.<Serializable>newArrayList();
			    final Consumer<Serializable> _function = (Serializable it) -> {
			      boolean _matched = false;
			      if (it instanceof Number) {
			        _matched=true;
			        list.add(((Number)it).toString());
			      }
			    };
			    list.forEach(_function);
			  }
			}
		''')
	}
	
	@Test def void test_04() {
		'''
			class C {
				def m()	{
					val list = newArrayList
					list.forEach [
						if (it instanceof String) list.add(it)
					]
				}
			}
		'''.assertCompilesTo('''
			import java.util.ArrayList;
			import java.util.function.Consumer;
			import org.eclipse.xtext.xbase.lib.CollectionLiterals;
			
			@SuppressWarnings("all")
			public class C {
			  public void m() {
			    final ArrayList<Object> list = CollectionLiterals.<Object>newArrayList();
			    final Consumer<Object> _function = (Object it) -> {
			      if ((it instanceof String)) {
			        list.add(it);
			      }
			    };
			    list.forEach(_function);
			  }
			}
		''')
	}
	
}