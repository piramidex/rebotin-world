package edu.upb.lp.rebotinol.view.house;

import javax.swing.JPanel;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.house.Mail;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.observers.RebotinolHouseObserver;

//TODO
class MailPanel extends JPanel implements RebotinolHouseObserver {
	private static final long serialVersionUID = -6353725173297518536L;

	public MailPanel(RebotinolHouse house) {
		house.registerObserver(this);
		//TODO
	}

	@Override
	public void memoryChanged(Fraction memory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void positionChanged(int previousH, int previousV, int h, int v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mailChanged(Mail mail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rebotinolErrorOcurred() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void matrixChanged(int h, int v, Fraction newValue) {
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

}
