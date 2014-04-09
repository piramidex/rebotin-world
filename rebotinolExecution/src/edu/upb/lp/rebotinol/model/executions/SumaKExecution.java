package edu.upb.lp.rebotinol.model.executions;

import edu.upb.lp.rebotinol.exceptions.RebotinolExecutionException;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;

/**
 * Instruction to add a given number to the memorized number.
 * 
 * @author Alexis Marechal
 * 
 */
public class SumaKExecution extends ChangeMemoryExecution {
	private Double _valueToAdd;
	
	/**
	 * Constructor
	 * @param value The value in this instruction
	 */
	public SumaKExecution(Double value) {
		_valueToAdd = value;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doMemoryStep(RebotinolHouse house)
			throws RebotinolExecutionException {
		house.setMemory(getOldValue() + _valueToAdd);
	}
}