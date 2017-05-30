
//이렇게 일반화시켜서 코드 중복을 없앤다. 
public abstract class CaffeineBeverage {

	public abstract void prepareRecipe();
	
	//두가지 메소드는 중복되어있어서 가지고 온다. 
	//밖에서는 prepareRecipe만 필요하다. 애네들은 필요하지않다.
	//애네들은 밑에서 재정의할 필요가 없다. 
	protected final void boilWater(){ //finaㅣ을 쓰면 재정의를 못한다. 
		System.out.println("물을 끓임");
	}
	protected final void pourInCup(){
		System.out.println("컵에 따르다");
	}

}
