package edu.upb.lp.rebotinol.view.automaticTests.executions;

import edu.upb.lp.rebotinol.examples.Problem2_2012_Example;
import edu.upb.lp.rebotinol.examples.RebotinolExample;

public class Executions22012PanelTesting extends AbstractExecutionsPanelTesting {

	@Override
	protected RebotinolExample buildExample() {
		return new Problem2_2012_Example();
	}

	public static void main(String[] args) {
		Executions22012PanelTesting t = new Executions22012PanelTesting();
		t.run();
	}
}
