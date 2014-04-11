package edu.upb.lp.rebotinol.model.executions;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;

/**
 * Instruction to add a given number to the memorized number.
 * 
 * @author Alexis Marechal
 * 
 */
public class MultkExecution extends ChangeMemoryExecution {
	private int _valueToAdd;
	
	/**
     * Constructor
     * @param value The value in this instruction
     */
	public MultkExecution(int value) {
		_valueToAdd = value;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doMemoryStep(RebotinolHouse house)
			throws RebotinolExecutionException {
		house.setMemory(getOldValue() * _valueToAdd);
	}
}