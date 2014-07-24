package edu.upb.lp.rebotinol.view.house;

import javax.swing.JPanel;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;

//TODO javadoc
public class HousePanel extends JPanel {
	private static final long serialVersionUID = 7076675313840261743L;
	private MatrixPanel _matrixPanel;
	private MemoryPanel _memoryPanel;
	
	public HousePanel(RebotinolHouse house, Fraction[][] initialMatrix) {
		createContentPane(house, initialMatrix);
	}
	
	private void createContentPane(RebotinolHouse house, Fraction[][] initialMatrix) {
		_matrixPanel = new MatrixPanel(house, initialMatrix);
		_memoryPanel = new MemoryPanel(house);
		add(_matrixPanel);
		//add(_memoryPanel);
//        rebotinPanel.setLocation((75 + (45 * sizeH)), 75);
//        rebotinPanel.setBackground(Color.black);
//        rebotinPanel.setSize(50, 95);

	}
}
