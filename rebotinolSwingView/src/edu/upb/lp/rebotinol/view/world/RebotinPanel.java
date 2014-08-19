package edu.upb.lp.rebotinol.view.world;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;

import javax.swing.JButton;
import javax.swing.JPanel;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.model.house.Mail;
import edu.upb.lp.rebotinol.observers.RebotinolHouseObserver;

public class RebotinPanel extends JPanel implements RebotinolHouseObserver {

	
	protected int _delta;
	protected int _size;
	protected double _direction;
	protected Color _color;
	protected Color _borderColor;
	
	protected int _radBody;
	protected int _xBody;
	protected int _yBody;
	
	protected int _radEye;
	protected int _xEye;
	protected int _yEye;
	
	protected int _radRetine;
	protected int _xRetine;
	protected int _yRetine;
	
	protected int _x1Arm;
	protected int _y1Arm;
	protected int _x2Arm;
	protected int _y2Arm;

	protected int _x1Hand;
	protected int _y1Hand;
	protected int _x2Hand;
	protected int _y2Hand;
	
	protected int _x1Finger1;
	protected int _y1Finger1;
	protected int _x2Finger1;
	protected int _y2Finger1;
	
	protected int _x1Finger2;
	protected int _y1Finger2;
	protected int _x2Finger2;
	protected int _y2Finger2;	
	
	
	protected Ellipse2D.Double _circleBody;
	protected Ellipse2D.Double _circleEye;
	protected Ellipse2D.Double _circleRetine;
	protected Line2D.Double _lineArm;
	protected Line2D.Double _lineHand;
	protected Line2D.Double _lineFinger1;
	protected Line2D.Double _lineFinger2;

	protected NumberPanel _numPanel;
	
	public RebotinPanel(int size, Color color, Color borderColor, RebotinolController controller) {
		super();
		
		_size = size;
		_color = color;
		_borderColor = borderColor;

		createShapes();
		
		setLayout(null);
		_numPanel = new NumberPanel(null, (int) (1.5*_radBody), (int) (1.5*_radBody));
		_numPanel.setLocation(_xBody - (int) (0.75 * _radBody), _yBody - (int) (0.75 * _radBody));
		_numPanel.setSize((int) (1.5*_radBody), (int) (1.5*_radBody));
		_numPanel.setOpaque(false);
		add(_numPanel);
		
		controller.getHouse().registerObserver(this);
		
	}
	
	
	public void createShapes() {
		
		_delta = _size / 8;
		
		// body
		
		_radBody = 2 * _delta;

		_xBody = (2 * _delta) + _radBody;
		_yBody = _xBody;
		
		_circleBody = new Ellipse2D.Double(
				(_xBody - _radBody), (_yBody - _radBody),
				(2 * _radBody), (2 * _radBody));

		// eye
		
		_radEye = _delta / 2;
		
		_xEye = _xBody + (int) ((_radBody + _radEye) * (-0.50));  // cos 120 = -0.50
		_yEye = _yBody - (int) ((_radBody + _radEye) * (+0.87));  // sin 120 = +0.87
		
		_circleEye = new Ellipse2D.Double(
				(_xEye - _radEye), (_yEye - _radEye),
				(2 * _radEye), (2 * _radEye));

		// retina

		
		
		// arm
		
		_x1Arm = _xBody + (int) (_radBody * (+0.77));
		_y1Arm = _yBody - (int) (_radBody * (+0.64));
		
		_x2Arm = _x1Arm;
		_y2Arm = _y1Arm - (int) (1.5 * _delta);
		
		_lineArm = new Line2D.Double(_x1Arm, _y1Arm, _x2Arm, _y2Arm);
		
		//hand
		
	}
	
	
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		// draw body
		g2.setStroke(new BasicStroke(3));
		g2.setColor(_color);
		g2.fill(_circleBody);
		g2.setColor(_borderColor);
		g2.draw(_circleBody);

		// draw eye
		g2.setColor(_color);
		g2.fill(_circleEye);
		g2.setColor(_borderColor);
		g2.draw(_circleEye);		
		
		// draw arm
		g2.setColor(_borderColor);
		g2.draw(_lineArm);
		

		
		
	}

	
	//-----------------------------------------------
	// RebotinHouseObserver methods
	//-----------------------------------------------


	@Override
	public void memoryChanged(Fraction memory) {
		_numPanel.set_number(memory);
		
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
		// TODO Auto-generated method stub
		
	}


	@Override
	public void rebotinolErrorSolved() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
