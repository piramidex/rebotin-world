package edu.upb.lp.rebotinol.xtextToSwing;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
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

	public static String check(Resource r, String fileName, String extension, Types type) {
		if (r.getContents().size() > 0) {
			EObject source = r.getContents().get(0);
			if ((extension.equals("rebo") && source instanceof RebotinolProgram)
					|| (extension.equals("rconf") && source instanceof Configuration)) {
				Diagnostic diag = Diagnostician.INSTANCE.validate(source);
				if (r.getErrors().isEmpty() && diag.getSeverity() != Diagnostic.ERROR) {
					return "";
				} else {
					return "El archivo " + fileName
							+ " tiene errores, rev’salo!\n";
				}
			} else {
				return "El archivo no es v‡lido, tiene que tener la extensi—n ."
						+ (type == Types.REBOTINOL ? "rebo" : "rconf");
			}
		} else {
			return "El archivo " + fileName
					+ " tiene errores, rev’salo!\n";
		}
	}
}
