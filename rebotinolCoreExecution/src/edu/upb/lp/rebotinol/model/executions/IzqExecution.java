package edu.upb.lp.rebotinol.model.executions;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionVisitor;

/**
 * Instruction to go to the left on the matrix.
 *
 * @author Alexis Marechal
 *
 */
public class IzqExecution extends MovementExecution {
    /**
     * {@inheritDoc}
     */
	@Override
	protected int getNewHorizontal(int h, int v) {
		return h-1;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	protected int getNewVertical(int h, int v) {
		return v;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	protected int getUndoHorizontal(int h, int v) {
		return h+1;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	protected int getUndoVertical(int h, int v) {
		return v;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	protected boolean doesModify(RebotinolHouse house, int h, int v) {
		return h > 0;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object accept(RebotinolExecutionVisitor v) {
		return v.visit(this);
	}
}
