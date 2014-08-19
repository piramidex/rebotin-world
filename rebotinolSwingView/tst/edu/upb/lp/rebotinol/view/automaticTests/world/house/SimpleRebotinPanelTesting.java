package edu.upb.lp.rebotinol.view.automaticTests.world.house;

import edu.upb.lp.rebotinol.examples.RebotinolAnotherSimpleExample;
import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolSimpleExample;

public class SimpleRebotinPanelTesting extends AbstractRebotinPanelTesting {

	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolAnotherSimpleExample();
	}

	public static void main(String[] args) {
		SimpleRebotinPanelTesting t = new SimpleRebotinPanelTesting();
		t.run();
	}
	
}
