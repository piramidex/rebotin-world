package edu.upb.lp.rebotinol.view.house;

import java.awt.Color;

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
				whitepanel.setLocation((75 + (45 * i)), (75 + (45 * j)));
				whitepanel.setBackground(Color.WHITE);
				whitepanel.setSize(40, 40);
				contentpanel.add(whitepanel);
				whitePanels[j][i] = whitepanel;
				
				String num = matrix[j][i].toString();

				JLabel number = new JLabel(num);
				number.setLocation(0, 0);
				number.setSize(40, 40);
				number.setHorizontalAlignment(0);
				number.setVerticalAlignment(0);
				whitepanel.add(number);

				JPanel blackpanel = new JPanel();
				blackpanel.setLocation((70 + (45 * i)), (70 + (45 * j)));
				if (j == house.getPositionV() && i == house.getPositionH()) {
					blackpanel.setBackground(Color.RED);
				} else {
					blackpanel.setBackground(Color.black);
				}

				blackpanel.setSize(50, 50);
				contentpanel.add(blackpanel);
				blackPanels[j][i] = blackpanel;
			}
		}

		return contentpanel;
	}

	@Override
	public void memoryChanged(Fraction memory) {}

	@Override
	public void positionChanged(int h, int v) {
		blackPanels[v][h].setBackground(Color.RED);
		
	}

	@Override
	public void mailChanged(Mail mail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rebotinolErrorOcurred() {
		// TODO Auto-generated method stub
		
	}
}
