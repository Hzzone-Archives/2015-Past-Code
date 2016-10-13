/**
 * The class AudioFile models an audio recording.
 *
 * @author  A Jiayi
 * @date  2008-10-20
 * @version  1.0.0
 */ 
public class AudioFile implements MediaFile {

	/**
	 * A string with the name of the audio file.
	 */
	private String name;
   
	/**
	 * An integer with the duration of the audio file in seconds 
	*/
	private int duration;
   
	/**
	 * Constructs a <code>AudioFile</code> object.
	 * Constructor that initializes the instance variables name and duration. 
	 *
	 * @param initialName - the string with the name of the audio file.
	 * @param initialDuration - the integer with the duration of the audio file in seconds. 
	 */	
	public AudioFile(String initialName, int initialDuration) {
   	
		name = initialName;
		duration = initialDuration;
   	}
   
	/**
	 * Returns the value of instance variable name. 
	 * 
	 * @return the value of instance variable name.
	 */ 
	public String getName() {

		return name;
	} 
   	
	/**
	 * Returns the value of instance variable duration. 
	 *
	 * @return the value of instance variable duration.
	 */ 	
	public int getDuration() {

		return duration;
	}
   	
	/**
	 * Returns <code>true</code> if the names of two audioFiles are equal. 
	 * </p>
	 *
	 * @param object  object with which two audioFiles are compared.
	 * @return  <code>true</code> if the name of the audioFile is
	 *          equal to the code of the argument; <code>false</code>
	 *          otherwise.
	 */
	public boolean equals(Object object) {

		return object instanceof AudioFile
			&& getName().equals(((AudioFile) object).getName());
	}

	/**
	 * Returns the string representation of an AudioFile object.
	 *
	 * @return the string representation of an AudioFile object.
	 */
	public String toString() {

		return getName() + "," + getDuration();
	}   
}