package edu.upb.lp.rebotinol.view.automaticTests;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.model.executions.RebotinolProgram;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.util.RebotinolFlowException;
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
 * 
 */
public abstract class AutomaticGUITesting extends ManualGUITesting {
	/**
	 * Runs this test. This method should create a JFrame then execute a
	 * rebotinol program step by step.
	 */
	public void run() {
		super.run();
		final RebotinolProgram program = getExample().getProgram();
		RebotinolHouse house = null;
		try {
			house = getExample().getHouse();
		} catch (RebotinolFatalException e) {
			throw new IllegalStateException(e);
		}
		final RebotinolHouse finalHouse = house;
		final Timer timer = new Timer(2000, null);
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				try {
					program.step(finalHouse);
					if (program.isFinished()) {
						timer.stop();
					}
				} catch (RebotinolFlowException e) {
					throw new IllegalStateException(e);
				} catch (RebotinolExecutionException e) {
					throw new IllegalStateException(e);
				}

			}
		};
		timer.addActionListener(listener);
		timer.setRepeats(true);
		System.out.println("Starting forward");
		timer.start();
		while (timer.isRunning());
		System.out.println("Forward finished");
		final Timer timer2 = new Timer(2000, null);
		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				try {
					if (!program.isStarted()) {
						timer.stop();
					} else {
						try {
							program.stepBack(finalHouse);
						} catch (RebotinolFatalException e) {
							throw new IllegalStateException(e);
						}
					}
				} catch (RebotinolFlowException e) {
					throw new IllegalStateException(e);
				}
			}
		};
		timer2.addActionListener(listener2);
		timer2.setRepeats(true);
		System.out.println("Starting backward");
		timer2.start();
		while (timer2.isRunning());
		System.out.println("Backward finished");
	}
}
