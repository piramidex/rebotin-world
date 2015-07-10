package edu.upb.lp.rebotinol.view.world;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.observers.RebotinolMatrixObserver;

//TODO javadoc
public class WorldPanel extends JPanel implements RebotinolMatrixObserver {
	/**
	 * Serial
	 */
	private static final long serialVersionUID = -913194192857925696L;

	protected MatrixPanel _matrixPanel;
	protected HousePanel _housePanel;
	protected RebotinPanel _rebotinPanel;
	protected MailboxPanel _mailboxPanel;
	
	protected int _xMatrix;
	protected int _yMatrix;
	protected int _widthMatrix;
	protected int _heightMatrix;
	protected int _numRowsMatrix;
	protected int _numColsMatrix;
	
	protected int _xHouse;
	protected int _yHouse;
	protected int _widthHouse;
	protected int _heightHouse;
	
	
	
	
	public WorldPanel(RebotinolController controller) {
		super();
		
		controller.getHouse().registerObserver(this);
		
		setLayout(new BoxLayout(this,  BoxLayout.PAGE_AXIS));
		//setOpaque(true);
		
		JLayeredPane layers = new JLayeredPane();
		//layers.setLayout(new BoxLayout(layers,  BoxLayout.PAGE_AXIS));
		layers.setLayout(null);
		//layers.setPreferredSize(new Dimension(600, 600));

		// matrix
		_xMatrix = 185;
		_yMatrix = 160;
		_matrixPanel = new MatrixPanel(controller.getHouse(), controller.getInitialMatrix(), 170, 170);
		//_matrixPanel.setSize(500,500);
		_matrixPanel.setLocation(_xMatrix, _yMatrix);
		layers.add(_matrixPanel, 0, 0);
		
		// house
		_housePanel = new HousePanel(200, Color.YELLOW, Color.BLACK);
		_housePanel.setSize(205, 205);
		_housePanel.setLocation(100, 130);
		_housePanel.setOpaque(false);
		layers.add(_housePanel, 1, 0);
		
		// rebotin
		_rebotinPanel = new RebotinPanel(80, Color.WHITE, Color.BLACK, controller);
		_rebotinPanel.setSize(500, 500);
		_rebotinPanel.setLocation(160, 220);
		_rebotinPanel.setOpaque(false);
		layers.add(_rebotinPanel, 2, 0);
		
		// mailbox
		_mailboxPanel = new MailboxPanel(45, 35, Color.WHITE, Color.BLACK, controller);
		_mailboxPanel.setSize(45, 35);
		_mailboxPanel.setLocation(100, 220);
		_mailboxPanel.setOpaque(false);
		layers.add(_mailboxPanel, 3, 0);
		
	
		//setLayout(null);
		add(layers);
	}



	
	//--------------------------------------------------
	// RebotinolMatrixObserver methods
	//--------------------------------------------------

	@Override
	public void positionChanged(int previousH, int previousV, int h, int v) {
		_xMatrix -= (h - previousH) * _matrixPanel.getSizeCell();
		_yMatrix -= (v - previousV) * _matrixPanel.getSizeCell();
		_matrixPanel.setLocation(_xMatrix, _yMatrix);
		
	}




	@Override
	public void matrixChanged(int h, int v, Fraction newValue) {
		// TODO Auto-generated method stub
		
	}
	

}
