package edu.upb.lp.rebotinol.model.executions;

import java.util.List;

import edu.upb.lp.rebotinol.exceptions.RebotinolExecutionException;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;

/**
 * A {@link ConditionalExecution} whose condition depends on the memory value
 * and the current value shown in the matrix. The specific condition is to be
 * defined in each subclass.
 * 
 * @author Alexis Marechal
 * 
 */
public abstract class MatrixConditionalExecution extends ConditionalExecution {
    /**
     * Constructor
     * 
     * @param subExecutions
     *            The subExecutions of this sequential instruction execution
     */
    public MatrixConditionalExecution(List<RebotinolInstructionExecution> subExecutions) {
        super(subExecutions);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean evalCondition(RebotinolHouse house) throws RebotinolExecutionException {
        Double mem = house.getMemory();
        if (mem == null) {
            throw new RebotinolExecutionException(
                    "Cannot evaluate a conditional instruction while the memory is empty!");
        }
        Double curr = house.getCurrentMatrixValue();
        if (curr == null) {
            throw new RebotinolExecutionException(
                    "Cannot evaluate a conditional instruction while watching an empty position in the matrix!");
        }
        return evalCondition(mem, curr);
    }

    /**
     * Evaluate the specific condition for this conditional execution based on
     * the memory and the current value shown in the matrix.
     * 
     * @param memory
     *            The current value in rebotin's memory
     * @param currentValue
     *            The current value shown in the matrix
     * @return true if this conditional execution condition has been met
     * @throws RebotinolExecutionException
     *             If the evaluation condition met an error (e.g., empty memory
     *             or empty matrix value)
     */
    protected abstract boolean evalCondition(Double memory, Double currentValue) throws RebotinolExecutionException;

}
