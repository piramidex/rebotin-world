package edu.upb.lp.rebotinol.model.executions;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;
import edu.upb.lp.rebotinol.util.RebotinolExecutionVisitor;

/**
 * Instruction to add a given number to the memorized number.
 * 
 * @author Alexis Marechal
 * 
 */
public class MultkExecution extends ChangeMemoryExecution {
	private Fraction _valueToMultiply;
	
	/**
     * Constructor
     * @param value The value in this instruction
     */
	public MultkExecution(Fraction value) {
		_valueToMultiply = value;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doMemoryStep(RebotinolHouse house)
			throws RebotinolExecutionException {
//		Fraction res = getOldValue().multiply(_valueToMultiply);
//		house.setMemory(Fraction.getReducedFraction(res.getNumerator(), res.getDenominator()));
		house.setMemory(getOldValue().multiply(_valueToMultiply));
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object accept(RebotinolExecutionVisitor v) {
		return v.visit(this);
	}
	
	/**
	 * @return The value to be multiplied
	 */
	public Fraction getValue() {
		return _valueToMultiply;
	}
}