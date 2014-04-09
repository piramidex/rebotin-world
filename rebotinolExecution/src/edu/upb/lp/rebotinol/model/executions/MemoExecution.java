package edu.upb.lp.rebotinol.model.executions;

import edu.upb.lp.rebotinol.exceptions.RebotinolExecutionException;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;

/**
 * An instruction to memorize the current number in the matrix.
 *
 * @author Alexis Marechal
 *
 */
public class MemoExecution extends RebotinolInstructionExecution {

	private Double _oldValue;

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doStep(RebotinolHouse house)
			throws RebotinolExecutionException {
		Double val = house.getCurrentMatrixValue();
		if (val == null) {
			throw new RebotinolExecutionException("Tried to memorize an empty cell");
		} else {
			_oldValue = house.getMemory();
			house.setMemory(val);
			finish();
		}
		
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
