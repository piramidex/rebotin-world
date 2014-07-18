package edu.upb.lp.rebotinol.view.executions;

import javax.swing.JPanel;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.model.executions.RebotinolInstructionExecution;
import edu.upb.lp.rebotinol.util.RebotinolExecutionObserver;

public abstract class InstructionView extends JPanel implements RebotinolExecutionObserver {

	protected String _instrText;
	protected int _indent;
	protected boolean _runnable;
	protected RebotinolInstructionExecution _execution;
	protected RebotinolController _controller;
	

	public InstructionView(
			RebotinolInstructionExecution instr,
			RebotinolController controller) {
		super();
		_instrText = ExecutionsNameGetter.getName(instr);
		_indent = 0;
		_runnable = true;
		_execution = instr;
		_controller = controller;
		instr.registerObserver(this);
	}

	public InstructionView(
			RebotinolInstructionExecution instr,
			ComposedInstructionView containerInstr,
			RebotinolController controller) {
		super();
		_instrText = ExecutionsNameGetter.getName(instr);
		_indent = containerInstr.getIndent() + 1;
		_runnable = true;
		_execution = instr;
		_controller = controller;
		containerInstr.addNestedInstructionView(this);
		instr.registerObserver(this);
	}
	
	
	public InstructionView(
			String instrText,
			RebotinolController controller) {
		super();
		_instrText = instrText;
		_indent = 0;	
		_runnable = false;
		_execution = null;
		_controller = controller;
	}

	public InstructionView(
			String instrText,
			ComposedInstructionView parentView,
			RebotinolController controller) {
		super();
		_instrText = instrText;
		_indent = parentView.getIndent() + 1;
		_runnable = false;
		_execution = null;
		_controller = controller;
	}

	public String getInstrText() { return _instrText; }
	
	public int getIndent() { return _indent; }

	public void attachAdditionalInstr(RebotinolInstructionExecution instr) {
		instr.registerObserver(this);
	}
}
