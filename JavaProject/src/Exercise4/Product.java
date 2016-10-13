package Exercise4;

public class Product{

	private String code;
	private String description;
	private double price;
/*
 * @return code the Product code.
 */
	public String getCode(){
		return code;
	}

/*
 * @return  description the Product description.
 */
	public String getDescription(){
		return description;
	}

/*
 * @return  Price the Product price.
 */
	public double getPrice(){
		return price;
	}

/*
 * compare two Product object code 
 * @para object the Prodcut object
 * @return  true if two Product object code equals
 * false Otherwise.
 */
	public boolean equals(Object object){

		return object instanceof Product
				&& getCode().equals(((Product)object).getCode());
	}

/*
 *@return String the representation of the Product
 */

	public String toString(){
		return code+"_"+description+"_"+price;
	}

/*
 *Contructs a Product object.
 *
 *@param initialCode the Code of the Product
 *@param initialDescription the description of the Product
 *@param initialPrice the Price of the Product
 */
	public Product(String initialCode, String initialDescription, double initialPrice){
		 code = initialCode;
		 description = initialDescription;
		 price = initialPrice;
	}


}