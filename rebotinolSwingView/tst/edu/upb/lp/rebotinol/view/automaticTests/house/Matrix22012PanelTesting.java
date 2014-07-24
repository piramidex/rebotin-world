package edu.upb.lp.rebotinol.view.automaticTests.house;

import edu.upb.lp.rebotinol.examples.Problem2_2012_Example;
import edu.upb.lp.rebotinol.examples.RebotinolExample;

public class Matrix22012PanelTesting extends AbstractHousePanelTesting {

	@Override
	protected RebotinolExample buildExample() {
		return new Problem2_2012_Example();
	}

	public static void main(String[] args) {
		Matrix22012PanelTesting t = new Matrix22012PanelTesting();
		t.run();
	}
}
