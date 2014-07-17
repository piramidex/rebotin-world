package edu.upb.lp.rebotinol.model.executions;

import java.util.ArrayList;
import java.util.List;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.util.RebotinolFlowException;

/**
 * A complex instruction has a sequence of sub-instructions. This includes the
 * conditional instructions and the rep instruction. Moreover, a complete
 * rebotinol program can also be seen as a sequential instruction.
 * 
 * @author Alexis Marechal
 * 
 */
public abstract class SequentialInstructionExecution extends
		RebotinolInstructionExecution {

	private List<RebotinolInstructionExecution> _subExecutions;
	private int _currentExecutionIndex = 0;

	/**
	 * Constructor
	 * 
	 * @param subExecutions
	 *            The subExecutions of this sequential instruction execution
	 */
	public SequentialInstructionExecution(
			List<RebotinolInstructionExecution> subExecutions) {
		_subExecutions = new ArrayList<RebotinolInstructionExecution>();
		_subExecutions.addAll(subExecutions);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doStep(RebotinolHouse house)
			throws RebotinolExecutionException, RebotinolFlowException {
		RebotinolInstructionExecution current = getCurrentExecution();
		current.step(house);
		if (current.isFinished()) {
			if (_currentExecutionIndex == _subExecutions.size() - 1) {
				finish();
			} else {
				incCurrent();
			}
		}
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	protected void doStepBack(RebotinolHouse house)
			throws RebotinolFlowException, RebotinolExecutionException, RebotinolFatalException {
		RebotinolInstructionExecution current = getCurrentExecution();
		if (current.isStarted()) {
			current.stepBack(house);
		} else {
			decCurrent();
		}
		unfinish();
	}

	/**
	 * Increases the "current execution" counter, to execute the next sub-execution
	 * @throws RebotinolFlowException  If the currentExecutionIndex was at its maximum value
	 */
	protected void incCurrent() throws RebotinolFlowException {
		if (_currentExecutionIndex == _subExecutions.size() - 1) {
			throw new RebotinolFlowException(
					"Increasing the index in a sequential execution when the index was the maximum");
		}
		setCurrentExecutionIndex(_currentExecutionIndex + 1);
	}

	/**
	 * Decreases the "current execution" counter, to execute the previous
	 * sub-execution
	 * 
	 * @throws RebotinolFlowException
	 *             If the currentExecutionIndex was 0.
	 */
	protected void decCurrent() throws RebotinolFlowException {
		if (_currentExecutionIndex == 0) {
			throw new RebotinolFlowException(
					"Decreasing the index in a sequential execution when the index was 0");
		}
		setCurrentExecutionIndex(_currentExecutionIndex + 1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void skip() {
		super.skip();
		for (RebotinolInstructionExecution exec : _subExecutions) {
			exec.skip();
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void unskip() {
		super.unskip();
		for (RebotinolInstructionExecution exec : _subExecutions) {
			exec.unskip();
		}
	}

	/**
	 * Getter for the sub-executions list.
	 * 
	 * @return A clone of the sub-executions list.
	 */
	public List<RebotinolInstructionExecution> getSubExecutions() {
		List<RebotinolInstructionExecution> ans = new ArrayList<RebotinolInstructionExecution>();
		ans.addAll(_subExecutions);
		return ans;
	}

	/**
	 * @return The index of the current execution being considered in this
	 *         sub-execution, starting with 0.
	 */
	public int getCurrentExecutionIndex() {
		return _currentExecutionIndex;
	}

	/**
	 * @return The current execution being considered.
	 */
	public RebotinolInstructionExecution getCurrentExecution() {
		return _subExecutions.get(_currentExecutionIndex);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean automaticStep() {
		return false;
	}

	/**
	 * Changes the execution index. This method changes the status of the old
	 * and new current executions.
	 * 
	 * @param index
	 *            The new value of the execution index.
	 */
	protected void setCurrentExecutionIndex(int index) {
		getCurrentExecution().unsetCurrent();
		_currentExecutionIndex = index;
		getCurrentExecution().setCurrent();
	}
}
