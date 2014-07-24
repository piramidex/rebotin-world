package edu.upb.lp.rebotinol.view.buttons;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolSimpleExample;

public class SimpleButtonsPanelTesting extends AbstractButtonsPanelTesting {

	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolSimpleExample();
	}

	public static void main(String[] args) {
		SimpleButtonsPanelTesting t = new SimpleButtonsPanelTesting();
		t.run();
	}
}
