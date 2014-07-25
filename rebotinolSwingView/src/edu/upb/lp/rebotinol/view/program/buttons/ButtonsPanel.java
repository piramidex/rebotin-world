package edu.upb.lp.rebotinol.view.program.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.controller.RebotinolScheduler;
import edu.upb.lp.rebotinol.observers.RebotinolProgramObserver;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.util.RebotinolFlowException;

/**
 * 
 * @author Alexis Marechal
 *
 */
//TODO javadoc
public class ButtonsPanel extends JPanel implements RebotinolProgramObserver {
	/**
	 * Serial
	 */
	private static final long serialVersionUID = -3779632858557326186L;

	private RebotinolController _controller;
	private RebotinolScheduler _scheduler;
	private JButton _backButton = new JButton("<-");
	private JButton _playButton = new JButton(">");
	private JButton _stopButton = new JButton("x");
	private JButton _forwardButton = new JButton("->");

	public ButtonsPanel(RebotinolController controller) {
		_controller = controller;
		_controller.registerObserver(this);
		_scheduler = controller.getScheduler();
		_scheduler.registerObserver(this);

		setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
		
//		_backButton.setLocation(45, 10);
		_backButton.setSize(30, 30);
		_backButton.setEnabled(false);
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

//		_playButton.setLocation(105, 10);
		_playButton.setSize(30, 30);
		_playButton.setEnabled(true);
		add(_playButton);
		ActionListener playListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				_scheduler.play();
			}
		};
		_playButton.addActionListener(playListener);

//		_stopButton.setLocation(165, 10);
		_stopButton.setSize(30, 30);
		_stopButton.setEnabled(false);
		add(_stopButton);
		ActionListener stopListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				_scheduler.stop();
			}
		};
		_stopButton.addActionListener(stopListener);

//		_forwardButton.setLocation(225, 10);
		_forwardButton.setSize(30, 30);
		_forwardButton.setEnabled(true);
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

	@Override
	public void activatePrevious() {
		_backButton.setEnabled(true);
	}

	@Override
	public void deActivatePrevious() {
		_backButton.setEnabled(false);
	}

	@Override
	public void activateNext() {
		_forwardButton.setEnabled(true);
		
	}

	@Override
	public void deActivateNext() {
		_forwardButton.setEnabled(false);
	}
}
