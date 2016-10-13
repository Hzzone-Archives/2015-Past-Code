/*
 *this class maintains a list of the orders
 *that hava been completed
 */

public class Sales{

	//A vector that contains references to instances of class Order
	Vector orders;

	/*
	 *Construct a Sales object
	 *Creates the vector order,initially empty
	 */
	public Sales(){

		orders = new Vector();

	}

	//Add the specified order to the vector orders
	public void addOrder(Order order){

		orders.add(order);

	}

	//Returns an iterator over the instances in the vector orders.
	public Iterator getOrdersIterator(){

		return orders.iterator();

	}
	//Returns the number of instances in the vector orders
	public int getNumberOfOrders(){

		return orders.size();
		
	}



}