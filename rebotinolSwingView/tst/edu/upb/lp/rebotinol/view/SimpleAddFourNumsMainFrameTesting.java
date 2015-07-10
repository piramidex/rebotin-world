package edu.upb.lp.rebotinol.view;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolExampleFourNums;

public class SimpleAddFourNumsMainFrameTesting extends AbstractMainFrameTesting {
	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolExampleFourNums();
	}
	
	public static void main(String[] args) {
		SimpleAddFourNumsMainFrameTesting t = new SimpleAddFourNumsMainFrameTesting();
		t.run();
	}
}
