package edu.upb.lp.rebotinol.view.program.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.controller.RebotinolScheduler;
import edu.upb.lp.rebotinol.observers.RebotinolSchedulingObserver;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.util.RebotinolFlowException;

/**
 * 
 * @author Alexis Marechal
 *
 */
//TODO javadoc
public class ButtonsPanel extends JPanel implements RebotinolSchedulingObserver {
	/**
	 * Serial
	 */
	private static final long serialVersionUID = -3779632858557326186L;

	private RebotinolController _controller;
	private RebotinolScheduler _scheduler;
	private JButton _backButton = new JButton("Step back");
	private JButton _playButton = new JButton("Play");
	private JButton _stopButton = new JButton("Stop");
	private JButton _forwardButton = new JButton("Step forward");

	public ButtonsPanel(RebotinolController controller) {
		_controller = controller;
		_scheduler = controller.get_scheduler();
		_scheduler.registerObserver(this);

		_backButton.setLocation(0, 0);
		_backButton.setSize(100, 30);
		add(_backButton);
		ActionListener backListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					_controller.stepBack();
				} catch (RebotinolExecutionException e1) {
					throw new IllegalStateException(e1);
				} catch (RebotinolFlowException e1) {
					throw new IllegalStateException(e1);
				} catch (RebotinolFatalException e1) {
					throw new IllegalStateException(e1);
				}

			}
		};
		_backButton.addActionListener(backListener);

		_playButton.setLocation(100, 100);
		_playButton.setSize(100, 30);
		_playButton.setEnabled(true);
		add(_playButton);
		ActionListener playListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				_scheduler.play();
			}
		};
		_playButton.addActionListener(playListener);

		_stopButton.setLocation(300, 100);
		_stopButton.setSize(100, 30);
		_stopButton.setEnabled(false);
		add(_stopButton);
		ActionListener stopListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				_scheduler.stop();
			}
		};
		_stopButton.addActionListener(stopListener);

		_forwardButton.setLocation(500, 100);
		_forwardButton.setSize(100, 30);
		add(_forwardButton);
		ActionListener forwardListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					_controller.step();
				} catch (RebotinolExecutionException e1) {
					throw new IllegalStateException(e1);
				} catch (RebotinolFlowException e1) {
					throw new IllegalStateException(e1);
				}

			}
		};
		_forwardButton.addActionListener(forwardListener);
	}

	@Override
	public void startPlay() {
		_playButton.setEnabled(false);
		_stopButton.setEnabled(true);

	}

	@Override
	public void stopPlay() {
		_stopButton.setEnabled(false);
		_playButton.setEnabled(true);
	}
}
