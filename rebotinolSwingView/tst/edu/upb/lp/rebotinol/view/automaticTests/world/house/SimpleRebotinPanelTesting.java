package edu.upb.lp.rebotinol.view.automaticTests.world;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolSimpleExample;
import edu.upb.lp.rebotinol.view.automaticTests.program.executions.SimpleRepExecutionsPanelTesting;

public class SimpleRebotinPanelTesting extends AbstractRebotinPanelTesting {

	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolSimpleExample();
	}

	public static void main(String[] args) {
		SimpleRebotinPanelTesting t = new SimpleRebotinPanelTesting();
		t.run();
	}
	
}
