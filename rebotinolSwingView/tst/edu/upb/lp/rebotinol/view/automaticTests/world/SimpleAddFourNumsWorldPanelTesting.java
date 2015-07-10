package edu.upb.lp.rebotinol.view.automaticTests.world;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolExampleFourNums;

public class SimpleAddFourNumsWorldPanelTesting extends AbstractWorldPanelTesting {

	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolExampleFourNums();
	}

	public static void main(String[] args) {
		SimpleAddFourNumsWorldPanelTesting t = new SimpleAddFourNumsWorldPanelTesting();
		t.run();
	}
}
