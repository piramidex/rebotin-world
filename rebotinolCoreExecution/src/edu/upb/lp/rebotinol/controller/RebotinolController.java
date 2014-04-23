package edu.upb.lp.rebotinol.controller;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.executions.RebotinolInstructionExecution;
import edu.upb.lp.rebotinol.model.executions.SequentialInstructionExecution;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;
import edu.upb.lp.rebotinol.util.RebotinolFlowException;

/**
 * A rebotinol controller follows the MVC pattern for the rebotinol world. It
 * contains the main classes in this world (a rebotinol house, a program, an
 * initial matrix and optionnally an expected matrix)
 * 
 * @author Alexis Marechal
 * 
 */
public interface RebotinolController {

	/**
	 * @return the rebotinol house
	 */
	public abstract RebotinolHouse get_house();

	/**
	 * @return The initial matrix. This attribute does not change while the
	 *         program is executed
	 */
	public abstract Fraction[][] get_initialMatrix();

	/**
	 * @return The expected matrix after the execution of the program. This
	 *         attribute is optional
	 */
	public abstract Fraction[][] get_expectedMatrix();

	/**
	 * @return The program that was defined by the rebotinol programmer
	 */
	public abstract SequentialInstructionExecution get_program();

	/**
	 * Execute a single step in this program
	 * 
	 * @throws RebotinolExecutionException
	 *             If the program was incorrect (i.e., it asked to memorize a
	 *             number from an empty cell). This exception is to be expected
	 *             often, as it indicates an error made by the rebotinol
	 *             programmer.
	 * @throws RebotinolFlowException
	 *             If the program tried to execute some illegal instruction,
	 *             like an instruction that was already finished. This exception
	 *             indicates a severe bug in the execution platform.
	 */
	public abstract void step() throws RebotinolExecutionException,
			RebotinolFlowException;

	/**
	 * Go a single step back. This method undoes the last {@link #step()}
	 * 
	 * @throws RebotinolExecutionException
	 *             If the program was incorrect (i.e., it asked to memorize a
	 *             number from an empty cell). This exception is to be expected
	 *             often, as it indicates an error made by the rebotinol
	 *             programmer.
	 * @throws RebotinolFlowException
	 *             If the program tried to execute some illegal instruction,
	 *             like an instruction that was already finished. This exception
	 *             indicates a severe bug in the execution platform.
	 */
	public abstract void stepBack() throws RebotinolExecutionException,
			RebotinolFlowException;

	/**
	 * Set or remove a breakpoint from a given execution.
	 * 
	 * @param execution
	 *            The execution on which we are trying to set or remove a
	 *            breakpoint.
	 * @param breakpoint
	 *            true if we want to set a breakpoint on the execution, false if
	 *            we want to remove it
	 */
	public void setBreakpoint(RebotinolInstructionExecution execution,
			boolean breakpoint);
}