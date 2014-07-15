package edu.upb.lp.rebotinol.model.executions;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;

/**
 * Instruction to add a given number to the memorized number.
 * 
 * @author Alexis Marechal
 * 
 */
public class SumakExecution extends ChangeMemoryExecution {
	private Fraction _valueToAdd;
	
	/**
	 * Constructor
	 * @param value The value in this instruction
	 */
	public SumakExecution(Fraction value) {
		_valueToAdd = value;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doMemoryStep(RebotinolHouse house)
			throws RebotinolExecutionException {
		house.setMemory(getOldValue().add(_valueToAdd));
	}
}