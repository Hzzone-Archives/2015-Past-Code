package no2_3_v1;

/**
 * An exception that is thrown when a preference key is requested but not
 * present.
 * 
 * @author author name
 * @version 1.0.0
 */

public class PreferenceNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new instance of <code>PreferenceNotFoundException</code>.
	 */
	public PreferenceNotFoundException() {
	}

	/**
	 * Constructs a new instance of <code>PreferenceNotFoundException</code>
	 * that includes an explanation.
	 * 
	 * @param message
	 *            Additional information about this exception. Can be null.
	 */
	public PreferenceNotFoundException(String message) {
		super(message);
	}
}

