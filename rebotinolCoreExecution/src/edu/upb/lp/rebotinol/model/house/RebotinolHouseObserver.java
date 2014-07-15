package edu.upb.lp.rebotinol.model.house;

import org.apache.commons.math3.fraction.Fraction;

/**
 * This observer is used to watch a rebotinol house. The house will warn its
 * observers when some specific events occur.
 * 
 * @author Alexis Marechal
 * 
 */
public interface RebotinolHouseObserver {
	/**
	 * This method is executed by the observed house when rebotin's memory
	 * changes
	 * 
	 * @param memory
	 *            The new value of the memory
	 */
	public abstract void memoryChanged(Fraction memory);

	/**
	 * This method is executed by the observed house when the matrix is moved
	 * 
	 * @param previousH
	 *            the previous horizontal position
	 * @param previousV
	 *            the previous vertical position
	 * @param h
	 *            the new horizontal position
	 * @param v
	 *            the new vertical position
	 */
	public abstract void positionChanged(int previousH, int previousV, int h,
			int v);

	/**
	 * This method is executed by the observed house when the matrix is modified
	 * 
	 * @param h
	 *            The horizontal position in the matrix
	 * @param v
	 *            The vertical position in the matrix
	 * @param newValue
	 *            The new value in that position in the matrix
	 */
	public abstract void matrixChanged(int h, int v, Fraction newValue);

	/**
	 * This method is executed by the observed house when the mail value changed
	 * 
	 * @param mail
	 *            The new mail.
	 */
	public abstract void mailChanged(Mail mail);

	/**
	 * This method is executed by the observed house when the matrix was sent
	 */
	public abstract void matrixSent();

	/**
	 * This method is executed by the observed house when the matrix was unsent
	 */
	public abstract void matrixUnsent();

	/**
	 * This method is executed by the observed house when Rebotin has met an
	 * error (division by 0, tried to read an empty cell, ...)
	 * 
	 * @param _error
	 */
	public abstract void rebotinolErrorOcurred();
}
