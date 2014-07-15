package edu.upb.lp.rebotinol.model.executions;

import java.util.List;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.util.RebotinolExecutionException;

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
    public MayorkExecution(List<RebotinolInstructionExecution> subExecutions, Fraction fixedValue) {
        super(subExecutions, fixedValue);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean evalCondition(Fraction memory) throws RebotinolExecutionException {
        return memory.compareTo(getFixedValue()) == 1;
    }

}
