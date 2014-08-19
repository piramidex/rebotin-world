package edu.upb.lp.rebotinol.view.automaticTests.world.house;

import java.awt.Color;

import javax.swing.JFrame;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.view.automaticTests.AutomaticGUITesting;
import edu.upb.lp.rebotinol.view.world.RebotinPanel;

public abstract class AbstractRebotinPanelTesting extends AutomaticGUITesting {

	@Override
	protected void doBuildAndShowFrame(JFrame frame) {
		RebotinolExample ex = getExample();
		RebotinPanel panel;
		try {
			panel = new RebotinPanel(200, Color.WHITE, Color.BLACK, ex.getController());
		} catch (RebotinolFatalException e) {
			throw new IllegalStateException(e);
		}
		frame.add(panel);
	}
}
