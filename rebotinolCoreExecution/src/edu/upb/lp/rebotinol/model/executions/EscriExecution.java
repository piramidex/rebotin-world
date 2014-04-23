package edu.upb.lp.rebotinol.model.executions;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;

/**
 * Instruction to write the memorized number on the matrix.
 * 
 * @author Alexis Marechal
 * 
 */
public class EscriExecution extends RebotinolInstructionExecution {
	private Fraction _oldValue;

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doStep(RebotinolHouse house)
			throws RebotinolExecutionException {
		Fraction val = house.getMemory();
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