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
	public void memoryChanged(Fraction memory) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	public void positionChanged(int previousH, int previousV, int h, int v) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	public void matrixChanged(int h, int v, Fraction newValue) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	public void mailChanged(Mail mail) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	public void matrixSent() {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	public void matrixUnsent() {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 */
	public void rebotinolErrorOcurred() {
		// do nothing
	}
}
