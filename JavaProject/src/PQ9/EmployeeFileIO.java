package PQ9;

import java.util.*;
import java.io.*;

/**
 * This class provides two file I/O methods for handling employee data.
 *
 * @author  author name
 * @version  1.0.0
 * @see  Employee
 */
public class  EmployeeFileIO {

	/**
	 * Creates a vector of <code>Employee</code> objects from a file that
	 * contains employee data.
	 * <p>
	 * Every line in the specified file should contain three fields: ID, name,
	 * and salary of an employee in the following format: ID_name_salary
	 *
	 * @param filename  the name of a file containing employee data.
	 * @return  a vector of <code>Employee</code> objects.
	 * @throws FileNotFoundException  if the specified file does not exist.
	 * @throws IOException  if an I/O error occurs.
	 * @throws NoSuchElementException  if the data in the file is incomplete.
	 * @throws NumberFormatException  if the file contains invalid numbers.
	 */
	public static Vector read(String filename) throws FileNotFoundException,
			IOException, NoSuchElementException, NumberFormatException  {


		/* HERE IS MY CODE */
        BufferedReader fileIn =
                new BufferedReader(new FileReader(filename));

        String employeeInfo = fileIn.readLine();
        Vector<Employee> oneVector = new Vector();

        while(employeeInfo != null) {
            StringTokenizer employeeInfoTokens
                    = new StringTokenizer(employeeInfo, "_");
            oneVector.add(new Employee(Integer.parseInt(employeeInfoTokens.nextToken()),
                    employeeInfoTokens.nextToken(), Double.parseDouble(employeeInfoTokens.nextToken())));
            employeeInfo = fileIn.readLine();
        }
        fileIn.close();

		return oneVector;
	}

	/**
	 * Creates a file of employee data from a vector of <code>Employee</code>
	 * objects.
	 * <p>
	 * Every line in the file should contain the ID, name, and salary of an
	 * employee separated by an underscore: ID_name_salary
	 *
	 * @param filename  the name of the file that will store the employee data.
	 * @param vector  a vector of <code>Employee</code> objects.
	 * @throws IOException  if an I/O error occurs.
	 */
	public static void write(String filename, Vector vector)
			throws IOException  {


		/*HERE IS MY CODE*/
        PrintWriter fileOut =
                new PrintWriter(new FileWriter(filename));
        for(Iterator iEmployee = vector.iterator();
                iEmployee.hasNext();){
            fileOut.println(((Employee)iEmployee.next()).toString());
        }
        fileOut.close();

	}
}