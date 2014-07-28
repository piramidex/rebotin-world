package edu.upb.lp.rebotinol.examples;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.model.executions.RebotinolProgram;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;

/**
 * This class builds some instances of the main rebotinol classes (a controller,
 * a house, some individual executions and a complete program) to be used in
 * tests.
 * 
 * This class and its subclasses should NOT be used in the final product
 * 
 * @author Alexis Marechal
 * 
 */
public abstract class RebotinolExample {
	protected RebotinolHouse _house;
	protected RebotinolController _controller;
	protected RebotinolProgram _program;
	protected Fraction[][] _initialMatrix;
	protected Fraction[][] _expectedMatrix;
	protected Fraction _expectedResult;

	/**
	 * @return the house
	 * @throws RebotinolFatalException
	 *             If something went really bad
	 */
	public RebotinolHouse getHouse() throws RebotinolFatalException {
		if (_house == null) {
			buildHouse();
		}
		return _house;
	}

	/**
	 * @return the controller
	 * @throws RebotinolFatalException
	 *             If something went really bad
	 */
	public RebotinolController getController() throws RebotinolFatalException {
		if (_controller == null) {
			buildController();
		}
		return _controller;
	}

	/**
	 * @return the program
	 */
	public RebotinolProgram getProgram() {
		if (_program == null) {
			buildProgram();
		}
		return _program;
	}

	/**
	 * @return the initial matrix
	 */
	public Fraction[][] getInitialMatrix() {
		if (_initialMatrix == null) {
			buildInitialMatrix();
		}
		return _initialMatrix;
	}

	/**
	 * @return the expected matrix
	 */
	public Fraction[][] getExpectedMatrix() {
		if (_expectedMatrix == null) {
			buildExpectedMatrix();
		}
		return _expectedMatrix;
	}

	/**
	 * @return the expected result
	 */
	public Fraction getExpectedResult() {
		if (_expectedResult == null) {
			buildExpectedResult();
		}
		return _expectedResult;
	}
	
	/**
	 * Build the house
	 * 
	 * @throws RebotinolFatalException
	 *             If something went really bad
	 */
	protected void buildHouse() throws RebotinolFatalException {
		_house = new RebotinolHouse(getInitialMatrix());
	}

	/**
	 * Build the controller
	 * 
	 * @throws RebotinolFatalException
	 *             If something went really bad
	 */
	protected void buildController() throws RebotinolFatalException {
		_controller = new RebotinolController(getHouse(), getInitialMatrix(),
				getExpectedMatrix(), getExpectedResult(), getProgram());
	}

	/**
	 * Build the program
	 */
	protected abstract void buildProgram();

	/**
	 * Build the initial matrix
	 */
	protected abstract void buildInitialMatrix();

	/**
	 * Build the expected matrix
	 */
	protected abstract void buildExpectedMatrix();
	
	/**
	 * Build the expected result
	 */
	protected abstract void buildExpectedResult();
}