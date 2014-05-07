package edu.upb.lp.rebotinol.dialogs;

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
	// TODO remove this
	private String def = "/Users/Alexis/Documents/dropbox/UPB/Otros/CIprog/2014/runtime-Rebotin_runtime/ReboTest/test/test.rebo";

	private Text programTextField;
	private Text configurationTextField;

	/**
	 * {@inheritDoc}
	 */
	public RebotinLaunchDialog(Shell parentShell) {
		super(parentShell);
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

		//TODO stop using the hardcoded file path
		Label labelProgram = new Label(container, SWT.NONE);
		labelProgram.setText("Programa (*.rebo): ");
		programTextField = new Text(container, SWT.BORDER);
		configureTextfield(container, programTextField, def,
				def, "rebo");
		Label labelConfiguration = new Label(container, SWT.NONE);
		labelConfiguration.setText("Configuraci—n (*.rconf): ");
		configurationTextField = new Text(container, SWT.BORDER);
		configureTextfield(container, configurationTextField,
				"", def, "rconf");
		return area;
	}

	private void configureTextfield(Composite container, Text textField,
			String textDefault, String fileDefault, String extension) {
		textField.setText(textDefault);

		GridData layoutData = new GridData(SWT.FILL, SWT.WRAP, true, false);
		textField.setLayoutData(layoutData);

		final Text finalField = textField;
		final String finalExtension = extension;
		final String finalFileDefault = fileDefault;
		final Button buttonFile = new Button(container, SWT.NONE);
		buttonFile.setText("...");

		buttonFile.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
			}

			public void widgetSelected(SelectionEvent e) {
				FileDialog dlg = new FileDialog(buttonFile.getShell(), SWT.OPEN);
				dlg.setFileName(finalFileDefault);
				dlg.setText("Open");
				dlg.setFilterExtensions(new String[] { finalExtension });
				String path = dlg.open();
				if (path == null)
					return;
				finalField.setText(path);
				checkOk();
			}
		});
	}

	private void checkOk() {
		Button ok = getButton(IDialogConstants.OK_ID);
		if (programTextField != null && configurationTextField != null
				&& programTextField.getText() != null
				&& configurationTextField.getText() != null
				&& programTextField.getText().endsWith(".rebo")
				&& configurationTextField.getText().endsWith(".rconf")) {
			//TODO check if the files actually exist
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
}