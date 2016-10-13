

public class Coffee extends Product{

	/*the origin of the Coffee*/
	private String origin;

	/*the roast of the Coffee*/
	private String roast;

	/*the flavor of the Coffee*/
	private String flavor;

	/*the aroma of the Coffee*/
	private String aroma;

	/*the acidity of the Coffee*/
	private String acidity;

	/*the body of the Coffee*/
	private String body;

	/*
	 *returns origin the origin of the Coffee
	 *
	 *@return origin the origin of the Coffee
	 */
	public String getOrigin(){
		return origin;
	}

	/*
	 *returns roast the roast of the Coffee
	 *
	 *@return roast the roast of the Coffee
	 */
	public String getRoast(){
		return roast;
	}

	/*
	 *returns flavor the flavor of the Coffee
	 *
	 *@return flavor the flavor of the Coffee
	 */
	public String getFlavor(){
		return flavor;
	}

	/*
	 *returns aroma the aroma of the Coffee
	 *
	 *@return aroma the aroma of the Coffee
	 */
	public String getAroma(){
		return aroma;
	}

	/*
	 *returns acidity the acidity of the Coffee
	 *
	 *@return acidity the acidity of the Coffee
	 */
	public String getAcidity(){
		return acidity;
	}

	/*
	 *returns body the body of the Coffee
	 *
	 *@return body the body of the Coffee
	 */
	public String getBody(){
		return body;
	}

	public String toString(){
		return super.getCode()+"_"+super.getDescription()+"_"+super.getPrice()+"_"+origin+"_"
		+roast+"_"+flavor+"_"+aroma+"_"+acidity+"_"+body;
	}

	/*
	 *Constructs a Coffee object
	 * @param initialCode the code of the coffee
	 * @param initialDescription the description of the coffee
	 * @param initialPrice the price of the coffee
	 * @param initialOrigin the origin of the coffee
	 * @param initialRoast the roast of the coffee
	 * @param initialFlavor the flavor of the coffee
	 * @param initialAroma the aroma of the coffee
	 * @param initialAcidity the acidity of the coffee
	 * @param initialBody the body of the coffee
	 */
	public Coffee(String initialCode, String initialDescription, double initialPrice,
				  String initialOrigin, String initialRoast, String initialFlavor,
				  String initialAroma, String initialAcidity, String initialBody){
		super(initialCode, initialDescription, initialPrice);
		origin = initialOrigin;
		roast = initialRoast;
		flavor = initialFlavor;
		aroma = initialAroma;
		acidity = initialAcidity;
		body = initialBody;
	}


}