
public class Coffe extends CaffeineBeverage {

	@Override
	public void prepareRecipe() {
		
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
		
	}
	protected void brewCoffeeGrinds(){
		System.out.println("커피를 내림");
	}
	protected void addSugarAndMilk(){
		System.out.println("설탕과 밀크 추카");
	}
	
}
