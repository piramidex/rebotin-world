package edu.upb.lp.rebotinol.model.executions;

import java.util.List;

import edu.upb.lp.rebotinol.exceptions.RebotinolExecutionException;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;

/**
 * A {@link ConditionalExecution} whose condition depends on the memory value
 * and a fixed value. The specific condition is to be defined in each subclass.
 * 
 * @author Alexis Marechal
 * 
 */
public abstract class FixedConditionalExecution extends ConditionalExecution {

    private Double _fixedValue;

    /**
     * 
     * @param subExecutions
     *            The subExecutions of this sequential instruction execution
     * @param fixedValue
     *            The fixed value on which this {@link ConditionalExecution}
     *            will evaluate its condition
     */
    public FixedConditionalExecution(List<RebotinolInstructionExecution> subExecutions, Double fixedValue) {
        super(subExecutions);
        _fixedValue = fixedValue;
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
        return evalCondition(mem, _fixedValue);
    }

    /**
     * Evaluate the specific condition for this conditional execution based on
     * the memory and the current value shown in the matrix.
     * 
     * @param memory
     *            The current value in rebotin's memory
     * @param fixedValue
     *            The fixed value in this condition
     * @return true if this conditional execution condition has been met
     * @throws RebotinolExecutionException
     *             If the evaluation condition met an error (e.g., empty memory
     *             or empty matrix value)
     */
    protected abstract boolean evalCondition(Double memory, Double fixedValue) throws RebotinolExecutionException;

}
