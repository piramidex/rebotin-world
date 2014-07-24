package edu.upb.lp.rebotinol.view.manualTests;

import javax.swing.JFrame;

import edu.upb.lp.rebotinol.examples.RebotinolExample;

/**
 * This class is meant to manually test the different panels in the Swing GUI.
 * Subclasses should implement the methods {@link #getExample()} which builds a
 * {@link RebotinolExample} to work with, and {@link #buildAndShowFrame()} which
 * builds a JFrame to be tested. The method {@link #run()} in this class uses
 * theses methods to setup the example, but not automatic execution of the
 * program is triggered.
 * 
 * @author Alexis Marechal
 * 
 */
public abstract class ManualGUITesting {
	private final RebotinolExample example = buildExample();

	/**
	 * Runs this test. This method should create a JFrame and show it..
	 */
	public void run() {
		buildAndShowFrame();
	}

	protected abstract void doBuildAndShowFrame(JFrame frame);

	protected void buildAndShowFrame() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Testing the rebotin GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		doBuildAndShowFrame(frame);
		frame.setVisible(true);
	}

	protected abstract RebotinolExample buildExample();

	public RebotinolExample getExample() {
		return example;
	}
}
