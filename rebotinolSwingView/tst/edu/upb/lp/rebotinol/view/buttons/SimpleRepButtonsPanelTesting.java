package edu.upb.lp.rebotinol.view.buttons;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolSimpleRepExample;

public class SimpleRepButtonsPanelTesting extends AbstractButtonsPanelTesting {

	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolSimpleRepExample();
	}

	public static void main(String[] args) {
		SimpleRepButtonsPanelTesting t = new SimpleRepButtonsPanelTesting();
		t.run();
	}
}
