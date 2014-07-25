package edu.upb.lp.rebotinol.view;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolSimpleRepExample;

public class SimpleRepMainFrameTesting extends AbstractMainFrameTesting {
	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolSimpleRepExample();
	}
	
	public static void main(String[] args) {
		SimpleRepMainFrameTesting t = new SimpleRepMainFrameTesting();
		t.run();
	}
}
