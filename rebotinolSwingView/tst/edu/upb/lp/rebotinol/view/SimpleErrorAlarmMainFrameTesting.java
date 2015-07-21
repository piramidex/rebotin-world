package edu.upb.lp.rebotinol.view;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.examples.RebotinolExampleErrorEmptyCell;

public class SimpleErrorAlarmMainFrameTesting extends AbstractMainFrameTesting {
	@Override
	protected RebotinolExample buildExample() {
		return new RebotinolExampleErrorEmptyCell();
	}
	
	public static void main(String[] args) {
		SimpleErrorAlarmMainFrameTesting t = new SimpleErrorAlarmMainFrameTesting();
		t.run();
	}
}
