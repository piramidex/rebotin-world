package edu.upb.lp.rebotinol.view;

import edu.upb.lp.rebotinol.model.executions.RebotinolInstructionExecution;

//TODO javadoc
/**
 * 
 * @author Alexis Marechal
 *
 */
public abstract class RebotinolInstructionObserver {
    public void initialise(RebotinolInstructionExecution exec) {}

    public void stepPerformed() {}

    public void stepsChanged(int _steps) {}

    public void stepBackPerformed() {}

    public void finished() {}

    public void unfinished() {}

    public void setCurrent() {}

    public void unsetCurrent() {}

    public void skipped() {}

    public void unskipped() {}
    
    public void breakpointMet() {}
}
