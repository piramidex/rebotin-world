package edu.upb.lp.rebotinol.model.executions;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;

/**
 * An execution that changes rebotin's memory. It remembers the old value in the memory for rollback
 * @author Alexis Marechal
 *
 */
public abstract class ChangeMemoryExecution extends
		RebotinolInstructionExecution {
	private Fraction _oldValue;

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doStep(RebotinolHouse house)
			throws RebotinolExecutionException {
		checkMemoryNotEmpty(house);
		Fraction val = house.getMemory();
		_oldValue = val;
		doMemoryStep(house);
		finish();
	}

	/**
	 * Perform the precise memory modification of this instruction.
	 * 
	 * @param house
	 *            The house in which we are working.
	 * @throws RebotinolExecutionException
	 *             If the instruction was already executed before calling
	 *             this method.
	 */
	protected abstract void doMemoryStep(RebotinolHouse house)
			throws RebotinolExecutionException;

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doStepBack(RebotinolHouse house) {
		house.setMemory(_oldValue);
		_oldValue = null;
	}
	
	/**
	 * @return the old value stored to rollback this execution
	 */
	public Fraction getOldValue() {
	    return _oldValue;
	}

	/**
	 * Checks that the memory is not empty. All subclasses except memoExecution need this.
	 *
	 * @param house The house in which we are working
	 * @throws RebotinolExecutionException If something went wrong
	 */
	protected void checkMemoryNotEmpty(RebotinolHouse house) throws RebotinolExecutionException {
		if (house.getMemory() == null) {
			throw new RebotinolExecutionException(
					"Tried to change the memory while it was empty!");
		}
	}

}
