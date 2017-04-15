
public class Whip extends CondimentDecorator {
	
	public Whip(Beverage beverage){
		setDecoratee(beverage);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return getBeverage().getDescription()+" Whip ";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return getBeverage().cost()+300;
	}
	
}
