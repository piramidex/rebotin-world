package edu.upb.lp.rebotinol.model.executions;

import edu.upb.lp.rebotinol.exceptions.RebotinolExecutionException;
import edu.upb.lp.rebotinol.exceptions.RebotinolFlowException;
import edu.upb.lp.rebotinol.model.house.MatrixMail;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;

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
		MatrixMail mail = new MatrixMail(house.getMatrix());
		house.setMail(mail);
	}

	@Override
	protected void doStepBack(RebotinolHouse house) {
		house.setMail(null);
	}

}
