package edu.upb.lp.rebotinol.view;

import javax.swing.JFrame;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;

public abstract class AbstractMainFrameTesting {
	private final RebotinolExample _example = buildExample();
	
	/**
	 * Runs this test. This method should create a JFrame and show it..
	 */
	public void run() {
		buildAndShowFrame();
	}
	
	protected void buildAndShowFrame() {
		RebotinolExample ex = getExample();
		JFrame mainFrame;
		try {
			mainFrame = new RebotinolMainFrame(ex.getController());
		} catch (RebotinolFatalException e) {
			throw new IllegalStateException(e);
		}
		mainFrame.setVisible(true);
	}
	
	protected abstract RebotinolExample buildExample();

	public RebotinolExample getExample() {
		return _example;
	}
}
