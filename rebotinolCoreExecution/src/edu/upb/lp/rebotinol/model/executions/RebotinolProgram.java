package edu.upb.lp.rebotinol.model.executions;

import java.util.List;

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

}
