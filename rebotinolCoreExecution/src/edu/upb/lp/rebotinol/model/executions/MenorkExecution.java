package edu.upb.lp.rebotinol.model.executions;

import java.util.List;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.util.RebotinolExecutionException;

public class MenorkExecution extends FixedConditionalExecution {

    /**
     * Constructor
     * @param value The value in this instruction
     */
    public MenorkExecution(List<RebotinolInstructionExecution> subExecutions, int fixedValue) {
        super(subExecutions, fixedValue);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean evalCondition(Fraction memory) throws RebotinolExecutionException {
        return memory.compareTo(new Fraction(getFixedValue())) != 1;
    }

}
