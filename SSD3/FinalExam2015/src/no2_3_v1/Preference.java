package no2_3_v1;

import java.util.Map.Entry;

import java.util.HashMap;
import java.util.Iterator;

/**
 * This class models custom preferences in a game.
 * 
 * @author A Jiayi
 * @version 1.0.0
 */
public class Preference {

	/**
	 * The single instance of class <code>Preference</code>
	 */
	private static Preference instance;
	
	/**
	 * Store each preference using an unique String key mapping to a String
	 * value.
	 */
	private HashMap<String, String> prefs;

	/**
	 * The constructor is declared private so it can only be called by methods
	 * of this class.
	 */
	private Preference() {
		prefs = new HashMap<String, String>();
	}

	/**
	 * Obtains the single instance of class <code>Preference</code>
	 * 
	 * @return the single instance of class <code>Preference</code>
	 */
	public static Preference getInstance() {
		if (instance == null) {
			instance = new Preference();
		}
		return instance;
	}

	/**
	 * Setting a custom preference.
	 */
	public void addPref(String key, String value) {
		prefs.put(key, value);
	}

	/**
	 * Removing a custom preference.
	 */
	public void removePref(String key) {
		prefs.remove(key);
	}

	/**
	 * Retrieving the value of a custom preference.
	 * 
	 * @return the value of a custom preference using the specified
	 *         <code>key</code>
	 */
	public String getPrefValue(String key) throws PreferenceNotFoundException {

		if (prefs.containsKey(key))
			return prefs.get(key);
		else
			throw new PreferenceNotFoundException(key + " Not Found!");
	}

	/**
	 * Updating a custom preference.
	 */
	public void updatePref(String key, String value) {
		if (prefs.containsKey(key)) {
			prefs.put(key, value);
		}
	}

	/*
	 * 下面的方法与试题要求无关， 仅用于查看对用户偏好进行添加、移除和更新后的结果。
	 */
	public void printPref() {
		Entry<String, String> entry;
		Iterator<Entry<String, String>> iter = prefs.entrySet().iterator();
		while (iter.hasNext()) {
			entry = iter.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
