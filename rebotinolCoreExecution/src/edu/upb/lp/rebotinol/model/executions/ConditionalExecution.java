package edu.upb.lp.rebotinol.model.executions;

import java.util.List;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.util.RebotinolFlowException;

/**
 * A conditional execution is a sequential execution that may or may not be
 * executed depending on some condition. The specific condition is to be defined
 * in the subclasses.
 * 
 * @author Alexis Marechal
 * 
 */
public abstract class ConditionalExecution extends SequentialInstructionExecution {
    private boolean _conditionVerified = false;

    /**
     * Constructor
     * 
     * @param subExecutions
     *            The subExecutions of this sequential instruction execution
     */
    public ConditionalExecution(List<RebotinolInstructionExecution> subExecutions) {
        super(subExecutions);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doStep(RebotinolHouse house) throws RebotinolExecutionException, RebotinolFlowException {
        if (_conditionVerified) {
            super.doStep(house);
        } else {
            if (evalCondition(house)) {
                _conditionVerified = true;
                getSubExecutions().get(0).setCurrent();
                unsetCurrent();
            } else {
                for (RebotinolInstructionExecution exec : getSubExecutions()) {
                    exec.skip();
                }
                finish();
            }
        }
    }

    /**
     * Evaluate the condition that will determine wether the sub-executions of
     * this conditional execution will be executed
     * 
     * @param house
     *            The rebotinol house on which we are working
     * @return true if the subExecutions should be executed, false otherwise
     * @throws RebotinolExecutionException
     *             If the evaluation condition met an error (e.g., empty memory
     *             or empty matrix value)
     */
    protected abstract boolean evalCondition(RebotinolHouse house) throws RebotinolExecutionException;

    /**
	 * {@inheritDoc} 
	 */
	@Override
	protected void doStepBack(RebotinolHouse house) throws RebotinolFlowException, RebotinolFatalException {
		if (getCurrentExecutionIndex() == 0 && !getCurrentExecution().isStarted()) {
			_conditionVerified = false;
			setCurrent();
		} else {
			super.doStepBack(house);
		}
	}
	
    /**
     * {@inheritDoc}
     */
    @Override
	public RebotinolInstructionExecution getNextExecutionToStep() {
    	if (_conditionVerified) {
    		return super.getNextExecutionToStep();
    	} else {
    		return this;
    	}
	}
}
