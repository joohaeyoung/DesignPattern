
public class Test {

	
	
	public static void main(String[] args) {
		Beverage beverage 
			= Beverage.getInstance(new HouseBlend(),
					"Mocha","HouseBlend","Mocha"); //�������� �Ἥ ���ڿ��� ���� �� �� �ִ�. 
		System.out.printf("%s: %,d��", 
			beverage.getDescription(),beverage.cost());

	}

}
