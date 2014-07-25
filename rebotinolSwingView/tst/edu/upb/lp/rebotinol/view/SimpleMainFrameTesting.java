package edu.upb.lp.rebotinol.view;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolSimpleExample;

public class SimpleMainFrameTesting extends AbstractMainFrameTesting {
	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolSimpleExample();
	}
	
	public static void main(String[] args) {
		SimpleMainFrameTesting t = new SimpleMainFrameTesting();
		t.run();
	}
}
