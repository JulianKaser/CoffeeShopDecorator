
/**
 * This is the basic component for all elements.
 * Out of these components we create our coffee beverage.
 * @author julian
 *
 */

public abstract class CoffeeBeverage {
	
	protected String description = "Unknown Beverage";
	
	
	public String getDescription(){
		return description;
	}
	
	
	//let the subclasses define their costs....
	public abstract double cost();
	

}
