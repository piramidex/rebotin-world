package edu.upb.lp.rebotinol.view.world;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.model.house.Mail;
import edu.upb.lp.rebotinol.observers.RebotinolHouseObserver;

public class ErrorAlarmPanel extends JPanel implements RebotinolHouseObserver {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8160776677800306900L;

	protected int _size;
	protected Color _colorOff;
	protected Color _colorOn;
	protected Color _borderColor;
	
	protected int _radAlarm;
	protected int _xAlarm;
	protected int _yAlarm;
	
	protected Ellipse2D.Double _circleAlarm;
		
	protected boolean _on;
	
	public ErrorAlarmPanel(int size, Color colorOff, Color colorOn, Color borderColor, RebotinolController controller) {
		super();
		
		_size = size;
		_colorOff = colorOff;
		_colorOn = colorOn;
		_borderColor = borderColor;

		createShapes();
	
		_on = false;
		
		controller.getHouse().registerObserver(this);
		
	}
	
	
	public void createShapes() {
		
		_radAlarm = _size / 2;

		_xAlarm = _radAlarm;
		_yAlarm = _xAlarm;
		
		_circleAlarm = new Ellipse2D.Double(
				(_xAlarm - _radAlarm), (_yAlarm - _radAlarm),
				(2 * _radAlarm), (2 * _radAlarm));
		
	}
	
	
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setStroke(new BasicStroke(3));
		
		if (_on) {
			g2.setColor(_colorOn);
		}
		else {
			g2.setColor(_colorOff);
		}
		g2.fill(_circleAlarm);

		g2.setColor(_borderColor);
		g2.draw(_circleAlarm);

	}

	
	//-----------------------------------------------
	// RebotinHouseObserver methods
	//-----------------------------------------------


	@Override
	public void memoryChanged(Fraction memory) {
		// TODO Auto-generated method stub

	}


	@Override
	public void mailChanged(Mail mail) {
		// TODO Auto-generated method stub
	
	}


	@Override
	public void matrixSent() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void matrixUnsent() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void rebotinolErrorOcurred() {
		_on = true;
		repaint();
	}


	@Override
	public void rebotinolErrorSolved() {
		_on = false;
		repaint();
	}


	@Override
	public void errorMessageChanged(String message) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
