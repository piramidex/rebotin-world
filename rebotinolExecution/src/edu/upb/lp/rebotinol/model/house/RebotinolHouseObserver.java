package edu.upb.lp.rebotinol.model.house;

import org.apache.commons.math3.fraction.Fraction;

/**
 * This observer is used to watch a rebotinol house. The house will warn its
 * observers when some specific events occur.
 * 
 * @author Alexis Marechal
 * 
 */
public abstract class RebotinolHouseObserver {
	/**
	 * Builds an observer for a given rebotinol house. This observer registers
	 * itself to the house.
	 * 
	 * @param house
	 */
	public RebotinolHouseObserver(RebotinolHouse house) {
		house.registerObserver(this);
	}

	/**
	 * This method is executed by the observed house when rebotin's memory
	 * changes
	 * 
	 * @param memory
	 *            The new value of the memory
	 */
	public void memoryChanged(Fraction memory) {
	}

	/**
	 * This method is executed by the observed house when the matrix is moved
	 * 
	 * @param h
	 *            the new horizontal position
	 * @param v
	 *            the new vertical position
	 */
	public void positionChanged(int h, int v) {
	}

	/**
	 * This method is executed by the observed house when the mail value changed
	 * 
	 * @param mail
	 *            The new mail.
	 */
	public void mailChanged(Mail mail) {
	}

	/**
	 * This method is executed by the observed house when Rebotin has met an
	 * error (division by 0, tried to read an empty cell, ...)
	 * 
	 * @param _error
	 */
	public void rebotinolErrorOcurred() {
		
	}
}
