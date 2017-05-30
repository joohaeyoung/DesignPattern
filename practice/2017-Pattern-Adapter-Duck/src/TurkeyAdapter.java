
//adapter ���� : ���� �� �� ����  Ŭ�������� �����ؼ� ���� �ִ�. 
//���� Duck �� Turkey �� ���� ���� ���µ� �̷��� �ϸ� ���� �� �� �ְ� �ȴ�. 
/*
 * �ѱ��� ǥ�� �÷��׸� �Ϻ��� ���� ���Ͽ� �ٷ� �����ټ� ���� ���׶� ����� ���ڷ� �ٲ��ִ� ����͸� �����־�� �Ѵ�. 
 * �̿� ���� ����ʹ� ������ �������̽��� �÷��׿��� �ʿ�� �ϴ� �������̽��� �ٲ��شٰ� �� �� �ִ�.
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
