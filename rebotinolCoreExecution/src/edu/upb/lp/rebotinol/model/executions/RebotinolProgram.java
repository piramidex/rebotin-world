package edu.upb.lp.rebotinol.model.executions;

import java.util.List;

import edu.upb.lp.rebotinol.util.RebotinolExecutionVisitor;

/**
 * A rebotinol program, which is simply a basic instance of
 * {@link SequentialInstructionExecution}.
 * 
 * @author Alexis Marechal
 * 
 */
public class RebotinolProgram extends SequentialInstructionExecution {

	/**
	 * Constructor
	 * 
	 * @param subExecutions
	 *            The executions that conform this program.
	 */
	public RebotinolProgram(List<RebotinolInstructionExecution> executions) {
		super(executions);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object accept(RebotinolExecutionVisitor v) {
		return v.visit(this);
	}
}
