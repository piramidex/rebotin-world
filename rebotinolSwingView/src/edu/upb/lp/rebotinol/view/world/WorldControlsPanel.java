package edu.upb.lp.rebotinol.view.world;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.controller.RebotinolController.ProblemStatus;
import edu.upb.lp.rebotinol.observers.RebotinolControllerObserver;

//TODO javadoc
public class WorldControlsPanel extends JPanel implements RebotinolControllerObserver {
	/**
	 * Serial
	 */
	private static final long serialVersionUID = -913194192857925696L;

	private JTextArea _messages;

	public WorldControlsPanel(RebotinolController controller) {
		super();

		setLayout(new FlowLayout());
		setMaximumSize(new Dimension(600,  100));
		setBorder(BorderFactory.createEtchedBorder());
		
		_messages = new JTextArea("");

		_messages.setPreferredSize(new Dimension(380, 60));
		_messages.setEditable(false);
		// messages.setBorder(BorderFactory.createEtchedBorder());
		_messages.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Mensajes"));
		_messages.setBackground(getBackground());
		
		controller.registerObserver(this);
		add(_messages);
	}

	// --------------------------------------------------
	// RebotinolControllerObserver methods
	// --------------------------------------------------

	@Override
	public void problemStatusChanged(ProblemStatus problemStatus) {
		switch (problemStatus) {
		case SOLVED:
			_messages.setText("Problema resuelto!");
			break;
		case UNSOLVED:
			_messages.setText("Solución equivocada al problema, revisa!");
			break;
		case UNKNOWN:
			_messages.setText("");
			break;
		}
		
	}

}
