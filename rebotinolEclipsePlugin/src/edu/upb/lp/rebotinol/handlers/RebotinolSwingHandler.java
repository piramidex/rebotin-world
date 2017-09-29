package edu.upb.lp.rebotinol.handlers;

import java.io.File;

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

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IEditorInput input = HandlerUtil.getActiveEditorInput(event);

		String programFile = "";
		String configurationFile = "";
		if (input instanceof IFileEditorInput) {
			FileEditorInput fileInput = (FileEditorInput) input;
			IFile file = fileInput.getFile();
			IEditorPart part = HandlerUtil.getActiveEditor(event);
			if (part.isDirty()) {
				part.doSave(null);
			}
			if (file.getFileExtension().equals("rebo")) {
				programFile = file.getLocationURI().getPath();
				if (programFile.charAt(2) == ':') {
					programFile = programFile.substring(1);
				}
				programFile = programFile.replace("/", File.separator);
			} else if (file.getFileExtension().equals("rconf")) {
				configurationFile = file.getLocationURI().getPath();
				if (configurationFile.charAt(2) == ':') {
					configurationFile = configurationFile.substring(1);
				}
				configurationFile = configurationFile.replace("/", File.separator);
			}
		}

		RebotinLaunchDialog dialog = new RebotinLaunchDialog(window.getShell(), programFile, configurationFile);
		dialog.open();

		// MessageDialog.openInformation(
		// window.getShell(),
		// "RebotinolEclipsePlugin",
		// "Hello, Eclipse world");
		return null;
	}
}
