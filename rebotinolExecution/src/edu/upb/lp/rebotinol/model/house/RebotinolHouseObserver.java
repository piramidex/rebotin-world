package edu.upb.lp.rebotinol.model.house;

import org.apache.commons.math3.fraction.Fraction;

/**
 * 
 * @author Alexis Marechal
 *
 */
public abstract class RebotinolHouseObserver {
//TODO javadoc
    public void initialise(RebotinolHouse house) {}
    
	public void memoryChanged(Fraction memory) {}

	public void positionChanged(int h, int v) {}

	public void mailChanged(Mail mail) {}

	public void messageNotificationChanged(boolean message) {}

    public void errorNotificationChanged(boolean _error) {}

}
