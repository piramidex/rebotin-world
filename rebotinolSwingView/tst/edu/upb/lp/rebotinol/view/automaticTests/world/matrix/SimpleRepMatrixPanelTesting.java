
package edu.upb.lp.rebotinol.view.automaticTests.world.matrix;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolSimpleRepExample;

public class SimpleRepMatrixPanelTesting extends AbstractHousePanelTesting {

	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolSimpleRepExample();
	}

	public static void main(String[] args) {
		SimpleRepMatrixPanelTesting t = new SimpleRepMatrixPanelTesting();
		t.run();
	}
}
