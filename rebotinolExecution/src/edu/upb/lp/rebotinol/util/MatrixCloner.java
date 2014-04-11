package edu.upb.lp.rebotinol.util;

/**
 * This simple class allows to safely clone a matrix.
 * @author Alexis Marechal
 *
 */
public class MatrixCloner {
	/**
	 * Clone a matrix
	 * @param param The parameter matrix
	 * @return An exact copy of the matrix parameter
	 */
	public static Double[][] cloneMatrix(Double[][] param) {
		if (param == null || param.length == 0) {
			return param;
		} else {
			Double[][] clone = new Double[param.length][param[0].length];
			for (int i = 0; i < clone.length; i++) {
				clone[i] = param[i].clone();
			}
			return clone;
		}
	}
}
