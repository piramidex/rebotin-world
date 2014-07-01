package edu.upb.lp.rebotinol.xtextToSwing;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import edu.upb.lp.rebotinol.ComplexInstruction;
import edu.upb.lp.rebotinol.Difer;
import edu.upb.lp.rebotinol.Diferk;
import edu.upb.lp.rebotinol.EmptyInstruction;
import edu.upb.lp.rebotinol.Igual;
import edu.upb.lp.rebotinol.Igualk;
import edu.upb.lp.rebotinol.Instruction;
import edu.upb.lp.rebotinol.Mayor;
import edu.upb.lp.rebotinol.Mayork;
import edu.upb.lp.rebotinol.Menor;
import edu.upb.lp.rebotinol.Menork;
import edu.upb.lp.rebotinol.Multk;
import edu.upb.lp.rebotinol.NonEmptyInstruction;
import edu.upb.lp.rebotinol.RebotinolProgram;
import edu.upb.lp.rebotinol.Repetirn;
import edu.upb.lp.rebotinol.Sumak;
import edu.upb.lp.rebotinol.model.executions.AbaExecution;
import edu.upb.lp.rebotinol.model.executions.ArrExecution;
import edu.upb.lp.rebotinol.model.executions.DerExecution;
import edu.upb.lp.rebotinol.model.executions.DiferExecution;
import edu.upb.lp.rebotinol.model.executions.DiferkExecution;
import edu.upb.lp.rebotinol.model.executions.EnviarExecution;
import edu.upb.lp.rebotinol.model.executions.EnviarMatrizExecution;
import edu.upb.lp.rebotinol.model.executions.EscriExecution;
import edu.upb.lp.rebotinol.model.executions.IgualExecution;
import edu.upb.lp.rebotinol.model.executions.IgualkExecution;
import edu.upb.lp.rebotinol.model.executions.InverExecution;
import edu.upb.lp.rebotinol.model.executions.IzqExecution;
import edu.upb.lp.rebotinol.model.executions.MayorExecution;
import edu.upb.lp.rebotinol.model.executions.MayorkExecution;
import edu.upb.lp.rebotinol.model.executions.MemoExecution;
import edu.upb.lp.rebotinol.model.executions.MenorExecution;
import edu.upb.lp.rebotinol.model.executions.MenorkExecution;
import edu.upb.lp.rebotinol.model.executions.MultExecution;
import edu.upb.lp.rebotinol.model.executions.MultkExecution;
import edu.upb.lp.rebotinol.model.executions.RebotinolInstructionExecution;
import edu.upb.lp.rebotinol.model.executions.RepExecution;
import edu.upb.lp.rebotinol.model.executions.SequentialInstructionExecution;
import edu.upb.lp.rebotinol.model.executions.SignoExecution;
import edu.upb.lp.rebotinol.model.executions.SumaExecution;
import edu.upb.lp.rebotinol.model.executions.SumakExecution;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.util.RebotinolSwitch;

/**
 * This class builds the executions corresponding to the instructions that were
 * parsed from the XText file, by relying on the Switch design pattern.
 * 
 * @see RebotinolSwitch
 * 
 * @author Alexis Marechal
 * 
 */
public class ProgramBuilderFromXtext {
	private static InnerBuilder builder = new InnerBuilder();

	/**
	 * Build a sequential execution from a whole rebotinol program.
	 * 
	 * @param prog
	 *            The program on which we are willing to build an execution.
	 * @return The execution built.
	 * @throws RebotinolFatalException If something went very bad
	 */
	public static SequentialInstructionExecution buildProgram(
			RebotinolProgram prog) throws RebotinolFatalException {
		return (SequentialInstructionExecution) builder.build(prog);
	}

	/**
	 * Build an execution from an instruction. The other methods in this class
	 * are not meant to be used directly.
	 * 
	 * @param instr
	 *            The instruction on which we are building the execution.
	 * @return The execution built.
	 * @throws RebotinolFatalException If something went very bad.
	 */
	public static RebotinolInstructionExecution buildExecution(Instruction instr) throws RebotinolFatalException {
		return builder.build(instr);
	}

