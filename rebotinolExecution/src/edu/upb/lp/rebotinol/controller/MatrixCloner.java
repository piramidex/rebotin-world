package edu.upb.lp.rebotinol.controller;

//TODO javadoc
public class MatrixCloner {
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
