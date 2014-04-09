package edu.upb.lp.rebotinol.model.executions;

import edu.upb.lp.rebotinol.exceptions.RebotinolExecutionException;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;

/**
 * Instruction to invert the memorized number.
 * 
 * @author Alexis Marechal
 * 
 */
public class InverExecution extends RebotinolInstructionExecution {	
	private Double _oldValue;

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doStep(RebotinolHouse house)
			throws RebotinolExecutionException {
		Double val = house.getMemory();
		if (val == null) {
			throw new RebotinolExecutionException(
					"Tried to invert while the memory was empty!");
		}
		_oldValue = val;
		house.setMemory(1/val);
		finish();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doStepBack(RebotinolHouse house) {
		house.setMemory(_oldValue);
		_oldValue = null;
		unfinish();
	}
}