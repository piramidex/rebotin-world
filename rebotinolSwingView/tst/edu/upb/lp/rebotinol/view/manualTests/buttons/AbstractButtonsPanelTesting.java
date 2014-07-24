package edu.upb.lp.rebotinol.view.manualTests.buttons;

import javax.swing.JFrame;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.view.automaticTests.AutomaticGUITesting;
import edu.upb.lp.rebotinol.view.buttons.ButtonsPanel;

public abstract class AbstractButtonsPanelTesting extends AutomaticGUITesting {
	@Override
	protected void doBuildAndShowFrame(JFrame frame) {
		RebotinolExample ex = getExample();
		ButtonsPanel panel;
		try {
			panel = new ButtonsPanel(ex.getController());
		} catch (RebotinolFatalException e) {
			throw new IllegalStateException(e);
		}
		frame.add(panel);
	}
}
