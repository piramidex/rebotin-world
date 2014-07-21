package edu.upb.lp.rebotinol.dialogs;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import edu.upb.lp.rebotinol.xtextToSwing.FileChecker;

/**
 * @author Lars Vogel
 * @see <a
 *      href="http://www.vogella.com/code/de.vogella.rcp.intro.dialogs.custom/src/com/vogella/plugin/dialogs/custom/MyTitleAreaDialog.html">Tutorial
 *      from vogella</a>
 * @see <a
 *      href="http://www.programcreek.com/2010/11/add-a-file-chooserselector-for-eclipse-rcp-development/">Tutorial
 *      from programcreek</a>
 * @see <a
 *      href="https://krishnanmohan.wordpress.com/2012/10/04/inline-validations-in-eclipse-rcp-field-assists/">Tutorial
 *      for decorations</a>
 * 
 * @author Alexis Marechal
 */
public class RebotinLaunchDialog extends TitleAreaDialog {
	private Text _programTextField;
	private ControlDecoration _programDecorator;
	private Text _configurationTextField;
	private ControlDecoration _configurationDecorator;
	private static String _programPath = "";
	private static String _configurationPath = "";
	private String _currentFile = "";
	private Image _image;

	/**
	 * Constructor.
	 * 
	 * @param parentShell
	 *            A parent sheel for this dialog
	 * @param programPath
	 *            The path of the rebotinol program
	 * @param configurationPath
	 *            The path of the configuration file
	 */
	public RebotinLaunchDialog(Shell parentShell, String programPath,
			String configurationPath) {
		super(parentShell);
		//Set program path
		if (programPath != null && !programPath.isEmpty()) {
			_currentFile = programPath;
			if (!_programPath.equals(programPath)) {
				_programPath = programPath;
				_configurationPath = "";
			}
		}
		//Set configuration path
		if (configurationPath != null && !configurationPath.isEmpty()) {
			_currentFile = configurationPath;
			if (!_configurationPath.equals(configurationPath)) {
				_configurationPath = configurationPath;
				_programPath = "";
			}
		}
		//Set image
		URL iconUrl = FileLocator.find(Platform.getBundle("rebotinolEclipsePlugin"),
				new Path("icons/Rebotin.png"), null);
		try {
			_image = new Image(Display.getDefault(), iconUrl.openStream());
		} catch (IOException e) {
			// Do nothing, forget about the image
			_image = null;
		}
		//TODO maybe enable help in the future
		setHelpAvailable(false);
	}
	

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void create() { 
		super.create();
		setTitle("Inicializaci—n del mundo de rebotin");
		setMessage(
				"En esta ventana debes escoger el programa que deseas que rebotin ejecute"
						+ " (con la estensi—n .rebo) y una configuraci—n inicial (con "
						+ "la extensi—n .rconf).",
				IMessageProvider.INFORMATION);
		if (_image != null) {
			setTitleImage(_image);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		container.setLayout(new GridLayout(3, false));

		configureProgramfield(container);
		configureConfigurationfield(container);
		return area;
	}

	private void configureProgramfield(Composite container) {
		Label labelProgram = new Label(container, SWT.NONE);
		labelProgram.setText("Programa (*.rebo): ");
		_programTextField = new Text(container, SWT.BORDER);
		_programTextField.setEditable(false);
		_programTextField.setText(extractFileName(_programPath));

		GridData layoutData = new GridData(SWT.FILL, SWT.WRAP, true, false);
		_programTextField.setLayoutData(layoutData);

		// Error decorator
		_programDecorator = new ControlDecoration(_programTextField, SWT.TOP
				| SWT.LEFT);
		FieldDecoration fieldDecoration = FieldDecorationRegistry.getDefault()
				.getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);
		Image img = fieldDecoration.getImage();
		_programDecorator.setImage(img);
		_programDecorator.hide();

		final Button buttonFile = new Button(container, SWT.NONE);
		buttonFile.setText("...");
		buttonFile.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
			}

