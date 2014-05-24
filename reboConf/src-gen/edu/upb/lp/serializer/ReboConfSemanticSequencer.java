package edu.upb.lp.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import edu.upb.lp.reboConf.Configuration;
import edu.upb.lp.reboConf.Empty;
import edu.upb.lp.reboConf.Fraction;
import edu.upb.lp.reboConf.Line;
import edu.upb.lp.reboConf.Matrix;
import edu.upb.lp.reboConf.ReboConfPackage;
import edu.upb.lp.services.ReboConfGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ReboConfSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ReboConfGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ReboConfPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ReboConfPackage.CONFIGURATION:
				if(context == grammarAccess.getConfigurationRule()) {
					sequence_Configuration(context, (Configuration) semanticObject); 
					return; 
				}
				else break;
			case ReboConfPackage.EMPTY:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEmptyRule()) {
					sequence_Empty(context, (Empty) semanticObject); 
					return; 
				}
				else break;
			case ReboConfPackage.FRACTION:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getNegativeNumberRule() ||
				   context == grammarAccess.getNumberRule() ||
				   context == grammarAccess.getPositiveNumberRule()) {
					sequence_PositiveNumber(context, (Fraction) semanticObject); 
					return; 
				}
				else break;
			case ReboConfPackage.INTEGER:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getIntegerRule() ||
				   context == grammarAccess.getNegativeNumberRule() ||
				   context == grammarAccess.getNumberRule() ||
				   context == grammarAccess.getPositiveNumberRule() ||
				   context == grammarAccess.getPositiveNumberAccess().getFractionNumeratorAction_1_0()) {
					sequence_Integer(context, (edu.upb.lp.reboConf.Integer) semanticObject); 
					return; 
				}
				else break;
			case ReboConfPackage.LINE:
				if(context == grammarAccess.getLineRule()) {
					sequence_Line(context, (Line) semanticObject); 
					return; 
				}
				else break;
			case ReboConfPackage.MATRIX:
				if(context == grammarAccess.getMatrixRule()) {
					sequence_Matrix(context, (Matrix) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (initial=Matrix (expected=Matrix | mail=Number)?)
	 */
	protected void sequence_Configuration(EObject context, Configuration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Empty}
	 */
	protected void sequence_Empty(EObject context, Empty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Integer(EObject context, edu.upb.lp.reboConf.Integer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ReboConfPackage.Literals.INTEGER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReboConfPackage.Literals.INTEGER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (els+=Element els+=Element*)
	 */
	protected void sequence_Line(EObject context, Line semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     lines+=Line+
	 */
	protected void sequence_Matrix(EObject context, Matrix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (numerator=PositiveNumber_Fraction_1_0 denominator=Integer)
	 */
	protected void sequence_PositiveNumber(EObject context, Fraction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ReboConfPackage.Literals.FRACTION__NUMERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReboConfPackage.Literals.FRACTION__NUMERATOR));
			if(transientValues.isValueTransient(semanticObject, ReboConfPackage.Literals.FRACTION__DENOMINATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReboConfPackage.Literals.FRACTION__DENOMINATOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPositiveNumberAccess().getFractionNumeratorAction_1_0(), semanticObject.getNumerator());
		feeder.accept(grammarAccess.getPositiveNumberAccess().getDenominatorIntegerParserRuleCall_1_2_0(), semanticObject.getDenominator());
		feeder.finish();
	}
}
