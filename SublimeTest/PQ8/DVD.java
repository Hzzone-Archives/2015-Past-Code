/*
 *DVD a interface declare the 
 *methods obtaining DVD information
 */

public Interface DVD{

	//returns the region code of the DVD
	int getRegionCode();

	//returns an array with the names of the audio tracks on the DVD
	String[] getAudioTracks();

	//returns an array with the languages of the subtitles on the DVD
	String[] getSubtitles();
}