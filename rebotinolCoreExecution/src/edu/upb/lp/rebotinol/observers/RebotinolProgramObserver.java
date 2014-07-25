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
public interface RebotinolProgramObserver {
	/**
	 * This method is executed by the observed controller when the automatic execution starts.
	 */
	public void startPlay();

	/**
	 * This method is executed by the observed controller when the automatic execution stops.
	 */
	public void stopPlay();
	
	/**
	 * This method is called when the "previous" button should be activated
	 */
	public void activatePrevious();
	
	/**
	 * This method is called when the "previous" button should be deactivated
	 */
	public void deActivatePrevious();
	
	/**
	 * This method is called when the "next" button should be activated
	 */
	public void activateNext();
	
	/**
	 * This method is called when the "next" button should be deactivated
	 */
	public void deActivateNext();
}
