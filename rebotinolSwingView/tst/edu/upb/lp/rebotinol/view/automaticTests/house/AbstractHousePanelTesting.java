package edu.upb.lp.rebotinol.view.automaticTests.house;

import javax.swing.JFrame;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.view.automaticTests.AutomaticGUITesting;
import edu.upb.lp.rebotinol.view.house.MatrixPanel;

public abstract class AbstractHousePanelTesting extends AutomaticGUITesting {

	@Override
	protected void doBuildAndShowFrame(JFrame frame) {
		RebotinolExample ex = getExample();
		MatrixPanel panel;
		try {
//			panel = new HousePanel(ex.getHouse(), ex.getInitialMatrix());
			panel = new MatrixPanel(ex.getHouse(), ex.getInitialMatrix());
		} catch (RebotinolFatalException e) {
			throw new IllegalStateException(e);
		}
		frame.add(panel);
	}
}
