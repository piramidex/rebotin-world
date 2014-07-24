package edu.upb.lp.rebotinol.view.house;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolSimpleExample;

public class SimpleMatrixPanelTesting extends AbstractHousePanelTesting {

	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolSimpleExample();
	}

	public static void main(String[] args) {
		SimpleMatrixPanelTesting t = new SimpleMatrixPanelTesting();
		t.run();
	}
}
