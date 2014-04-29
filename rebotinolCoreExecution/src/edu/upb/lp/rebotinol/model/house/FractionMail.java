package edu.upb.lp.rebotinol.model.house;

import org.apache.commons.math3.fraction.Fraction;

import edu.upb.lp.rebotinol.util.RebotinolFatalException;

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
	 * @throws RebotinolFatalException If the content was null
	 */
	public FractionMail(Fraction content) throws RebotinolFatalException {
		if (content == null) {
			throw new RebotinolFatalException("Cannot create a mail with an empty Fraction value");
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
