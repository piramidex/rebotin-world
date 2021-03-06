package edu.upb.lp.rebotinol.model.executions;

import java.util.List;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.util.RebotinolExecutionException;
import edu.upb.lp.rebotinol.util.RebotinolExecutionVisitor;

public class DiferkExecution extends FixedConditionalExecution {

    /**
     * Constructor
     * @param value The value in this instruction
     */
    public DiferkExecution(List<RebotinolInstructionExecution> subExecutions, Fraction fixedValue) {
        super(subExecutions, fixedValue);
    }

    /**
     * {@inheritDoc} 
     */
    @Override
    protected boolean evalCondition(Fraction memory) throws RebotinolExecutionException {
        return !memory.equals(getFixedValue());
    }

    /**
	 * {@inheritDoc}
	 */
	@Override
	public Object accept(RebotinolExecutionVisitor v) {
		return v.visit(this);
	}
}
