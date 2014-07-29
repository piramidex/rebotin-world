package edu.upb.lp.rebotinol.xtextToSwing;

import org.apache.log4j.Logger;
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
	static Logger log = Logger.getLogger("RebotinDebug");
	
	public enum Types {
		REBOTINOL, CONFIGURATION;
	}

	public static String check(Resource r, String fileName, String extension, Types type) {
		log.debug("Checking file with name " + fileName);
		if (r.getContents().size() > 0) {
			EObject source = r.getContents().get(0);
			if ((extension.equals("rebo") && source instanceof RebotinolProgram)
					|| (extension.equals("rconf") && source instanceof Configuration)) {
				Diagnostic diag = Diagnostician.INSTANCE.validate(source);
				if (r.getErrors().isEmpty() && diag.getSeverity() != Diagnostic.ERROR) {
					log.debug("File has no errors");
					return "";
				} else {
					log.debug("File has errors");
					return "El archivo " + fileName
							+ " tiene errores, rev’salo!\n";
				}
			} else {
				log.debug("File has bad extension: " + extension);
				return "El archivo no es v‡lido, tiene que tener la extensi—n ."
						+ (type == Types.REBOTINOL ? "rebo" : "rconf");
			}
		} else {
			log.debug("File has no contents inside!");
			return "El archivo " + fileName
					+ " tiene errores, rev’salo!\n";
		}
	}
}