	private static class InnerBuilder extends
			RebotinolSwitch<RebotinolInstructionExecution> {
		
		public RebotinolInstructionExecution build(EObject obj) throws RebotinolFatalException {
			try {
				return doSwitch(obj);
			} catch (Exception e) {
				throw new RebotinolFatalException(e.getMessage());
			}
		}
		
		@Override
		public RebotinolInstructionExecution caseRebotinolProgram(
				RebotinolProgram program) {
			List<RebotinolInstructionExecution> subExecutions = new ArrayList<RebotinolInstructionExecution>();
			for (Instruction instr : program.getInstructions()) {
				try {
					subExecutions.add(buildExecution(instr));
				} catch (RebotinolFatalException e) {
					throw new IllegalStateException(e.getMessage());
				}
			}
			SequentialInstructionExecution exec = new SequentialInstructionExecution(
					subExecutions);
			return exec;
		}

		@Override
		public RebotinolInstructionExecution caseInstruction(Instruction instr) {
			throw new IllegalArgumentException(
					"Fatal! Found an instance of Instruction which is not any of its known subclasses!");
		}

		@Override
		public RebotinolInstructionExecution caseEmptyInstruction(
				EmptyInstruction instr) {
			switch (instr.getType()) {
			case ABA:
				return new AbaExecution();
			case ARR:
				return new ArrExecution();
			case DER:
				return new DerExecution();
			case ENVIAR:
				return new EnviarExecution();
			case ENVIAR_MATRIZ:
				return new EnviarMatrizExecution();
			case ESCRI:
				return new EscriExecution();
			case INVER:
				return new InverExecution();
			case IZQ:
				return new IzqExecution();
			case MEMO:
				return new MemoExecution();
			case MULT:
				return new MultExecution();
			case SIGNO:
				return new SignoExecution();
			case SUMA:
				return new SumaExecution();
			default:
				throw new IllegalArgumentException(
						"Fatal! Foudn an instance of EmptyInstruction which is not any of its known subclasses!");
			}
		}

		@Override
		public RebotinolInstructionExecution caseNonEmptyInstruction(
				NonEmptyInstruction instr) {
			throw new IllegalArgumentException(
					"Fatal! Found an instance of NonEmptyInstruction which is not any of its known subclasses!");
		}

		@Override
		public RebotinolInstructionExecution caseComplexInstruction(
				ComplexInstruction instr) {
			throw new IllegalArgumentException(
					"Fatal! Found an instance of ComplexInstruction which is not any of its known subclasses!");
		}

		@Override
		public RebotinolInstructionExecution caseSumak(Sumak instr) {
			return new SumakExecution(instr.getVal());
		}

		@Override
		public RebotinolInstructionExecution caseMultk(Multk instr) {
			return new MultkExecution(instr.getVal());
		}

		private List<RebotinolInstructionExecution> getSubExecutions(
				ComplexInstruction instr) {
			List<RebotinolInstructionExecution> ans = new ArrayList<RebotinolInstructionExecution>();
			for (Instruction subInstr : instr.getSubInstructions()) {
				try {
					ans.add(buildExecution(subInstr));
				} catch (RebotinolFatalException e) {
					throw new IllegalStateException(e.getMessage());
				}
			}
			return ans;
		}

		@Override
		public RebotinolInstructionExecution caseIgual(Igual instr) {
			return new IgualExecution(getSubExecutions(instr));
		}

		@Override
		public RebotinolInstructionExecution caseIgualk(Igualk instr) {
			return new IgualkExecution(getSubExecutions(instr), instr.getVal());
		}

		@Override
		public RebotinolInstructionExecution caseDifer(Difer instr) {
			return new DiferExecution(getSubExecutions(instr));
		}

		@Override
		public RebotinolInstructionExecution caseDiferk(Diferk instr) {
			return new DiferkExecution(getSubExecutions(instr), instr.getVal());
		}

		@Override
		public RebotinolInstructionExecution caseMayor(Mayor instr) {
			return new MayorExecution(getSubExecutions(instr));
		}

		@Override
		public RebotinolInstructionExecution caseMayork(Mayork instr) {
			return new MayorkExecution(getSubExecutions(instr), instr.getVal());
		}

		@Override
		public RebotinolInstructionExecution caseMenor(Menor instr) {
			return new MenorExecution(getSubExecutions(instr));
		}

		@Override
		public RebotinolInstructionExecution caseMenork(Menork instr) {
			return new MenorkExecution(getSubExecutions(instr), instr.getVal());
		}

		@Override
		public RebotinolInstructionExecution caseRepetirn(Repetirn instr) {
			List<RebotinolInstructionExecution> subExecutions = getSubExecutions(instr);
			for (int i=0; i<instr.getVal(); i++) {
				subExecutions.addAll(getSubExecutions(instr));
			}
			return new RepExecution(subExecutions, instr.getSubInstructions().size());
		}
	}
}
