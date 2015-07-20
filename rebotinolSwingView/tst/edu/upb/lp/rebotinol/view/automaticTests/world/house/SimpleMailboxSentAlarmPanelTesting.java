package edu.upb.lp.rebotinol.view.automaticTests.world.house;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolExampleErrorEmptyCell;
import edu.upb.lp.rebotinol.examples.RebotinolExampleFourNums;

public class SimpleMailboxSentAlarmPanelTesting extends AbstractMailboxSentAlarmPanelTesting {

	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolExampleFourNums();
	}

	public static void main(String[] args) {
		SimpleMailboxSentAlarmPanelTesting t = new SimpleMailboxSentAlarmPanelTesting();
		t.run();
	}
	
}
