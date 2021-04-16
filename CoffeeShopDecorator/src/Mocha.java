
public class Mocha extends CondimentDecorator{

	
	private CoffeeBeverage beverage;
	
	public Mocha(CoffeeBeverage beverage){
		this.beverage = beverage;
	}
	
	
	
	@Override
	public String getDescription() {
		System.out.println(beverage.getDescription() + ", Mocha");
		return beverage.getDescription() + ", Mocha";
	}

	
	
	@Override
	/**
	 * Combines costs of ingredients plus beverage
	 */
	public double cost() {
		System.out.println("Mocha costs 0.70");
		return .70 + beverage.cost();
	}

}
