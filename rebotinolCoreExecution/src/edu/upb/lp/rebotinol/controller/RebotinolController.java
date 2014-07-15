package edu.upb.lp.rebotinol.controller;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.executions.RebotinolInstructionExecution;
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
 * 
 */
public class RebotinolController {
	private RebotinolHouse _house;
	private Fraction[][] _initialMatrix;
	private Fraction[][] _expectedMatrix;
	private SequentialInstructionExecution _program;

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
			SequentialInstructionExecution program)
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
		this._program = program;
	}

	/**
	 * A constructor without expected matrix
	 * 
	 * @param house
	 *            The rebotinol house on which we will be working
	 * @param initialMatrix
	 *            The initial matrix
	 * @param program
	 *            The program to be executed.
	 * @throws RebotinolFatalException
	 *             If something very bad happened
	 */
	public RebotinolController(RebotinolHouse house,
			Fraction[][] initialMatrix, SequentialInstructionExecution program)
			throws RebotinolFatalException {
		this(house, initialMatrix, null, program);
	}

	/**
	 * @return the rebotinol house
	 */
	public RebotinolHouse get_house() {
		return _house;
	}

	/**
	 * @return A clone of the initial matrix. This attribute does not change
	 *         while the program is executed
	 */
	public Fraction[][] get_initialMatrix() {
		return MatrixUtil.cloneMatrix(_initialMatrix);
	}

	/**
	 * @return A clone of the expected matrix after the execution of the
	 *         program. This attribute is optional
	 */
	public Fraction[][] get_expectedMatrix() {
		return MatrixUtil.cloneMatrix(_expectedMatrix);
	}

	/**
	 * @return The program that was defined by the rebotinol programmer
	 */
	public SequentialInstructionExecution get_program() {
		return _program;
	}

	/**
	 * Execute a single step in this program
	 * 
	 * @throws RebotinolExecutionException
	 *             If the program was incorrect (i.e., it asked to memorize a
	 *             number from an empty cell). This exception is to be expected
	 *             often, as it indicates an error made by the rebotinol
	 *             programmer.
	 * @throws RebotinolFlowException
	 *             If the program tried to execute some illegal instruction,
	 *             like an instruction that was already finished. This exception
	 *             indicates a severe bug in the execution platform.
	 */
	public void step() throws RebotinolExecutionException,
			RebotinolFlowException {
		_program.step(_house);
	}

	/**
	 * Go a single step back. This method undoes the last {@link #step()}
	 * 
	 * @throws RebotinolExecutionException
	 *             If the program was incorrect (i.e., it asked to memorize a
	 *             number from an empty cell). This exception is to be expected
	 *             often, as it indicates an error made by the rebotinol
	 *             programmer.
	 * @throws RebotinolFlowException
	 *             If the program tried to execute some illegal instruction,
	 *             like an instruction that was already finished. This exception
	 *             indicates a severe bug in the execution platform.
	 * @throws RebotinolFatalException
	 *             If something went really wrong
	 */
	public void stepBack() throws RebotinolExecutionException,
			RebotinolFlowException, RebotinolFatalException {
		_program.stepBack(_house);
	}

	/**
	 * Set or remove a breakpoint from a given execution.
	 * 
	 * @param execution
	 *            The execution on which we are trying to set or remove a
	 *            breakpoint.
	 * @param breakpoint
	 *            true if we want to set a breakpoint on the execution, false if
	 *            we want to remove it
	 */
	public void setBreakpoint(RebotinolInstructionExecution execution,
			boolean breakpoint) {
		execution.setBreakpoint(breakpoint);
	}

	/**
	 * Starts an automatic execution of the program until it ends or until a
	 * breakpoint is encountered. If the program was already started, this
	 * method does nothing.
	 */
	public void startPlay() {
		// TODO Alexis
	}

	/**
	 * Stops the automatic execution of the program if it was started, does
	 * nothing otherwise.
	 */
	public void stopPlay() {
		// TODO Alexis
	}
}