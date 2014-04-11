package edu.upb.lp.rebotinol.model.executions;

import java.util.List;

import org.apache.commons.math3.fraction.Fraction;

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
    protected boolean evalCondition(Fraction memory, Fraction matrixValue) throws RebotinolExecutionException {
        return !memory.equals(matrixValue);
    }

}
