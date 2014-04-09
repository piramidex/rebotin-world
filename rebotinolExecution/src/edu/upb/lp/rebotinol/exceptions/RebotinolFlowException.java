package edu.upb.lp.rebotinol.exceptions;

/**
 * This exception is thrown if there was an error during the execution in the
 * execution flow of the instructions, like trying to perform a step on a
 * finished instruction or trying to rollback an execution that was not
 * executed.
 * 
 * @author Alexis Marechal
 * 
 */
public class RebotinolFlowException extends Exception {

	public RebotinolFlowException(String string) {
		super(string);
	}

	private static final long serialVersionUID = -8813540406649310841L;

}
