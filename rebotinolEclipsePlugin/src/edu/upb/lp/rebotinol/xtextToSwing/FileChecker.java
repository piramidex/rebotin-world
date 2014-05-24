package edu.upb.lp.rebotinol.xtextToSwing;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;

import edu.upb.lp.reboConf.Configuration;
import edu.upb.lp.rebotinol.RebotinolProgram;

/**
 * This class allows to check if a file contains errors. If so, it returns a
 * string describing the first error met.
 * 
 * @author Alexis Marechal
 * 
 */
public class FileChecker {

	public enum Types {
		REBOTINOL, CONFIGURATION;
	}

	public static String check(IFile file, Types type) {
		URI uri = URI.createFileURI(file.getFullPath().toString());
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(uri, true);
		if (r.getContents().size() > 0) {
			EObject source = r.getContents().get(0);
			if ((file.getFileExtension().equals("rebo") && source instanceof RebotinolProgram)
					|| (file.getFileExtension().equals("rconf") && source instanceof Configuration)) {
				Diagnostic diag = Diagnostician.INSTANCE.validate(source);
				if (r.getErrors().isEmpty() && diag.getSeverity() != Diagnostic.ERROR) {
					return "";
				} else {
					return "El archivo " + file.getName()
							+ " tiene errores, rev’salo!\n";
				}
			} else {
				return "El archivo no es v‡lido, tiene que tener la extensi—n ."
						+ (type == Types.REBOTINOL ? "rebo" : "rconf");
			}
		} else {
			return "El archivo " + file.getName()
					+ " tiene errores, rev’salo!\n";
		}
	}
}
