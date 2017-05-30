
//이렇게 일반화시켜서 코드 중복을 없앤다. 
public abstract class CaffeineBeverage {

	//템플릿 메소드다. 수정이 안되도록 final 로 설정
	public  final void prepareRecipe(){
		
		boilWater();
		brew();
		pourInCup();
		
		if( customerWantsCondiments())
			addCondiments();
		
	}

	//두가지 메소드는 중복되어있어서 가지고 온다. 
	//밖에서는 prepareRecipe만 필요하다. 애네들은 필요하지않다.
	//애네들은 밑에서 재정의할 필요가 없다. 
	protected final void boilWater(){ //finaㅣ을 쓰면 재정의를 못한다. 
		System.out.println("물을 끓임");
	}
	protected abstract void brew();
	
	protected final void pourInCup(){
		System.out.println("컵에 따르다");
	}
	protected abstract void addCondiments();//이것을 빈메소드로 만들어놓아서 hook으로 만들수 있다. 첨가물이 필요하면 정의하고 필용벗으면 정의하지 안혹. 이러한 방법이 있다. addComment자체를 abstract 가 아니라hook 메소드를 만들수 있다.
	
	//hook
	protected boolean customerWantsCondiments(){
		return true;
	}
}
