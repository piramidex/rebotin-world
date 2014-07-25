package edu.upb.lp.rebotinol.view.program;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.view.program.buttons.ButtonsPanel;
import edu.upb.lp.rebotinol.view.program.executions.ExecutionsPanel;

//TODO javadoc
//TODO all
public class ProgramPanel extends JPanel {
	/**
	 * Serial
	 */
	private static final long serialVersionUID = -3939498643794045996L;
	
	private JPanel _buttonsPanel;
	private JPanel _executionsPanel;
	public ProgramPanel(RebotinolController controller) {
		_executionsPanel = new ExecutionsPanel(controller);
		_executionsPanel.setSize(300,450);
		_buttonsPanel = new ButtonsPanel(controller);
		_buttonsPanel.setSize(300,50);
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		add(_executionsPanel);
		add(Box.createHorizontalGlue());
		add(_buttonsPanel);
	}
}
