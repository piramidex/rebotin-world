package edu.upb.lp.rebotinol.model.executions;

import edu.upb.lp.rebotinol.model.house.FractionMail;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.util.RebotinolFlowException;

/**
 * An instruction to send the current value in the memory through the mail.
 * 
 * @author Alexis Marechal
 * 
 */
public class EnviarExecution extends RebotinolInstructionExecution {
	@Override
	protected void doStep(RebotinolHouse house)
			throws RebotinolExecutionException, RebotinolFlowException {
		FractionMail mail;
		try {
			mail = new FractionMail(house.getMemory());
		} catch (RebotinolFatalException e) {
			throw new RebotinolExecutionException(e.getMessage());
		}
		house.setMail(mail);
	}

	@Override
	protected void doStepBack(RebotinolHouse house) {
		house.setMail(null);
	}

}
