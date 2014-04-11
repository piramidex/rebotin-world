package edu.upb.lp.rebotinol.model.executions;

import java.util.List;

import edu.upb.lp.rebotinol.util.RebotinolExecutionException;

/**
 * Instruction to check if the memory content is different to the current value shown in the matrix
 * @author Alexis Marechal
 *
 */
public class DiferExecution extends MatrixConditionalExecution {

    /**
     * Constructor
     * 
     * @param subExecutions
     *            The subExecutions of this sequential instruction execution
     */
    public DiferExecution(List<RebotinolInstructionExecution> subExecutions) {
        super(subExecutions);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean evalCondition(Double memory, Double matrixValue) throws RebotinolExecutionException {
        return !memory.equals(matrixValue);
    }

}
