package edu.upb.lp.rebotinol.util;

import org.apache.commons.math3.fraction.Fraction;

/**
 * This simple class allows to safely clone a matrix of Fractions.
 * @author Alexis Marechal
 *
 */
public class MatrixCloner {
	/**
	 * Clone a matrix
	 * @param param The parameter matrix.
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
}
