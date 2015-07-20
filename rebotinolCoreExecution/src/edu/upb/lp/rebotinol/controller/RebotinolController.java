package edu.upb.lp.rebotinol.controller;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.executions.RebotinolInstructionExecution;
import edu.upb.lp.rebotinol.model.executions.RebotinolProgram;
import edu.upb.lp.rebotinol.model.executions.SequentialInstructionExecution;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.MatrixUtil;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.util.RebotinolFlowException;

/**
 * A rebotinol controller follows the MVC pattern for the rebotinol world. It
 * contains the main classes in this world (a rebotinol house, a program, an
 * initial matrix and optionnally an expected matrix)
 * 
 * @author Alexis Marechal
 * @author Alfredo Villalba
 * 
 */
public class RebotinolController {
	private RebotinolHouse _house;
	private Fraction[][] _initialMatrix;
	private Fraction[][] _expectedMatrix;
	private Fraction _expectedResult;
	private SequentialInstructionExecution _program;
	private boolean _hasRebotinolErrorOccurred;
	private RebotinolScheduler _scheduler;
	private RebotinolButtonsController _buttonsController = new RebotinolButtonsController();
	

	/**
	 * Constructor
	 * 
	 * @param house
	 *            The rebotinol house on which we will be working
	 * @param initialMatrix
	 *            The initial matrix
	 * @param expectedMatrix
	 *            The expected matrix at the end of the execution. Can be null.
	 * @param program
	 *            The program to be executed.
	 * @throws RebotinolFatalException
	 *             If something very bad happened
	 */
	public RebotinolController(RebotinolHouse house,
			Fraction[][] initialMatrix, Fraction[][] expectedMatrix,
			Fraction expectedResult, RebotinolProgram program)
			throws RebotinolFatalException {
		// Check inputs
		if (house == null) {
			throw new RebotinolFatalException(
					"Tried to create a controller with a null house!");
		}
		if (initialMatrix == null) {
			throw new RebotinolFatalException(
					"Tried to create a controller with a null initial matrix!");
		}
		if (program == null) {
			throw new RebotinolFatalException(
					"Tried to create a controller with a null program!");
		}
		int sizeV = initialMatrix.length;
		int sizeH = initialMatrix[0].length;
		this._house = house;
		this._initialMatrix = MatrixUtil.cloneMatrix(initialMatrix);
		if (expectedMatrix != null) {
			if (expectedMatrix.length != sizeV
					|| expectedMatrix[0].length != sizeH) {
				throw new RebotinolFatalException(
						"The initial matrix and the expected matrix must have the same size when building a rebotinol world");
			}
			_expectedMatrix = MatrixUtil.cloneMatrix(expectedMatrix);
		} else {
			_expectedMatrix = null;
		}
		this._expectedResult = expectedResult;
		this._program = program;
		this._hasRebotinolErrorOccurred = false;
		_scheduler = new RebotinolScheduler(this, _buttonsController);
	}

	/**
	 * @return the rebotinol house
	 */
	public RebotinolHouse getHouse() {
		return _house;
	}

	/**
	 * @return A clone of the initial matrix. This attribute does not change
	 *         while the program is executed
	 */
	public Fraction[][] getInitialMatrix() {
		return MatrixUtil.cloneMatrix(_initialMatrix);
	}

	/**
	 * @return A clone of the expected matrix after the execution of the
	 *         program. May be null.
	 */
	public Fraction[][] getExpectedMatrix() {
		return MatrixUtil.cloneMatrix(_expectedMatrix);
	}

	/**
	 * @return The expected result after the execution of the program. May be
	 *         null.
	 */
	public Fraction getExpectedResult() {
		return _expectedResult;
	}

	/**
	 * @return The program that was defined by the rebotinol programmer
	 */
	public SequentialInstructionExecution getProgram() {
		return _program;
	}

	/**
	 * @return the scheduler for the automatic executions
	 */
	public RebotinolScheduler getScheduler() {
		return _scheduler;
	}

	/**
	 * @return the buttons controller
	 */
	public RebotinolButtonsController getButtonsController() {
		return _buttonsController;
	}
	

