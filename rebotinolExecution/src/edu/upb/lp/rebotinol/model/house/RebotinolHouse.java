package edu.upb.lp.rebotinol.model.house;

import java.util.ArrayList;
import java.util.List;

import edu.upb.lp.rebotinol.util.MatrixCloner;
import edu.upb.lp.rebotinol.view.RebotinolHouseObserver;

/**
 * Rebotin's house. It contains a matrix of Doubles, a memory that stores a
 * Double, a possibly empty mailbox and two boolean indicators, one for the
 * messages and one for the errors.
 * 
 * @author Alexis Marechal
 * 
 */
public class RebotinolHouse {
    private final List<RebotinolHouseObserver> _observers = new ArrayList<RebotinolHouseObserver>();
    private final int _sizeH;
    private final int _sizeV;
    private final Double[][] _matrix;
    private Double _memory;
    private int _positionH;
    private int _positionV;
    private Mail _mail;
    private boolean _message;
    private boolean _error;

    /**
     * Builds a rebotinol house
     * @param matrix The initial matrix on which rebotin should work
     * @param sizeH The horizontal size of the matrix (must be > 0)
     * @param sizeV The vertical size of the matrix (must be > 0)
     */
    public RebotinolHouse(Double[][] matrix) {
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
        _message = false;
        _error = false;
    }

    /**
     * Adds an observer to this house
     * @param observer The observer to be added
     */
    public void addObserver(RebotinolHouseObserver observer) {
        _observers.add(observer);
    }

    /**
     * Change the value in Rebotin's memory.
     * 
     * @param value
     *            the new value to be memorized by Rebotin
     */
    public void setMemory(Double value) {
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
    public Double getMemory() {
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
        setMessageNotification(mail != null);
        for (RebotinolHouseObserver observer : _observers) {
            observer.mailChanged(mail);
        }
    }

    /**
     * @return true if the message notification is on, false otherwise.
     */
    public boolean isMessageNotificationOn() {
        return _message;
    }

    private void setMessageNotification(boolean notif) {
        _message = notif;
        for (RebotinolHouseObserver observer : _observers) {
            observer.messageNotificationChanged(_message);
        }
    }

    /**
     * @return true if the error notification is on, false otherwise.
     */
    public boolean isErrorNotificationOn() {
        return _error;
    }

    /**
     * Turns on or off the error notification.
     * 
     * @param notif
     */
    public void setErrorNotification(boolean notif) {
        _error = notif;
        for (RebotinolHouseObserver observer : _observers) {
            observer.errorNotificationChanged(_error);
        }
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
    public Double[][] getMatrix() {
        return MatrixCloner.cloneMatrix(_matrix);
    }

    /**
     * @return The current value shown in the window.
     */
    public Double getCurrentMatrixValue() {
        return _matrix[_positionV][_positionH];
    }

    /**
     * Write a value in the current position of the matrix.
     * 
     * @param val
     *            The value to be written in the matrix.
     */
    public void writeInMatrix(Double val) {
        _matrix[_positionV][_positionH] = val;
    }
}
