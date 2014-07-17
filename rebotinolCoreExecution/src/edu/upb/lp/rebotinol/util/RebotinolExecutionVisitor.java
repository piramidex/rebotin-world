package edu.upb.lp.rebotinol.util;

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

/**
 * Visitor design pattern for rebotinol executions
 * @author Alexis Marechal
 *
 */
public abstract class RebotinolExecutionVisitor {
	/**
	 * Visit an {@link AbaExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(AbaExecution exec);
	
	/**
	 * Visit an {@link ArrExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(ArrExecution exec);
	
	/**
	 * Visit a {@link DerExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(DerExecution exec);
	
	/**
	 * Visit a {@link DiferExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(DiferExecution exec);
	
	/**
	 * Visit a {@link DiferkExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(DiferkExecution exec);
	
	/**
	 * Visit an {@link EnviarExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(EnviarExecution exec);
	
	/**
	 * Visit an {@link EnviarMatrizExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(EnviarMatrizExecution exec);
	
	/**
	 * Visit an {@link EscriExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(EscriExecution exec);

	/**
	 * Visit an {@link IgualExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(IgualExecution exec);
	
	/**
	 * Visit an {@link IgualklExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(IgualkExecution exec);
	
	/**
	 * Visit an {@link InverExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(InverExecution exec);
	
	/**
	 * Visit an {@link IzqExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(IzqExecution exec);

	/**
	 * Visit a {@link MayorExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(MayorExecution exec);
	
	/**
	 * Visit a {@link MayorkExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(MayorkExecution exec);
	
	/**
	 * Visit a {@link MemoExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(MemoExecution exec);
	
	/**
	 * Visit a {@link MenorExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(MenorExecution exec);
	
	/**
	 * Visit a {@link MenorkExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(MenorkExecution exec);

	/**
	 * Visit a {@link MultExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(MultExecution exec);
	
	/**
	 * Visit a {@link MultkExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(MultkExecution exec);

	/**
	 * Visit a {@link RebotinolProgram}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(RebotinolProgram exec);
	
	/**
	 * Visit a {@link RepExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(RepExecution exec);

	/**
	 * Visit a {@link SignoExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(SignoExecution exec);
	
	/**
	 * Visit a {@link SumaExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(SumaExecution exec);
	
	/**
	 * Visit a {@link SumakExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public abstract Object visit(SumakExecution exec);
	
	/**
	 * Visit a {@link RebotinolInstructionExecution}.
	 * @param exec The execution to be visited
	 * @return The result of the visit.
	 */
	public Object visit(RebotinolInstructionExecution exec) {
		return exec.accept(this);
	}
}
