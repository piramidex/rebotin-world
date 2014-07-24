package edu.upb.lp.rebotinol.view.program.executions;

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
import edu.upb.lp.rebotinol.model.executions.RebotinolProgram;
import edu.upb.lp.rebotinol.model.executions.RepExecution;
import edu.upb.lp.rebotinol.model.executions.SignoExecution;
import edu.upb.lp.rebotinol.model.executions.SumaExecution;
import edu.upb.lp.rebotinol.model.executions.SumakExecution;
import edu.upb.lp.rebotinol.util.RebotinolExecutionVisitor;

public class ExecutionsNameGetter extends RebotinolExecutionVisitor {

	private static ExecutionsNameGetter getter = new ExecutionsNameGetter();
	
	/**
	 * Gets the name of an instruction execution.
	 * @param exec
	 * @return
	 */
	public static String getName(RebotinolInstructionExecution exec) {
		return (String) getter.visit(exec);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(AbaExecution exec) {
		return "ABA";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(ArrExecution exec) {
		return "ARR";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(DerExecution exec) {
		return "DER";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(DiferExecution exec) {
		return "DIFER";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(DiferkExecution exec) {
		return "DIFER " + exec.getFixedValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(EnviarExecution exec) {
		return "ENVIAR";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(EnviarMatrizExecution exec) {
		return "ENVIAR MATRIZ";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(EscriExecution exec) {
		return "ESCRI";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(IgualExecution exec) {
		return "IGUAL";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(IgualkExecution exec) {
		return "IGUAL " + exec.getFixedValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(InverExecution exec) {
		return "INVER";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(IzqExecution exec) {
		return "IZQ";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(MayorExecution exec) {
		return "MAYOR";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(MayorkExecution exec) {
		return "MAYOR " + exec.getFixedValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(MemoExecution exec) {
		return "MEMO";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(MenorExecution exec) {
		return "MENOR";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(MenorkExecution exec) {
		return "MENOR " + exec.getFixedValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(MultExecution exec) {
		return "MULT";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(MultkExecution exec) {
		return "MULT " + exec.getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(RebotinolProgram exec) {
		//Do nothing
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(RepExecution exec) {
		return "REP " + exec.getTotalNumberOfRepetitions();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(SignoExecution exec) {
		return "SIGNO";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(SumaExecution exec) {
		return "SUMA";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object visit(SumakExecution exec) {
		return "SUMA " + exec.getValue();
	}
}
