package edu.upb.lp.rebotinol.util;

import javax.swing.SwingUtilities;

import edu.upb.lp.rebotinol.controller.RebotinolController;
import edu.upb.lp.rebotinol.view.RebotinolMainFrame;

/**
 * Simple class to create frames in the EDT.
 * @author Alexis Marechal
 * 
 */
public class RebotinFrameManager {
	/**
	 * Create and show a {@link RebotinolMainFrame} based on a {@link RebotinolController}
	 * @param controller The controller on which the Frame should be based.
	 */
	public static void launchFrame(RebotinolController controller) {
		final RebotinolMainFrame newFrame = new RebotinolMainFrame(controller);
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				newFrame.setVisible(true);
			}
		});
	}
}
