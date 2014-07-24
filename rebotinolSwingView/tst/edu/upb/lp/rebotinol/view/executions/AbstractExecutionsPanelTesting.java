package edu.upb.lp.rebotinol.view.executions;

import javax.swing.JFrame;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.view.AbstractGUITesting;

public abstract class AbstractExecutionsPanelTesting extends AbstractGUITesting {
	@Override
	protected void doBuildAndShowFrame(JFrame frame) {
		RebotinolExample ex = getExample();
		ExecutionsPanel panel;
		try {
			panel = new ExecutionsPanel(ex.getController());
		} catch (RebotinolFatalException e) {
			throw new IllegalStateException(e);
		}
		frame.add(panel);
	}
}
