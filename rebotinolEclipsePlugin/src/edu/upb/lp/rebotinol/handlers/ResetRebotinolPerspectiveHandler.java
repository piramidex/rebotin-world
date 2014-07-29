package edu.upb.lp.rebotinol.handlers;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.PlatformUI;

public class ResetRebotinolPerspectiveHandler extends AbstractHandler {
	static Logger log = Logger.getLogger("RebotinDebug");
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		log.info("User clicked on the reset perspective button");
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().resetPerspective();
		return null;
	}

	
}
