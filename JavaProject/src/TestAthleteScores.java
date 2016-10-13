import  java.io.*;

/**
 * Test driver for class <code>AthleteScores</code>.
 *
 * @author  author name
 * @version  1.0.0
 */
public class TestAthleteScores  {

	/* Standard output stream */
	private static PrintWriter  stdOut = new  PrintWriter(System.out, true);

	/* Standard error stream */
	private static PrintWriter  stdErr = new  PrintWriter(System.err, true);

	/**
	 * Test driver for class <code>AthleteScores</code>.
	 *
	 * @param args  not used.
	 */
	public static void  main(String[] args)  {

		/* Here's my CODE */

		String name = "hzz";
		double scoreOne = 90;
		double scoreTwo = 91;
		double scoreThree = 92;
		double newScoreOne = 93;
		double newScoreTwo = 94;
		double newScoreThree = 95;

		//test accessors
		AthleteScores athlete = new AthleteScores(name,scoreOne,scoreTwo,scoreThree);

		assertTrue("1: testing method getName",
			name.equals(athlete.getName()));
		assertTrue("2: testing method getScoreOne",
			scoreOne == athlete.getScoreOne());
		assertTrue("3: testing method getScoreTwo",
			scoreTwo == athlete.getScoreTwo());
		assertTrue("4: testing method getScoreThree",
			scoreThree == athlete.getScoreThree());

		//test mutators
		athlete = new AthleteScores(name,scoreOne,scoreTwo,scoreThree);

		athlete.setScoreOne(newScoreOne);
		athlete.setScoreTwo(newScoreTwo);
		athlete.setScoreThree(newScoreThree);

		assertTrue("5: testing method setScoreOne",
			newScoreOne == athlete.getScoreOne());
		assertTrue("6: testing method setScoreTwo",
			newScoreTwo == athlete.getScoreTwo());
		assertTrue("7: testing method setScoreThree",
			newScoreThree == athlete.getScoreThree());

		// test method getMinimum
		double smallestScoreOne = 90;
		double smallestScoreTwo = 90;
		double smallestScoreThree = 90;

		//when the scoreOne is the smallest
		athlete = new AthleteScores(name,scoreOne,scoreTwo,scoreThree);
		athlete.setScoreOne(smallestScoreOne);
		assertTrue("8: testing method getMinimum",
			smallestScoreOne == athlete.getMinimum());

		//when the scoreTwo is the smallest
		athlete = new AthleteScores(name,scoreOne,scoreTwo,scoreThree);
		athlete.setScoreOne(smallestScoreTwo);
		assertTrue("9: testing method getMinimum",
			smallestScoreTwo == athlete.getMinimum());

		//when the scoreThree is the smallest
		athlete = new AthleteScores(name,scoreOne,scoreTwo,scoreThree);
		athlete.setScoreOne(smallestScoreOne);
		assertTrue("10: testing method getMinimum",
			smallestScoreThree == athlete.getMinimum());

		//test method equals
		athlete = new AthleteScores(name,scoreOne,scoreTwo,scoreThree);
		String nameOne = "hzz";
		String nameTwo = "gyb";
		scoreOne = 100;
		scoreTwo = 100;
		scoreThree = 100;

		AthleteScores athleteOne = new AthleteScores(nameOne,scoreOne,scoreTwo,scoreThree);
		AthleteScores athleteTwo = new AthleteScores(nameOne,scoreOne,scoreTwo,scoreThree);
		AthleteScores athleteThree = new AthleteScores(nameTwo,scoreOne,scoreTwo,scoreThree);

		//when two athlete'name equals
     	assertTrue("11: testing method equals",
     		athleteOne.equals(athleteTwo));

     	//when two athlete'name not equals
     	assertTrue("12: testing method equals",
     		!athleteOne.equals(athleteThree));

     	//when another object not AthleteScores object 
     	assertTrue("13: testing method equals",
     		!athleteOne.equals("Hello world"));

		//test method toString
		athlete = new AthleteScores(name,scoreOne,scoreTwo,scoreThree);
		String result = name+","+scoreOne+","+scoreTwo+","+scoreThree;

		assertTrue("10: testing method toString",
			result.equals(athlete.toString()));

		stdOut.println("done");


	}

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

}
