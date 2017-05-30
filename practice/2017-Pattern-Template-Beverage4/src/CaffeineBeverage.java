
public class CaffeineBeverage {
	
	private CaffeineBeverageStrategy strategy;
	public CaffeineBeverage(CaffeineBeverageStrategy strategy){
		this.strategy = strategy;
	}
	
	public final void prepareRecipe(){
		
		boilWater();
		strategy.brew();
		pourInCup();
		strategy.addCondiments();
		
	}
	protected final void boilWater(){
		System.out.println(" ¹°À» ²úÀÓ ");
	}
	protected final void pourInCup(){
		System.out.println(" ÄÅ¿¡ µû¸£´Ù ");
	}

}
