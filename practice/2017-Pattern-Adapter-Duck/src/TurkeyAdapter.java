
//adapter 패턴 : 같이 쓸 수 없는  클래스들을 연결해서 쓸수 있다. 
//원래 Duck 과 Turkey 는 같이 쓸수 없는데 이렇게 하면 같이 쓸 수 있게 된다. 
/*
 * 한국의 표준 플러그를 일본에 전원 소켓에 바로 끼워줄수 없어 동그랑 모양을 일자로 바꿔주는 어댑터를 끼워주어야 한다. 
 * 이와 같이 어댑터는 소켓의 인터페이스를 플러그에서 필요로 하는 인터페이스로 바꿔준다고 할 수 있다.
 */

public class TurkeyAdapter implements Duck {
	
	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey){
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		
		turkey.gobble();

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 5 ; i++)
			turkey.fly();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		turkey.display();
	}

}
