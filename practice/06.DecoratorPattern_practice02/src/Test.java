
public class Test {

	public static void main(String[] args) {
		
		Beverage beverage = new HouseBlend();
		beverage = new Mocha(beverage);
	
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		
		System.out.printf("%s: %,d원\n", 
			beverage.getDescription(),beverage.cost());
		
		beverage = beverage.removeCondiment();
		System.out.printf("%s : %,d원\n", beverage.getDescription(), beverage.cost());
		
		beverage = beverage.removeCondiment();
		System.out.printf("%s : %,d원\n", beverage.getDescription(), beverage.cost());
		
		beverage = beverage.removeCondiment();
		System.out.printf("%s : %,d원\n", beverage.getDescription(), beverage.cost());
		
	}
}
