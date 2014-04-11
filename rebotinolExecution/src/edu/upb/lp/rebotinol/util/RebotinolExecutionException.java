package edu.upb.lp.rebotinol.util;

/**
 * This exception is thrown when Rebotinol encountered an error in its execution
 * (e.g., when he tried to divide a number by zero, or read a value from an
 * empty cell in the matrix).
 * 
 * @author Alexis Marechal
 * 
 */
public class RebotinolExecutionException extends Exception {

	private static final long serialVersionUID = -8813540406649310841L;
	
	public RebotinolExecutionException(String string) {
		super(string);
	}

	

}
