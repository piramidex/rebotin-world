package edu.upb.lp.rebotinol.model.executions;

/**
 * This observer is used to watch the execution of an instruction in a
 * rebotinol program. The execution will warn its observers when some specific
 * events occur.
 * 
 * @author Alexis Marechal
 * 
 */
public abstract class RebotinolExecutionObserver {
	/**
	 * Builds an observer for a given execution. This observer registers itself
	 * to the execution.
	 * 
	 * @param exec
	 */
	public RebotinolExecutionObserver(RebotinolInstructionExecution exec) {
		exec.registerObserver(this);
	}

	/**
	 * This method is executed by the observed execution when it performs a step
	 */
	public void stepPerformed() {
	}

	/**
	 * This method is executed by the observed execution when the number of steps is updated
	 */
	public void stepsChanged(int _steps) {
	}

	/**
	 * This method is executed by the observed execution when a step back is performed
	 */
	public void stepBackPerformed() {
	}

	/**
	 * This method is executed by the observed execution when it is finished
	 */
	public void finished() {
	}

	/**
	 * This method is executed by the observed execution when it is no longer finished
	 */
	public void unfinished() {
	}

	/**
	 * This method is executed by the observed execution when it has been set as the current execution
	 */
	public void setCurrent() {
	}

	/**
	 * This method is executed by the observed execution when it has been unset as the current execution
	 */
	public void unsetCurrent() {
	}

	/**
	 * This method is executed by the observed execution when it has been skipped
	 */
	public void skipped() {
	}

	/**
	 * This method is executed by the observed execution when it has been unskipped
	 */
	public void unskipped() {
	}

	/**
	 * This method is executed by the observed execution when it should be executed but a breakpoint is met
	 */
	public void breakpointMet() {
	}
}