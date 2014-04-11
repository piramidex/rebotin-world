package edu.upb.lp.rebotinol.model.house;

import org.apache.commons.math3.fraction.Fraction;

/**
 * A mail containing a Fraction number.
 * 
 * @author Alexis Marechal
 *
 */
public class FractionMail implements Mail {
	private final Fraction _content;
	
	/**
	 * Constructor
	 * @param content The content of this mail.
	 */
	public FractionMail(Fraction content) {
		if (content == null) {
			throw new IllegalArgumentException("Cannot create a mail with an empty Fraction value");
		}
		_content = content;
	}

	/**
	 * @return The content of this mail.
	 */
	public Fraction getContent() {
		return _content;
	}
}
