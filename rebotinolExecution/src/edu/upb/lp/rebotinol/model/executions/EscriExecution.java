package edu.upb.lp.rebotinol.model.executions;

import edu.upb.lp.rebotinol.exceptions.RebotinolExecutionException;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;

/**
 * Instruction to write the memorized number on the matrix.
 * 
 * @author Alexis Marechal
 * 
 */
public class EscriExecution extends RebotinolInstructionExecution {
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
					"Tried to write on the matrix while the memory was empty!");
		}
		_oldValue = house.getCurrentMatrixValue();
		house.writeInMatrix(val);
		finish();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doStepBack(RebotinolHouse house) {
		house.writeInMatrix(_oldValue);
		_oldValue = null;
		unfinish();
	}
}