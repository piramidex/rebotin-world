package edu.upb.lp.rebotinol.model.executions;

import java.util.List;

import edu.upb.lp.rebotinol.util.RebotinolExecutionVisitor;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;

public class RepExecution extends SequentialInstructionExecution {
    private int _numberOfInstructions;
    
    /**
     * Constructor. If the REP instruction has 3 sub-instructions, and a number
     * of repetitions of 4, then the length of the subExecutions parameter
     * should be 12.
     * 
     * @param subExecutions
     *            The sub-executions in this RepExecution
     * @param numberOfInstructions
     *            The number of sub-instructions in the rep instruction.
     */
    public RepExecution(List<RebotinolInstructionExecution> subExecutions, int numberOfInstructions) {
        super(subExecutions);
        _numberOfInstructions = numberOfInstructions;
    }
     
    /**
     * {@inheritDoc}
     */
    @Override
    public int getCurrentExecutionIndex() {
        return getCurrentExecutionIndex()%_numberOfInstructions;
    }
    
    /**
     * Computes the number of repetitions that have already been performed in this execution.
     * @return The number of repetitions that have already been performed in this execution.
     */
    public int getRepetitionsPerformed() {
        return getCurrentExecutionIndex()/_numberOfInstructions;
    }
    
    /**
     * Computes the total number of repetitions that should be performed by this execution.
     * @return The total number of repetitions that should be performed by this execution.
     */
    public int getTotalNumberOfRepetitions() {
    	return getSubExecutions().size()/_numberOfInstructions;
    }
    //TODO avisar cada que termina una vuelta hacia adelante y atras
    
    /**
     * @return The number of instructions to be executed at each repetition.
     */
    public int getNumberOfInstructionsPerRepetition() {
    	return _numberOfInstructions;
    }
    
    /**
	 * {@inheritDoc}
	 */
	@Override
	public Object accept(RebotinolExecutionVisitor v) {
		return v.visit(this);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isBreakpoint() {
		return false;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toggleBreakpoint() throws RebotinolFatalException {
		throw new RebotinolFatalException("Cannot set a breakpoint in a rep execution");
	}
	
}
