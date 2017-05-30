
//기존에 존재 하였던 MallardDuck

public class MallardDuck implements Duck {

	@Override
	public void quack() {
	
		System.out.println("꽥꽥");
	}

	@Override
	public void fly() {
		
		System.out.println("하늘을 날고 있음");
	}

	@Override
	public void display() {
	
		System.out.println("난 청동 오리");
	}

}
