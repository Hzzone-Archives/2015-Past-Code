package no2_3_v2;

/**
 * This class models a preference item in a game.
 * 
 * @author author name
 * @version 1.0.0
 */
public class PrefItem {
	
	private String key;
	private String value;

	public PrefItem(String initialKey, String initialValue) {
		key = initialKey;
		value = initialValue;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String newValue) {
		this.value = newValue;
	}
}
