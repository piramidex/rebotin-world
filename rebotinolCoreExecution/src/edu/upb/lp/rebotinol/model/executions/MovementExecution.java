package edu.upb.lp.rebotinol.model.executions;

import edu.upb.lp.rebotinol.model.house.RebotinolHouse;
import edu.upb.lp.rebotinol.util.RebotinolExecutionException;

/**
 * Instruction to move the matrix.
 * 
 * @author Alexis Marechal
 * 
 */
public abstract class MovementExecution extends RebotinolInstructionExecution {
    private boolean _modified = false;

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doStep(RebotinolHouse house) throws RebotinolExecutionException {
        int h = house.getPositionH();
        int v = house.getPositionV();
        if (doesModify(house, h, v)) {
            int newH = getNewHorizontal(h, v);
            int newV = getNewVertical(h, v);
            house.setPosition(newH, newV);
            _modified = true;
        }
        finish();
    }

    /**
     * Computes the new horizontal position after this execution
     * 
     * @param h
     *            The current horizontal position
     * @param v
     *            The current vertical position
     * @return The new horizontal position after this execution
     */
    protected abstract int getNewHorizontal(int h, int v);

    /**
     * Computes the new vertical position after this execution
     * 
     * @param h
     *            The current horizontal position
     * @param v
     *            The current vertical position
     * @return The vertical position after this execution
     */
    protected abstract int getNewVertical(int h, int v);

    /**
     * Computes the horizontal position after undoing this execution
     * 
     * @param h
     *            The current horizontal position
     * @param v
     *            The current vertical position
     * @return The horizontal position after undoing this execution
     */
    protected abstract int getUndoHorizontal(int h, int v);

    /**
     * Computes the vertical position after undoing this execution
     * 
     * @param h
     *            The current horizontal position
     * @param v
     *            The current vertical position
     * @return The vertical position after undoing this execution
     */
    protected abstract int getUndoVertical(int h, int v);

    /**
     * Checks if this execution would actually move the house in the matrix
     * (i.e., if we are not at the border of the matrix).
     * 
     * @param house
     *            The house in which we are working
     * @param h
     *            The current horizontal position
     * @param v
     *            The current vertical position
     * @return true if this execution would actually move the matrix
     */
    protected abstract boolean doesModify(RebotinolHouse house, int h, int v);

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doStepBack(RebotinolHouse house) {
        if (_modified) {
            int h = house.getPositionH();
            int v = house.getPositionV();
            int newH = getUndoHorizontal(h, v);
            int newV = getUndoVertical(h, v);
            house.setPosition(newH, newV);
            _modified = false;
        }
        unfinish();
    }
}
