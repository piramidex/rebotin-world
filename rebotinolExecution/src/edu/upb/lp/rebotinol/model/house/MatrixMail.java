package edu.upb.lp.rebotinol.model.house;

/**
 * A mail containing a matrix of Doubles.
 * @author Alexis Marechal
 *
 */
public class MatrixMail implements Mail {
	private final Double[][] _content;

	/**
	 * Builds a mail containing a matrix.
	 * 
	 * @param content
	 *            The content of the mail. Note that this parameter will be
	 *            cloned.
	 */
	public MatrixMail(Double[][] content) {
		if (content == null || content.length == 0 || content[0].length == 0) {
			throw new IllegalArgumentException("Cannot create a mail with an empty matrix");
		}
		_content = new Double[content.length][];
		// Clone the matrix
		for (int i = 0; i < content.length; i++) {
			_content[i] = content[i].clone();
		}
	}

	/**
	 * @return The content of this mail. Note that this content is cloned before
	 *         returning it.
	 */
	public Double[][] getContent() {
		Double[][] clone = new Double[_content.length][];
		for (int i = 0; i < clone.length; i++) {
			clone[i] = _content[i].clone();
		}
		return clone;
	}
}
