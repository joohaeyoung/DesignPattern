
public class Coffe extends CaffeineBeverage {

	@Override
	public void prepareRecipe() {
		
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
		
	}
	protected void brewCoffeeGrinds(){
		System.out.println("Ŀ�Ǹ� ����");
	}
	protected void addSugarAndMilk(){
		System.out.println("������ ��ũ ��ī");
	}
	
}
