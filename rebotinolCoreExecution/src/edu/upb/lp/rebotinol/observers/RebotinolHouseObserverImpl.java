package edu.upb.lp.rebotinol.observers;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.house.Mail;

/**
 * Basic implementation of the {@link RebotinolHouseObserver} that does nothing
 * when observing events.
 * 
 * @author Alexis Marechal
 * 
 */
public abstract class RebotinolHouseObserverImpl implements
		RebotinolHouseObserver {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void memoryChanged(Fraction memory) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void mailChanged(Mail mail) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void matrixSent() {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void matrixUnsent() {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void rebotinolErrorOcurred() {
		// do nothing
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void rebotinolErrorSolved() {
		// do nothing
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void errorMessageChanged(String message) {
		// do nothing
	}
}
