package edu.upb.lp.rebotinol.view.program.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.observers.RebotinolButtonsObserver;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;
import edu.upb.lp.rebotinol.util.RebotinolFlowException;

/**
 * 
 * @author Alexis Marechal
 *
 */
//TODO javadoc
public class ButtonsPanel extends JPanel implements RebotinolButtonsObserver {
	/**
	 * Serial
	 */
	private static final long serialVersionUID = -3779632858557326186L;

	private RebotinolController _controller;
	private JButton _backButton = new JButton("<-");
	private JButton _playButton = new JButton(">");
	private JButton _pauseButton = new JButton("x");
	private JButton _forwardButton = new JButton("->");

	public ButtonsPanel(RebotinolController controller) {
		_controller = controller;
		_controller.getButtonsController().registerObserver(this);
		controller.getButtonsController().registerObserver(this);

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
				_controller.play();
			}
		};
		_playButton.addActionListener(playListener);

//		_stopButton.setLocation(165, 10);
		_pauseButton.setSize(30, 30);
		_pauseButton.setEnabled(false);
		add(_pauseButton);
		ActionListener stopListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				_controller.stop();
			}
		};
		_pauseButton.addActionListener(stopListener);

//		_forwardButton.setLocation(225, 10);
		_forwardButton.setSize(30, 30);
		_forwardButton.setEnabled(true);
		add(_forwardButton);
		ActionListener forwardListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					_controller.step();
				} catch (RebotinolFlowException e1) {
					throw new IllegalStateException(e1);
				}

			}
		};
		_forwardButton.addActionListener(forwardListener);
	}

	@Override
	public void activateNext(boolean active) {
		_forwardButton.setEnabled(active);
		
	}

	@Override
	public void activatePlay(boolean active) {
		_playButton.setEnabled(active);
	}

	@Override
	public void activatePlayBack(boolean active) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activatePrevious(boolean activate) {
		_backButton.setEnabled(activate);
		
	}

	@Override
	public void activatePause(boolean activate) {
		_pauseButton.setEnabled(activate);
	}
}
