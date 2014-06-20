package edu.upb.lp.rebotinol.view.house;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.house.Mail;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.model.house.RebotinolHouseObserver;

public class MatrixPanelBuilder extends RebotinolHouseObserver {
	private RebotinolHouse house;
	private Fraction[][] matrix;
	private int sizeH;
	private int sizeV;
	private JPanel[][] whitePanels;
	private JPanel[][] blackPanels;
	private JPanel mailPanel;
	private JLabel rebotinMemory;
	
	public MatrixPanelBuilder(RebotinolHouse house, Fraction[][] initialMatrix) {
		super(house);
		this.house = house; 
		sizeH = house.getSizeH();
		sizeV = house.getSizeV();
		whitePanels = new JPanel[sizeV][sizeH];
		blackPanels = new JPanel[sizeV][sizeH];
		matrix = initialMatrix;
	}
	
	public JPanel createContentPane() {

		JPanel contentpanel = new JPanel();
		contentpanel.setLayout(null);

		for (int j = 0; j < sizeV; j++) {
			for (int i = 0; i < sizeH; i++) {
				JPanel whitepanel = new JPanel();
				whitepanel.setLayout(null);
				//whitepanel.setLocation((75 + (45 * i)), (75 + (45 * j)));
				whitepanel.setLocation(5, 5);
				whitepanel.setBackground(Color.WHITE);
				whitepanel.setSize(40, 40);
				whitePanels[j][i] = whitepanel;
				
				String num = matrix[j][i].toString();

				JLabel number = new JLabel(num);
				number.setLocation(0, 0);
				number.setSize(40, 40);
				number.setHorizontalAlignment(0);
				number.setVerticalAlignment(0);
				whitepanel.add(number);

				JPanel blackpanel = new JPanel();
				blackpanel.setLayout(null);
				blackpanel.setLocation((70 + (45 * i)), (70 + (45 * j)));
				if (j == house.getPositionV() && i == house.getPositionH()) {
					blackpanel.setBackground(Color.RED);
				} else {
					blackpanel.setBackground(Color.black);
				}

				blackpanel.setSize(50, 50);
				contentpanel.add(blackpanel);
				blackPanels[j][i] = blackpanel;
				blackpanel.add(whitePanels[j][i]);
			}
		}
        JPanel rebotinPanel = new JPanel();
        rebotinPanel.setLocation((75 + (45 * sizeH)), 75);
        rebotinPanel.setBackground(Color.black);
        rebotinPanel.setSize(50, 95);
        contentpanel.add(rebotinPanel);
        
        JPanel memoryPanel = new JPanel();
        memoryPanel.setLocation(5, 5);
        memoryPanel.setSize(40,40);
        memoryPanel.setBackground(Color.WHITE);
        rebotinPanel.add(memoryPanel);
        
        rebotinMemory = new JLabel(house.getCurrentMatrixValue().toString());
        rebotinMemory.setLocation(0,0);
        rebotinMemory.setSize(40,40);
        memoryPanel.add(rebotinMemory);
        
        mailPanel = new JPanel();
        mailPanel.setLocation(5, 50);
        mailPanel.setBackground(Color.white);
        mailPanel.setSize(40, 40);
        rebotinPanel.add(mailPanel);
        
        JButton mailButton = new JButton("Mail");
        mailButton.setLocation(10,10);
        mailButton.setSize(20,20);
        mailPanel.add(mailButton);

		return contentpanel;
	}

	@Override
	public void memoryChanged(Fraction memory) {
		rebotinMemory.setText(memory.toString());
	}

	@Override
	public void positionChanged(int previousH, int previousV, int h, int v) {
		whitePanels[previousV][previousH].repaint();
		whitePanels[v][h].repaint();
		blackPanels[previousV][previousH].setBackground(Color.BLACK);
		blackPanels[previousV][previousH].repaint();
		blackPanels[v][h].setBackground(Color.RED);
		blackPanels[v][h].repaint();
	}

	@Override
	public void mailChanged(Mail mail) {
		mailPanel.setBackground(Color.green);
		
	}

	@Override
	public void rebotinolErrorOcurred() {
		// TODO Auto-generated method stub
		
	}
}
