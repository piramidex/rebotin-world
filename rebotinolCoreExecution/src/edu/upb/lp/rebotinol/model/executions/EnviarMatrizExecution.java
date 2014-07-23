package edu.upb.lp.rebotinol.model.executions;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;
import edu.upb.lp.rebotinol.util.RebotinolExecutionVisitor;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.util.RebotinolFlowException;

/**
 * An instruction to send the current matrix through the mail.
 * 
 * @author Alexis Marechal
 * 
 */
public class EnviarMatrizExecution extends RebotinolInstructionExecution {
	@Override
	protected void doStep(RebotinolHouse house)
			throws RebotinolExecutionException, RebotinolFlowException {
		try {
			house.sendMatrix();
			finish();
		} catch (RebotinolFatalException e) {
			throw new RebotinolExecutionException("Could not send the matrix in the house!",e);
		}
	}

	@Override
	protected void doStepBack(RebotinolHouse house) throws RebotinolFatalException {
		house.unsendMatrix();
		unfinish();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object accept(RebotinolExecutionVisitor v) {
		return v.visit(this);
	}
}
