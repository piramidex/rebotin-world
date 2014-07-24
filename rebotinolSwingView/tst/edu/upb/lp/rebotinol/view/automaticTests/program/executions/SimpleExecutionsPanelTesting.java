package edu.upb.lp.rebotinol.view.automaticTests.program.executions;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolSimpleExample;

public class SimpleExecutionsPanelTesting extends AbstractExecutionsPanelTesting {

	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolSimpleExample();
	}

	public static void main(String[] args) {
		SimpleExecutionsPanelTesting t = new SimpleExecutionsPanelTesting();
		t.run();
	}
}
