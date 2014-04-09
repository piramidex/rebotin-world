package edu.upb.lp.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import edu.upb.lp.rebotinol.Difer;
import edu.upb.lp.rebotinol.Diferk;
import edu.upb.lp.rebotinol.EmptyInstruction;
import edu.upb.lp.rebotinol.Igual;
import edu.upb.lp.rebotinol.Igualk;
import edu.upb.lp.rebotinol.Mayor;
import edu.upb.lp.rebotinol.Mayork;
import edu.upb.lp.rebotinol.Menor;
import edu.upb.lp.rebotinol.Menork;
import edu.upb.lp.rebotinol.Multk;
import edu.upb.lp.rebotinol.RebotinolPackage;
import edu.upb.lp.rebotinol.RebotinolProgram;
import edu.upb.lp.rebotinol.Repetirn;
import edu.upb.lp.rebotinol.Sumak;
import edu.upb.lp.services.RebotinolGrammarAccess;
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
public class RebotinolSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RebotinolGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RebotinolPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RebotinolPackage.DIFER:
				if(context == grammarAccess.getComplexInstructionRule() ||
				   context == grammarAccess.getDiferRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getNonEmptyInstructionRule()) {
					sequence_Difer(context, (Difer) semanticObject); 
					return; 
				}
				else break;
			case RebotinolPackage.DIFERK:
				if(context == grammarAccess.getComplexInstructionRule() ||
				   context == grammarAccess.getDiferkRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getNonEmptyInstructionRule()) {
					sequence_Diferk(context, (Diferk) semanticObject); 
					return; 
				}
				else break;
			case RebotinolPackage.EMPTY_INSTRUCTION:
				if(context == grammarAccess.getEmptyInstructionRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_EmptyInstruction(context, (EmptyInstruction) semanticObject); 
					return; 
				}
				else break;
			case RebotinolPackage.IGUAL:
				if(context == grammarAccess.getComplexInstructionRule() ||
				   context == grammarAccess.getIgualRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getNonEmptyInstructionRule()) {
					sequence_Igual(context, (Igual) semanticObject); 
					return; 
				}
				else break;
			case RebotinolPackage.IGUALK:
				if(context == grammarAccess.getComplexInstructionRule() ||
				   context == grammarAccess.getIgualkRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getNonEmptyInstructionRule()) {
					sequence_Igualk(context, (Igualk) semanticObject); 
					return; 
				}
				else break;
			case RebotinolPackage.MAYOR:
				if(context == grammarAccess.getComplexInstructionRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getMayorRule() ||
				   context == grammarAccess.getNonEmptyInstructionRule()) {
					sequence_Mayor(context, (Mayor) semanticObject); 
					return; 
				}
				else break;
			case RebotinolPackage.MAYORK:
				if(context == grammarAccess.getComplexInstructionRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getMayorkRule() ||
				   context == grammarAccess.getNonEmptyInstructionRule()) {
					sequence_Mayork(context, (Mayork) semanticObject); 
					return; 
				}
				else break;
			case RebotinolPackage.MENOR:
				if(context == grammarAccess.getComplexInstructionRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getMenorRule() ||
				   context == grammarAccess.getNonEmptyInstructionRule()) {
					sequence_Menor(context, (Menor) semanticObject); 
					return; 
				}
				else break;
			case RebotinolPackage.MENORK:
				if(context == grammarAccess.getComplexInstructionRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getMenorkRule() ||
				   context == grammarAccess.getNonEmptyInstructionRule()) {
					sequence_Menork(context, (Menork) semanticObject); 
					return; 
				}
				else break;
			case RebotinolPackage.MULTK:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getMultkRule() ||
				   context == grammarAccess.getNonEmptyInstructionRule()) {
					sequence_Multk(context, (Multk) semanticObject); 
					return; 
				}
				else break;
			case RebotinolPackage.REBOTINOL_PROGRAM:
				if(context == grammarAccess.getRebotinolProgramRule()) {
					sequence_RebotinolProgram(context, (RebotinolProgram) semanticObject); 
					return; 
				}
				else break;
			case RebotinolPackage.REPETIRN:
				if(context == grammarAccess.getComplexInstructionRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getNonEmptyInstructionRule() ||
				   context == grammarAccess.getRepetirnRule()) {
					sequence_Repetirn(context, (Repetirn) semanticObject); 
					return; 
				}
				else break;
			case RebotinolPackage.SUMAK:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getNonEmptyInstructionRule() ||
				   context == grammarAccess.getSumakRule()) {
					sequence_Sumak(context, (Sumak) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     subInstructions+=Instruction+
	 */
	protected void sequence_Difer(EObject context, Difer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (val=INT subInstructions+=Instruction+)
	 */
	protected void sequence_Diferk(EObject context, Diferk semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=EmptyInstructionType
	 */
	protected void sequence_EmptyInstruction(EObject context, EmptyInstruction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RebotinolPackage.Literals.EMPTY_INSTRUCTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RebotinolPackage.Literals.EMPTY_INSTRUCTION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEmptyInstructionAccess().getTypeEmptyInstructionTypeEnumRuleCall_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     subInstructions+=Instruction+
	 */
	protected void sequence_Igual(EObject context, Igual semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (val=INT subInstructions+=Instruction+)
	 */
	protected void sequence_Igualk(EObject context, Igualk semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     subInstructions+=Instruction+
	 */
	protected void sequence_Mayor(EObject context, Mayor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (val=INT subInstructions+=Instruction+)
	 */
	protected void sequence_Mayork(EObject context, Mayork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     subInstructions+=Instruction+
	 */
	protected void sequence_Menor(EObject context, Menor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (val=INT subInstructions+=Instruction+)
	 */
	protected void sequence_Menork(EObject context, Menork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_Multk(EObject context, Multk semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RebotinolPackage.Literals.MULTK__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RebotinolPackage.Literals.MULTK__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultkAccess().getValINTTerminalRuleCall_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     instructions+=Instruction+
	 */
	protected void sequence_RebotinolProgram(EObject context, RebotinolProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (val=INT subInstructions+=Instruction+)
	 */
	protected void sequence_Repetirn(EObject context, Repetirn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_Sumak(EObject context, Sumak semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RebotinolPackage.Literals.SUMAK__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RebotinolPackage.Literals.SUMAK__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSumakAccess().getValINTTerminalRuleCall_1_0(), semanticObject.getVal());
		feeder.finish();
	}
}
