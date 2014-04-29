package edu.upb.lp.rebotinol.util;

/**
 * This exception is thrown when an unexpected fatal error has occurred during
 * the creation or executino of rebotinol world.
 * 
 * @author Alexis Marechal
 * 
 */
public class RebotinolFatalException extends Exception {

	private static final long serialVersionUID = 2969343560506433851L;

	public RebotinolFatalException(String string) {
		super(string);
	}

}
