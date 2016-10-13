package no2_3_v1;

//import no2_3_v2.Preference;

public class TestPreference {

	public static void main(String[] args) throws PreferenceNotFoundException {
		
		Preference myPrefs = Preference.getInstance();
		
		myPrefs.addPref("player name", "Al");
		myPrefs.addPref("screen size", "15 inch");
		myPrefs.addPref("music volume", "80 decibel");
		myPrefs.printPref();
		System.out.println();
		
		myPrefs.removePref("music volume");
		myPrefs.updatePref("player name", "Benny");
		myPrefs.printPref();
		System.out.println();
		
		String k1="player name",k2="color";
		System.out.println(k1+":"+myPrefs.getPrefValue(k1));
		System.out.println(k2+":"+myPrefs.getPrefValue(k2));
	}
}
