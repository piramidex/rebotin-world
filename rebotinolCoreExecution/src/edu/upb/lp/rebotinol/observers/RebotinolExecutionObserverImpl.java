package edu.upb.lp.rebotinol.observers;

/**
 * Basic implementation of the {@link RebotinolExecutionObserver} that does nothing
 * when observing events.
 * 
 * @author Alexis Marechal
 * 
 */
public abstract class RebotinolExecutionObserverImpl implements RebotinolExecutionObserver {
	/**
	 * {@inheritDoc}
	 */
	public void stepPerformed() {
		//do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	public void stepsChanged(int _steps) {
		//do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	public void stepBackPerformed() {
		//do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	public void finished() {
		//do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	public void unfinished() {
		//do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	public void setCurrent() {
		//do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	public void unsetCurrent() {
		//do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	public void skipped() {
		//do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	public void unskipped() {
		//do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	public void breakpointMet() {
		//do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	public void breakpointSet() {
		//do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	public void breakpointRemoved() {
		//do nothing
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void repetitionsChanged(int repetitionsExecuted) {
		//do nothing
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void started() {
		//do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	public void unstarted() {
		//do nothing
	}
}
