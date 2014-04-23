package edu.upb.lp.rebotinol.model.executions;

import java.util.List;

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
        return getCurrentExecution()%_numberOfInstructions;
    }
    
    /**
     * Computes the number of repetitions that have already been performed in this execution.
     * @return The number of repetitions that have already been performed in this execution.
     */
    public int getRepetitionsPerformed() {
        return getCurrentExecution()/_numberOfInstructions;
    }
}
