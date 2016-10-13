import java.io.*;
import java.lang.reflect.*;

/**
 * Test driver for class <code>MediaFile</code>.
 *
 * @author  author name
 * @version  1.0.0
 * @see AudioFile
 */
public class TestMediaFile  {

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

			System.exit(0);
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

		System.exit(0);
	}

	/**
	 * Test driver for class <code>MediaFile</code>.
	 *
	 * @param args  not used.
	 */
	public static void  main(String[] args)  {

		Class interfaceDescriptor = null;

		try {
			interfaceDescriptor  = Class.forName("MediaFile");
		} catch (ClassNotFoundException cnfe) {
			fail("1: Interface MediaFile not found " +
			     "(check the name of the interface)");
		}

		assertTrue("2: MediaFile is not an Interface",
		           interfaceDescriptor.isInterface());

		Method[] methods = interfaceDescriptor.getMethods();

		if (methods.length == 0) {
			fail("3: MediaFile contains no methods");
		}

		assertTrue("3: MediaFile should contain only one method",
		           methods.length == 1);

		try {
			Method method = interfaceDescriptor.getMethod("getName", (Class[])null);
		} catch (NoSuchMethodException nsme) {
			fail("4: Method getName() not found " +
			     "(check the name of the method)");
		}

		stdOut.println("done");
	}
}
