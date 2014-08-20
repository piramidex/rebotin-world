package edu.upb.lp.rebotinol.view.world;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.apache.commons.math3.fraction.Fraction;


public class NumberPanel extends JPanel {
	
	protected Fraction _number;
	protected boolean _numberIsInt;
	
	protected int _fontSize;
	protected int _ySize;
	protected int _xSize;
	
	protected Color _colorNumber;
	protected Color _colorLine;
	
	protected int _x1Numerator;
	protected int _y1Numerator;
	
	protected int _x1Denominator;
	protected int _y1Denominator;

	protected int _x1Integer;
	protected int _y1Integer;

	protected int _x1Line;
	protected int _y1Line;
	protected int _widthLine;
	protected int _heightLine;
	
	protected JLabel _lbNumerator;
	protected JLabel _lbDenominator;
	protected JLabel _lbInteger;
	
	
	public NumberPanel(Fraction f, int width, int height) {
		super();
		
		// set colors
		_colorNumber = Color.BLACK;
		_colorLine = Color.BLACK;
		
		// set size
		_xSize = width;
		_ySize = height;

		// compute number coordinates and fraction line
		_x1Line = 0;
		_y1Line = _ySize / 2;
		_widthLine = _xSize;
		_heightLine = (int) (_ySize * 0.05);
		
		_x1Numerator = 0;
		_y1Numerator = 0;
		
		_x1Denominator = 0;
		_y1Denominator = _y1Line + _heightLine + 1;
		
		_x1Integer = 0;
		_y1Integer = _ySize / 4;

		// set numbera and font size
		_lbNumerator = new JLabel("");
		_lbDenominator = new JLabel("");
		_lbInteger = new JLabel("");
		
		_fontSize = (int) ((_ySize / 2) * 0.75);
		_lbNumerator.setFont(new Font(_lbNumerator.getFont().getFontName(),Font.PLAIN, _fontSize));
		_lbDenominator.setFont(new Font(_lbNumerator.getFont().getFontName(),Font.PLAIN, _fontSize));
		_lbInteger.setFont(new Font(_lbNumerator.getFont().getFontName(),Font.PLAIN, _fontSize));
		
		set_number(f);
		
		// place graphical components
		setLayout(null);
		
		_lbNumerator.setLocation(_x1Numerator, _y1Numerator);
		_lbNumerator.setSize(_xSize, _ySize / 2);
		_lbNumerator.setHorizontalAlignment(0);
		
		_lbDenominator.setLocation(_x1Denominator, _y1Denominator);
		_lbDenominator.setSize(_xSize, _ySize / 2);
		_lbDenominator.setHorizontalAlignment(0);
		

		_lbInteger.setLocation(_x1Integer, _y1Integer);
		_lbInteger.setSize(_xSize, _ySize / 2);
		_lbInteger.setHorizontalAlignment(0);

		add(_lbNumerator);
		add(_lbDenominator);
		add(_lbInteger);
	}
	
	
	public void set_number(Fraction f) {
		
		_number = f;
		if (_number != null)
			_numberIsInt = (_number.getDenominator() == 1);

		
		// fraction
		if ((_number != null) && (!_numberIsInt)) {

			_lbNumerator.setText(_number.getNumerator()+"");
			_lbDenominator.setText(_number.getDenominator()+"");
			_lbNumerator.setVisible(true);
			_lbDenominator.setVisible(true);
			_lbInteger.setVisible(false);
		}
		
		// integer
		else if ((_number != null) && (_numberIsInt)) {

			_lbNumerator.setText("");
			_lbDenominator.setText("");
			_lbInteger.setText(_number.getNumerator()+"");
			_lbNumerator.setVisible(false);
			_lbDenominator.setVisible(false);
			_lbInteger.setVisible(true);
		}
		
		// empty (_number == null)
		else {

			_lbNumerator.setText("");
			_lbDenominator.setText("");
			_lbInteger.setText("");
			_lbNumerator.setVisible(false);
			_lbDenominator.setVisible(false);
			_lbInteger.setVisible(false);
		}
		
	}

	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		if ((_number != null) && (!_numberIsInt)) {
			g.setColor(_colorLine);
			g.fillRect(_x1Line, _y1Line, _widthLine, _heightLine);
		}
		
	}

	
	

}
