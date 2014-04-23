package edu.upb.lp.rebotinol.model.executions;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;

/**
 * Instruction to invert the memorized number.
 * 
 * @author Alexis Marechal
 * 
 */
public class InverExecution extends ChangeMemoryExecution {	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doMemoryStep(RebotinolHouse house)
			throws RebotinolExecutionException {
		if (getOldValue().equals(new Fraction(0))) {
			throw new RebotinolExecutionException("Division by 0!");
		}
		house.setMemory(getOldValue().reciprocal());
	}
}