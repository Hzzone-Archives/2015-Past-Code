/**
 * The class MediaDatabase maintains a collection of MediaFile objects.
 * A MediaFile object is an instance of a class 
 * that implements the interface MediaFile.
 *
 * @author  A Jiayi
 * @date  2008-10-20
 * @version  1.0.0
 * @see MediaFile
 */ 

import java.util.Vector;
import java.util.Iterator;

public class MediaDatabase {
 
	/**
	 * A vector that contains references to MediaFile objects.
	 */
	private Vector<MediaFile> files;

	/**
	 * Constructs a <code>MediaDatabase</code> object.
	 * Creates the vector files, which is initially empty
	 */
	public MediaDatabase() {

		files = new Vector<MediaFile>();
	}
   
	/**
	 * Adds the specified media file to the end of the vector files
	 *
	 * @param mediaFile   a<code>MediaFile</code> object.
	 */
	public void addFile(MediaFile mediaFile) {

		files.add(mediaFile);
	}
   
	/**
	 * Removes the specified media file from the vector items
	 *
	 * @param mediaFile   a<code>MediaFile</code> object.
	 */		 
	public void removeFile(MediaFile mediaFile) {
   	
		files.remove(mediaFile);
	}

	/**
	 * Returns an iterator over the instances in the vector files.
	 *
	 * @return an {@link MediaFile} over the instances in the vector MediaFile. 
	 */	 
	public Iterator getFilesIterator() {

		return files.iterator();
	}

	/**
	 * Returns the <code>MediaFile</code> object stored in the vector files with
	 * the specified <code>name<code>. 
	 * Returns null if there are no products in the catalog with 
	 * the specified <code>name</code>. 
	 *
	 * @param name  the value of instance variable name. 
	 * @return  the <code>MediaFile</code> object with the specified name.
	 */    	
	public MediaFile getFile(String name) {
 
		for (Iterator i = getFilesIterator(); i.hasNext();) {
			MediaFile mediaFile = (MediaFile)i.next();
			if (mediaFile.getName().equals(name)) {
				return mediaFile;
			}
		}
		return null;
	}

	/**
	 * Returns the number of files in the MediaFile.
	 *
	 * @return  the number of <code>MediaFile</code> objects in this 
	 * 						MediaDatabase.
	 */	
	public int getNumberOfFiles() {

		return files.size();
	}
   	 
	/**
	 * Returns an array containing the names of all the files stored in the vector files.
	 * 
	 * @return  the array of <code>MediaFile</code> objects stored in the vector files.
	 */	
	public String[] getFileNames() {

		String [] filesNames = new String [files.size()];
		for (int i = 0; i < files.size(); i++)
			filesNames[i] = ((MediaFile)files.get(i)).getName();
			return filesNames;
		}
}
