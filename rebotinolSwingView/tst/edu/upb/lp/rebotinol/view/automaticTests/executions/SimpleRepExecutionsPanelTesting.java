package edu.upb.lp.rebotinol.view.automaticTests.executions;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolSimpleRepExample;

public class SimpleRepExecutionsPanelTesting extends AbstractExecutionsPanelTesting {

	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolSimpleRepExample();
	}

	public static void main(String[] args) {
		SimpleRepExecutionsPanelTesting t = new SimpleRepExecutionsPanelTesting();
		t.run();
	}
}
