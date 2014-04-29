package edu.upb.lp.rebotinol.examples;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.model.executions.SequentialInstructionExecution;
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
	protected SequentialInstructionExecution _program;
	protected Fraction[][] _initialMatrix;
	protected Fraction[][] _expectedMatrix;
	
	
	/**
	 * @return the _house
	 */
	public RebotinolHouse getHouse() {
		if (_house == null) {
			buildHouse();
		}
		return _house;
	}

	/**
	 * @return the _controller
	 */
	public RebotinolController getController() {
		if (_controller == null) {
			buildController();
		}
		return _controller;
	}

	/**
	 * @return the _program
	 */
	public SequentialInstructionExecution getProgram() {
		if (_program == null) {
			buildProgram();
		}
		return _program;
	}

	/**
	 * @return the _initialMatrix
	 */
	public Fraction[][] getInitialMatrix() {
		if (_initialMatrix == null) {
			buildInitialMatrix();
		}
		return _initialMatrix;
	}

	/**
	 * @return the _expectedMatrix
	 */
	public Fraction[][] getExpectedMatrix() {
		if (_expectedMatrix == null) {
			buildExpectedMatrix();
		}
		return _expectedMatrix;
	}

	/**
	 * Builod the house
	 */
	protected void buildHouse() {
		try {
			_house = new RebotinolHouse(getInitialMatrix());
		} catch (RebotinolFatalException e) {
			throw new IllegalStateException(e);
		}
	}

	/**
	 * Build the controller
	 */
	protected void buildController() {
		try {
			_controller = new RebotinolController(getHouse(),
					getInitialMatrix(), getExpectedMatrix(),
					getProgram());
		} catch (RebotinolFatalException e) {
			throw new IllegalStateException(e);
		}
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
}