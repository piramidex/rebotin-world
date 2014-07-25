package edu.upb.lp.rebotinol.xtextToSwing;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.reboConf.Configuration;
import edu.upb.lp.reboConf.util.ReboConfSwitch;

/**
 * This class allows to build the elements contained in a Rebotinol
 * {@link Configuration} into {@link Fraction}s and arrays of {@link Fraction}s
 * 
 * @author Alexis Marechal
 * 
 */
public class MatrixBuilderFromXText {
	private static NumberBuilder _nBuilder = new NumberBuilder();

	/**
	 * Converts the initial matrix contained in a rebotinol
	 * {@link Configuration} into an array of {@link Fraction}s
	 * 
	 * @param conf
	 *            The rebotinol {@link Configuration}.
	 * @return The initial matrix in conf as an array of {@link Fraction}s
	 */
	public static Fraction[][] buildInitialMatrix(Configuration conf) {
		return buildMatrix(conf.getInitial());
	}

	/**
	 * Converts the expected matrix contained in a rebotinol
	 * {@link Configuration} into an array of {@link Fraction}s
	 * 
	 * @param conf
	 *            The rebotinol {@link Configuration}.
	 * @return The expected matrix in conf as an array of {@link Fraction}s, or
	 *         null if the expected matrix was null.
	 */
	public static Fraction[][] buildExpectedMatrix(Configuration conf) {
		return buildMatrix(conf.getExpected());
	}

	private static Fraction[][] buildMatrix(edu.upb.lp.reboConf.Matrix m) {
		if (m == null) {
			return null;
		}
		int lines = m.getLines().size();
		int cols = m.getLines().get(0).getEls().size();
		Fraction[][] result = new Fraction[lines][cols];
		int linecounter = 0;
		for (edu.upb.lp.reboConf.Line line : m.getLines()) {
			int colcounter = 0;
			for (edu.upb.lp.reboConf.Element el : line.getEls()) {
				result[linecounter][colcounter] = _nBuilder.doSwitch(el);
				colcounter++;
			}
			linecounter++;
		}
		return result;
	}

	/**
	 * Converts the expected result contained in a rebotinol
	 * {@link Configuration} into a {@link Fraction}
	 * 
	 * @param conf
	 *            The rebotinol {@link Configuration}
	 * @return The expected result in conf as a {@link Fraction}, or null if the
	 *         expected result was null
	 */
	public static Fraction buildExpectedResult(Configuration conf) {
		if (conf.getMail() == null) {
			return null;
		} else {
			return buildNumber(conf.getMail());
		}
	}

	private static Fraction buildNumber(edu.upb.lp.reboConf.Number num) {
		return _nBuilder.doSwitch(num);
	}

	private static class NumberBuilder extends ReboConfSwitch<Fraction> {
		@Override
		public Fraction caseFraction(edu.upb.lp.reboConf.Fraction fr) {
			int numerator = fr.getNumerator().getValue();
			int denominator = fr.getDenominator().getValue();
			return new Fraction(numerator, denominator);
		}

		@Override
		public Fraction caseNFraction(edu.upb.lp.reboConf.NFraction fr) {
			int numerator = fr.getNumerator().getValue();
			int denominator = fr.getDenominator().getValue();
			return new Fraction(-numerator, denominator);
		}

		@Override
		public Fraction caseInteger(edu.upb.lp.reboConf.Integer i) {
			return new Fraction(i.getValue());
		}

		@Override
		public Fraction caseNInteger(edu.upb.lp.reboConf.NInteger i) {
			return new Fraction(-i.getValue());
		}
		
		@Override
		public Fraction caseEmpty(edu.upb.lp.reboConf.Empty e) {
			return null;
		}
	}
}
