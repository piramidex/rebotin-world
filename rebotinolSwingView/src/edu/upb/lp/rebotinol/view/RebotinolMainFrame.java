package edu.upb.lp.rebotinol.view;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.view.program.ProgramPanel;
import edu.upb.lp.rebotinol.view.world.WorldPanel;

/**
 * This is the main class for the rebotinol view in Swing (2014).
 * 
 * @author Alexis Marechal
 */
//TODO fix all this
//TODO javadoc
public class RebotinolMainFrame extends JFrame {
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1609064165373925148L;
	
	private RebotinolController _controller;
	private JPanel _worldPanel;
	private JPanel _programPanel;
	
	/**
	 * Constructor
	 * @param controller The {@link RebotinolController} on which this view is based
	 */
	public RebotinolMainFrame(RebotinolController controller) {
		super("Ejecuci—n de rebotin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_controller = controller;
		setSize(800, 500);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS));
		buildPanels();
	}

	/**
	 * This method builds the interface (and its sub-panels) and makes it visible
	 */
	public void buildPanels() {
		_worldPanel = new WorldPanel(_controller);
		_worldPanel.setSize(500, 500);
		_programPanel = new ProgramPanel(_controller);
		_programPanel.setSize(300, 500);
		add(_worldPanel);
		add(Box.createVerticalGlue());
		add(_programPanel);
	}
}
