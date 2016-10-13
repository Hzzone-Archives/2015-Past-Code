/*VHSMovie
 *a class extends class Movie 
 *and implements interface VHS
 */

public class VHSMovie extends Movie implements VHS{

	//the format of the VHS movie
	String format;

	//the language of the VHS movie
	String language;
	
	//returns the value of the variable format
	String getFormat(){
		return format;
	}

	//returns the value of the variable language
	String getLanguage(){
		return language;
	}

	//returns a String representation of the object with the {title,format,language}
	String toString(){
		return super.title+","+format+","+language;
	}
	



}
