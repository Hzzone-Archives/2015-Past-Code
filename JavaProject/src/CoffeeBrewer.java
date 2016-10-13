

public class CoffeeBrewer extends Product{

	/*the model of the CoffeeBrewer*/
	private String model;

	/*the waterSupply of the CoffeeBrewer*/
	private String waterSupply;

	/*the number of cups of the CoffeeBrewer*/
	private int numberOfCups;

	/*
	*return the model of the CoffeeBrewer
	*
	*@return the model of the CoffeeBrewer
	*/
	public String getModel(){
		return model;
	}

	/*
	*return the water suppy of the CoffeeBrewer
	*
	*@return the water suppy of the CoffeeBrewer
	*/
	public String getWaterSupply(){
		return waterSupply;
	}

	/*
	*return the number of cups of the CoffeeBrewer
	*
	*@return the number of cups of the CoffeeBrewer
	*/
	public int getNumberOfCups(){
		return numberOfCups;
	}

	/*
	*return the string representationg of the CoffeeBrewer
	*
	*@return the string representationg of the CoffeeBrewer
	*/
	public String toString(){
		return super.getCode()+"_"+super.getDescription()+"_"+super.getPrice()+"_"
		+model+"_"+waterSupply+"_"+numberOfCups;
	}

	/*
	*contruct a CoffeeBrewer object
	*
	*@param initialCode the code of the CoffeeBrewer
	*@param initialDescription the description of the CoffeeBrewer
	*@param initialPrice the price of the CoffeeBrewer
	*@param initialModel the model of the CoffeeBrewer
	*@param initialWaterSupply the water supply of the CoffeeBrewer
	*@param initialNumberOfCups the number of cups of the CoffeeBrewer
	*/
	public CoffeeBrewer(String initialCode, String initialDescription,
		double initialPrice, String initialModel, String initialWaterSupply,
		int initialNumberOfCups ){
		
		super(initialCode, initialDescription, initialPrice);

		model = initialModel;
		waterSupply = initialWaterSupply;
		numberOfCups = initialNumberOfCups;
	}

}