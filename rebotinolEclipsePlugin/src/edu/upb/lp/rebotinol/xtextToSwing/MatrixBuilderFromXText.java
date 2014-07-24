package edu.upb.lp.rebotinol.xtextToSwing;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.reboConf.Configuration;
import edu.upb.lp.reboConf.PositiveNumber;

/**
 * 
 * @author Alexis Marechal
 *
 */
//TODO javadoc
public class MatrixBuilderFromXText {
	public static Fraction[][] buildInitialMatrix(Configuration conf) {
		return null;
	}
	
	public static Fraction[][] buildExpectedMatrix(Configuration conf) {
		return null;
	}
	
	public static Fraction buildExpectedResult(Configuration conf) {
		return null;
	}
	
	public static Fraction buildNumber(Number num) {
		int numerator, denominator;
		PositiveNumber pnum = (PositiveNumber) num;
		if (pnum instanceof edu.upb.lp.reboConf.Fraction) {
			
		}
		return null;
	}
}
