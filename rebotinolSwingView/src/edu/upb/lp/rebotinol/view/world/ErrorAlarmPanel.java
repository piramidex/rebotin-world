package edu.upb.lp.rebotinol.view.world;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.model.house.Mail;
import edu.upb.lp.rebotinol.observers.RebotinolHouseObserver;

public class ErrorAlarmPanel extends AbstractAlarmPanel implements RebotinolHouseObserver {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5076701756476051240L;


	public ErrorAlarmPanel(int size, Color colorOff, Color colorOn, Color borderColor, RebotinolController controller) {
		super(size, colorOff, colorOn, borderColor);
		controller.getHouse().registerObserver(this);
		
	}
	
	//-----------------------------------------------
	// RebotinHouseObserver methods
	//-----------------------------------------------


	@Override
	public void memoryChanged(Fraction memory) {
		// TODO Auto-generated method stub

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
		_on = true;
		repaint();
	}


	@Override
	public void rebotinolErrorSolved() {
		_on = false;
		repaint();
	}


	@Override
	public void errorMessageChanged(String message) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
