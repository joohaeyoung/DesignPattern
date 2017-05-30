
//상속을 이용한 방법

public class TurkeyAdapter extends Turkey implements Duck {


	@Override
	public void quack() {
		// TODO Auto-generated method stub
		gobble();

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 5 ; i++)
			fly();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		display();
	}

}
