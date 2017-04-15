
public class HouseBlend extends Beverage {//장식당하는애

	public HouseBlend(){
		setDescription("HouseBlend");
	}
	
	@Override
	public int cost() {
	
		int sum = 0;
		
		for( Condiment c : condiments )
			sum +=c.cost();
		
		
		return sum+1000;
	}
	//변수를 지정안하고 이렇게 사용할수 있다. 

}
