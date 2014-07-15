package edu.upb.lp.rebotinol.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

import edu.upb.lp.rebotinol.examples.RebotinolExample;
import edu.upb.lp.rebotinol.model.executions.RebotinolProgram;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.util.RebotinolFlowException;

/**
 * This class is meant to manually test the different panels in the Swing GUI. Subclasses should
 * implement the methods {@link #getExample()} which builds a {@link RebotinolExample} to work with,
 * and {@link #buildAndShowFrame()} which builds a JFrame to be tested. The method {@link #run()} in
 * this class uses theses methods to setup the example, and then executes the program contained
 * in the example with the house also contained in the example.
 * @author Alexis Marechal
 *
 */
public abstract class AbstractGUITesting {
	private final RebotinolExample example = buildExample();

	/**
	 * Runs this test. This method should create a JFrame then execute a rebotinol program step
	 * by step.
	 */
	public void run() {
		buildAndShowFrame();
		final RebotinolProgram program = example.getProgram();
		RebotinolHouse house = null;
		try {
			house = example.getHouse();
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
		timer.start();
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
