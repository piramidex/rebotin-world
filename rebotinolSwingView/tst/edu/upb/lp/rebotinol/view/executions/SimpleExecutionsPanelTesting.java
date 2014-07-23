package edu.upb.lp.rebotinol.view.executions;

import javax.swing.JFrame;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolSimpleExample;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.view.AbstractGUITesting;

public class SimpleExecutionsPanelTesting extends AbstractGUITesting {

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

	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolSimpleExample();
	}

	public static void main(String[] args) {
		SimpleExecutionsPanelTesting t = new SimpleExecutionsPanelTesting();
		t.run();
	}
}
