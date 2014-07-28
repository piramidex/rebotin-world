package edu.upb.lp.rebotinol.examples;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.executions.DerExecution;
import edu.upb.lp.rebotinol.model.executions.EnviarMatrizExecution;
import edu.upb.lp.rebotinol.model.executions.EscriExecution;
import edu.upb.lp.rebotinol.model.executions.IzqExecution;
import edu.upb.lp.rebotinol.model.executions.MemoExecution;
import edu.upb.lp.rebotinol.model.executions.RebotinolInstructionExecution;
import edu.upb.lp.rebotinol.model.executions.RebotinolProgram;
import edu.upb.lp.rebotinol.model.executions.SignoExecution;
import edu.upb.lp.rebotinol.model.executions.SumaExecution;
import edu.upb.lp.rebotinol.util.MatrixUtil;

/**
 * Example of problem number 2 in the 2012 edition of the CIPROG.
 * 
 * @author Alexis Marechal
 * 
 */
public class Problem2_2012_Example extends RebotinolExample {

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void buildProgram() {
		List<RebotinolInstructionExecution> subExecutions = new ArrayList<RebotinolInstructionExecution>();
		subExecutions.add(new MemoExecution());
		subExecutions.add(new DerExecution());
		subExecutions.add(new SumaExecution());
		subExecutions.add(new EscriExecution());
		subExecutions.add(new IzqExecution());
		subExecutions.add(new SignoExecution());
		subExecutions.add(new SumaExecution());
		subExecutions.add(new SignoExecution());
		subExecutions.add(new EscriExecution());
		subExecutions.add(new DerExecution());
		subExecutions.add(new SignoExecution());
		subExecutions.add(new SumaExecution());
		subExecutions.add(new EscriExecution());
		subExecutions.add(new EnviarMatrizExecution());
		_program = new RebotinolProgram(subExecutions);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void buildInitialMatrix() {
		_initialMatrix = MatrixUtil.createMatrix(1, 2);
		_initialMatrix[0][0] = new Fraction(2);
		_initialMatrix[0][1] = new Fraction(3);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void buildExpectedMatrix() {
		_initialMatrix = MatrixUtil.createMatrix(1, 2);
		_initialMatrix[0][0] = new Fraction(3);
		_initialMatrix[0][1] = new Fraction(2);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void buildExpectedResult() {
		// do nothing
	}	
}
