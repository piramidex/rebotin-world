package edu.upb.lp.rebotinol.model.executions;

import java.util.List;

import edu.upb.lp.rebotinol.exceptions.RebotinolExecutionException;

/**
 * Instruction to check if the memory content is equal to the current value shown in the matrix
 * @author Alexis Marechal
 *
 */
public class IgualExecution extends MatrixConditionalExecution {

    /**
     * Constructor
     * 
     * @param subExecutions
     *            The subExecutions of this sequential instruction execution
     */
    public IgualExecution(List<RebotinolInstructionExecution> subExecutions) {
        super(subExecutions);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean evalCondition(Double memory, Double matrixValue) throws RebotinolExecutionException {
        return memory.equals(matrixValue);
    }

}
