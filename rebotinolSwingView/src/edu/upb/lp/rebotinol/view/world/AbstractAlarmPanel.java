package edu.upb.lp.rebotinol.view.world;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

public class AbstractAlarmPanel extends JPanel {


	/**
	 * 
	 */
	private static final long serialVersionUID = -185476708556243361L;
	
	protected int _size;
	protected Color _colorOff;
	protected Color _colorOn;
	protected Color _borderColor;
	
	protected int _radAlarm;
	protected int _xAlarm;
	protected int _yAlarm;
	
	protected Ellipse2D.Double _circleAlarm;
		
	protected boolean _on;
	
	public AbstractAlarmPanel(int size, Color colorOff, Color colorOn, Color borderColor) {
		super();
		
		_size = size;
		_colorOff = colorOff;
		_colorOn = colorOn;
		_borderColor = borderColor;

		createShapes();
	
		_on = false;
		
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

	

	
	
}
