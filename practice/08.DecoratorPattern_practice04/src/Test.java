
public class Test {

	
	
	public static void main(String[] args) {
		Beverage beverage 
			= Beverage.getInstance(new HouseBlend(),
					"Mocha","HouseBlend","Mocha"); //열거형을 써서 문자열을 제어 할 수 있다. 
		System.out.printf("%s: %,d원", 
			beverage.getDescription(),beverage.cost());

	}

}
