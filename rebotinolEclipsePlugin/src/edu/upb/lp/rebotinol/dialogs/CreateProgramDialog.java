package edu.upb.lp.rebotinol.dialogs;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * @author Lars Vogel
 * @see <a
 *      href="http://www.vogella.com/code/de.vogella.rcp.intro.dialogs.custom/src/com/vogella/plugin/dialogs/custom/MyTitleAreaDialog.html">Tutorial
 *      from vogella</a>
 * @see <a
 *      href="https://krishnanmohan.wordpress.com/2012/10/04/inline-validations-in-eclipse-rcp-field-assists/">Tutorial
 *      for decorations</a>
 * 
 * @author Alexis Marechal
 */
public class CreateProgramDialog extends TitleAreaDialog {
	private Text _projectTextField;
	private ControlDecoration _projectDecorator;
	private Text _programTextField;
	private ControlDecoration _programDecorator;
	private Image _image;

	/**
	 * Constructor.
	 * 
	 * @param parentShell
	 *            A parent sheel for this dialog
	 */
	public CreateProgramDialog(Shell parentShell) {
		super(parentShell);
		// Set image
		URL iconUrl = FileLocator.find(Platform
				.getBundle("rebotinolEclipsePlugin"), new Path(
				"icons/Rebotin.png"), null);
		try {
			_image = new Image(Display.getDefault(), iconUrl.openStream());
		} catch (IOException e) {
			// Do nothing, forget about the image
			_image = null;
		}
		// TODO maybe enable help in the future
		setHelpAvailable(false);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void create() {
		super.create();
		setTitle("Creaci—n de un programa en rebotinol");
		setMessage("En esta ventana debes escoger un nombre de proyecto que hayas creado "
				+ "previamente, y un nombre para el programa que quieres crear",
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
		container.setLayout(new GridLayout(2, false));

		configureProjectfield(container);
		configureProgramfield(container);
		return area;
	}

	private void configureProjectfield(Composite container) {
		Label labelProject = new Label(container, SWT.NONE);
		labelProject.setText("Proyecto: ");
		_projectTextField = new Text(container, SWT.BORDER);
		_projectTextField.setEditable(true);
		_projectTextField.setText("");

		GridData layoutData = new GridData(SWT.FILL, SWT.WRAP, true, false);
		_projectTextField.setLayoutData(layoutData);

		_projectTextField.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				checkOk();
			}
		});

		// Error decorator
		_projectDecorator = new ControlDecoration(_projectTextField, SWT.TOP
				| SWT.LEFT);
		FieldDecoration fieldDecoration = FieldDecorationRegistry.getDefault()
				.getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);
		Image img = fieldDecoration.getImage();
		_projectDecorator.setImage(img);
	}

	private void configureProgramfield(Composite container) {
		Label labelProgram = new Label(container, SWT.NONE);
		labelProgram.setText("Programa: ");
		_programTextField = new Text(container, SWT.BORDER);
		_programTextField.setEditable(true);
		_programTextField.setText("");

		GridData layoutData = new GridData(SWT.FILL, SWT.WRAP, true, false);
		_programTextField.setLayoutData(layoutData);

		_programTextField.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				checkOk();
			}
		});

		// Error decorator
		_programDecorator = new ControlDecoration(_programTextField, SWT.TOP
				| SWT.LEFT);
		FieldDecoration fieldDecoration = FieldDecorationRegistry.getDefault()
				.getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);
		Image img = fieldDecoration.getImage();
		_programDecorator.setImage(img);
		_programDecorator.hide();
	}

	private void checkOk() {
		Button ok = getButton(IDialogConstants.OK_ID);
		ok.setEnabled(checkProject() && checkProgram());
	}

	private boolean checkProject() {
		String projectName = _projectTextField.getText();
		if (projectName != null && !projectName.isEmpty()) {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IProject project = root.getProject(_projectTextField.getText());
			if (project.exists()) {
				try {
					// check xtext nature
					String[] natures = project.getDescription().getNatureIds();

					if (natures.length != 1
							|| !natures[0].equals("org.eclipse.xtext.ui.shared.xtextNature")) {
						_projectDecorator.setDescriptionText("Este proyecto no es un proyecto v‡lido. "
								+ "Debes utilizar un proyecto creado con el menu de rebotin");
						_projectDecorator.show();
						return false;
					} else {
						IProgressMonitor progressMonitor = new NullProgressMonitor();
						project.open(progressMonitor);
						_projectDecorator.hide();
						return true;
					}
				} catch (CoreException e) {
					throw new IllegalStateException(e);
				}
			} else {
				_projectDecorator
						.setDescriptionText("Este proyecto no existe, debes crearlo primero. "
								+ "Si est‡s seguro de haber introducido un nombre de "
								+ "proyecto existente, intenta hacer un 'refresh' de la lista "
								+ "de proyectos (con un clic derecho en la ventana de la izquierda)");
				_projectDecorator.show();
				return false;
			}
		} else {
			_projectDecorator
					.setDescriptionText("Debes indicar un nombre de proyecto");
			_projectDecorator.show();
			return false;
		}
	}

	private boolean checkProgram() {
		String program = _programTextField.getText();
		if (program != null && !program.isEmpty()) {
			if (program.contains(".")) {
				_programDecorator
						.setDescriptionText("El nombre de un programa no debe contener un punto '.'. "
								+ "No incluyas la extensi—n del archivo!");
				_programDecorator.show();
				return false;
			} else {
				IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
				IProject project = root.getProject(_projectTextField.getText());
				if (project.getFile(new Path(program+".rebo")).exists()) {
					_programDecorator
							.setDescriptionText("Este archivo ya existe!");
					_programDecorator.show();
					return false;
				} else {
					_programDecorator.hide();
					return true;
				}
			}
		} else {
			_programDecorator
					.setDescriptionText("Debes indicar un nombre de programa");
			_programDecorator.show();
			return false;
		}
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected void okPressed() {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(_projectTextField.getText());
		// create file
		URL url;
		try {
			url = new URL("platform:/plugin/rebotinolEclipsePlugin/res/p.rebo");
			InputStream inputStream = url.openConnection().getInputStream();
			IFile newFile = project.getFile(new Path(_programTextField
					.getText() + ".rebo"));
			newFile.create(inputStream, true, null);
			CreateProjectDialog.openFile(newFile);
		} catch (Exception e) {
			throw new IllegalStateException("Could not create program file", e);
		}
		close();
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

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);
		checkOk();
	}
}