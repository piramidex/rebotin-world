package edu.upb.lp.rebotinol.observers;

import edu.upb.lp.rebotinol.controller.RebotinolController;

/**
 * This observer is used to watch the scheduler that manages the automatic execution of
 * a program in a {@link RebotinolController}. The controller will warn its observers
 * when some specific events occur.
 * 
 * @author Alexis Marechal
 * 
 */
public interface RebotinolSchedulingObserver {
	/**
	 * This method is executed by the observed controller when the automatic execution starts.
	 */
	public void startPlay();

	/**
	 * This method is executed by the observed controller when the automatic execution stops.
	 */
	public void stopPlay();
}
