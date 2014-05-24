package edu.upb.lp.rebotinol.examples;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.model.executions.DerExecution;
import edu.upb.lp.rebotinol.model.executions.EnviarExecution;
import edu.upb.lp.rebotinol.model.executions.EscriExecution;
import edu.upb.lp.rebotinol.model.executions.MemoExecution;
import edu.upb.lp.rebotinol.model.executions.RebotinolInstructionExecution;
import edu.upb.lp.rebotinol.model.executions.SequentialInstructionExecution;
import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.MatrixUtil;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;

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
		subExecutions.add(new EnviarExecution());
		_program = new SequentialInstructionExecution(subExecutions);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void buildInitialMatrix() {
		_initialMatrix = MatrixUtil.createMatrix(5, 5);
		_initialMatrix[0][0] = new Fraction(1);
		_initialMatrix[3][3] = new Fraction(1,5);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void buildExpectedMatrix() {
		_expectedMatrix = MatrixUtil.createMatrix(5, 5);
		_expectedMatrix[0][0] = new Fraction(1);
		_expectedMatrix[0][1] = new Fraction(1);
	}

	/** 
	 * {@inheritDoc}
	 */
	@Override
	public RebotinolHouse getHouse() {
		buildInitialMatrix();
		RebotinolHouse house;
		try {
			house = new RebotinolHouse(_initialMatrix);
		} catch (RebotinolFatalException e) {
			throw new IllegalStateException(e);
		}
		return house;
	}
	
	
}
