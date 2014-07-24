package edu.upb.lp.rebotinol.view.automaticTests.world;

import edu.upb.lp.rebotinol.examples.Problem2_2012_Example;
import edu.upb.lp.rebotinol.examples.RebotinolExample;

public class World22012PanelTesting extends AbstractWorldPanelTesting {

	@Override
	protected RebotinolExample buildExample() {
		return new Problem2_2012_Example();
	}

	public static void main(String[] args) {
		World22012PanelTesting t = new World22012PanelTesting();
		t.run();
	}
}
