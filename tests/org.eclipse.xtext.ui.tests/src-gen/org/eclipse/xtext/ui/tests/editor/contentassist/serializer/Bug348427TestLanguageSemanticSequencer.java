/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug348427TestLanguage.Bug348427TestLanguagePackage;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug348427TestLanguage.Child1;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug348427TestLanguage.Child2;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug348427TestLanguage.Model;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug348427TestLanguage.Scenario1;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug348427TestLanguage.Scenario2;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug348427TestLanguageGrammarAccess;

@SuppressWarnings("all")
public class Bug348427TestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Bug348427TestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Bug348427TestLanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Bug348427TestLanguagePackage.CHILD1:
				if(context == grammarAccess.getChild1_1Rule()) {
					sequence_Child1_1(context, (Child1) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getChild1_2Rule()) {
					sequence_Child1_2(context, (Child1) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getChild1_3Rule()) {
					sequence_Child1_3(context, (Child1) semanticObject); 
					return; 
				}
				else break;
			case Bug348427TestLanguagePackage.CHILD2:
				if(context == grammarAccess.getChild2_1Rule()) {
					sequence_Child2_1(context, (Child2) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getChild2_2Rule()) {
					sequence_Child2_2(context, (Child2) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getChild2_3Rule()) {
					sequence_Child2_3(context, (Child2) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getChild2_4Rule()) {
					sequence_Child2_4(context, (Child2) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getChild2_5Rule()) {
					sequence_Child2_5(context, (Child2) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getChild2_6Rule()) {
					sequence_Child2_6(context, (Child2) semanticObject); 
					return; 
				}
				else break;
			case Bug348427TestLanguagePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case Bug348427TestLanguagePackage.SCENARIO1:
				if(context == grammarAccess.getScenario1_1Rule()) {
					sequence_Scenario1_1(context, (Scenario1) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScenario1_2Rule()) {
					sequence_Scenario1_2(context, (Scenario1) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScenario1_3Rule()) {
					sequence_Scenario1_3(context, (Scenario1) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScenario1_4Rule()) {
					sequence_Scenario1_4(context, (Scenario1) semanticObject); 
					return; 
				}
				else break;
			case Bug348427TestLanguagePackage.SCENARIO2:
				if(context == grammarAccess.getScenario2_1Rule()) {
					sequence_Scenario2_1(context, (Scenario2) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScenario2_2Rule()) {
					sequence_Scenario2_2(context, (Scenario2) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScenario2_3Rule()) {
					sequence_Scenario2_3(context, (Scenario2) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScenario2_4Rule()) {
					sequence_Scenario2_4(context, (Scenario2) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScenario2_5Rule()) {
					sequence_Scenario2_5(context, (Scenario2) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScenario2_6Rule()) {
					sequence_Scenario2_6(context, (Scenario2) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScenario2_7Rule()) {
					sequence_Scenario2_7(context, (Scenario2) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScenario2_8Rule()) {
					sequence_Scenario2_8(context, (Scenario2) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID bool?='bool'? enumType=EnumType)
	 */
	protected void sequence_Child1_1(EObject context, Child1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID bool?='bool'? enumType=EnumType)
	 */
	protected void sequence_Child1_2(EObject context, Child1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID bool?='bool'? enumType=EnumType)
	 */
	protected void sequence_Child1_3(EObject context, Child1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID bool?='bool'? (string='a' | string='b'))
	 */
	protected void sequence_Child2_1(EObject context, Child2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID bool?='bool'? (string='a' | string='b'))
	 */
	protected void sequence_Child2_2(EObject context, Child2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID bool?='bool'? (string='a' | string='b'))
	 */
	protected void sequence_Child2_3(EObject context, Child2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID bool?='bool'? (string='a' | string='b'))
	 */
	protected void sequence_Child2_4(EObject context, Child2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID bool?='bool'? (string='a' | string='b'))
	 */
	protected void sequence_Child2_5(EObject context, Child2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID bool?='bool'? (string='a' | string='b'))
	 */
	protected void sequence_Child2_6(EObject context, Child2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         element1=Scenario1_1 | 
	 *         element1=Scenario1_2 | 
	 *         element1=Scenario1_3 | 
	 *         element1=Scenario1_4 | 
	 *         element2=Scenario2_1 | 
	 *         element2=Scenario2_2 | 
	 *         element2=Scenario2_3 | 
	 *         element2=Scenario2_4 | 
	 *         element2=Scenario2_5 | 
	 *         element2=Scenario2_6 | 
	 *         element2=Scenario2_7 | 
	 *         element2=Scenario2_8
	 *     )
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (child+=Child1_1 | child+=Child1_2 | child+=Child1_3)
	 */
	protected void sequence_Scenario1_1(EObject context, Scenario1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (child+=Child1_1 | child+=Child1_2 | child+=Child1_3)+
	 */
	protected void sequence_Scenario1_2(EObject context, Scenario1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((child+=Child1_1 | child+=Child1_2 | child+=Child1_3)*)
	 */
	protected void sequence_Scenario1_3(EObject context, Scenario1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((child+=Child1_1 | child+=Child1_2 | child+=Child1_3)?)
	 */
	protected void sequence_Scenario1_4(EObject context, Scenario1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (child+=Child2_1 | child+=Child2_2 | child+=Child2_3)
	 */
	protected void sequence_Scenario2_1(EObject context, Scenario2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (child+=Child2_1 | child+=Child2_2 | child+=Child2_3)+
	 */
	protected void sequence_Scenario2_2(EObject context, Scenario2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (child+=Child2_4 | child+=Child2_5 | child+=Child2_6)
	 */
	protected void sequence_Scenario2_3(EObject context, Scenario2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (child+=Child2_4 | child+=Child2_5 | child+=Child2_6)+
	 */
	protected void sequence_Scenario2_4(EObject context, Scenario2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((child+=Child2_1 | child+=Child2_2 | child+=Child2_3)?)
	 */
	protected void sequence_Scenario2_5(EObject context, Scenario2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((child+=Child2_1 | child+=Child2_2 | child+=Child2_3)*)
	 */
	protected void sequence_Scenario2_6(EObject context, Scenario2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((child+=Child2_4 | child+=Child2_5 | child+=Child2_6)?)
	 */
	protected void sequence_Scenario2_7(EObject context, Scenario2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((child+=Child2_4 | child+=Child2_5 | child+=Child2_6)*)
	 */
	protected void sequence_Scenario2_8(EObject context, Scenario2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}