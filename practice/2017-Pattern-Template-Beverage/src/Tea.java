
public class Tea extends CaffeineBeverage {

	@Override
	public void prepareRecipe() {
		
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
		
	}
	protected void steepTeaBag(){
		System.out.println("Ƽ���� �㱸��.");
	}
	protected void addLemon(){
		System.out.println("���� �߰�.");
	}
	
	
	
}
