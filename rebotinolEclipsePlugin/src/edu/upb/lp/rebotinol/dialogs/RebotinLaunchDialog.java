package edu.upb.lp.rebotinol.dialogs;

import java.io.File;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * @author Lars Vogel
 * @see <a
 *      href="http://www.vogella.com/code/de.vogella.rcp.intro.dialogs.custom/src/com/vogella/plugin/dialogs/custom/MyTitleAreaDialog.html">Tutorial
 *      from vogella</a>
 * @see <a
 *      href="http://www.programcreek.com/2010/11/add-a-file-chooserselector-for-eclipse-rcp-development/">Tutorial
 *      from programcreek</a>
 * 
 * @author Alexis Marechal
 */
public class RebotinLaunchDialog extends TitleAreaDialog {
	private Text _programTextField;
	private Text _configurationTextField;
	private static String _programPath = "";
	private static String _configurationPath = "";
	private String _currentFile = "";

	/**
	 * Constructor.
	 * @param parentShell A parent sheel for this dialog
	 * @param programPath The path of the rebotinol program
	 * @param configurationPath The path of the configuration file
	 */
	public RebotinLaunchDialog(Shell parentShell, String programPath,
			String configurationPath) {
		super(parentShell);
		if (programPath != null && !programPath.isEmpty()) {
			_currentFile = programPath;
			if (!_programPath.equals(programPath)) {
				_programPath = programPath;
				_configurationPath = "";
			}
		}
		if (configurationPath != null && !configurationPath.isEmpty()) {
			_currentFile = configurationPath;
			if (!_configurationPath.equals(configurationPath)) {
				_configurationPath = configurationPath;
				_programPath = "";
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void create() {
		super.create();
		setTitle("Inicializaci—n del mundo de rebotin");
		setMessage(
				"En esta ventana debe escoger el programa que desea que rebotin ejecute"
						+ " (con la estensi—n .rebo) y su configuraci—n inicial de rebotin (con "
						+ "la extensi—n .reboconf).",
				IMessageProvider.INFORMATION);
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
		if (_programTextField != null && _configurationTextField != null
				&& _programTextField.getText() != null
				&& _configurationTextField.getText() != null
				&& _programTextField.getText().endsWith(".rebo")
				&& _configurationTextField.getText().endsWith(".rconf")) {
			// TODO check if the files actually exist and contain a good
			// ressource
			ok.setEnabled(true);
		} else {
			ok.setEnabled(false);
		}
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);
		getButton(IDialogConstants.OK_ID).setEnabled(false);
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected void okPressed() {
		// saveInput();
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
}