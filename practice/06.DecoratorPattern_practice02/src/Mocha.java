
public class Mocha extends CondimentDecorator {
		
	public Mocha(Beverage beverage){
		setDecoratee(beverage);
	}
	
	@Override//CondimentDecorator에서 추사메소드였기 때문에 꼭  오버라이드해야함
	public String getDescription() {
		return beverage.getDescription()+", Mocha";
	}

	@Override // Beverage 를 상속받은 CondimentDecorator 이기 때문에 꼭 오버라이드 해야함. 
	public int cost() {
		return beverage.cost()+200;
	}
	

}
