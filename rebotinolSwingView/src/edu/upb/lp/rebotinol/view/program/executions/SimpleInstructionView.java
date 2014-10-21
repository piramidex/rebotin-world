package edu.upb.lp.rebotinol.view.program.executions;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.event.MouseInputAdapter;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.model.executions.RebotinolInstructionExecution;
import edu.upb.lp.rebotinol.observers.RebotinolExecutionObserver;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;

//TODO javadoc
//TODO check what to do with exceptions, who is supposed to catch them?
public class SimpleInstructionView extends InstructionView implements
		RebotinolExecutionObserver {
	/**
	 * Serial
	 */
	private static final long serialVersionUID = -2686975294972574340L;

	protected boolean _breakpoint = false;

	protected JLabel _lbIcon;
	protected JLabel _lbInstruction;
	protected Component _boxIndent;

	private static ImageIcon emptyIcon = new ImageIcon("res/tmp/empty.png");
	private static ImageIcon runIcon = new ImageIcon("res/tmp/arrow_small.png");
	private static ImageIcon stopIcon = new ImageIcon("res/tmp/stop_small.png");
	private static ImageIcon counterIcon = new ImageIcon("res/tmp/counter.png");

	public SimpleInstructionView(RebotinolInstructionExecution instr,
			ComposedInstructionView parentView, RebotinolController controller) {

		super(instr, parentView, controller);
		populateView(instr.isCurrent());

	}

	public SimpleInstructionView(RebotinolInstructionExecution instr,
			RebotinolController controller) {
		super(instr, controller);
		populateView(instr.isCurrent());
	}

	public SimpleInstructionView(String instrText,
			ComposedInstructionView parentView, RebotinolController controller) {

		super(instrText, parentView, controller);
		populateView(false);

	}

	public SimpleInstructionView(String instrText,
			RebotinolController controller) {
		super(instrText, controller);
		populateView(false);
	}

	private void populateView(boolean isCurrent) {
		setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
		// icon
		// add(Box.createHorizontalStrut(50));
		_lbIcon = new JLabel(emptyIcon);
		_lbIcon.setPreferredSize(new Dimension(30, 20));
		if (isCurrent) {
			setCurrent();
		} else {
			unsetCurrent();
		}
		
		if (_runnable) {
			_lbIcon.addMouseListener(new MouseInputAdapter() {
				public void mouseClicked(MouseEvent e) {
					if (e.getClickCount() == 2) {
						try {
							handleBreakpointEvent();
						} catch (RebotinolFatalException e1) {
							throw new IllegalStateException(e1);
						}
					}
				}
			});
		}
		add(_lbIcon);

		// indent
		_boxIndent = Box.createHorizontalStrut(30 * _indent);
		add(_boxIndent);

		// instruction
		add(_lbInstruction = new JLabel(_instrText));
		add(Box.createHorizontalGlue());

		// to avoid vertical resizing - no way to avoid fixing horizontal limit?
		setMaximumSize(new Dimension(2000, 50));
	}

	protected void handleBreakpointEvent() throws RebotinolFatalException {
		for (RebotinolInstructionExecution e : _executions) {
			_controller.toggleBreakpoint(e);
		}
	}

	public void setCounter(int n) {

	}

	// ------------------------------------------------
	// RebotinolExecutionObserver interface methods
	// ------------------------------------------------

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
		setBackground(Color.GREEN);
		_lbIcon.setIcon(runIcon);
	}

	@Override
	public void unsetCurrent() {
		setBackground(Color.WHITE);
		_lbIcon.setIcon(emptyIcon);
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
	public void breakpointSet() throws RebotinolFatalException {
		if (!_breakpoint) {
			_breakpoint = true;
			_lbIcon.setIcon(stopIcon);
		}
	}

	@Override
	public void breakpointRemoved() throws RebotinolFatalException {
		if (_breakpoint) {
			_breakpoint = false;
			_lbIcon.setIcon(emptyIcon);
		}
	}

	@Override
	public void repetitionsChanged(int repetitionsExecuted) {
		_lbIcon.setIcon(counterIcon);
		_lbIcon.setText(repetitionsExecuted + "");
		_lbIcon.setHorizontalTextPosition(JLabel.CENTER);
		_lbIcon.setFont(new Font(_lbIcon.getFont().getFontName(), Font.PLAIN,
				10));
	}

	@Override
	public void started() {
		// TODO Auto-generated method stub

	}

	@Override
	public void unstarted() {
		// TODO Auto-generated method stub

	}

}
