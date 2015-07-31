package edu.upb.lp.rebotinol.view.world;

import java.awt.Color;
import java.awt.FlowLayout;

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
	protected ErrorAlarmPanel _errorAlarmPanel;
	protected MailboxSentAlarmPanel _mailboxSentAlarmPanel;
	
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
	
	
	protected double _zoom;
	protected double _zoomCoeff;
	protected int _sizeHouse;
	protected int _sizeRebotin;
	protected int _widthMailbox;
	protected int _heightMailbox;
	protected int _sizeMailboxSentAlarm;
	protected int _sizeErrorAlarm;
	protected int _sizeCell;
	
	
	
	
	
	public WorldPanel(RebotinolController controller) {
		this(100, controller);
	}
	
	
	
	public WorldPanel(double zoom, RebotinolController controller) {
		super();
		
		_zoom = zoom;
		_zoomCoeff = _zoom / 100;
		
		
		controller.getHouse().registerObserver(this);
		
		//setLayout(new BoxLayout(this,  BoxLayout.PAGE_AXIS));
		setLayout(null);
		setOpaque(true);
		
		JLayeredPane layers = new JLayeredPane();
		//layers.setLayout(new BoxLayout(layers,  BoxLayout.PAGE_AXIS));
		layers.setLayout(null);
		//layers.setPreferredSize(new Dimension(600, 600));

		// matrix
		_xMatrix = (int) (_zoomCoeff * 185);
		_yMatrix = (int) (_zoomCoeff * 160);
		_sizeCell = (int) (_zoomCoeff * 34);
		_matrixPanel = new MatrixPanel(controller.getHouse(), controller.getInitialMatrix(), _sizeCell);
		//_matrixPanel.setSize(500,500);
		_matrixPanel.setLocation(_xMatrix, _yMatrix);
		layers.add(_matrixPanel, 0, 0);
		
		// house
		_sizeHouse = (int) (_zoomCoeff * 200);
		_housePanel = new HousePanel(_sizeHouse, Color.YELLOW, Color.BLACK);
		_housePanel.setSize(_sizeHouse, _sizeHouse);
		_housePanel.setLocation((int) (_zoomCoeff * 100), (int) (_zoomCoeff * 130));
		_housePanel.setOpaque(false);
		layers.add(_housePanel, 1, 0);
		
		// rebotin
		_sizeRebotin = (int) (_zoomCoeff * 80);
		_rebotinPanel = new RebotinPanel(_sizeRebotin, Color.WHITE, Color.BLACK, controller);
		_rebotinPanel.setSize(_sizeRebotin, _sizeRebotin);
		_rebotinPanel.setLocation((int) (_zoomCoeff * 160), (int) (_zoomCoeff * 220));
		_rebotinPanel.setOpaque(false);
		layers.add(_rebotinPanel, 2, 0);
		
		// mailbox
		_widthMailbox = (int) (_zoomCoeff * 45);
		_heightMailbox = (int) (_zoomCoeff * 35);
		_mailboxPanel = new MailboxPanel(_widthMailbox, _heightMailbox, Color.WHITE, Color.BLACK, controller);
		_mailboxPanel.setSize(_widthMailbox, _heightMailbox);
		_mailboxPanel.setLocation((int) (_zoomCoeff * 100), (int) (_zoomCoeff * 220));
		_mailboxPanel.setOpaque(false);
		layers.add(_mailboxPanel, 3, 0);
		
		
		// error and mailbox alarms panels
		_sizeMailboxSentAlarm = (int) (_zoomCoeff * 18);
		_mailboxSentAlarmPanel = new MailboxSentAlarmPanel(_sizeMailboxSentAlarm, Color.WHITE, Color.GREEN, Color.BLACK, controller);
		_mailboxSentAlarmPanel.setSize(_sizeMailboxSentAlarm, _sizeMailboxSentAlarm);
		_mailboxSentAlarmPanel.setLocation((int) (_zoomCoeff * 105), (int) (_zoomCoeff * 270));
		_mailboxSentAlarmPanel.setOpaque(false);
		layers.add(_mailboxSentAlarmPanel, 4, 0);
		
		_sizeErrorAlarm = (int) (_zoomCoeff * 18);
		_errorAlarmPanel = new ErrorAlarmPanel(_sizeErrorAlarm, Color.WHITE, Color.RED, Color.BLACK, controller);
		_errorAlarmPanel.setSize(_sizeErrorAlarm, _sizeErrorAlarm);
		_errorAlarmPanel.setLocation((int) (_zoomCoeff * 105), (int) (_zoomCoeff * 295));
		_errorAlarmPanel.setOpaque(false);
		layers.add(_errorAlarmPanel, 5, 0);
		
	
		//setLayout(null);
		layers.setLocation(0, 0);
		layers.setSize((int) (_zoomCoeff * 500), (int) (_zoomCoeff * 500));
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
