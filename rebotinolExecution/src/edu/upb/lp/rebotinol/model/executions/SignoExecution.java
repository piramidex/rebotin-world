package edu.upb.lp.rebotinol.model.executions;

import edu.upb.lp.rebotinol.exceptions.RebotinolExecutionException;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;

/**
 * Instruction to invert the memorized number.
 * 
 * @author Alexis Marechal
 * 
 */
public class SignoExecution extends ChangeMemoryExecution {	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doMemoryStep(RebotinolHouse house)
			throws RebotinolExecutionException {
		house.setMemory(-getOldValue());
	}
}