package edu.upb.lp.rebotinol.examples;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.executions.DerExecution;
import edu.upb.lp.rebotinol.model.executions.EnviarMatrizExecution;
import edu.upb.lp.rebotinol.model.executions.EscriExecution;
import edu.upb.lp.rebotinol.model.executions.MemoExecution;
import edu.upb.lp.rebotinol.model.executions.RebotinolInstructionExecution;
import edu.upb.lp.rebotinol.model.executions.RebotinolProgram;
import edu.upb.lp.rebotinol.model.executions.RepExecution;
import edu.upb.lp.rebotinol.util.MatrixUtil;

/**
 * A basic rep example, with an 5 x 5 matrix, with initially one number in the
 * first cell, which is copied to the three left cells.
 * 
 * @author Alexis Marechal
 * 
 */
public class RebotinolSimpleRepExample extends RebotinolExample {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void buildProgram() {
		List<RebotinolInstructionExecution> subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new MemoExecution());
		List<RebotinolInstructionExecution> repExecutions = new ArrayList<RebotinolInstructionExecution>();
		repExecutions.add(new DerExecution());
		repExecutions.add(new EscriExecution());
		subExecutions.add(new RepExecution(repExecutions, 3));
		subExecutions.add(new EnviarMatrizExecution());
		_program = new RebotinolProgram(subExecutions);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void buildInitialMatrix() {
		_initialMatrix = MatrixUtil.createMatrix(5, 5);
		_initialMatrix[0][0] = new Fraction(2,3);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void buildExpectedMatrix() {
		_expectedMatrix = MatrixUtil.createMatrix(5, 5);
		_expectedMatrix[0][0] = new Fraction(2,3);
		_expectedMatrix[0][2] = new Fraction(2,3);
		_expectedMatrix[0][3] = new Fraction(2,3);
		_expectedMatrix[0][4] = new Fraction(2,3);
	}	
}
