package edu.upb.lp.rebotinol.handlers;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;

import edu.upb.lp.rebotinol.dialogs.RebotinLaunchDialog;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class RebotinolSwingHandler extends AbstractHandler {
	static Logger log = Logger.getLogger("RebotinDebug");

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		log.info("User clicked on the execute button");
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		IEditorInput input = HandlerUtil.getActiveEditorInput(event);

		String programFile = "";
		String configurationFile = "";
		if (input instanceof IFileEditorInput) {
			FileEditorInput fileInput = (FileEditorInput) input;
			IFile file = fileInput.getFile();
			IEditorPart part = HandlerUtil.getActiveEditor(event);
			if (part.isDirty()) {
				log.debug("Saving automatically the current file");
				part.doSave(null);
			}
			if (file.getFileExtension().equals("rebo")) {
				programFile = file.getLocationURI().getPath();
				log.debug("The current file has the extension rebo, its name is " + programFile);
			} else if (file.getFileExtension().equals("rconf")) {
				configurationFile = file.getLocationURI().getPath();
				log.debug("The current file has the extension rconf, its name is " + configurationFile);
			}
		}

		RebotinLaunchDialog dialog = new RebotinLaunchDialog(window.getShell(),
				programFile, configurationFile);
		log.debug("Launching RebotinLaunchDialog with parameters:\n\t programFile: "
				+ programFile + "\n\t configurationFile: " + configurationFile);
		dialog.open();

		// MessageDialog.openInformation(
		// window.getShell(),
		// "RebotinolEclipsePlugin",
		// "Hello, Eclipse world");
		return null;
	}
}
