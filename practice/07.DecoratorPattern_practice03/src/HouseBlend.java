
public class HouseBlend extends Beverage {//��Ĵ��ϴ¾�

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
	//������ �������ϰ� �̷��� ����Ҽ� �ִ�. 

}
