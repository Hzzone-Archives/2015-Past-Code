import  java.io.*;
import  java.util.*;

/**
 * Test driver for class <code>MediaDatabase</code>.
 *
 * @author  author name
 * @version  1.0.0
 */
public class TestMediaDatabase  {

	/* Standard output stream */
	private static PrintWriter  stdOut =
		new  PrintWriter(System.out, true);

	/* Standard error stream */
	private static PrintWriter  stdErr =
		new  PrintWriter(System.err, true);

	/**
	 * Displays a message in the standard error stream if the value specified
	 * by parameter <code>condition<code> is <code>false</code>.
	 *
	 * @param message  the error message.
	 * @param condition  the test condition.
	 */
	public static void assertTrue(String message, boolean condition) {

		if (!condition) {
			stdErr.print("** Test failure ");
			stdErr.println(message);
		}
	}

	/**
	 * Displays a message in the standard error stream.
	 *
	 * @param message  the error message.
	 */
	public static void fail(String message) {

		stdErr.print("** Test failure ");
		stdErr.println(message);
	}

	/**
	 * Test driver for class <code>MediaDatabase</code>.
	 *
	 * @param args  not used.
	 */
	public static void  main(String[] args)  {

		String[] fileNames = {"f0", "f1", "f2", "f3", "f4"};

		AudioFile file0 = new AudioFile(fileNames[0], 0);
		AudioFile file1 = new AudioFile(fileNames[1], 1);
		AudioFile file2 = new AudioFile(fileNames[2], 2);
		AudioFile file3 = new AudioFile(fileNames[3], 3);
		AudioFile file4 = new AudioFile(fileNames[4], 4);

		MediaFile[] files = {file0, file1, file2, file3, file4};
		MediaFile[] removedFiles = {file2, file3};
		MediaFile[] notRemovedFiles = {file0, file1, file4};

		MediaDatabase database = new MediaDatabase();
		MediaDatabase databaseEmpty = new MediaDatabase();

		// Testing addFile and getNumberOfFiles
	
		assertTrue("1: testing method getNumberOfFiles",
			databaseEmpty.getNumberOfFiles() == 0);

		for (int i = 0; i < files.length; i++) {
			database.addFile(files[i]);
		}
			
		assertTrue("2: testing methods addFile and getNumberOfFiles",
			database.getNumberOfFiles() == files.length);

		// testing getFile
		for (int i = 0; i <  files.length; i++) {
			assertTrue("3: testing method getFile",
				database.getFile(fileNames[i]) == files[i]);
		}

		assertTrue("3: testing method getFile",
			database.getFile("unknownName") == null);

		// testing getFileNames
		assertTrue("4: testing method getFileNames",
			databaseEmpty.getFileNames().length == 0);
			
		String[] resultGetFileNames = database.getFileNames();
		assertTrue("5: testing method getFileNames",
			resultGetFileNames.length == 5
			&&	isNameInArray(fileNames[0], resultGetFileNames)
			&&	isNameInArray(fileNames[1], resultGetFileNames)
			&&	isNameInArray(fileNames[2], resultGetFileNames)
			&&	isNameInArray(fileNames[3], resultGetFileNames)
			&&	isNameInArray(fileNames[4], resultGetFileNames));
		
		// testing getFilesIterator
		Iterator iterator = database.getFilesIterator();

		for (int i = 0; i <  files.length; i++) {
			if (iterator.hasNext()) {
				assertTrue("5: testing method getIterator",
					iterator.next() == files[i]);
			} else {
				fail("6: testing method getIterator");
			}
		}

		// testing removeFiles
		for (int i = 0; i < removedFiles.length; i++) {
			database.removeFile(removedFiles[i]);
		}

		assertTrue("7: testing method removeFiles",
			database.getNumberOfFiles() == notRemovedFiles.length);

		for (int i = 0; i <  notRemovedFiles.length; i++) {
			assertTrue("8: testing method removeFiles",
				database.getFile(notRemovedFiles[i].getName()) ==
					notRemovedFiles[i]);
		}

		for (int i = 0; i <  removedFiles.length; i++) {
			assertTrue("9: testing method removeFiles",
				database.getFile(removedFiles[i].getName()) == null);
		}
	
		stdOut.println("done");
	}
	
	/*
	 * Check if the name exist in the array
	 */
	private static boolean isNameInArray(String name, String[] array) {
		
		for (int i = 0; i < array.length; i++) {
			if (name.equals(array[i])) {
				
				return true;
		
			}
		}
		
		return false;
	}
}
