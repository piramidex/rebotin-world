package edu.upb.lp.rebotinol.view.automaticTests;

import edu.upb.lp.rebotinol.controller.RebotinolSchedulerMonitor;
import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.view.manualTests.ManualGUITesting;

/**
 * This class is meant to manually test the different panels in the Swing GUI.
 * Subclasses should implement the methods {@link #getExample()} which builds a
 * {@link RebotinolExample} to work with, and {@link #buildAndShowFrame()} which
 * builds a JFrame to be tested. The method {@link #run()} in this class uses
 * theses methods to setup the example, and then automatically executes the
 * corresponding program.
 * 
 * @author Alexis Marechal
 * @author Alfredo Villalba
 * 
 */
public abstract class AutomaticGUITesting extends ManualGUITesting {
	
	/**
	 * Runs this test. This method should create a JFrame then execute a
	 * rebotinol program step by step.
	 */
	public void run() {
		super.run();

		// play forward
		
		System.out.println("Starting forward");

		try {
			getExample().getController().play();
		} catch (RebotinolFatalException e) {
			e.printStackTrace();
		}
		
		try {
			RebotinolSchedulerMonitor.get_instance().waitPlayFinished(getExample().getController());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (RebotinolFatalException e) {
			e.printStackTrace();
		}
		
		System.out.println("Forward finished");
		
		// pause 2000 ms
		
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		// play backward
		
		System.out.println("Starting backward");
		
		try {
			getExample().getController().playBack();
		} catch (RebotinolFatalException e) {
			e.printStackTrace();
		}

		try {
			RebotinolSchedulerMonitor.get_instance().waitPlayBackFinished(getExample().getController());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (RebotinolFatalException e) {
			e.printStackTrace();
		}
		
		System.out.println("Backward finished");
		
		
	}
}
