
public class CoffeeShop {

	
	
	public static void main(String[] args) {
		
		CoffeeBeverage beverage1 = new Espresso();
		System.out.println(beverage1.getDescription() + " CHF" + beverage1.cost());
		
		
		//you build your coffee with components:
		CoffeeBeverage beverage2 = new AfficiandoBlend();
		beverage2 = new Whip(beverage2);
		beverage2 = new Toffee(beverage2);
		System.out.println(beverage2.getDescription() + " CHF" +beverage2.cost());
		
		
	}
}
