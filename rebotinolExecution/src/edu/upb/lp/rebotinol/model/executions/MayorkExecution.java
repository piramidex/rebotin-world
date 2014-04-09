package edu.upb.lp.rebotinol.model.executions;

import java.util.List;

import edu.upb.lp.rebotinol.exceptions.RebotinolExecutionException;

/**
 * A conditional execution whose condition is that the memory value is greater than a fixed value
 * @author Alexis Marechal
 *
 */
public class MayorkExecution extends FixedConditionalExecution {

    /**
     * Constructor
     * 
     * @param subExecutions
     *            The subExecutions of this sequential instruction execution
     */
    public MayorkExecution(List<RebotinolInstructionExecution> subExecutions, Double fixedValue) {
        super(subExecutions, fixedValue);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean evalCondition(Double memory, Double fixedValue) throws RebotinolExecutionException {
        return memory >= fixedValue;
    }

}
