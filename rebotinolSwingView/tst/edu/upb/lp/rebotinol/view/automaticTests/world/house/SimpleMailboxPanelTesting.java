package edu.upb.lp.rebotinol.view.automaticTests.world.house;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolExampleFourNums;

public class SimpleMailboxPanelTesting extends AbstractMailboxPanelTesting {

	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolExampleFourNums();
	}

	public static void main(String[] args) {
		SimpleMailboxPanelTesting t = new SimpleMailboxPanelTesting();
		t.run();
	}
	
}
