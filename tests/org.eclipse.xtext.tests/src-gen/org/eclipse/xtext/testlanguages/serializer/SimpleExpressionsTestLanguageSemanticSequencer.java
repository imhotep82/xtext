/*
 * generated by Xtext
 */
package org.eclipse.xtext.testlanguages.serializer;

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
import org.eclipse.xtext.testlanguages.services.SimpleExpressionsTestLanguageGrammarAccess;
import org.eclipse.xtext.testlanguages.simpleExpressions.Atom;
import org.eclipse.xtext.testlanguages.simpleExpressions.Op;
import org.eclipse.xtext.testlanguages.simpleExpressions.Sequence;
import org.eclipse.xtext.testlanguages.simpleExpressions.SimpleExpressionsPackage;

@SuppressWarnings("all")
public class SimpleExpressionsTestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SimpleExpressionsTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SimpleExpressionsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SimpleExpressionsPackage.ATOM:
				sequence_Atom(context, (Atom) semanticObject); 
				return; 
			case SimpleExpressionsPackage.OP:
				sequence_Addition_Multiplication(context, (Op) semanticObject); 
				return; 
			case SimpleExpressionsPackage.SEQUENCE:
				sequence_Sequence(context, (Sequence) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (values+=Addition_Op_1_0 (operator='+' | operator='-') values+=Multiplication) | 
	 *         (values+=Multiplication_Op_1_0 (operator='*' | operator='/') values+=Term)
	 *     )
	 */
	protected void sequence_Addition_Multiplication(EObject context, Op semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Atom(EObject context, Atom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=Sequence_Sequence_1_0 expressions+=Addition)
	 */
	protected void sequence_Sequence(EObject context, Sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}