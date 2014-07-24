package edu.upb.lp.rebotinol.view.world;

import javax.swing.JPanel;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;

//TODO javadoc
public class HousePanel extends JPanel {
	private static final long serialVersionUID = 7076675313840261743L;
	private MatrixPanel _matrixPanel;
	
	public HousePanel(RebotinolHouse house, Fraction[][] initialMatrix) {
		createContentPane(house, initialMatrix);
	}
	
	private void createContentPane(RebotinolHouse house, Fraction[][] initialMatrix) {
		_matrixPanel = new MatrixPanel(house, initialMatrix);
		_matrixPanel.setSize(200,200);
		_matrixPanel.setLocation(0, 0);
		add(_matrixPanel);
	}
}
