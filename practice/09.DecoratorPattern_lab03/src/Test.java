
public class Test {

	public static void main(String[] args) {
	
		Beverage beverage1 = new HouseBlend();
		Beverage beverage2 = new HouseBlend();
		
		beverage1 = new Mocha(beverage1);
		beverage1 = new Mocha(beverage1);
		beverage1 = new Whip(beverage1);
		
		
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		
		System.out.println( beverage1.equals(beverage2) );
		
		
		System.out.printf("%s: %,d¿ø", 
				beverage1.getDescription() , beverage1.cost() );
	}
}


