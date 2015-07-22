package edu.upb.lp.rebotinol.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;

import com.sun.prism.impl.VertexBuffer;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.view.program.ProgramPanel;
import edu.upb.lp.rebotinol.view.world.WorldPanel;

/**
 * This is the main class for the rebotinol view in Swing (2014).
 * 
 * @author Alexis Marechal
 * @author Alfredo Villalba
 */
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
		super("Ejecuci�n de rebotin");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		_controller = controller;
		setSize(900, 600);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS));
		buildPanels();
	}

	/**
	 * This method builds the interface (and its sub-panels) and makes it visible
	 */
	public void buildPanels() {
		
		// world + world controls panels
		
		JPanel worldAndControlsPanel = new JPanel();
		worldAndControlsPanel.setLayout(new BoxLayout(worldAndControlsPanel, BoxLayout.Y_AXIS));
		//worldAndControlsPanel.setAlignmentX(CENTER_ALIGNMENT);
		worldAndControlsPanel.setBorder(BorderFactory.createEtchedBorder());
		
		_worldPanel = new WorldPanel(_controller);
		//_worldPanel.setMaximumSize(new Dimension(500, 500));
		//_worldPanel.setBackground(Color.BLACK);
		//_worldPanel.setAlignmentY(LEFT_ALIGNMENT);
		//_worldPanel.setBorder(BorderFactory.createEtchedBorder());
		_worldPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Mundo de Rebotin"));
		
		
		JPanel worldControlsPanel = new JPanel();
		//worldControlsPanel.setLayout(new BoxLayout(worldControlsPanel, BoxLayout.X_AXIS));
		worldControlsPanel.setLayout(new FlowLayout());
		worldControlsPanel.setMaximumSize(new Dimension(600,  100));
		worldControlsPanel.setBorder(BorderFactory.createEtchedBorder());

		JTextArea messages = new JTextArea("some text....");
		messages.setPreferredSize(new Dimension(380, 60));
		messages.setEditable(false);
		//messages.setBorder(BorderFactory.createEtchedBorder());
		messages.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Mensajes"));
		messages.setBackground(getBackground());
		worldControlsPanel.add(messages);
		
		
		/*
		//JTextField messages = new JTextField(4, 20);
		JLabel messages = new JLabel("some message...");
		//messages.setSize(300, 100);
		messages.setPreferredSize(new Dimension(300, 100));
		messages.setBackground(Color.WHITE);
		messages.setOpaque(true);
		worldControlsPanel.add(messages);
		*/
		
		JSlider slider = new JSlider(0, 100);
		slider.setSize(100, 50);
		slider.setMajorTickSpacing(10);
		slider.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Zoom in/out"));
		worldControlsPanel.add(slider);

		_worldPanel.setAlignmentX(CENTER_ALIGNMENT);
		worldAndControlsPanel.add(_worldPanel);
		worldAndControlsPanel.add(worldControlsPanel);

		
		// program + program controls panels
		
		_programPanel = new ProgramPanel(_controller);
		_programPanel.setMaximumSize(new Dimension(300, 600));
		_programPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Programa"));
				
		

		add(worldAndControlsPanel);
		add(Box.createVerticalGlue());
		add(_programPanel);
	}
}
