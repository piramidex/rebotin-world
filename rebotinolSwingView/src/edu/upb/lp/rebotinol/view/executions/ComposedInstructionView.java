package edu.upb.lp.rebotinol.view.executions;

import java.awt.Color;

import javax.swing.BoxLayout;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.model.executions.SequentialInstructionExecution;

public class ComposedInstructionView extends InstructionView {
	/**
	 * Serial 
	 */
	private static final long serialVersionUID = -5270550700301600302L;
	
	protected SimpleInstructionView _beginInstruction;
	protected SimpleInstructionView _endInstruction;
	
	protected int _numNestedInstrs;

	public ComposedInstructionView(
			SequentialInstructionExecution instr,
			ComposedInstructionView parentView,
			RebotinolController controller) {

		super(instr, parentView, controller);
		populateView(instr);
	}

	public ComposedInstructionView(
			SequentialInstructionExecution instr,
			RebotinolController controller) {
		
		super(instr, controller);
		populateView(instr);
	}


	private void populateView(SequentialInstructionExecution instr) {
		setBackground(Color.WHITE);
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

		// create begin composed instruction
		_beginInstruction = new SimpleInstructionView(instr, _controller);
		add(_beginInstruction);
		
		// create end composed instruction
		_endInstruction = new SimpleInstructionView("}", _controller);
		add(_endInstruction);

		_numNestedInstrs = 0;
	}

	public void addNestedInstructionView(InstructionView subView) {
		_numNestedInstrs++;
		add(subView, _numNestedInstrs);
	}
	

	//------------------------------------------------
	// RebotinolExecutionObserver interface methods
	//------------------------------------------------
	

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
	
	
	
	
	
	
	
	
//	public void addCounter() {
//		_beginInstruction.setCounter(0);
//	}
//	
//	public void removeCounter() {
//		_beginInstruction.clearCounter();
//	}
//	
//	public void setCounter(int n) {
//		_beginInstruction.setCounter(n);
//	}


}
