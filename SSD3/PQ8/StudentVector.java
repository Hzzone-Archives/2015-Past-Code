import java.util.*;

/**
 * This class contains methods to process vectors of {@link Student} objects.
 *
 * @author  author name
 * @version  1.0.0
 * @see  Student
 * @see  Vector
 */
public class  StudentVector  {

	/**
	 * Returns a vector with three elements.
	 *
	 * @param first  a <code>Student</code> object.
	 * @param second  a <code>Student</code> object.
	 * @param third  a <code>Student</code> object.
	 * @return a vector with the objects <code>first</code>,
	 *           <code>second</code>, and <code>third</code>
	 */
	public static Vector makeVector(Student  first, Student  second,
	                                Student  third)  {

		/* HERE IS MY ODE*/

		Vector madeVector = new vector();
		//add the first,second,third Student object to the vector
		madeVector.add(first);
		madeVector.add(second);
		madeVector.add(third);

		return madeVector;

	}

	/**
	 * Returns a vector with the same elements of the specified array
	 * arranged in the same order.
	 *
	 * @param array  an array with <code>Student</code> objects .
	 * @return a vector with the same elements of the specified array
	 *         arranged in the same order
	 */
	public static Vector makeVectorFromArray(Student[] array) {

		/* HERE IS MY ODE*/

		Vector studentVector = new vector();
		//Add the Student objects into studentVector with the same sequence
		for(int i=0;i<array.length;i++)
			studentVector.add(array.[i]);

        //Returns the vector
		return studentVector;
	}

	/**
	 * Returns <code>true</code> if the specified vector contains a
	 * student whose ID matches the specified ID.
	 *
	 * @param vector  a vector of <code>Student</code> objects.
	 * @param id  a student ID.
	 * @return  <code>true</code> if the specified vector contains a
	 *          student whose ID matches the specified ID;
	 *          <code>false</code> otherwise.
	 */
	public static boolean hasStudent(Vector  vector, int  id)  {


		/* HERE IS MY ODE*/

		// if there exits a student whose ID matchs return true
		for(Iterator it = vector.iterator(); it.hasNext();){
			if(it.next().getId == id)
				return true;
		}
		//otherwise return false
		return false;

		
	}

	/**
	 * Returns the number of students in the specified vector whose
	 * grade is greater than or equal to the specified grade.
	 *
	 * @param vector  a vector of <code>Student</code> objects.
	 * @param grade  a grade.
	 * @return  the number of students in the specified vector whose
	 *          grade is greater than or equal to the specified grade.
	 */
	public static int countGradeGreaterOrEqual(Vector vector, int grade)  {


		/* PLACE YOUR CODE HERE */

		return 0; // REMOVE; USED SO THIS FILE COMPILES
	}

	/**
	 * Returns the smallest grade of the students in the specified vector.
	 * <p>
	 * This method assumes that the vector is not empty.
	 *
	 * @param vector  a vector of <code>Student</code> objects.
	 * @return  the smallest grade of the students in the specified vector.
	 */
	public static int getMinGrade(Vector vector)  {


		/* PLACE YOUR CODE HERE */

		return 0; // REMOVE; USED SO THIS FILE COMPILES
	}

	/**
	 * Returns the average grade of the students in the specified vector.
	 *
	 * @param vector  a vector of <code>Student</code> objects.
	 * @return  the average grade of the students in the specified vector.
	 */
	public static double getGradeAverage(Vector vector)  {

		/* PLACE YOUR CODE HERE */

		return 0; // REMOVE; USED SO THIS FILE COMPILES
	}

	/**
	 * Removes all students in the specified vector whose grade
	 * is less than the specified grade.
	 *
	 * @param vector  a vector of <code>Student</code> objects.
	 * @param grade  a grade.
	 */
	public static void removeGradeLess(Vector  vector, int  grade)  {

		/* PLACE YOUR CODE HERE */
	}

	/**
	 * Returns the string representation of the objects in the specified
	 * vector.
	 * <p>
	 * A new line character ( \n ) should separate the string
	 * representations of the objects. For example:
	 * </p>
	 * <pre>
	 * Student[328,Galileo Galilei,80]\nStudent[123,Albert Einstein,100]
	 * </pre>
	 * <p>
	 * Note that the string does <i>not</i> end with a new line character ( \n ).
	 * </p>
	 *
	 * @param vector  a vector of <code>Student</code> objects.
	 * @return  the string representation of the objects in the specified
	 *          vector.
	 */
	public static String displayAll(Vector  vector)  {


		/* PLACE YOUR CODE HERE */

		return ""; // REMOVE; USED SO THIS FILE COMPILES
	}
}