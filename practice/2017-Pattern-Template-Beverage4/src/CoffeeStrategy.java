
public class CoffeeStrategy implements CaffeineBeverageStrategy {

	@Override
	public void brew() {
		System.out.println(" 커피를 내림 ");
	}

	@Override
	public void addCondiments() {
		System.out.println(" 설탕과 밀크 추가 ");
	}

}
