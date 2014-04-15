package edu.upb.lp.rebotinol.model.executions;


//TODO javadoc
/**
 * 
 * @author Alexis Marechal
 *
 */
public abstract class RebotinolExecutionObserver {
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
