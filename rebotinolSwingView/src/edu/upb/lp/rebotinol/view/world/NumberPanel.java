package edu.upb.lp.rebotinol.view.world;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.apache.commons.math3.fraction.Fraction;


public class NumberPanel extends JPanel {
	
	protected Fraction _number;
	
	protected int _sizeText;
	protected int _ySize;
	protected int _xSize;
	
	protected Color _colorNumber;
	protected Color _colorLine;
	
	protected int _x1Numerator;
	protected int _y1Numerator;
	
	protected int _x1Denominator;
	protected int _y1Denominator;
	
	protected int _x1Line;
	protected int _y1Line;
	protected int _widthLine;
	protected int _heightLine;
	
	protected JLabel _lbNumerator;
	protected JLabel _lbDenominator;
	
	
	public NumberPanel(Fraction f, int width, int height) {
		super();
		
		_colorNumber = Color.BLACK;
		_colorLine = Color.BLACK;
		
		_xSize = width;
		_ySize = height;

		_x1Line = 0;
		_y1Line = _ySize / 2;
		_widthLine = _xSize;
		_heightLine = (int) (_ySize * 0.1);
		
		_x1Numerator = 0;
		_y1Numerator = 0;
		
		_x1Denominator = 0;
		_y1Denominator = _y1Line + _heightLine + 1;
		
		set_number(f);
		
		setLayout(null);
		_lbNumerator.setLocation(_x1Numerator, _y1Numerator);
		_lbDenominator.setLocation(_x1Denominator, _y1Denominator);
		_lbNumerator.setSize(_xSize, _ySize / 2);
		_lbDenominator.setSize(_xSize, _ySize / 2);
		_lbNumerator.setHorizontalAlignment(0);
		_lbDenominator.setHorizontalAlignment(0);
		add(_lbNumerator);
		add(_lbDenominator);
	}
	
	
	public void set_number(Fraction f) {
		_number = f;
		_lbNumerator = new JLabel(_number.getNumerator()+"");
		_lbDenominator = new JLabel(_number.getDenominator()+"");
	}

	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	
		g.setColor(_colorLine);
		g.fillRect(_x1Line, _y1Line, _widthLine, _heightLine);
		
	}

	
	

}
