package edu.upb.lp.rebotinol.handlers;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import edu.upb.lp.rebotinol.dialogs.CreateProgramDialog;

public class CreateReboFileHandler extends AbstractHandler {
	static Logger log = Logger.getLogger("RebotinDebug");
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		log.info("User clicked on the create rebo file button");
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		CreateProgramDialog dialog = new CreateProgramDialog(window.getShell());
		dialog.open();
		return null;
	}

}
