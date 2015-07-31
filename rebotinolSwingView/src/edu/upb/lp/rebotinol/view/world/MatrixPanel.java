package edu.upb.lp.rebotinol.view.world;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.text.DecimalFormat;

import javax.swing.JPanel;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.observers.RebotinolMatrixObserver;

/**
 * ...
 * @author Jorge Loza
 * @author Mauricio Loza
 * @author Alfredo Villalba
 *
 */
public class MatrixPanel extends JPanel implements RebotinolMatrixObserver {
	
	private static final long serialVersionUID = 3579955482940404200L;
	
	private RebotinolHouse house;
	
	
	private int _width;
	private int _height;
	private int _sizeCell;
	
	private int _xLeft;
	private int _xRight;
	private int _yTop;
	private int _yBottom;
	
	private int _numRows;
	private int _numCols;
	
	private NumberPanel[][] _numbers;
	
	private Color _colorCells;
	private Color _colorBorders;
	
	

	/**
	 * 
	 * @param house
	 * @param initialMatrix
	 */
	public MatrixPanel(RebotinolHouse house, Fraction[][] initialMatrix, int width, int height) {
		super();

		this.house = house;
		house.registerObserver(this);

		// size
		_numRows = house.getSizeV();
		_numCols = house.getSizeH();
		
		int _sizeCell1 = height / _numRows;
		int _sizeCell2 = width / _numCols;
		
		_sizeCell = (_sizeCell1 <= _sizeCell2 ? _sizeCell1 : _sizeCell2);
		
		_width = (_numCols * _sizeCell) + 1;
		_height = (_numRows * _sizeCell) + 1;
		
		setSize(_width, _height);
		
		// location
		_xLeft = 0;
		_xRight = _width - 1;
		
		_yTop = 0;
		_yBottom = _height - 1;

		// colors
		_colorCells = Color.WHITE;
		_colorBorders = Color.BLACK;
		setBackground(_colorCells);
		
		// numbers
		createNumbers(initialMatrix);
		
	}

	
	public MatrixPanel(RebotinolHouse house, Fraction[][] initialMatrix, int sizeCell) {
		this(house, initialMatrix, initialMatrix[0].length * sizeCell, initialMatrix.length * sizeCell);
		
	}

	
	
	private void createNumbers(Fraction[][] initalMatrix) {

		setLayout(null);
		_numbers = new NumberPanel[_numRows][_numCols];
		for (int i = 0; i < _numRows; i++) {
			for (int j = 0; j < _numCols; j++) {
				Fraction f = initalMatrix[i][j];
				_numbers[i][j] = new NumberPanel(f, (int)(_sizeCell*0.8), (int)(_sizeCell*0.8));
				_numbers[i][j].setLocation(j*_sizeCell+(int)(_sizeCell*0.1), i*_sizeCell+(int)(_sizeCell*0.1));
				if (f != null) _numbers[i][j].setToolTipText(f.toString());
				add(_numbers[i][j]);
			}
		}
	}
	
	public int getSizeCell() { return _sizeCell; }


	@Override
	public void positionChanged(int previousH, int previousV, int h, int v) {
//		//blackPanels[v][h].setBackground(Color.RED);
//		int deltaH = previousH - h;
//		int deltaV = previousV - v;
//		
//		for(int j = 0; j <= _numRows; j++){
//			for(int i = 0; i <= _numCols; i++){
//			}
//		}
	}
	
//	private JPanel numberDisplay(int v, int h, Fraction frac){
//		JPanel numbers = new JPanel();
//		numbers.setLayout(null);
//		numbers.setSize(40,40);
//		numbers.setLocation(0, 0);
//		numbers.setBackground(Color.WHITE);
//		if(frac == null){
//			JLabel numlabel = new JLabel("");
//			numlabel.setLocation(0, 0);
//			numlabel.setSize(40, 40);
//			numlabel.setHorizontalAlignment(0);
//			numlabel.setVerticalAlignment(0);
//		}else if(frac.getDenominator() == 1){
//			JLabel numlabel = new JLabel(numberFormating(frac.getNumerator())+"");
//			numlabel.setLocation(0, 0);
//			numlabel.setSize(40, 40);
//			numlabel.setHorizontalAlignment(0);
//			numlabel.setVerticalAlignment(0);
//			numbers.add(numlabel);
//			numbers.setToolTipText(frac.toString());
//			
//		}else{
//			int den =frac.getDenominator();
//			JLabel denominatorlabel = new JLabel(numberFormating(den)+"");
//			denominatorlabel.setLocation(0, 20);
//			denominatorlabel.setSize(40, 20);
//			denominatorlabel.setHorizontalAlignment(0);
//			denominatorlabel.setVerticalAlignment(0);
//			numbers.add(denominatorlabel);
//			
//			int num = frac.getNumerator();	
//			JLabel numeratorlabel = new JLabel(numberFormating(num)+"");
//			numeratorlabel.setLocation(0, 0);;
//			numeratorlabel.setSize(40, 20);
//			numeratorlabel.setHorizontalAlignment(0);
//			numeratorlabel.setVerticalAlignment(0);
//			numbers.add(numeratorlabel);
//			
//			JPanel division = new JPanel();
//			division.setSize(30, 2);
//			division.setLocation(5, 19);
//			division.setBackground(Color.BLACK);
//			numbers.add(division);
//			numbers.setToolTipText(frac.toString());
//		}
//		return numbers;
//	}
	
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
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		// draw matrix
		g2.setStroke(new BasicStroke(3));
		g2.setColor(_colorBorders);
		
		// draw horizontal lines
		int y = _yTop;
		for(int i = 0; i <= _numRows; i++) {
			g2.drawLine(_xLeft, y, _xRight, y);
			y += _sizeCell;
		}
		
		// draw vertical lines
		int x = _xLeft;
		for(int i = 0; i <= _numCols; i++) {
			g2.drawLine(x, _yTop, x, _yBottom);
			x += _sizeCell;
		}
		
	}

	@Override
	public void matrixChanged(int h, int v, Fraction newValue) {
		_numbers[v][h].setToolTipText(null);
		_numbers[v][h].set_number(newValue);
		if (newValue != null)
			_numbers[v][h].setToolTipText(newValue.toString());
	}

}
