package edu.upb.lp.rebotinol.controller;

import edu.upb.lp.rebotinol.exceptions.RebotinolExecutionException;
import edu.upb.lp.rebotinol.exceptions.RebotinolFlowException;
import edu.upb.lp.rebotinol.model.executions.SequentialInstructionExecution;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;

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
	public abstract Double[][] get_initialMatrix();

	/**
	 * @return The expected matrix after the execution of the program. This
	 *         attribute is optional
	 */
	public abstract Double[][] get_expectedMatrix();

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
	 * Execute fully the current instruction. If the current instruction is not
	 * a complex instruction (i.e., it does not have sub-Instructions), this
	 * method is equivalent to {@link #step()}
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
	public abstract void stepOver() throws RebotinolExecutionException,
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
	 * Step back fully the current instruction. This method undoes the last
	 * {@link #stepOver()}
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
	public abstract void stepBackOver() throws RebotinolExecutionException,
			RebotinolFlowException;

}