package edu.upb.lp.rebotinol.model.executions;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionVisitor;

/**
 * Instruction to go to the right on the matrix.
 *
 * @author Alexis Marechal
 *
 */
public class DerExecution extends MovementExecution {
    /**
     * {@inheritDoc}
     */
    @Override
    public int getNewHorizontal(int h, int v) {
		return h+1;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public int getNewVertical(int h, int v) {
		return v;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public int getUndoHorizontal(int h, int v) {
		return h-1;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public int getUndoVertical(int h, int v) {
		return v;
	}

	/**
     * {@inheritDoc}
     */
	@Override
	public boolean doesModify(RebotinolHouse house, int h, int v) {
		return h < house.getSizeH() - 1;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object accept(RebotinolExecutionVisitor v) {
		return v.visit(this);
	}
}
