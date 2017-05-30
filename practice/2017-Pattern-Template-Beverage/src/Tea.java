
public class Tea extends CaffeineBeverage {

	@Override
	public void prepareRecipe() {
		
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
		
	}
	protected void steepTeaBag(){
		System.out.println("티백을 담구다.");
	}
	protected void addLemon(){
		System.out.println("레몬 추가.");
	}
	
	
	
}
