package edu.upb.lp.rebotinol.view.executions;

import edu.upb.lp.rebotinol.model.executions.RebotinolInstructionExecution;
import edu.upb.lp.rebotinol.util.RebotinolExecutionObserver;

public class ExecutionPanel implements RebotinolExecutionObserver {

	public ExecutionPanel(RebotinolInstructionExecution exec) {
		exec.registerObserver(this);
	}
	
	@Override
	public void stepPerformed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stepsChanged(int _steps) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stepBackPerformed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finished() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unfinished() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCurrent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unsetCurrent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void skipped() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unskipped() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breakpointMet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breakpointSet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breakpointRemoved() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void repetitionsChanged(int repetitionsExecuted) {
		// TODO Auto-generated method stub
		
	}
	

}
