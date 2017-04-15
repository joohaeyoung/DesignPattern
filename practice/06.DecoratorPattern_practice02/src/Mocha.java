
public class Mocha extends CondimentDecorator {
		
	public Mocha(Beverage beverage){
		setDecoratee(beverage);
	}
	
	@Override//CondimentDecorator���� �߻�޼ҵ忴�� ������ ��  �������̵��ؾ���
	public String getDescription() {
		return beverage.getDescription()+", Mocha";
	}

	@Override // Beverage �� ��ӹ��� CondimentDecorator �̱� ������ �� �������̵� �ؾ���. 
	public int cost() {
		return beverage.cost()+200;
	}
	

}
