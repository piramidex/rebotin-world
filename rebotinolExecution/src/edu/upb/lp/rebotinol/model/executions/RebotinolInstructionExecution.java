package edu.upb.lp.rebotinol.model.executions;

import edu.upb.lp.rebotinol.exceptions.RebotinolExecutionException;
import edu.upb.lp.rebotinol.exceptions.RebotinolFlowException;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.view.RebotinolInstructionObserver;

/**
 * The execution of a Rebotinol instruction.
 *
 * @author Alexis Marechal
 *
 */
public abstract class RebotinolInstructionExecution {
    RebotinolInstructionObserver _observer;
    
	private int _steps = 0;
	private boolean _finished = false;
	private boolean _current = false;
	private boolean _skipped = false;

	/**
	 * Execute a step in this instruction.
	 * 
	 * @param house
	 *            The house in which this instruction should be executed.
	 * @return true if the instruction has been completely executed, or false if
	 *         some steps can still be executed on it.
	 * @throws RebotinolExecutionException
	 *             If there was an error met by Rebotin while executing this
	 *             instruction.
	 * @throws RebotinolFlowException
	 *             If the instruction was completely executed before calling
	 *             this method.
	 */
	public boolean step(RebotinolHouse house)
			throws RebotinolExecutionException, RebotinolFlowException {
		if (_finished) {
			throw new RebotinolFlowException(
					"Tried to execute an instruction that was already executed");
		} else {
			incSteps();
			doStep(house);
			_observer.stepPerformed();
			return _finished;
		}
	}

	/**
	 * Increase the number of steps performed in this execution
	 */
	private void incSteps() {
        _steps++;
        _observer.stepsChanged(_steps);
    }
	
	/**
     * Decrease the number of steps performed in this execution
     */
    private void decSteps() {
        _steps--;
        _observer.stepsChanged(_steps);
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
	 * @throws RebotinolExecutionException
	 *             If there was an error met by Rebotin while executing this
	 *             instruction.
	 * @throws RebotinolFlowException
	 *             If no steps in the instruction was executed before calling
	 *             this method.
	 */
	public boolean stepBack(RebotinolHouse house) {
		if (_steps == 0) {
			throw new IllegalStateException(
					"Tried to un-execute an instruction that was not executed");
		} else {
			decSteps();
			doStepBack(house);
			_observer.stepBackPerformed();
			return _steps == 0;
		}
	}

	/**
	 * Actually step back the instruction. This method should modify the
	 * _finished attribute.
	 * 
	 * @param house
	 *            The house in which this instruction should be stepped back.
	 */
	protected abstract void doStepBack(RebotinolHouse house);

	/**
     * Execute completely this instruction, executing one step at a time until
     * it is finished.
     * 
     * @param house
     *            The house on which we are working.
     * @throws RebotinolExecutionException
     *             If there was an error met by Rebotin while executing this
     *             instruction.
     */
    public void executeFully(RebotinolHouse house)
            throws RebotinolExecutionException {
        try {
            while (!step(house)) {
            }
            _observer.executedFully();
        } catch (RebotinolFlowException e) {
            throw new IllegalStateException(
                    "Got a flow exception while executing completely an instruction");
        }
    }
    
	/**
	 * Completely reinitialise this instruction, stepping back step by step.
	 * 
	 * @param house
	 *            The house on which this instruction is supposed to work.
	 */
	public void reinitialise(RebotinolHouse house) {
		while (_steps > 0) {
			stepBack(house);
		}
		_observer.reinitialised();
	}

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
	    _observer.finished();
	}
	
	/**
	 * Set this execution as un-finished
	 */
	protected void unfinish() {
	    _finished = false;
	    _observer.unfinished();
	}
	
	/**
	 * Set this execution as the current being evaluated
	 */
	protected void setCurrent() {
	    _current = true;
	    _observer.setCurrent();
	}
	
	/**
	 * Unset this execution as the current being evaluated
	 */
	protected void unsetCurrent() {
	    _current = false;
	    _observer.unsetCurrent();
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
	    _observer.skipped();
	}
	
	/**
     * Unset this execution as skipped
     */
	protected void unskip() {
	    _skipped = false;
	    _observer.unskipped();
	}
	
	/**
     * @return true is this execution has been skipped
     */
	public boolean isSkipped() {
	    return _skipped;
	}
}
