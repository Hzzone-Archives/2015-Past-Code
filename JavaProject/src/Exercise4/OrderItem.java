package Exercise4;

public class OrderItem {

	private Product product;
	private int quantity;

   /*
	*returns Product object the product of the Coffee
	*
	*@return Product object the product of the Coffee
	*/
	public Product getProduct(){
		return product;
	}

   /*
	*returns quantity the quantity of the orderItem
	*
    *@return quantity the quantity of the orderItem
    */
	public int getQuantity(){
		return quantity;
	}

   /*set the value of the quantity
    *
    *@param newQuantity the new quantity
    */
	public void setQuantity(int newQuantity){
		quantity = newQuantity;
	}

	/*
	*returns value the product of quantity and price
	*
    *@return value the product of quantity and price
    */
	public double getValue(){
		return quantity*(product.getPrice());
	}

	/*
	*returns the string representation of the orderItem
	*
    *@return the string representation of the orderItem
    */
	public String toString(){
		return quantity+" "+product.getCode()+" "+product.getPrice();
	}
    /*construct a OrderItem object.
    *@param initialProduct the product of the item
    *@param initialQuantity the product quantity of the item
    */
	public OrderItem(Product initialProduct, int initialQuantity){
		product = initialProduct;
		quantity = initialQuantity;
	}

}