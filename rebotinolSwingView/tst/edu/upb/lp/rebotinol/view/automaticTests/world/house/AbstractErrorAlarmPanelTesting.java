package edu.upb.lp.rebotinol.view.automaticTests.world.house;

import java.awt.Color;

import javax.swing.JFrame;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.view.automaticTests.AutomaticGUITesting;
import edu.upb.lp.rebotinol.view.world.ErrorAlarmPanel;

public abstract class AbstractErrorAlarmPanelTesting extends AutomaticGUITesting {

	@Override
	protected void doBuildAndShowFrame(JFrame frame) {
		RebotinolExample ex = getExample();
		ErrorAlarmPanel panel;
		try {
			panel = new ErrorAlarmPanel(100, Color.WHITE, Color.RED, Color.BLACK, ex.getController());
		} catch (RebotinolFatalException e) {
			throw new IllegalStateException(e);
		}
		frame.add(panel);
	}
}
