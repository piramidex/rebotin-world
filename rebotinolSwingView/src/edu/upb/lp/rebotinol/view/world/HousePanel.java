package edu.upb.lp.rebotinol.view.world;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;

import javax.swing.JPanel;

//TODO javadoc
public class HousePanel extends JPanel {

	private static final long serialVersionUID = 7076675313840261743L;
	
	
	protected int _xSize;
	protected int _ySize;
	
	protected Color _color;
	protected Color _borderColor;
	
	protected Path2D.Double _pathHouse;
	
	
	public HousePanel(int ySize, Color color, Color borderColor) {
		super();
		_ySize = ySize;
		_color = color;
		_borderColor = borderColor;
		createShapes();
	}
	
	
	public void createShapes() {
		
		_xSize = (int) (_ySize / 1.10);
		
		int xDeltaHouse = (int) (_xSize / 1.14);
		int yDeltaHouse = _ySize;
		
		int dx = _xSize - xDeltaHouse;
		int dy = 0;
		
		
		int yDeltaRoof = (int) (yDeltaHouse / 7.50);
		int yDeltaWindow = (int) (yDeltaHouse / 4.64);
		int yDeltaRoom = yDeltaHouse - yDeltaRoof - yDeltaWindow;
		
		int xDeltaWindow = (int) (xDeltaHouse / 3.90);
		int xDeltaRoof = yDeltaWindow;
		int xDeltaColLeft = (xDeltaHouse - (2 * xDeltaRoof) - xDeltaWindow) / 2;
		int xDeltaColRight = xDeltaHouse - (2 * xDeltaRoof) - xDeltaWindow - xDeltaColLeft;
		
		//   11-------------------------------10
		//   |                                |
		//   |       13   14                  |
		//   12------01   18-----15   08------09   
		//           |    |      |    |
		//           |    |      |    |
		//   03------02   17-----16   07------06
		//   |                                |
		//   |                                |
		//   |                                |
		//   |                                |
		//   |                                |
		//   04-------------------------------05
		
		
		_pathHouse = new Path2D.Double();
		_pathHouse.moveTo((dx + xDeltaRoof), (dy + yDeltaRoof));								// 01
		_pathHouse.lineTo((dx + xDeltaRoof), (dy + yDeltaRoof + yDeltaWindow));					// 02
		_pathHouse.lineTo(dx, (dy + yDeltaRoof + yDeltaWindow));								// 03
		_pathHouse.lineTo(dx, (dy + yDeltaHouse));												// 04
		_pathHouse.lineTo((dx + xDeltaHouse), (dy + yDeltaHouse));								// 05
		_pathHouse.lineTo((dx + xDeltaHouse), (dy + yDeltaRoof + yDeltaWindow));				// 06
		_pathHouse.lineTo((dx + xDeltaHouse - xDeltaRoof), (dy + yDeltaRoof + yDeltaWindow)); 	// 07
		_pathHouse.lineTo((dx + xDeltaHouse - xDeltaRoof), (dy + yDeltaRoof));					// 08
		_pathHouse.lineTo((dx + xDeltaHouse), (dy + yDeltaRoof));								// 09
		_pathHouse.lineTo((dx + xDeltaHouse), dy);												// 10
		_pathHouse.lineTo(dx, dy);																// 11
		_pathHouse.lineTo(dx,  (dy + yDeltaRoof));												// 12
		_pathHouse.lineTo((dx + xDeltaRoof), (dy + yDeltaRoof));								// 13
		_pathHouse.moveTo((dx + xDeltaRoof + xDeltaColLeft), (dy + yDeltaRoof));				// 14
		_pathHouse.lineTo((dx + xDeltaRoof + xDeltaColLeft + xDeltaWindow), (dy + yDeltaRoof));	// 15
		_pathHouse.lineTo((dx + xDeltaRoof + xDeltaColLeft + xDeltaWindow), (dy + yDeltaRoof + yDeltaWindow));	// 16
		_pathHouse.lineTo((dx + xDeltaRoof + xDeltaColLeft), (dy + yDeltaRoof + yDeltaWindow));	// 17
		_pathHouse.lineTo((dx + xDeltaRoof + xDeltaColLeft), (dy + yDeltaRoof));				// 18
		_pathHouse.closePath();
		
		
		
	}
	
	
	public void setAlpha(int alpha) {
		_color = new Color(
				_color.getRed(),
				_color.getGreen(),
				_color.getBlue(),
				alpha);
		
		_borderColor = new Color(
				_borderColor.getRed(),
				_borderColor.getGreen(),
				_borderColor.getBlue(),
				alpha);
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		g2.setStroke(new BasicStroke(3));
		
		
		// house
	
		g2.setColor(_color);
		g2.fill(_pathHouse);
		
		g2.setColor(_borderColor);
		g2.draw(_pathHouse);
		
	}
		
	
	

}
