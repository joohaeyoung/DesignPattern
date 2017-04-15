
public class Mocha extends CondimentDecorator {
	private Beverage beverage;	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription()+", Mocha";
	}
	
	@Override
	public int cost() {
		return beverage.cost()+200;
	}

}
