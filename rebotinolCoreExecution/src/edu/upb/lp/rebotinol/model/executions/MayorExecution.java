package edu.upb.lp.rebotinol.model.executions;

import java.util.List;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.util.RebotinolExecutionException;

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
    protected boolean evalCondition(Fraction memory, Fraction matrixValue) throws RebotinolExecutionException {
        return memory.compareTo(matrixValue) == 1;
    }

}
