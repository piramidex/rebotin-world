package edu.upb.lp.rebotinol.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import edu.upb.lp.rebotinol.dialogs.RebotinLaunchDialog;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class RebotinolSwingHandler extends AbstractHandler {
	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		RebotinLaunchDialog dialog = new RebotinLaunchDialog(window.getShell());
//		ResourceFileSelectionDialog dialog = new ResourceFileSelectionDialog("Title", "Message", new String[] { "properties", "java" });
		dialog.open();
		
//		MessageDialog.openInformation(
//				window.getShell(),
//				"RebotinolEclipsePlugin",
//				"Hello, Eclipse world");
		return null;
	}
}
