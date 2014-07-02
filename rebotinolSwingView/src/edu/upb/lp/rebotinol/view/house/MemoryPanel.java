package edu.upb.lp.rebotinol.view.house;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.house.Mail;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.model.house.RebotinolHouseObserver;

public class MemoryPanel extends JPanel implements RebotinolHouseObserver {
	private static final long serialVersionUID = 5581499529049955453L;
	JPanel whitePanel = new JPanel();
	private JLabel rebotinMemory = new JLabel();
	
	public MemoryPanel(RebotinolHouse house) {
		house.registerObserver(this);
		createContentPane(house.getMemory());
	}
	
	private void createContentPane(Fraction memory) {
        whitePanel.setLocation(5, 5);
        whitePanel.setSize(40,40);
        whitePanel.setBackground(Color.WHITE);
        if (memory == null) {
        	rebotinMemory.setText("");
        } else {
        	rebotinMemory.setText(memory.toString());
        }
        rebotinMemory.setLocation(0,0);
        rebotinMemory.setSize(40,40);
        whitePanel.add(rebotinMemory);
        
        this.add(whitePanel);
	}

	@Override
	public void memoryChanged(Fraction memory) {
		if (memory == null) {
			rebotinMemory.setText("");
		} else {
			rebotinMemory.setText(memory.toString());
		}
	}

	@Override
	public void positionChanged(int previousH, int previousV, int h, int v) {
		// do nothing
		
	}

	@Override
	public void mailChanged(Mail mail) {
		// do nothing
	}

	@Override
	public void rebotinolErrorOcurred() {
		// do nothing
	}
}
