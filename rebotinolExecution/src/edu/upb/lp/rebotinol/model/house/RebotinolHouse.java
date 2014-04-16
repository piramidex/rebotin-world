package edu.upb.lp.rebotinol.model.house;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.util.MatrixCloner;

/**
 * Rebotin's house. It contains a matrix of Fractions, a memory that stores a
 * Fraction, a possibly empty mailbox and two boolean indicators, one for the
 * messages and one for the errors.
 * 
 * @author Alexis Marechal
 * 
 */
//TODO manage errors
public class RebotinolHouse {
    private final List<RebotinolHouseObserver> _observers = new ArrayList<RebotinolHouseObserver>();
    private final int _sizeH;
    private final int _sizeV;
    private final Fraction[][] _matrix;
    private Fraction _memory;
    private int _positionH;
    private int _positionV;
    private Mail _mail;
    private boolean _error;

    /**
     * Builds a rebotinol house
     * @param matrix The initial matrix on which rebotin should work
     * @param sizeH The horizontal size of the matrix (must be > 0)
     * @param sizeV The vertical size of the matrix (must be > 0)
     */
    public RebotinolHouse(Fraction[][] matrix) {
        // Check input
    	if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Passed an invalid matrix as parameter when creating the house");
        }
        // Clone the parameter matrix
    	_sizeH = matrix[0].length;
        _sizeV = matrix.length;
        _matrix = MatrixCloner.cloneMatrix(matrix);
        _memory = null;
        _positionH = 0;
        _positionV = 0;
        _mail = null;
        _error = false;
    }

    /**
     * Adds an observer to this house
     * @param observer The observer to be added
     */
    public void registerObserver(RebotinolHouseObserver observer) {
        _observers.add(observer);
    }

    /**
     * Change the value in Rebotin's memory.
     * 
     * @param value
     *            the new value to be memorized by Rebotin
     */
    public void setMemory(Fraction value) {
        _memory = value;
        for (RebotinolHouseObserver observer : _observers) {
            observer.memoryChanged(_memory);
        }
    }

    /**
     * Set a horizontal position in the matrix
     * 
     * @param h
     *            The horizontal position
     */
    public void setPosition(int h, int v) {
        if (h >= _sizeH) {
            throw new IllegalArgumentException("Tried to set a position outside of the house");
        }
        if (v >= _sizeV) {
            throw new IllegalArgumentException("Tried to set a position outside of the house");
        }
        _positionH = h;
        _positionV = v;
        for (RebotinolHouseObserver observer : _observers) {
            observer.positionChanged(_positionH, _positionV);
        }
    }

    /**
     * @return The value memorized by Rebotin
     */
    public Fraction getMemory() {
        return _memory;
    }

    /**
     * @return The current horizontal position in the matrix
     */
    public int getPositionH() {
        return _positionH;
    }

    /**
     * @return The current vertical position in the matrix
     */
    public int getPositionV() {
        return _positionV;
    }

    /**
     * @return The value in the mailbox. May be null to empty the mailbox.
     */
    public Mail getMail() {
        return _mail;
    }

    /**
     * Changes the value in the mailbox
     * 
     * @param mail
     *            The new value for the mailbox. May be null if the mailbox is
     *            empty.
     */
    public void setMail(Mail mail) {
        _mail = mail;
        for (RebotinolHouseObserver observer : _observers) {
            observer.mailChanged(mail);
        }
    }

    /**
     * @return true if the error notification is on, false otherwise.
     */
    public boolean isErrorNotificationOn() {
        return _error;
    }

    /**
     * @return The horizontal size of the matrix.
     */
    public int getSizeH() {
        return _sizeH;
    }

    /**
     * @return The vertical size of the matrix.
     */
    public int getSizeV() {
        return _sizeV;
    }

    /**
     * @return The matrix in the house. Note that this content is cloned before returning it.
     */
    public Fraction[][] getMatrix() {
        return MatrixCloner.cloneMatrix(_matrix);
    }

    /**
     * @return The current value shown in the window.
     */
    public Fraction getCurrentMatrixValue() {
        return _matrix[_positionV][_positionH];
    }

    /**
     * Write a value in the current position of the matrix.
     * 
     * @param val
     *            The value to be written in the matrix.
     */
    public void writeInMatrix(Fraction val) {
        _matrix[_positionV][_positionH] = val;
    }
}
