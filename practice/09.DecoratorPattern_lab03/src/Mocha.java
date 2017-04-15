
public class Mocha extends CondimentDecorator {
	
	public Mocha(Beverage beverage){
		setDecoratee(beverage);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return getBeverage().getDescription()+" Mocha ";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return getBeverage().cost()+200;
	}
	
}
