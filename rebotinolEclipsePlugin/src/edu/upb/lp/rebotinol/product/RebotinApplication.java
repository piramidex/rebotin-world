package edu.upb.lp.rebotinol.product;

import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

/**
 * This class controls all aspects of the application's execution
 */
public class RebotinApplication implements IApplication {
	static Logger log = Logger.getLogger("RebotinDebug");
	
	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.IApplicationContext)
	 */
	public Object start(IApplicationContext context) throws Exception {
		configureLog4J();
		log.debug("Starting the Rebotin World application");
		Display display = PlatformUI.createDisplay();
		try {
			int returnCode = PlatformUI.createAndRunWorkbench(display, new RebotinApplicationWorkbenchAdvisor());
			if (returnCode == PlatformUI.RETURN_RESTART)
				return IApplication.EXIT_RESTART;
			else
				return IApplication.EXIT_OK;
		} finally {
			display.dispose();
		}
		
	}

	private void configureLog4J() {
		Properties props = new Properties();
		InputStream is = getClass().getResourceAsStream("/log4j.properties");
		try {
		    props.load(is);
		} catch(Exception e) {
			//Do nothing
		}
		finally {
		    try {
		        is.close();
		    }
		    catch (Exception e) {
		        // ignore this exception
		    }
		}
		PropertyConfigurator.configure(props);
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	public void stop() {
		log.debug("Stopping the Rebotin World application");
		if (!PlatformUI.isWorkbenchRunning())
			return;
		final IWorkbench workbench = PlatformUI.getWorkbench();
		final Display display = workbench.getDisplay();
		display.syncExec(new Runnable() {
			public void run() {
				if (!display.isDisposed())
					workbench.close();
			}
		});
	}
}
