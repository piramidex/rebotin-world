package edu.upb.lp.rebotinol.view;

import edu.upb.lp.rebotinol.model.house.Mail;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;

/**
 * 
 * @author Alexis Marechal
 *
 */
public interface RebotinolHouseObserver {

    public void initialise(RebotinolHouse house);
    
	public void memoryChanged(Double memory);

	public void positionChanged(int h, int v);

	public void mailChanged(Mail mail);

	public void messageNotificationChanged(boolean message);

    public void errorNotificationChanged(boolean _error);

}
