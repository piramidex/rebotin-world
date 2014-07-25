package edu.upb.lp.rebotinol.view.world;

import javax.swing.JPanel;

import edu.upb.lp.rebotinol.controller.RebotinolController;

//TODO javadoc
public class WorldPanel extends JPanel {
	/**
	 * Serial
	 */
	private static final long serialVersionUID = -913194192857925696L;

	private MatrixPanel _matrixPanel;
	
	public WorldPanel(RebotinolController controller) {
		_matrixPanel = new MatrixPanel(controller.getHouse(), controller.getInitialMatrix());
		_matrixPanel.setSize(500,500);
		_matrixPanel.setLocation(0, 0);
		setLayout(null);
		add(_matrixPanel);
	}
}
