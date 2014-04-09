package edu.upb.lp.rebotinol.model.executions;

import java.util.List;

import edu.upb.lp.rebotinol.exceptions.RebotinolExecutionException;

public class IgualkExecution extends FixedConditionalExecution {

    /**
     * Constructor
     * @param value The value in this instruction
     */
    public IgualkExecution(List<RebotinolInstructionExecution> subExecutions, Double fixedValue) {
        super(subExecutions, fixedValue);
    }

    /**
     * {@inheritDoc} 
     */
    @Override
    protected boolean evalCondition(Double memory, Double fixedValue) throws RebotinolExecutionException {
        return memory.equals(fixedValue);
    }

}
