import  java.io.*;

/**
 * Test driver for class <code>AudioFile</code>.
 *
 * @author  author name
 * @version  1.0.0
 * @see AudioFile
 */
public class TestAudioFile  {

	/* Standard output stream */
	private static PrintWriter  stdOut = new  PrintWriter(System.out, true);

	/* Standard error stream */
	private static PrintWriter  stdErr = new  PrintWriter(System.err, true);

	/**
	 * Displays a message in the standard error stream if the value specified
	 * by parameter <code>condition<code> is <code>false</code>.
	 *
	 * @param message  the error message.
	 * @param condition  the test condition.
	 */
	public static void assertTrue(String message, boolean condition) {

		if (! condition) {
			stdErr.print("** Test failure ");
			stdErr.println(message);
		}
	}

	/**
	 * Test driver for class <code>AudioFile</code>.
	 *
	 * @param args  not used.
	 */
	public static void  main(String[] args)  {

		String name = "file name";
		int duration = 120;

		// Test accessors
		AudioFile file = new AudioFile(name, duration);

		assertTrue("1: testing method getName",
		           name.equals(file.getName()));
		assertTrue("2: testing method getDuration",
		           duration == file.getDuration());

		// Test method equals
		String nameOne = "file name one";
		int durationOne = 150;

		String nameTwo = "file name two";
		int durationTwo = 35;

		AudioFile fileOne = new AudioFile(nameOne, durationOne);
		AudioFile fileTwo = new AudioFile(nameOne, durationTwo);
		AudioFile fileThree = new AudioFile(nameTwo, durationTwo);

		assertTrue("4: testing method equals",
		           fileOne.equals(fileTwo));
		assertTrue("5: testing method equals",
		           !fileOne.equals(fileThree));

		// Test method toString
		file = new AudioFile(name, duration);

		String result = name + "," + duration;

		assertTrue("6: testing method toString",
		           result.equals(file.toString()));

		stdOut.println("done");
	}
}
