package edu.upb.lp.rebotinol.examples;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.executions.DerExecution;
import edu.upb.lp.rebotinol.model.executions.EnviarExecution;
import edu.upb.lp.rebotinol.model.executions.MemoExecution;
import edu.upb.lp.rebotinol.model.executions.RebotinolInstructionExecution;
import edu.upb.lp.rebotinol.model.executions.RebotinolProgram;
import edu.upb.lp.rebotinol.model.executions.SumaExecution;
import edu.upb.lp.rebotinol.util.MatrixUtil;

/**
 * A very basic example with an 1 x 4 matrix.
 * The program sums all fours numbers and sends the result.
 * 
 * @author Alfredo Villalba
 * 
 */
public class RebotinolExampleFourNums extends RebotinolExample {

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void buildProgram() {
		List<RebotinolInstructionExecution> subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new MemoExecution());
		subExecutions.add(new DerExecution());
		subExecutions.add(new SumaExecution());
		subExecutions.add(new DerExecution());
		subExecutions.add(new SumaExecution());
		subExecutions.add(new DerExecution());
		subExecutions.add(new SumaExecution());
		subExecutions.add(new EnviarExecution());
		_program = new RebotinolProgram(subExecutions);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void buildInitialMatrix() {
		_initialMatrix = MatrixUtil.createMatrix(1, 4);
		_initialMatrix[0][0] = new Fraction(1, 2);
		_initialMatrix[0][1] = new Fraction(2);
		_initialMatrix[0][2] = new Fraction(3);
		_initialMatrix[0][3] = new Fraction(4);

	}



	@Override
	protected void buildExpectedMatrix() {
		_expectedMatrix = null;
	}	

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void buildExpectedResult() {
		_expectedResult = new Fraction(10);
	}
}
