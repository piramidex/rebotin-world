package edu.upb.lp.rebotinol.model.house;

/**
 * A mail containing a Double number.
 * 
 * @author Alexis Marechal
 *
 */
public class DoubleMail implements Mail {
	private final Double _content;
	
	/**
	 * A mail containing a Double.
	 * @param content The content of this mail.
	 */
	public DoubleMail(Double content) {
		if (content == null) {
			throw new IllegalArgumentException("Cannot create a mail with an empty Double value");
		}
		_content = content;
	}

	/**
	 * @return The content of this mail.
	 */
	public Double getContent() {
		return _content;
	}
}
