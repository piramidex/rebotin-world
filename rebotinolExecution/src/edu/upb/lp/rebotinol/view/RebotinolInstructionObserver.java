package edu.upb.lp.rebotinol.view;

import edu.upb.lp.rebotinol.model.executions.RebotinolInstructionExecution;

public interface RebotinolInstructionObserver {
    public void initialise(RebotinolInstructionExecution exec);

    public void stepPerformed();

    public void stepsChanged(int _steps);

    public void stepBackPerformed();

    public void executedFully();

    public void reinitialised();

    public void finished();

    public void unfinished();

    public void setCurrent();

    public void unsetCurrent();

    public void skipped();

    public void unskipped();
}
