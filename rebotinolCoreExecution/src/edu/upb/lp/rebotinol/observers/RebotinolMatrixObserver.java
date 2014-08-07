package edu.upb.lp.rebotinol.observers;

import org.apache.commons.math3.fraction.Fraction;

/**
 * This observer is used to watch the matrix in a rebotinol house. The house will warn its
 * observers when some specific events occur.
 * 
 * @author Alexis Marechal
 * 
 */
public interface RebotinolMatrixObserver {
	/**
	 * This method is executed by the observed house when the matrix is moved
	 * 
	 * @param previousH
	 *      the previous horizontal position
	 * @param previousV
	 *      the previous vertical position
	 * @param h
	 *      the new horizontal position
	 * @param v
	 *      the new vertical position
	 */
	public void positionChanged(int previousH, int previousV, int h,
			int v);

	/**
	 * This method is executed by the observed house when the matrix is modified
	 * 
	 * @param h
	 *      The horizontal position in the matrix
	 * @param v
	 *      The vertical position in the matrix
	 * @param newValue
	 *      The new value in that position in the matrix
	 */
	public void matrixChanged(int h, int v, Fraction newValue);
}
