package edu.upb.lp.rebotinol.model.executions;

import edu.upb.lp.rebotinol.exceptions.RebotinolExecutionException;
import edu.upb.lp.rebotinol.exceptions.RebotinolFlowException;
import edu.upb.lp.rebotinol.model.house.DoubleMail;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;

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
		DoubleMail mail = new DoubleMail(house.getMemory());
		house.setMail(mail);
	}

	@Override
	protected void doStepBack(RebotinolHouse house) {
		house.setMail(null);
	}

}
