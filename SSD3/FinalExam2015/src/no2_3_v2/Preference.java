package no2_3_v2;

import no2_3_v1.PreferenceNotFoundException;

import java.util.Iterator;
import java.util.Vector;

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
	private Vector<PrefItem> prefs;
	
	/**
	 * The constructor is declared private so it can only be called by methods
	 * of this class.
	 */
	private Preference() {
		prefs = new Vector<PrefItem>();
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
		PrefItem pi = new PrefItem(key, value);
		prefs.add(pi);
	}

	/**
	 * Removing a custom preference.
	 */
	public void removePref(String key) {
		Iterator<PrefItem> iter;
		for (iter = prefs.iterator(); iter.hasNext();) {
			PrefItem pi = iter.next();
			if (pi.getKey().equals(key)) {
				prefs.remove(pi);
				break;
			}
		}
	}

	public String getPrefValue(String key) throws PreferenceNotFoundException {
		Iterator<PrefItem> iter;
		for (iter = prefs.iterator(); iter.hasNext();) {
			PrefItem pi = iter.next();
			if (pi.getKey().equals(key)) {
				return pi.getValue();
			}
		}
		throw new PreferenceNotFoundException(key + " Not Found!");
	}

	public void updatePref(String key, String value) {
		Iterator<PrefItem> iter;
		for (iter = prefs.iterator(); iter.hasNext();) {
			PrefItem pi = iter.next();
			if (pi.getKey() == key) {
				pi.setValue(value);
			}
		}
	}

	/*
	 * 下面的方法与试题要求无关， 仅用于查看对用户偏好进行添加、移除和更新后的结果。
	 */
	public void printPref() {
		Iterator<PrefItem> iter;
		for (iter = prefs.iterator(); iter.hasNext();) {
			PrefItem pi = iter.next();
			System.out.println(pi.getKey() + ":" + pi.getValue());
		}
	}

}
