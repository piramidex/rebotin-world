package edu.upb.lp.rebotinol.view.house;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.house.Mail;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.model.house.RebotinolHouseObserver;

/**
 * ...
 * @author Jorge Loza
 * @author Mauricio Loza
 *
 */
public class MatrixPanel extends JPanel implements RebotinolHouseObserver {
	private static final long serialVersionUID = 3579955482940404200L;
	private RebotinolHouse house;
	private int sizeH;
	private int sizeV;
	private JPanel[][] whitePanels;
	private JPanel[][] blackPanels;

	/**
	 * 
	 * @param house
	 * @param initialMatrix
	 */
	public MatrixPanel(RebotinolHouse house, Fraction[][] initialMatrix) {
		house.registerObserver(this);
		sizeH = house.getSizeH();
		sizeV = house.getSizeV();
		whitePanels = new JPanel[sizeV][sizeH];
		blackPanels = new JPanel[sizeV][sizeH];
		this.house = house;
		createContentPane();
	}
	
	private void createContentPane() {

		setLayout(null);
		setSize(800, 600);
		for (int j = 0; j < sizeV; j++) {
			for (int i = 0; i < sizeH; i++) {
				JPanel whitepanel = new JPanel();
				whitepanel.setLayout(null);
				//whitepanel.setLocation((75 + (45 * i)), (75 + (45 * j)));
				whitepanel.setLocation(5, 5);
				whitepanel.setBackground(Color.WHITE);
				whitepanel.setSize(40, 40);
				whitePanels[j][i] = whitepanel;
				
				String num = house.getMatrix()[j][i].toString();

				JLabel number = new JLabel(num);
				number.setLocation(0, 0);
				number.setSize(40, 40);
				number.setHorizontalAlignment(0);
				number.setVerticalAlignment(0);
				whitepanel.add(number);

				JPanel blackpanel = new JPanel();
				blackpanel.setLayout(null);
				blackpanel.setLocation((375 + (45 * i)), (275 + (45 * j)));
				if (j == 0 && i == 0) {
					blackpanel.setBackground(Color.RED);
				} else {
					blackpanel.setBackground(Color.black);
				}

				blackpanel.setSize(50, 50);
				add(blackpanel);
				blackPanels[j][i] = blackpanel;
				blackpanel.add(whitePanels[j][i]);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void memoryChanged(Fraction memory) {
		//do nothing
	}

	@Override
	public void positionChanged(int previousH, int previousV, int h, int v) {
		whitePanels[previousV][previousH].repaint();
		whitePanels[v][h].repaint();
		blackPanels[previousV][previousH].setBackground(Color.BLACK);
		blackPanels[previousV][previousH].repaint();
		blackPanels[v][h].setBackground(Color.RED);
		blackPanels[v][h].repaint();
		int deltaH = previousH - h;
		int deltaV = previousV - v;
		for(int j = 0; j < sizeV; j++){
			for(int i = 0; i < sizeH; i++){
				blackPanels[j][i].setLocation(375 + ((i+deltaH) * 45), 275 + ((j+deltaV) * 45));
				blackPanels[j][i].repaint();
			}
		}
	}

	@Override
	public void mailChanged(Mail mail) {
		//do nothing
	}

	@Override
	public void rebotinolErrorOcurred() {
		// do nothing
	}

	@Override
	public void matrixChanged(int h, int v, Fraction newValue) {
		// TODO change the matrix numbers!
	}
}
