
public class Whip extends CondimentDecorator{
	
	private CoffeeBeverage beverage;
	
	
	public Whip(CoffeeBeverage beverage){
		this.beverage = beverage;
	}
	

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", with Whip";
	}

	
	
	@Override
	public double cost() {
		return .88 + beverage.cost();
	}

}
