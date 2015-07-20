package edu.upb.lp.rebotinol.view.automaticTests.world.house;

import java.awt.Color;

import javax.swing.JFrame;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.view.automaticTests.AutomaticGUITesting;
import edu.upb.lp.rebotinol.view.world.ErrorAlarmPanel;
import edu.upb.lp.rebotinol.view.world.MailboxSentAlarmPanel;

public abstract class AbstractMailboxSentAlarmPanelTesting extends AutomaticGUITesting {

	@Override
	protected void doBuildAndShowFrame(JFrame frame) {
		RebotinolExample ex = getExample();
		MailboxSentAlarmPanel panel;
		try {
			panel = new MailboxSentAlarmPanel(100, Color.WHITE, Color.GREEN, Color.BLACK, ex.getController());
		} catch (RebotinolFatalException e) {
			throw new IllegalStateException(e);
		}
		frame.add(panel);
	}
}
