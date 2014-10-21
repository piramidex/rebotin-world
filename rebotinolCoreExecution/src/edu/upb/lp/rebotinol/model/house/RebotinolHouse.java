package edu.upb.lp.rebotinol.model.house;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.observers.RebotinolHouseObserver;
import edu.upb.lp.rebotinol.observers.RebotinolMatrixObserver;
import edu.upb.lp.rebotinol.util.MatrixUtil;
import edu.upb.lp.rebotinol.util.RebotinolFatalException;

/**
 * Rebotin's house. It contains a matrix of Fractions, a memory that stores a
 * Fraction, a possibly empty mailbox and two boolean indicators, one for the
 * messages and one for the errors.
 * 
 * @author Alexis Marechal
 * 
 */
// TODO manage errors
public class RebotinolHouse {
	private final List<RebotinolHouseObserver> _houseObservers = new ArrayList<RebotinolHouseObserver>();
	private final List<RebotinolMatrixObserver> _matrixObservers = new ArrayList<RebotinolMatrixObserver>();
	private final int _sizeH;
	private final int _sizeV;
	private final Fraction[][] _matrix;
	private Fraction _memory;
	private int _positionH;
	private int _positionV;
	private Mail _mail;
	private boolean _matrixSent;
	private boolean _error;
	private String _errorMessage;

	/**
	 * Builds a rebotinol house
	 * 
	 * @param matrix
	 *            The initial matrix on which rebotin should work
	 * @throws RebotinolFatalException
	 *             IF the initial matrix was empty
	 */
	public RebotinolHouse(Fraction[][] matrix) throws RebotinolFatalException {
		// Check input
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			throw new RebotinolFatalException(
					"Passed an invalid matrix as parameter when creating the house");
		}
		// Clone the parameter matrix
		_sizeH = matrix[0].length;
		_sizeV = matrix.length;
		_matrix = MatrixUtil.cloneMatrix(matrix);
		_memory = null;
		_positionH = 0;
		_positionV = 0;
		_mail = null;
		_matrixSent = false;
		_error = false;
	}

	/**
	 * Adds an observer to this house
	 * 
	 * @param observer
	 *            The observer to be added
	 */
	public void registerObserver(RebotinolHouseObserver observer) {
		_houseObservers.add(observer);
	}
	
	/**
	 * Adds a matrix observer to this house
	 * 
	 * @param observer
	 *            The observer to be added
	 */
	public void registerObserver(RebotinolMatrixObserver observer) {
		_matrixObservers.add(observer);
	}

	/**
	 * Change the value in Rebotin's memory.
	 * 
	 * @param value
	 *            the new value to be memorized by Rebotin
	 */
	public void setMemory(Fraction value) {
		_memory = value;
		for (RebotinolHouseObserver observer : _houseObservers) {
			observer.memoryChanged(_memory);
		}
	}

	/**
	 * Sets a position in the matrix
	 * 
	 * @param h
	 *            The horizontal position
	 * @param v
	 *            The vertical position
	 * @throws RebotinolFatalException
	 *             If the new position was illegal
	 */
	public void setPosition(int h, int v) throws RebotinolFatalException {
		if (h >= _sizeH) {
			throw new RebotinolFatalException(
					"Tried to set a position outside of the house");
		}
		if (v >= _sizeV) {
			throw new RebotinolFatalException(
					"Tried to set a position outside of the house");
		}
		int oldPositionH = _positionH;
		int oldPositionV = _positionV;
		_positionH = h;
		_positionV = v;
		for (RebotinolMatrixObserver observer : _matrixObservers) {
			observer.positionChanged(oldPositionH, oldPositionV, _positionH,
					_positionV);
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
		for (RebotinolHouseObserver observer : _houseObservers) {
			observer.mailChanged(mail);
		}
	}

	/**
	 * @return true if the matrix has been sent
	 */
	public boolean isMatrixSent() {
		return _matrixSent;
	}
	
	/**
	 * Sets the flag "matrix sent" to true
	 * @throws RebotinolFatalException  If the matrix was already sent previously
	 */
	public void sendMatrix() throws RebotinolFatalException {
		if (_matrixSent) {
			throw new RebotinolFatalException("Tried to send the matrix when it was already sent!");
		}
		_matrixSent = true;
		for (RebotinolHouseObserver observer : _houseObservers) {
			observer.matrixSent();
		}
	}

	/**
	 * Sets the flag "matrix sent" to false
	 * @throws RebotinolFatalException If the matrix was not sent previously
	 */
	public void unsendMatrix() throws RebotinolFatalException {
		if (!_matrixSent) {
			throw new RebotinolFatalException("Tried to unsend the matrix when it was not sent!");
		}
		_matrixSent = false;
		for (RebotinolHouseObserver observer : _houseObservers) {
			observer.matrixUnsent();
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
	 * @return The matrix in the house. Note that this content is cloned before
	 *         returning it.
	 */
	public Fraction[][] getMatrix() {
		return MatrixUtil.cloneMatrix(_matrix);
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
		for (RebotinolMatrixObserver obs : _matrixObservers) {
			obs.matrixChanged(_positionH, _positionV, val);
		}
	}

	/**
	 * Writes a value in some position of the matrix.
	 * 
	 * @param h
	 *            The horizontal position
	 * @param v
	 *            The vertical position
	 * @param val
	 *            The value to be written in the matrix.
	 */
	public void writeInMatrix(int h, int v, Fraction val) {
		_matrix[v][h] = val;
		for (RebotinolMatrixObserver obs : _matrixObservers) {
			obs.matrixChanged(h, v, val);
		}
	}
	
	public void setError(boolean error) {
		_error = error;
		if (error) {
			for (RebotinolHouseObserver obs: _houseObservers) {
				obs.rebotinolErrorOcurred();
			}
		} else {
			for (RebotinolHouseObserver obs: _houseObservers) {
				obs.rebotinolErrorSolved();
			}
		}
	}

	public void setErrorMessage(String message) {
		_errorMessage = message;
		if (_error) {
			for (RebotinolHouseObserver obs: _houseObservers) {
				obs.errorMessageChanged(message);
			}
		}
	}
	
	public String getErrorMessage() {
		return _errorMessage;
	}
}
