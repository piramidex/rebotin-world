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
import edu.upb.lp.rebotinol.util.MatrixUtil;

/**
 * A very basic example, with an 5 x 5 matrix, with initially one number in the
 * first cell, which is copied to the left cell.
 * 
 * @author Alexis Marechal
 * 
 */
public class RebotinolSimpleExample extends RebotinolExample {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void buildProgram() {
		List<RebotinolInstructionExecution> subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new MemoExecution());
		subExecutions.add(new DerExecution());
		subExecutions.add(new EscriExecution());
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
		_expectedMatrix[0][1] = new Fraction(2,3);
	}	
}
