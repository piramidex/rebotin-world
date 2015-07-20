package edu.upb.lp.rebotinol.view.automaticTests.world.house;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolExampleErrorEmptyCell;

public class SimpleErrorAlarmPanelTesting extends AbstractErrorAlarmPanelTesting {

	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolExampleErrorEmptyCell();
	}

	public static void main(String[] args) {
		SimpleErrorAlarmPanelTesting t = new SimpleErrorAlarmPanelTesting();
		t.run();
	}
	
}
