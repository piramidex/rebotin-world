package edu.upb.lp.rebotinol.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.executions.RebotinolInstructionExecution;
import edu.upb.lp.rebotinol.model.executions.SequentialInstructionExecution;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.observers.RebotinolExecutionObserverImpl;
import edu.upb.lp.rebotinol.observers.RebotinolControlObserver;
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
	private RebotinolScheduler _scheduler;
	private List<RebotinolControlObserver> _observers = new ArrayList<RebotinolControlObserver>();
	private ProgramObserver _pObs = new ProgramObserver();

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
		_program.registerObserver(_pObs);
		_scheduler = new RebotinolScheduler(this);
	}

	/**
	 * Register an observer, following the Observer design pattern.
	 * 
	 * @param observer
	 *            The observer to be registered.
	 */
	public void registerObserver(RebotinolControlObserver observer) {
		_observers.add(observer);
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
	 *         program. This attribute is optional
	 */
	public Fraction[][] getExpectedMatrix() {
		return MatrixUtil.cloneMatrix(_expectedMatrix);
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
		if (!_program.isStarted()) {
			for (RebotinolControlObserver obs : _observers) {
				obs.activatePrevious();
			}
		}
		_program.step(_house);
		if (_program.isFinished()) {
			for (RebotinolControlObserver obs : _observers) {
				obs.deActivateNext();
			}
		}
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
		if (_program.isFinished()) {
			for (RebotinolControlObserver obs : _observers) {
				obs.activateNext();
			}
		}
		_program.stepBack(_house);
		if (!_program.isStarted()) {
			for (RebotinolControlObserver obs : _observers) {
				obs.deActivatePrevious();
			}
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

	private class ProgramObserver extends RebotinolExecutionObserverImpl {
		@Override
		public void finished() {
			_scheduler.stop();
			for (RebotinolControlObserver obs : _observers) {
				obs.deActivatePlay();
			}
		}

		@Override
		public void unfinished() {
			if (!_scheduler.isRunning()) {
				for (RebotinolControlObserver obs : _observers) {
					obs.activatePlay();
				}
			}
		}
		
		@Override
		public void breakpointMet() {
			_scheduler.stop();
		}
	}
	
	/**
	 * @return true if the current execution has a breakpoint
	 */
	public boolean isBreakpoint() {
		return _program.isDeepBreakpoint();
	}
}