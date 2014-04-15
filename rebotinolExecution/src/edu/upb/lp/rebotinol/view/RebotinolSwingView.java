package edu.upb.lp.rebotinol.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.model.executions.SequentialInstructionExecution;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.view.buttons.ButtonsPanelBuilder;
import edu.upb.lp.rebotinol.view.executions.ExecutionsPanelBuilder;
import edu.upb.lp.rebotinol.view.house.HousePanelBuilder;

/**
 * This is the main class for the rebotinol view in Swing (2014).
 * 
 * @author Alexis Marechal
 */
//TODO javadoc
public class RebotinolSwingView {
	RebotinolController _controller;
	private JFrame _mainFrame;
	private JPanel _buttonsPanel;
	private JPanel _housePanel;
	private JPanel _executionsPanel;
	
	public RebotinolSwingView(RebotinolController controller) {
		_controller = controller;
	}

	public void buildAndShow() {
		SequentialInstructionExecution program = _controller.get_program();
		RebotinolHouse house = _controller.get_house();
		Fraction[][] initialMatrix = _controller.get_initialMatrix();
		_executionsPanel = ExecutionsPanelBuilder.buildPanel(program);
		_housePanel = HousePanelBuilder.buildPanel(house, initialMatrix);
		_buttonsPanel = ButtonsPanelBuilder.buildPanel();
		initialiseMainFrame();
	}

	/**
	 * Method to initialise the main frame
	 */
	private void initialiseMainFrame() {
		// TODO Alexis
		
	}
}