	/**
	 * Returns true when a rebotinol error (division by zero, operation on empty, cell, etc.)
	 * has occurred while performing the current rebotinol instruction. Returns false otherwise.
	 * 
	 * @return true if rebotil error has occurred, false otherwise
	 */
	public boolean hasRebotinolErrorOccurred() {
		return _hasRebotinolErrorOccurred;
	}
	

	/**
	 * Execute a single step in this program
	 * 
	 * @throws RebotinolFlowException
	 *             If the program tried to execute some illegal instruction,
	 *             like an instruction that was already finished. This exception
	 *             indicates a severe bug in the execution platform.
	 */
	public void step() throws RebotinolFlowException {
		if (!_program.isStarted()) {
			_buttonsController.programStarted();
			_house.setError(false);
			_house.setErrorMessage("");
			_hasRebotinolErrorOccurred = false;
		}
		try {
			_program.step(_house);
		} catch (RebotinolExecutionException e) {
			_buttonsController.errorMet();
			_house.setError(true);
			_house.setErrorMessage(e.getMessage());
			_hasRebotinolErrorOccurred = true;
		} catch (ArithmeticException e) {
			_buttonsController.errorMet();
			_house.setError(true);
			_house.setErrorMessage("Error num�rico! Rebot�n no puede manejar numeros demasiado grandes o peque�os");
		}
		if (_program.isFinished()) {
			_buttonsController.programFinished();
		}
	}

	/**
	 * Performs a step. Only to be used by a {@link RebotinolScheduler}!
	 * 
	 * @return true if the automatic execution should stop.
	 * @throws RebotinolFlowException
	 *             If an error occured with the flow.
	 */
	protected boolean automaticStep() throws RebotinolFlowException {
		step();
		if (_program.isFinished()) {
			return true;
		} 
		else if (_hasRebotinolErrorOccurred) {
			return true;
		}
		else {
			RebotinolInstructionExecution next = _program
					.getNextExecutionToStep();
			return next.isBreakpoint();
		}
	}

	/**
	 * Performs a step back. Only to be used by a {@link RebotinolScheduler}!
	 * 
	 * @return true if a breakpoint was met after computing the stepback.
	 * @throws RebotinolFlowException
	 *             If an error occured with the flow.
	 * @throws RebotinolFatalException
	 *             If something went really wrong.
	 */
	protected boolean automaticStepBack() throws RebotinolFlowException,
			RebotinolFatalException {
		stepBack();
		if (!_program.isStarted()) {
			return true;
		} else {
			RebotinolInstructionExecution next = _program
					.getNextExecutionToStep();
			return next.isBreakpoint();
		}
	}

	/**
	 * Go a single step back. This method undoes the last {@link #step()}
	 * 
	 * @throws RebotinolFlowException
	 *             If the program tried to execute some illegal instruction,
	 *             like an instruction that was already finished. This exception
	 *             indicates a severe bug in the execution platform.
	 * @throws RebotinolFatalException
	 *             If something went really wrong
	 */
	public void stepBack() throws RebotinolFlowException,
			RebotinolFatalException {
		if (_program.isFinished()) {
			_buttonsController.programUnFinished();
		}
		if (_hasRebotinolErrorOccurred) {
			_buttonsController.errorSolved();
			_house.setError(false);
			_house.setErrorMessage("");
			_hasRebotinolErrorOccurred = false;
		}
		_program.stepBack(_house);
		if (!_program.isStarted()) {
			_buttonsController.programUnStarted();
		}
	}

	/**
	 * Set or remove a breakpoint from a given execution.
	 * 
	 * @param execution
	 *            The execution on which we are trying to set or remove a
	 *            breakpoint.
	 * @throws RebotinolFatalException
	 *             If something went really wrong
	 */
	public void toggleBreakpoint(RebotinolInstructionExecution execution)
			throws RebotinolFatalException {
		execution.toggleBreakpoint();
	}

	// private class ProgramObserver extends RebotinolExecutionObserverImpl {
	// @Override
	// public void breakpointMet() {
	// _scheduler.stop();
	// }
	// }

	/**
	 * Starts play
	 */
	public void play() {
		_scheduler.play();
	}

	/**
	 * Stops play
	 */
	public void stop() {
		_scheduler.stop();

	}

	/**
	 * Stops play
	 */
	public void playBack() {
		_scheduler.playBack();
	}

}