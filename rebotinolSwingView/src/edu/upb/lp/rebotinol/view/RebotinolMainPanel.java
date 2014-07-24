package edu.upb.lp.rebotinol.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.model.executions.SequentialInstructionExecution;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.view.buttons.ButtonsPanel;
import edu.upb.lp.rebotinol.view.executions.ExecutionsPanel;
import edu.upb.lp.rebotinol.view.house.HousePanel;

/**
 * This is the main class for the rebotinol view in Swing (2014).
 * 
 * @author Alexis Marechal
 */
//TODO fix all this
//TODO javadoc
public class RebotinolMainPanel extends JPanel {
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1609064165373925148L;
	
	private RebotinolController _controller;
	private JPanel _buttonsPanel;
	private JPanel _housePanel;
	private JPanel _executionsPanel;
	
	/**
	 * Constructor
	 * @param controller The {@link RebotinolController} on which this view is based
	 */
	public RebotinolMainPanel(RebotinolController controller) {
		_controller = controller;
		buildSubPanels();
	}

	/**
	 * This method builds the interface (and its sub-panels) and makes it visible
	 */
	public void buildSubPanels() {
		_executionsPanel = new ExecutionsPanel(_controller);
		_housePanel = new HousePanel(_controller.get_house(), _controller.get_initialMatrix());
		_buttonsPanel = new ButtonsPanel(_controller);
		add(_housePanel);
		add(_executionsPanel);
		add(_buttonsPanel);
	}
}
