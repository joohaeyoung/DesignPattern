
// ��Ƽ������ ���α׷� ȯ�濡�� ����ϸ� ����.

public class DoubleLockSingleton2 {
	
	// volatile 를 꼭 선언해 주어야 한다. 
	private volatile static DoubleLockSingleton2 unique = null;
	
	private DoubleLockSingleton2(){}
	
	public static  DoubleLockSingleton2 getInstance(){
		
		if(unique == null ){
			
			synchronized(DoubleLockSingleton2.class ){//�� �κи� �κ������� ��ŷ�� �ȴ�. 
				if(unique == null )	
					unique = new DoubleLockSingleton2();
			}
		}
		return unique;
	}
	

}
