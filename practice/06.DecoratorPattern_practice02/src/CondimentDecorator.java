
public abstract class CondimentDecorator extends Beverage {
	
	protected Beverage beverage;
	//protected CondimentDecorator(Beverage beverage){
	//	this.beverage = beverage;
	//}
	
	public abstract String getDescription();
	
	@Override
	public Beverage removeCondiment(){
		return beverage;
	}
	
	protected void setDecoratee(Beverage beverage){
		this.beverage = beverage;
	}
}
