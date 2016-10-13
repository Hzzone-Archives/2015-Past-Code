/*DVDMovie
 *this class extends class Movie
 *and implements the interface DVD
 */

public class DVDMovie extends Movie implements DVD{
	
	//the region code of the DVD movie
	private int regionCode;

	//the names of the audio tracks on the DVD movie
	private String[] audioTracks;

	//the language of the subtitles on the DVD movie
	private String[] subtitles;

	//returns the regionCode
	public int getRegionCode(){
		return regionCode;
	}

	//returns the audioTracks
	public String[] getAudioTracks(){
		return audioTracks;
	}

	//returns the subtitles
	public String[] getSubtitles(){
		return subtitles;
    
    //returns a String representation of the object with 
	//{title,regionCode}
	public String toString(){
		return title+","+regionCode;
	}

	

	/*
	 *Constructs a {@link DVDMovie} object
	 *@param initialTitle title of the DVDMovie
	 *@param initialActors actors of the DVDMovie
	 *@param initialDirector director of the DVDMovie
	 *@param initialRegionCode regionCode of the DVDMovie
	 *@param initialAudioTracks audioTracks of the DVDMovie
	 *@param initialSubtitles subtitles of the DVDMovie
	 */
	public DVDMovie(int initialTitle, String[] initialActors,
		String initialDirector, int initialRegionCode,
		String[] initialAudioTracks, String[] initialSubtitles){
		initialTitle = title;
		initialActors = actors;
		initialDirector = director;
		initialRegionCode = regionCode;
		initialAudioTracks = audioTracks;
		initialSubtitles = subtitles;
	}

}