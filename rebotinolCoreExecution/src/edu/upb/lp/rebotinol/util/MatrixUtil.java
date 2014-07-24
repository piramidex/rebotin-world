package edu.upb.lp.rebotinol.util;

import org.apache.commons.math3.fraction.Fraction;

/**
 * This simple class allows to manipulate matrices of fractions
 * 
 * @author Alexis Marechal
 * 
 */
public class MatrixUtil {
	/**
	 * Clone a matrix
	 * 
	 * @param param
	 *            The parameter matrix.
	 * @return An exact copy of the matrix parameter
	 */
	public static Fraction[][] cloneMatrix(Fraction[][] param) {
		if (param == null || param.length == 0) {
			return param;
		} else {
			Fraction[][] clone = new Fraction[param.length][param[0].length];
			for (int i = 0; i < clone.length; i++) {
				clone[i] = param[i].clone();
			}
			return clone;
		}
	}

	/**
	 * Create a matrix filled with the same value
	 * 
	 * @param sizeV
	 *            The vertical size
	 * @param sizeH
	 *            The horizontal size
	 * @param init
	 *            The initial value to fill the matrix
	 * @return The matrix built
	 */
	public static Fraction[][] createMatrix(int sizeV, int sizeH, Fraction init) {
		Fraction[][] ans = new Fraction[sizeV][sizeH];
		for (int v = 0; v < sizeV; v++) {
			for (int h = 0; h < sizeH; h++) {
				ans[v][h] = init;
			}
		}
		return ans;
	}

	/**
	 * Create a matrix filled with zeroes
	 * 
	 * @param sizeV
	 *            The vertical size
	 * @param sizeH
	 *            The horizontal size
	 * @return The matrix built
	 */
	public static Fraction[][] createMatrix(int sizeV, int sizeH) {
		return createMatrix(sizeV, sizeH, null);
	}
}
