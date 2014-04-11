package edu.upb.lp.rebotinol.model.executions;

import java.util.List;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.util.RebotinolExecutionException;

public class DiferkExecution extends FixedConditionalExecution {

    /**
     * Constructor
     * @param value The value in this instruction
     */
    public DiferkExecution(List<RebotinolInstructionExecution> subExecutions, int fixedValue) {
        super(subExecutions, fixedValue);
    }

    /**
     * {@inheritDoc} 
     */
    @Override
    protected boolean evalCondition(Fraction memory) throws RebotinolExecutionException {
        return !memory.equals(getFixedValue());
    }

}
