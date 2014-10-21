package edu.upb.lp.rebotinol.examples;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.executions.DerExecution;
import edu.upb.lp.rebotinol.model.executions.EnviarMatrizExecution;
import edu.upb.lp.rebotinol.model.executions.MemoExecution;
import edu.upb.lp.rebotinol.model.executions.RebotinolInstructionExecution;
import edu.upb.lp.rebotinol.model.executions.RebotinolProgram;
import edu.upb.lp.rebotinol.util.MatrixUtil;

/**
 * A very basic example with an 1 x 5 matrix.
 * The program memorizes each number and moves to the left each time.
 * 
 * @author Alfredo Villalba
 * 
 */
public class RebotinolAnotherSimpleExample extends RebotinolExample {

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void buildProgram() {
		List<RebotinolInstructionExecution> subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new MemoExecution());
		subExecutions.add(new DerExecution());
		subExecutions.add(new MemoExecution());
		subExecutions.add(new DerExecution());
		subExecutions.add(new MemoExecution());
		subExecutions.add(new DerExecution());
		subExecutions.add(new MemoExecution());
		subExecutions.add(new DerExecution());
		subExecutions.add(new MemoExecution());
		subExecutions.add(new EnviarMatrizExecution());
		_program = new RebotinolProgram(subExecutions);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void buildInitialMatrix() {
		_initialMatrix = MatrixUtil.createMatrix(1, 5);
		_initialMatrix[0][0] = new Fraction(2,3);
		_initialMatrix[0][1] = new Fraction(5, 1);
		_initialMatrix[0][2] = new Fraction(-1, 7);
		_initialMatrix[0][3] = new Fraction(230400, 7);
		_initialMatrix[0][4] = new Fraction(0, 1);

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void buildExpectedMatrix() {
		_expectedMatrix = MatrixUtil.createMatrix(1, 5);
		_expectedMatrix[0][0] = new Fraction(2,3);
		_expectedMatrix[0][1] = new Fraction(5, 1);
		_expectedMatrix[0][2] = new Fraction(-1, 7);
		_initialMatrix[0][3] = new Fraction(230400, 7);
		_expectedMatrix[0][4] = new Fraction(0, 1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void buildExpectedResult() {
		// do nothing
	}	
}
