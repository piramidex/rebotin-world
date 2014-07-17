package edu.upb.lp.rebotinol.model.executions;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionVisitor;

/**
 * Instruction to go up on the matrix.
 *
 * @author Alexis Marechal
 *
 */
public class ArrExecution extends MovementExecution {
    /**
     * {@inheritDoc}
     */
    @Override
    public int getNewHorizontal(int h, int v) {
		return h;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public int getNewVertical(int h, int v) {
		return v-1;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public int getUndoHorizontal(int h, int v) {
		return h;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public int getUndoVertical(int h, int v) {
		return v+1;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public boolean doesModify(RebotinolHouse house, int h, int v) {
		return v > 0;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object accept(RebotinolExecutionVisitor v) {
		return v.visit(this);
	}
}
