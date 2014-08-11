package edu.upb.lp.rebotinol.util;

import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * Exceptions handler to catch ALL exceptions in all threads
 * 
 * @see http://www.javaspecialists.eu/archive/Issue196.html
 * @author Alexis Marechal
 * 
 */
public class RebotinolExceptionHandler implements
		Thread.UncaughtExceptionHandler {
	private Shell _shell;
	/**
	 * Constructor
	 * 
	 * @param shell
	 *            A shell that will be used to show the errors.
	 */
	public RebotinolExceptionHandler(Shell shell) {
		_shell = shell;
	}

	/**
	 * Constructor without specifying the shell.
	 */
	public RebotinolExceptionHandler() {
		_shell = null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void uncaughtException(final Thread t, final Throwable e) {
		closeActiveOrVisibleFrames();
		final Throwable e1 = extractException(e);
		if (SwingUtilities.isEventDispatchThread()) {
			showMessage(t, e1);
		} else {
			try {
				SwingUtilities.invokeAndWait(new Runnable() {
					public void run() {
						showMessage(t, e1);
					}
				});
			} catch (InterruptedException ie) {
				Thread.currentThread().interrupt();
			} catch (InvocationTargetException ite) {
				// not much more we can do here except log the exception
				ite.getCause().printStackTrace();
			}
		}
	}

	private Throwable extractException(Throwable e) {
		Throwable cause = e;
		while (cause != null && !(cause instanceof RebotinolFatalException)) {
			cause = cause.getCause();
		}
		return cause == null ? e : cause;
	}

	// private String generateStackTrace(Throwable e) {
	// StringWriter writer = new StringWriter();
	// PrintWriter pw = new PrintWriter(writer);
	// e.printStackTrace(pw);
	// pw.close();
	// return writer.toString();
	// }

	private void showMessage(Thread t, Throwable e) {
		String message = e.getMessage();
		// String stackTrace = generateStackTrace(e);
		String error = "Oh no! Encontraste un error en el mundo de rebotin!";
		error += "\nPor favor, env’anos un e-mail con el siguiente mensaje a ciprog@lp.upb.edu:\n";
		error += "\n\n Error message: " + message;
		// show an error dialog
		// JOptionPane.showMessageDialog(null,
		// error, "Exception Occurred in " + t,
		// JOptionPane.ERROR_MESSAGE);
		IStatus status = new Status(IStatus.ERROR,
				"rebotinolEclipsePlugin.application", 1, error, e.getCause());
		ErrorDialog.openError(_shell, "Error!", null, status);
	}

	// /**
	// * We look for an active frame and attach ourselves to that.
	// */
	private void closeActiveOrVisibleFrames() {
		Frame[] frames = JFrame.getFrames();
		for (Frame frame : frames) {
			if (frame.isActive() || frame.isVisible()) {
				frame.dispose();
			}
		}
	}

	public static void configure(Shell shell) {
		Thread.setDefaultUncaughtExceptionHandler(new RebotinolExceptionHandler(shell));
		System.setProperty("sun.awt.exception.handler",
				RebotinolExceptionHandler.class.getName());
	}
}