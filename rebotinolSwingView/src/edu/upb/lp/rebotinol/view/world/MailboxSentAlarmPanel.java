package edu.upb.lp.rebotinol.view.world;

import java.awt.Color;
import org.apache.commons.math3.fraction.Fraction;
import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.model.house.Mail;
import edu.upb.lp.rebotinol.observers.RebotinolHouseObserver;

public class MailboxSentAlarmPanel extends AbstractAlarmPanel implements RebotinolHouseObserver {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8108992439456421872L;


	public MailboxSentAlarmPanel(int size, Color colorOff, Color colorOn, Color borderColor, RebotinolController controller) {
		super(size, colorOff, colorOn, borderColor);
		controller.getHouse().registerObserver(this);
		
	}
	
	//-----------------------------------------------
	// RebotinHouseObserver methods
	//-----------------------------------------------


	@Override
	public void memoryChanged(Fraction memory) {

	}


	@Override
	public void mailChanged(Mail mail) {
		if (mail != null) {
			_on = true;
			repaint();
		}
		else {
			_on = false;
			repaint();
		}
	}


	@Override
	public void matrixSent() {
		_on = true;
		repaint();
	}


	@Override
	public void matrixUnsent() {
		_on = false;
		repaint();
	}


	@Override
	public void rebotinolErrorOcurred() {
	}


	@Override
	public void rebotinolErrorSolved() {
	}


	@Override
	public void errorMessageChanged(String message) {
	}
	
	
	
	
}
