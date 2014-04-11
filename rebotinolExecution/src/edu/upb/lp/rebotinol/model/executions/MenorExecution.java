package edu.upb.lp.rebotinol.model.executions;

import java.util.List;

import edu.upb.lp.rebotinol.util.RebotinolExecutionException;

/**
 * A conditional execution whose condition is that the memory value is smaller than the current matrix value
 * @author Alexis Marechal
 *
 */
public class MenorExecution extends MatrixConditionalExecution {
    /**
     * Constructor
     * 
     * @param subExecutions
     *            The subExecutions of this sequential instruction execution
     */
    public MenorExecution(List<RebotinolInstructionExecution> subExecutions) {
        super(subExecutions);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean evalCondition(Double memory, Double matrixValue) throws RebotinolExecutionException {
        return memory <= matrixValue;
    }

}
