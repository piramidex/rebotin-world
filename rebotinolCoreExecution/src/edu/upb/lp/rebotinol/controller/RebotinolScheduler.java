package edu.upb.lp.rebotinol.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.util.RebotinolFlowException;

/**
 * This class controls the automatic execution of rebotin. When the method play() is called,
 * a {@link Timer} is launched, and it is stopped either when the method stop() is called or when the
 * program meets a breakpoint.
 *
 * @author Alexis Marechal
 *
 */
//TODO check what to do with exceptions
public class RebotinolScheduler {
	private final RebotinolController _controller;
	private RebotinolButtonsController _buttonsController;

	private final Timer _playTimer;
	private boolean _forward = true;
	
	/**
	 * Constructor.
	 * @param controller The controller that contains the program to be executed by
	 * this scheduler.
	 */
	public RebotinolScheduler(RebotinolController controller,
			RebotinolButtonsController buttonsController) {
		_controller = controller;
		_buttonsController = buttonsController;
		_playTimer = new Timer(2000, null);
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				try {
					if (_forward) {
						if(_controller.automaticStep()) {
							stop();
							synchronized (RebotinolSchedulerMonitor.get_instance()) {
								RebotinolSchedulerMonitor.get_instance().notifyAll();
							}
						}
					} else {
						if(_controller.automaticStepBack()) {
							stop();
							synchronized (RebotinolSchedulerMonitor.get_instance()) {
								RebotinolSchedulerMonitor.get_instance().notifyAll();
							}
						}
					}
				} catch (RebotinolFlowException e) {
					throw new IllegalStateException(e);
				} catch (RebotinolFatalException e) {
					throw new IllegalStateException(e);
				}
			}
		};
		_playTimer.addActionListener(listener);
		_playTimer.setRepeats(true);
	}

	public static enum Speeds {
		INSTANTANEOUS(1),
		FAST(100),
		NORMAL(500),
		SLOW(1000),
		VERYSLOW(2000);
		
		private int _ms;
		
		private Speeds(int ms) {
			_ms = ms;
		}
	}
	
	/**
	 * Start the automatic execution of the program.
	 */
	public void play() {
		_forward = true;
		if (!_playTimer.isRunning()) {
			try {
				if(!_controller.automaticStep()) {
					_playTimer.start();
					_buttonsController.forwardStarted();
				}
			} catch (RebotinolFlowException e) {
				throw new IllegalStateException(e);
			}
		}
	}
	
	/**
	 * Stop the automatic execution of the program.
	 */
	public void stop() {
		if (_playTimer.isRunning()) {
			_playTimer.stop();
			if (_forward) {
				_buttonsController.forwardFinished();
			} else {
				_buttonsController.backwardFinished();
			}
		}
	}
	
	/**
	 * Start the automatic execution of the program.
	 */
	public void playBack() {
		_forward = false;
		if (!_playTimer.isRunning()) {
			try {
				if(!_controller.automaticStepBack()) {
					_playTimer.start();
					_buttonsController.backwardStarted();
				}
			} catch (RebotinolFlowException e) {
				throw new IllegalStateException(e);
			} catch (RebotinolFatalException e) {
				throw new IllegalStateException(e);
			}
		}
	}
	
	/**
	 * Set the speed of the automatic execution.
	 * @param ms The delay in ms between each automatic step.
	 */
	public void setSpeed(Speeds speed) {
		_playTimer.setDelay(speed._ms);
	}
	
	/**
	 * @return true if the automatic execution of the program is currently running
	 */
	public boolean isRunning() {
		return _playTimer.isRunning();
	}
}
