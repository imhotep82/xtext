/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.idea.resource

import org.eclipse.emf.ecore.resource.ResourceSet
import com.google.inject.ImplementedBy

@ImplementedBy(ProjectBasedResourceSetProvider)
interface IResourceSetProvider {
	
	def ResourceSet get(Object context)
	
}