package edu.upb.lp.rebotinol.view.automaticTests.world;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolSimpleRepExample;

public class SimpleRepWorldPanelTesting extends AbstractWorldPanelTesting {

	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolSimpleRepExample();
	}

	public static void main(String[] args) {
		SimpleRepWorldPanelTesting t = new SimpleRepWorldPanelTesting();
		t.run();
	}
}
