
public class TeaStrategy implements CaffeineBeverageStrategy {

	@Override
	public void brew() {
		System.out.println(" 티백을 담그다 ");

	}

	@Override
	public void addCondiments() {
		System.out.println(" 레몬 추가 ");

	}

}
