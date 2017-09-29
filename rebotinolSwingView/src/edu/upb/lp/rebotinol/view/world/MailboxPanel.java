package edu.upb.lp.rebotinol.view.world;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;

import javax.swing.JPanel;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.model.house.Mail;
import edu.upb.lp.rebotinol.observers.RebotinolHouseObserver;

public class MailboxPanel extends JPanel implements RebotinolHouseObserver {

	private static final long serialVersionUID = -6337246719917803811L;
	
	protected int _width;
	protected int _height;
	protected Color _color;
	protected Color _borderColor;


	protected Path2D.Double _pathFrame;
	protected Path2D.Double _pathBottomBorder;
	protected Path2D.Double _pathTopBorder;
	
	protected NumberPanel _numPanel;
	
	protected boolean _open;
	
	public MailboxPanel(int width, int height, Color color, Color borderColor, RebotinolController controller) {
		super();
		
		_width = width;
		_height = height;
		_color = color;
		_borderColor = borderColor;
		
		createShapes();
		
		setLayout(null);
		_numPanel = new NumberPanel(null, (int) (0.8 * _width), (int) (0.8 *_height));
		_numPanel.setLocation((int) (0.1 * _width), (int) (0.1 * _height));
		_numPanel.setSize((int) (0.8 * _width), (int) (0.8 *_height));
		_numPanel.setOpaque(false);
		add(_numPanel);

		_open = false;
		
		controller.getHouse().registerObserver(this);
		
		
	}

	
	
	
	

	public void createShapes() {

		// frame
		
		_pathFrame = new Path2D.Double();
		_pathFrame.moveTo(0, 0);
		_pathFrame.lineTo(_width - 1, 0);
		_pathFrame.lineTo(_width - 1, _height - 1);
		_pathFrame.lineTo(0,  _height - 1);
		_pathFrame.closePath();

		// bottom border
		
		_pathBottomBorder = new Path2D.Double();
		_pathBottomBorder.moveTo(0, _height * 0.8);
		_pathBottomBorder.lineTo(_width / 2, _height * 0.1);
		_pathBottomBorder.lineTo(_width - 1, _height * 0.8);
		
		// top border
		
		_pathTopBorder = new Path2D.Double();
		_pathTopBorder.moveTo(0, 0);
		_pathTopBorder.lineTo(_width / 2, _height * 0.4);
		_pathTopBorder.lineTo(_width - 1, 0);
		_pathTopBorder.closePath();
		
		
		

		
	}


	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		g2.setStroke(new BasicStroke(3));

		g2.setColor(_color);
		g2.fill(_pathFrame);
		g2.setColor(_borderColor);
		g2.draw(_pathFrame);
		
		if (!_open) {
		
			g2.setColor(_borderColor);
			g2.draw(_pathBottomBorder);
		
			g2.setColor(_color);
			g2.fill(_pathTopBorder);
			g2.setColor(_borderColor);
			g2.draw(_pathTopBorder);
		}
	}




	//-----------------------------------------
	// RebotinolHouseObserver methods
	//-----------------------------------------
	

	@Override
	public void memoryChanged(Fraction memory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mailChanged(Mail mail) {
		if (mail != null) {
			_numPanel.set_number(mail.getContent());
			_open = true;
		}
		else {
			_numPanel.set_number(null);
			_open = false;
		}
		repaint();
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

	@Override
	public void errorMessageChanged(String message) {
		// TODO Auto-generated method stub
		
	}

}
