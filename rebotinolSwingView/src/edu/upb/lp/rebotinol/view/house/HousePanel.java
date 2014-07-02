package edu.upb.lp.rebotinol.view.house;

import javax.swing.JPanel;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;

//TODO javadoc
public class HousePanel extends JPanel {
	private static final long serialVersionUID = 7076675313840261743L;
	private MatrixPanel matrixPanel;
	private MemoryPanel memoryPanel;
	private MailPanel mailPanel;
	
	public HousePanel(RebotinolHouse house, Fraction[][] initialMatrix) {
		createContentPane(house, initialMatrix);
	}
	
	private void createContentPane(RebotinolHouse house, Fraction[][] initialMatrix) {
		matrixPanel = new MatrixPanel(house, initialMatrix);
		memoryPanel = new MemoryPanel(house);
		mailPanel = new MailPanel(house);
		add(matrixPanel);
		
		JPanel rebotinPanel = new JPanel();
		rebotinPanel.add(memoryPanel);
		rebotinPanel.add(mailPanel);
		
		add(rebotinPanel);
//        rebotinPanel.setLocation((75 + (45 * sizeH)), 75);
//        rebotinPanel.setBackground(Color.black);
//        rebotinPanel.setSize(50, 95);

	}
}
