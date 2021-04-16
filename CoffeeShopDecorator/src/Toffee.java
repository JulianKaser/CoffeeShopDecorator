
public class Toffee extends CondimentDecorator{
	
	private CoffeeBeverage beverage;
	
	
	public Toffee(CoffeeBeverage beverage){
		this.beverage = beverage;
		
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", with Toffee";
	}

	@Override
	public double cost() {
		return .45 + beverage.cost();
	}

}
