package edu.upb.lp.rebotinol.model.executions;

import java.util.ArrayList;
import java.util.List;

import edu.upb.lp.rebotinol.exceptions.RebotinolExecutionException;
import edu.upb.lp.rebotinol.exceptions.RebotinolFlowException;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;

/**
 * A complex instruction has a sequence of sub-instruction. This includes the
 * conditional instructions and the rep instruction. Moreover, a complete
 * rebotinol program can also be seen as a sequential instruction.
 * 
 * @author Alexis Marechal
 * 
 */
public class SequentialInstructionExecution extends RebotinolInstructionExecution {

    private List<RebotinolInstructionExecution> _subExecutions;
    private int _currentExecution = 0;

    /**
     * Constructor
     * 
     * @param subExecutions
     *            The subExecutions of this sequential instruction execution
     */
    public SequentialInstructionExecution(List<RebotinolInstructionExecution> subExecutions) {
        _subExecutions.addAll(subExecutions);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doStep(RebotinolHouse house) throws RebotinolExecutionException, RebotinolFlowException {
        RebotinolInstructionExecution current = _subExecutions.get(_currentExecution);
        current.step(house);
        if (current.isFinished()) {
            if (_currentExecution == _subExecutions.size() - 1) {
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
    protected void doStepBack(RebotinolHouse house) {
        RebotinolInstructionExecution current = _subExecutions.get(_currentExecution);
        if (current.isStarted()) {
            current.stepBack(house);
        } else {
            _subExecutions.get(_currentExecution).unsetCurrent();
            decCurrent();
        }
        unfinish();
    }

    /**
     * Increases the "current execution" counter, to execute the next
     * sub-execution
     */
    protected void incCurrent() {
        _currentExecution++;
        _subExecutions.get(_currentExecution).setCurrent();
    }

    /**
     * Decreases the "current execution" counter, to execute the previous
     * sub-execution
     */
    protected void decCurrent() {
        _currentExecution--;
        _subExecutions.get(_currentExecution).setCurrent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCurrent() {
        super.setCurrent();
        for (RebotinolInstructionExecution exec : _subExecutions) {
            exec.unskip();
        }
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
    protected List<RebotinolInstructionExecution> getSubExecutions() {
        List<RebotinolInstructionExecution> ans = new ArrayList<RebotinolInstructionExecution>();
        ans.addAll(_subExecutions);
        return ans;
    }

    /**
     * @return The index of the current execution being considered in this
     *         sub-execution. This value is 0 is this execution has not started
     *         yet.
     */
    protected int getCurrentExecution() {
        return _currentExecution;
    }

    /**
     * A public getter for the current execution index. This value may differ
     * from the protected getter {@link #getCurrentExecution()} when this is a
     * REP instruction.
     * 
     * @return
     */
    public int getCurrentExecutionIndex() {
        return _currentExecution;
    }
}
