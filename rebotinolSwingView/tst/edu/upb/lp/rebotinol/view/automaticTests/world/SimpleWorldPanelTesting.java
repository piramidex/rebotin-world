package edu.upb.lp.rebotinol.view.automaticTests.world;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolSimpleExample;

public class SimpleWorldPanelTesting extends AbstractWorldPanelTesting {

	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolSimpleExample();
	}

	public static void main(String[] args) {
		SimpleWorldPanelTesting t = new SimpleWorldPanelTesting();
		t.run();
	}
}
