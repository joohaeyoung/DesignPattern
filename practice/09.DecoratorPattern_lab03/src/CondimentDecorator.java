
public abstract class CondimentDecorator extends Beverage {

	private Beverage beverage;
	
	protected void setDecoratee(Beverage beverage){
		this.beverage = beverage;
	}
	
	protected Beverage getBeverage(){
		return beverage;
	}
	
	public abstract String getDescription();
	
	
	
	
}
