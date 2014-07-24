package edu.upb.lp.rebotinol.view.automaticTests.executions;

import javax.swing.JFrame;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.view.automaticTests.AutomaticGUITesting;
import edu.upb.lp.rebotinol.view.executions.ExecutionsPanel;

public abstract class AbstractExecutionsPanelTesting extends AutomaticGUITesting {
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