			public void widgetSelected(SelectionEvent e) {
				FileDialog dlg = new FileDialog(buttonFile.getShell(), SWT.OPEN);
				if (_programPath == null || _programPath.isEmpty()) {
					dlg.setFileName(_currentFile);
				} else {
					dlg.setFileName(_programPath);
				}
				dlg.setText("Open");
				dlg.setFilterExtensions(new String[] { "rebo" });
				String path = dlg.open();
				if (path == null)
					return;
				_programTextField.setText(extractFileName(path));
				_programPath = path;
				checkOk();
			}
		});
	}

	private void configureConfigurationfield(Composite container) {
		Label labelConfiguration = new Label(container, SWT.NONE);
		labelConfiguration.setText("Configuraci—n (*.rconf): ");
		_configurationTextField = new Text(container, SWT.BORDER);
		_configurationTextField.setEditable(false);
		_configurationTextField.setText(extractFileName(_configurationPath));

		GridData layoutData = new GridData(SWT.FILL, SWT.WRAP, true, false);
		_configurationTextField.setLayoutData(layoutData);

		// Error decorator
		_configurationDecorator = new ControlDecoration(
				_configurationTextField, SWT.TOP | SWT.LEFT);
		FieldDecoration fieldDecoration = FieldDecorationRegistry.getDefault()
				.getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);
		Image img = fieldDecoration.getImage();
		_configurationDecorator.setImage(img);
		_configurationDecorator.hide();

		final Button buttonFile = new Button(container, SWT.NONE);
		buttonFile.setText("...");
		buttonFile.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
			}

			public void widgetSelected(SelectionEvent e) {
				FileDialog dlg = new FileDialog(buttonFile.getShell(), SWT.OPEN);
				if (_configurationPath == null || _configurationPath.isEmpty()) {
					dlg.setFileName(_currentFile);
				} else {
					dlg.setFileName(_configurationPath);
				}
				dlg.setText("Open");
				dlg.setFilterExtensions(new String[] { "rconf" });
				String path = dlg.open();
				if (path == null)
					return;
				_configurationTextField.setText(extractFileName(path));
				_configurationPath = path;
				checkOk();
			}
		});
	}

	private void checkOk() {
		Button ok = getButton(IDialogConstants.OK_ID);
		ok.setEnabled(checkProgram() && checkConfiguration());
	}

	private boolean checkProgram() {
		if (_programPath == null || _programPath.isEmpty()) {
			_programDecorator.setDescriptionText("Este archivo es obligatorio");
			_programDecorator.show();
			return false;
		} else {
			Path path = new Path(_programPath);
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			String error = FileChecker.check(file, FileChecker.Types.REBOTINOL);
			if (!error.isEmpty()) {
				_programDecorator.setDescriptionText(error);
				_programDecorator.show();
				return false;
			} else {
				_programDecorator.hide();
				return true;
			}
		}
	}

	private boolean checkConfiguration() {
		if (_configurationPath == null || _configurationPath.isEmpty()) {
			_configurationDecorator.setDescriptionText("Este archivo es obligatorio");
			_configurationDecorator.show();
			return false;
		} else {
			Path path = new Path(_configurationPath);
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			String error = FileChecker.check(file, FileChecker.Types.CONFIGURATION);
			if (!error.isEmpty()) {
				_configurationDecorator.setDescriptionText(error);
				_configurationDecorator.show();
				return false;
			} else {
				_configurationDecorator.hide();
				return true;
			}
		}
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);
		checkOk();
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected void okPressed() {
		// TODO launch the SWING interface here
		super.okPressed();
	}

	private String extractFileName(String path) {
		if (path == "") {
			return path;
		}
		StringBuilder ans = new StringBuilder();
		StringBuilder builder = new StringBuilder(path);
		builder.reverse();
		int i = 0;
		char c = builder.charAt(i);
		do {
			ans.append(c);
			i++;
			if (i < path.length()) {
				c = builder.charAt(i);
			}
		} while (c != File.separatorChar && i < path.length());
		ans.reverse();
		return ans.toString();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean close() {
		if (_image != null) {
			_image.dispose();
			_image = null;
		}
		return super.close();
	}	
}