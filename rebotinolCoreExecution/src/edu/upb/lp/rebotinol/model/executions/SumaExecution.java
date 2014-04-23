package edu.upb.lp.rebotinol.model.executions;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;

/**
 * Instruction to add the current number on the matrix to the memorized number.
 * 
 * @author Alexis Marechal
 * 
 */
public class SumaExecution extends ChangeMemoryExecution {
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doMemoryStep(RebotinolHouse house)
			throws RebotinolExecutionException {
		Fraction val2 = house.getCurrentMatrixValue();
		if (val2 == null) {
			throw new RebotinolExecutionException(
					"Tried to add while the matrix was empty in the current position!");
		}
		house.setMemory(getOldValue().add(val2));
	}
}