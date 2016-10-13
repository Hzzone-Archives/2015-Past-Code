package Exercise4;
import java.util.*;
/*
 *this class maintains a list of
 *order items
 */

public class Order{

	//A vector that contains references to the instances of class OrderItem
	Vector items;

	/*
	 *Construct a Order object
	 *Creates a vector items,initially empty
	 */
	public Order(){

		items = new Vector();

	}

	//Add the specified order item to the vector items
	public void addItem(OrderItem orderItem){

		items.add(orderItem);

	}


	//Remove the specified order item from the vector items
	public void removeItem(OrderItem orderItem){

		items.remove(orderItem);

	}

	//Returns an Iterator over the instances in the vector items
	public Iterator getItemsIterator(){

		return items.iterator();

	}

	/*
	 *Returns a reference to the OrderItem instance
	 *with specified product
	 *Returns null if no
	 */
	public OrderItem getItem(Product product){

		for(Iterator it = getItemsIterator(); it.hasNext(); ){

			OrderItem item = (OrderItem)it.next();
			if(product.equals(item.getProduct())) {
                return item;

            }
		}
        return null;

	}

	//Returns the number of instances in the vector Items
	public int getNumberOfItems(){

		return items.size();

	}

	//Returns the total cost of the order
	public double getTotalCost(){

		double totalCost = 0;

		for(Iterator it = getItemsIterator(); it.hasNext(); ){

			totalCost += ((OrderItem)it.next()).getValue();

		}

		return totalCost;
	}

}