package edu.upb.lp.rebotinol.view.world;

import java.awt.Color;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.observers.RebotinolMatrixObserver;

/**
 * ...
 * @author Jorge Loza
 * @author Mauricio Loza
 *
 */
public class MatrixPanel extends JPanel implements RebotinolMatrixObserver {
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
		//numbers = new JLabel[sizeV][sizeH];
		
		this.house = house;
		createContentPane();
	}
	
	private void createContentPane() {

		setLayout(null);
		for (int j = 0; j < sizeV; j++) {
			for (int i = 0; i < sizeH; i++) {
				JPanel whitepanel = new JPanel();
				whitepanel.setLayout(null);
				whitepanel.setLocation(5, 5);
				whitepanel.setBackground(Color.WHITE);
				whitepanel.setSize(40, 40);
				whitePanels[j][i] = whitepanel;
				whitePanels[j][i].add(numberDisplay(j, i,house.getMatrix()[j][i]));
				JPanel blackpanel = new JPanel();
				blackpanel.setLayout(null);
				blackpanel.setLocation((50 + (45 * i)), (50 + (45 * j)));
				/*if (j == 0 && i == 0) {
					blackpanel.setBackground(Color.RED);
				} else {
					blackpanel.setBackground(Color.black);
				}*/
				
				blackpanel.setBackground(Color.black);
				
				blackpanel.setSize(50, 50);
				add(blackpanel);
				blackPanels[j][i] = blackpanel;
				blackpanel.add(whitePanels[j][i]);
			}
		}
	}

	@Override
	public void positionChanged(int previousH, int previousV, int h, int v) {
		blackPanels[previousV][previousH].setBackground(Color.BLACK);
		blackPanels[previousV][previousH].repaint();
		//blackPanels[v][h].setBackground(Color.RED);
		blackPanels[v][h].repaint();
		int deltaH = previousH - h;
		int deltaV = previousV - v;
		for(int j = 0; j < sizeV; j++){
			for(int i = 0; i < sizeH; i++){
				blackPanels[j][i].setLocation(50 + ((i+deltaH) * 45), 50 + ((j+deltaV) * 45));
				blackPanels[j][i].repaint();
			}
		}
	}
	
	private JPanel numberDisplay(int v, int h, Fraction frac){
		JPanel numbers = new JPanel();
		numbers.setLayout(null);
		numbers.setSize(40,40);
		numbers.setLocation(0, 0);
		numbers.setBackground(Color.WHITE);
		if(frac == null){
			JLabel numlabel = new JLabel("");
			numlabel.setLocation(0, 0);
			numlabel.setSize(40, 40);
			numlabel.setHorizontalAlignment(0);
			numlabel.setVerticalAlignment(0);
			whitePanels[v][h].add(numlabel);
		}else if(frac.getDenominator() == 1){
			JLabel numlabel = new JLabel(numberFormating(frac.getNumerator())+"");
			numlabel.setLocation(0, 0);
			numlabel.setSize(40, 40);
			numlabel.setHorizontalAlignment(0);
			numlabel.setVerticalAlignment(0);
			numbers.add(numlabel);
			numbers.setToolTipText(frac.toString());
			
		}else{
			int den =frac.getDenominator();
			JLabel denominatorlabel = new JLabel(numberFormating(den)+"");
			denominatorlabel.setLocation(0, 20);
			denominatorlabel.setSize(40, 20);
			denominatorlabel.setHorizontalAlignment(0);
			denominatorlabel.setVerticalAlignment(0);
			numbers.add(denominatorlabel);
			
			int num = frac.getNumerator();	
			JLabel numeratorlabel = new JLabel(numberFormating(num)+"");
			numeratorlabel.setLocation(0, 0);;
			numeratorlabel.setSize(40, 20);
			numeratorlabel.setHorizontalAlignment(0);
			numeratorlabel.setVerticalAlignment(0);
			numbers.add(numeratorlabel);
			
			JPanel division = new JPanel();
			division.setSize(30, 2);
			division.setLocation(5, 19);
			division.setBackground(Color.BLACK);
			numbers.add(division);
			numbers.setToolTipText(frac.toString());
		}
		return numbers;
	}
	
	private String numberFormating(int num){
		double pref = Math.log10(num);
		String numString = "";
		DecimalFormat df = new DecimalFormat("0"); 
		if(pref < 3){
			numString = num+"";
		}else if((pref > 3)&&(pref < 6)){
			double formatNum = (double)num/1000;
			numString = df.format(formatNum)+" k";
		}else if((pref > 6)&&(pref < 9)){
			double formatNum = (double)num/1000000;
			numString = df.format(formatNum)+" M";
		}else if(pref > 9){
			double formatNum = (double)num/1000000000;
			numString = df.format(formatNum)+" G";
		}

		return numString;
	}

	@Override
	public void matrixChanged(int h, int v, Fraction newValue) {
		whitePanels[v][h].removeAll();
		whitePanels[v][h].add(numberDisplay(v,h,newValue));
		whitePanels[v][h].updateUI();
		blackPanels[v][h].updateUI();
	}
}
