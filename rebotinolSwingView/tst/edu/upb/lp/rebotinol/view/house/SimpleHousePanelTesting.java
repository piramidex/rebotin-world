package edu.upb.lp.rebotinol.view.house;

import javax.swing.JFrame;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolSimpleExample;
import edu.upb.lp.rebotinol.view.AbstractGUITesting;

public class SimpleHousePanelTesting extends AbstractGUITesting {

	@Override
	protected void doBuildAndShowFrame(JFrame frame) {
		RebotinolExample ex = getExample();
		HousePanel panel = new HousePanel(ex.getHouse(), ex.getInitialMatrix());
		frame.add(panel);
	}

	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolSimpleExample();
	}

	public static void main(String[] args) {
		SimpleHousePanelTesting t = new SimpleHousePanelTesting();
		t.run();
	}
}
