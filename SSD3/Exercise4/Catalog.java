/*
 *this class models a product catalog.
 */

public class catalog{

	//A vector that contains references to instances of class Product
	Vector products;

	/*
	 *Construct a Catalog object
	 *with an empty products vector
	 */
	public catalog(){

		products = new vector();

	}

	//Add specified product to the vector products
	public void addProduct(Product product){

		products.add(product);

	}

	//Returns an Iterator over the vector products
	public Iterator getProductIterator(){

		return products.iterator();

	}

	/*
	 *Returns a reference to the Product instance with the specified code
	 *Returns null if no
	 */
	public Product getProduct(String code){

		//Creates a new Iterator over the vector Products
		for(Iterator it = getProductIterator(); it.hasNext(); ){

			Product product = (Product)it.next();
			String productCode = product.getCode();
			if(code.equals(productCode))
				return product;

		}

		return null;

	}

	//Returns the number of the instances in the vector product
	public int getNumberOfProducts(){

		return products.size();

	}



}