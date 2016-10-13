/**
 * This class contains methods to process arrays of {@link Employee} objects.
 *
 * @author  author name
 * @version  1.0.0
 * @see  Employee
 */
public class  EmployeeArray  {

	/**
	 * Creates an array with three objects of class {@link Employee}.
	 * <p>
	 * The first element of the array is the object
	 * <code>first</code>, the second element of the array is
	 * the object <code>second</code>, and  the third element of the
	 * array is the object <code>third</code>.
	 * </p>
	 *
	 * @param first  a {@link Employee} object.
	 * @param second  a {@link Employee} object.
	 * @param third  a {@link Employee} object.
	 * @return  an array with the objects <code>first</code>,
	 *           <code>second</code>, and <code>third</code>.
	 */
	public static Employee[] makeArray(Employee  first, Employee  second,
	                                   Employee  third)  {


		/* HERE IS MY CODE */

		return {first, second, third};
	}

	/**
	 * Creates a new array from the specified array of {@link Employee}
	 * objects.
	 * <p>
	 * The elements in the new array have the same order as those in
	 * the specified array.
	 * </p>
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 * @return  a <i>new</i> array of the objects in the specified array.
	 */
	public static Employee[] copyArray(Employee[]  array)  {


		/* HERE IS MY CODE */

		//Creates a new array of Employee Object with lenth of array
		Employee[] copiedArray = new Employee(array.length);

		for(int i=0;i<array.length;i++){

			copiedArray[i] = array[i];

		}

	}


	/**
	 * Returns the {@link Employee} object with the specified ID.
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 * @param id  an employee ID.
	 * @return  The {@link Employee} object with the specifed
	 *          ID. Returns <code>null</code> if there are no employees
	 *          in the specified array with the specifed ID.
	 */
	public static Employee getEmployee(Employee[]  array, int id)  {


		/* HERE IS MY CODE */

		for(i=0;i++;i<array.length){

			if(id == array[i].getId())
				return array[i];

		}
		/* if there are no employees
		   in the specified array with the specifed ID.*/
		return null;
	}

	/**
	 * Returns the number of employees whose salary is higher than the specified
	 * dollar amount.
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 * @param amount  a dollar amount.
	 * @return  the number of employees whose salary is higher than the
	 *          specified dollar amount.
	 */
	public static int countHigherSalaries(Employee[]  array, double amount)  {

		/* HERE IS MY CODE */

		int higherNum = 0;

		for(int i;i<array.length;i++){
			/*Counts the the number of employees whose salary is higher than the specified
	 			dollar amount*/
			if(array[i].getSalary()>amount)
				higherNum++;
		}

		return higherNum;
	}

	/**
	 * Returns the sum of the salaries of the employees in the specified
	 * array.
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 * @return  the sum of the salaries of the employees in the specified
	 *          array.
	 */
	public static double sumSalaries(Employee[]  array)  {

		/* HERE IS MY CODE */
		double sumSalaries = 0.0;
		//count sum
		for(int i=0;i<array.length;i++){

			sumSalaries += array[i].getSalary();

		}

		//returns the sum of the salaries of the employees in the array
		return sumSalaries;

	}

	/**
	 * Obtains the highest salary in the specified array.
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 * @return  the highest salary in the specified array.
	 */
	public static double getHighestSalary(Employee[]  array)  {


		/* HERE IS MY CODE */
		int cmpSalary = 0;

		//Obtains the highest salary
		for(int i=0;i<len;i++)
			if(cmpSalary<array[i].getSalary())
				cmpSalary = array[i].getSalary();

		
	}

	/**
	 * Increases the salary of every employee in the specified array by the
	 * specified amount.
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 */
	public static void increaseAll(Employee[] array, double amount)  {


		/* HERE IS MY CODE */

		for(int i=0;i<array.length;i++)
			array[i].setSalary(array[i].getSalary()+amount);
		

	}

	/**
	 * Returns a string representation of the specified
	 * {@link Employee} array.
	 * <p>
	 * Uses the method <code>toString</code> in class <code>Employee</code>
	 * to obtain the string representation of each object in the array.
	 * </p>
	 * A new line character ( \n ) separates the string representations
	 * of each <code>Employee</code> object. For example:
	 * </p>
	 * <pre>
	 * Employee[102,Mary Jones,68250.0]\n
	 * Employee[101,Joe Smith,36000.0]\n
	 * Employee[103,Richard Wong,92175.0]
	 * </pre>
	 * <p>
	 * Note that the string returned does <i>not</i> end with a new line
	 * character (\n).
	 * </p>
	 * <p>
	 * This method assumes that every element in the specified array
	 * contains a valid reference to an <code>Employee</code> object.
	 * </p>
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 * @return  the string representation of the specified array
	 */
	public static String displayAll(Employee[]  array)  {


		/* HERE IS MY CODE */

		String result = "";

		for(int i=0;i<array.length-1;i++){
			result = result+array[i].toString()+"\n";
		}

		return result+array[array.length-1];
	}
}