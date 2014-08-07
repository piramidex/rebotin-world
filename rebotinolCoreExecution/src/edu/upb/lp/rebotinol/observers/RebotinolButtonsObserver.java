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
public interface RebotinolButtonsObserver {
	/**
	 * This method is executed by the observed controller when the play button should be (de)activated.
	 * @param activate True if the buttons should be activated
	 */
	public void activatePlay(boolean activate);
	
	/**
	 * This method is called when the "previous" button should be (de)activated
	 * @param activate True if the buttons should be activated
	 */
	public void activatePrevious(boolean activate);
	
	/**
	 * This method is called when the "next" button should be (de)activated
	 * @param activate True if the buttons should be activated
	 */
	public void activateNext(boolean activate);
	
	/**
	 * This method is executed by the observed controller when the play button should be (de)activated.
	 * @param activate True if the buttons should be activated
	 */
	public void activatePlayBack(boolean activate);
	
	/**
	 * This method is executed by the observed controller when the pause button should be (de)activated.
	 * @param activate True if the buttons should be activated
	 */
	public void activatePause(boolean activate);
}
