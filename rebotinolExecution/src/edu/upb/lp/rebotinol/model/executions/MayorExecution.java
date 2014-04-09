package edu.upb.lp.rebotinol.model.executions;

import java.util.List;

import edu.upb.lp.rebotinol.exceptions.RebotinolExecutionException;

/**
 * A conditional execution whose condition is that the memory value is greater than the current matrix value
 * @author Alexis Marechal
 *
 */
public class MayorExecution extends MatrixConditionalExecution {

    /**
     * Constructor
     * 
     * @param subExecutions
     *            The subExecutions of this sequential instruction execution
     */
    public MayorExecution(List<RebotinolInstructionExecution> subExecutions) {
        super(subExecutions);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean evalCondition(Double memory, Double matrixValue) throws RebotinolExecutionException {
        return memory >= matrixValue;
    }

}
