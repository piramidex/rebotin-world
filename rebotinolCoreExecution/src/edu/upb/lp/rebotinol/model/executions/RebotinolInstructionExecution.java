package edu.upb.lp.rebotinol.model.executions;

import java.util.ArrayList;
import java.util.List;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;
import edu.upb.lp.rebotinol.util.RebotinolExecutionObserver;
import edu.upb.lp.rebotinol.util.RebotinolExecutionVisitor;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.util.RebotinolFlowException;

/**
 * The execution of a Rebotinol instruction.
 * 
 * @author Alexis Marechal
 * 
 */
/*TODO check that ALL exceptions communicate their cause*/
public abstract class RebotinolInstructionExecution {
	List<RebotinolExecutionObserver> _observers = new ArrayList<RebotinolExecutionObserver>();

	private int _steps = 0;
	private boolean _finished = false;
	private boolean _current = false;
	private boolean _skipped = false;
	private boolean _breakpoint = false;

	public void registerObserver(RebotinolExecutionObserver observer) {
		_observers.add(observer);
	}

	/**
	 * Execute a step in this instruction.
	 * 
	 * @param house
	 *            The house in which this instruction should be executed.
	 * @throws RebotinolExecutionException
	 *             If there was an error met by Rebotin while executing this
	 *             instruction.
	 * @throws RebotinolFlowException
	 *             If the instruction was completely executed before calling
	 *             this method.
	 */
	public void step(RebotinolHouse house) throws RebotinolExecutionException,
			RebotinolFlowException {
		if (_finished) {
			throw new RebotinolFlowException(
					"Tried to execute an instruction that was already executed");
		} else {
			incSteps();
			doStep(house);
			for (RebotinolExecutionObserver obs : _observers) {
				obs.stepPerformed();
			}
		}
	}

	/**
	 * Increase the number of steps performed in this execution
	 */
	private void incSteps() {
		_steps++;
		for (RebotinolExecutionObserver obs : _observers) {
			obs.stepsChanged(_steps);
		}
	}

	/**
	 * Decrease the number of steps performed in this execution
	 */
	private void decSteps() {
		_steps--;
		for (RebotinolExecutionObserver obs : _observers) {
			obs.stepsChanged(_steps);
		}
	}

	/**
	 * Actually execute the instruction. This method should modify the _finished
	 * attribute.
	 * 
	 * @param house
	 *            The house in which this instruction should be executed.
	 * @throws RebotinolExecutionException
	 *             If there was an error met by Rebotin while executing this
	 *             instruction.
	 * @throws RebotinolFlowException
	 *             If this instruction caused a problem in the flow
	 */
	protected abstract void doStep(RebotinolHouse house)
			throws RebotinolExecutionException, RebotinolFlowException;

	/**
	 * Go back a step in this instruction.
	 * 
	 * @param house
	 *            The house in which this instruction should be stepped back.
	 * @return true if the instruction has been completely reinitialised, or
	 *         false if some steps can still be undone on it.
	 * @throws RebotinolFlowException
	 *             If no steps in the instruction was executed before calling
	 *             this method.
	 * @throws RebotinolExecutionException
	 *             If Rebotin met a problem executing this step back
	 * @throws RebotinolFatalException If something went really wrong
	 */
	public boolean stepBack(RebotinolHouse house)
			throws RebotinolFlowException, RebotinolExecutionException, RebotinolFatalException {
		if (_steps == 0) {
			throw new RebotinolFlowException(
					"Tried to un-execute an instruction that was not executed");
		} else {
			decSteps();
			doStepBack(house);
			for (RebotinolExecutionObserver obs : _observers) {
				obs.stepBackPerformed();
			}
			return _steps == 0;
		}
	}

	/**
	 * Actually step back the instruction. This method should modify the
	 * _finished attribute.
	 * 
	 * @param house
	 *            The house in which this instruction should be stepped back.
	 * @throws RebotinolFlowException
	 *             If no steps in the instruction was executed before calling
	 *             this method.
	 * @throws RebotinolExecutionException
	 *             If Rebotin met a problem executing this step back
	 * @throws RebotinolFatalException If something went really wrong
	 */
	protected abstract void doStepBack(RebotinolHouse house)
			throws RebotinolFlowException, RebotinolExecutionException, RebotinolFatalException;

	/**
	 * @return The number of steps that have been executed in this instruction
	 *         at this point.
	 */
	public int getSteps() {
		return _steps;
	}

	/**
	 * @return true if this instruction has been completely executed.
	 */
	public boolean isFinished() {
		return _finished;
	}

	/**
	 * @return true if at least a step in this instruction has been executed.
	 */
	public boolean isStarted() {
		return _steps > 0;
	}

	/**
	 * Set this execution as finished
	 */
	protected void finish() {
		_finished = true;
		unsetCurrent();
		for (RebotinolExecutionObserver obs : _observers) {
			obs.finished();
		}
	}

	/**
	 * Set this execution as un-finished
	 */
	protected void unfinish() {
		_finished = false;
		for (RebotinolExecutionObserver obs : _observers) {
			obs.unfinished();
		}
	}

	/**
	 * Set this execution as the current being evaluated
	 */
	protected void setCurrent() {
		_current = true;
		for (RebotinolExecutionObserver obs : _observers) {
			obs.setCurrent();
		}
	}

	/**
	 * Unset this execution as the current being evaluated
	 */
	protected void unsetCurrent() {
		_current = false;
		for (RebotinolExecutionObserver obs : _observers) {
			obs.unsetCurrent();
		}
	}

	/**
	 * @return true is this execution has been marked as the one being evaluated
	 */
	public boolean isCurrent() {
		return _current;
	}

	/**
	 * Set this execution as skipped
	 */
	protected void skip() {
		_skipped = true;
		for (RebotinolExecutionObserver obs : _observers) {
			obs.skipped();
		}
	}

	/**
	 * Unset this execution as skipped
	 */
	protected void unskip() {
		_skipped = false;
		for (RebotinolExecutionObserver obs : _observers) {
			obs.unskipped();
		}
	}

	/**
	 * @return true is this execution has been skipped
	 */
	public boolean isSkipped() {
		return _skipped;
	}

	/**
	 * Set or remove a breakpoint in this execution
	 * @throws RebotinolFatalException If something went really wrong
	 */
	public void toggleBreakpoint() throws RebotinolFatalException {
		_breakpoint = !_breakpoint;
		for(RebotinolExecutionObserver o : _observers) {
			if (_breakpoint) o.breakpointSet();
			else o.breakpointRemoved();
		}
		
	}

	/**
	 * @return true if this execution has a breakpoint, false otherwise
	 */
	public boolean isBreakpoint() {
		return _breakpoint;
	}
	
	/**
	 * Accept a {@link RebotinoExecutionVisitor}, according to the visitor design pattern
	 * @param v The visitor to be accepted
	 * @return The result of the visit
	 */
	public abstract Object accept(RebotinolExecutionVisitor v);
}
