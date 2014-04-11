package edu.upb.lp.rebotinol.model.executions;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;

/**
 * An instruction to memorize the current number in the matrix.
 *
 * @author Alexis Marechal
 *
 */
public class MemoExecution extends ChangeMemoryExecution {
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doMemoryStep(RebotinolHouse house)
			throws RebotinolExecutionException {
		Fraction val = house.getCurrentMatrixValue();
		if (val == null) {
			throw new RebotinolExecutionException("Tried to memorize an empty cell");
		} else {
			house.setMemory(val);
		}
	}
}
