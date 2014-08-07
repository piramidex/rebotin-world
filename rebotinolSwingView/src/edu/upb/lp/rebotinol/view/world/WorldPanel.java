package edu.upb.lp.rebotinol.view.world;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BoxLayout;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
	
import edu.upb.lp.rebotinol.controller.RebotinolController;

//TODO javadoc
public class WorldPanel extends JPanel {
	/**
	 * Serial
	 */
	private static final long serialVersionUID = -913194192857925696L;

	protected MatrixPanel _matrixPanel;
	protected HousePanel _housePanel;
	protected RebotinPanel _rebotinPanel;
	
	public WorldPanel(RebotinolController controller) {
		
		setLayout(new BoxLayout(this,  BoxLayout.PAGE_AXIS));
		//setOpaque(true);
		
		JLayeredPane layers = new JLayeredPane();
		//layers.setLayout(new BoxLayout(layers,  BoxLayout.PAGE_AXIS));
		layers.setLayout(null);
		//layers.setPreferredSize(new Dimension(600, 600));

		_matrixPanel = new MatrixPanel(controller.getHouse(), controller.getInitialMatrix());
		_matrixPanel.setSize(500,500);
		_matrixPanel.setLocation(60, 0);
		layers.add(_matrixPanel, 0, 0);
		
		_housePanel = new HousePanel(200, Color.YELLOW, Color.BLACK);
		_housePanel.setSize(205, 205);
		_housePanel.setLocation(80, 30);
		_housePanel.setOpaque(false);
		layers.add(_housePanel, 1, 0);
		
		_rebotinPanel = new RebotinPanel(80, Color.WHITE, Color.BLACK);
		_rebotinPanel.setSize(500, 500);
		_rebotinPanel.setLocation(140, 120);
		_rebotinPanel.setOpaque(false);
		layers.add(_rebotinPanel, 2, 0);
		
	
		//setLayout(null);
		add(layers);
	}
	

}
