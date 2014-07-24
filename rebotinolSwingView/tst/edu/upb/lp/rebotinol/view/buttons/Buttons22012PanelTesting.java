package edu.upb.lp.rebotinol.view.buttons;

import edu.upb.lp.rebotinol.examples.Problem2_2012_Example;
import edu.upb.lp.rebotinol.examples.RebotinolExample;

public class Buttons22012PanelTesting extends AbstractButtonsPanelTesting {

	@Override
	protected RebotinolExample buildExample() {
		return new Problem2_2012_Example();
	}

	public static void main(String[] args) {
		Buttons22012PanelTesting t = new Buttons22012PanelTesting();
		t.run();
	}
}
