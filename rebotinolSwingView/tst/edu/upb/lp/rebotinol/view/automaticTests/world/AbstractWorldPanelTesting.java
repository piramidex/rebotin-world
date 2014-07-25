package edu.upb.lp.rebotinol.view.automaticTests.world;

import javax.swing.JFrame;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.view.automaticTests.AutomaticGUITesting;
import edu.upb.lp.rebotinol.view.world.HousePanel;
import edu.upb.lp.rebotinol.view.world.WorldPanel;

public abstract class AbstractWorldPanelTesting extends AutomaticGUITesting {

	@Override
	protected void doBuildAndShowFrame(JFrame frame) {
		RebotinolExample ex = getExample();
		WorldPanel panel;
		try {
			panel = new WorldPanel(ex.getController());
		} catch (RebotinolFatalException e) {
			throw new IllegalStateException(e);
		}
		frame.add(panel);
	}
}
