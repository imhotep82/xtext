/*
 * generated by Xtext
 */
package org.eclipse.xtext.xbase.annotations.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.eclipse.xtext.xbase.ui.internal.XtypeActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class XbaseWithAnnotationsExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return XtypeActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return XtypeActivator.getInstance().getInjector(XtypeActivator.ORG_ECLIPSE_XTEXT_XBASE_ANNOTATIONS_XBASEWITHANNOTATIONS);
	}
	
}