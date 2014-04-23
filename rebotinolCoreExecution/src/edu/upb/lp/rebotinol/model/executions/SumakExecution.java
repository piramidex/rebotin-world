package edu.upb.lp.rebotinol.model.executions;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;

/**
 * Instruction to add a given number to the memorized number.
 * 
 * @author Alexis Marechal
 * 
 */
public class SumakExecution extends ChangeMemoryExecution {
	private int _valueToAdd;
	
	/**
	 * Constructor
	 * @param value The value in this instruction
	 */
	public SumakExecution(int value) {
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