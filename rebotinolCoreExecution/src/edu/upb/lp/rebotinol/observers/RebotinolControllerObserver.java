package edu.upb.lp.rebotinol.observers;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.controller.RebotinolController.ProblemStatus;

/**
 * This observer is used to watch the {@link RebotinolController}. The
 * controller will warn its observers when the status of the problem (solved,
 * unsolved or unknown) will change.
 * 
 * @author Alexis Marechal
 * 
 */
public interface RebotinolControllerObserver {
	/**
	 * This method is called when the status of the problem changed (solved,
	 * unsolved or unknown)
	 * 
	 * @param problemStatus
	 *            The new status of the problem
	 */
	public void problemStatusChanged(ProblemStatus problemStatus);
}
