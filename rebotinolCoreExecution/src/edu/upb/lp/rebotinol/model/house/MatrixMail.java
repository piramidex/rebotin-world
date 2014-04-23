package edu.upb.lp.rebotinol.model.house;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.util.MatrixCloner;

/**
 * A mail containing a matrix of Fractions.
 * @author Alexis Marechal
 *
 */
public class MatrixMail implements Mail {
	private final Fraction[][] _content;

	/**
	 * Builds a mail containing a matrix.
	 * 
	 * @param content
	 *            The content of the mail. Note that this parameter will be
	 *            cloned.
	 */
	public MatrixMail(Fraction[][] content) {
		if (content == null || content.length == 0 || content[0].length == 0) {
			throw new IllegalArgumentException("Cannot create a mail with an empty matrix");
		}
		// Clone the matrix
		_content = MatrixCloner.cloneMatrix(content);
	}

	/**
	 * @return The content of this mail. Note that this content is cloned before
	 *         returning it.
	 */
	public Fraction[][] getContent() {
		return MatrixCloner.cloneMatrix(_content);
	}
}
