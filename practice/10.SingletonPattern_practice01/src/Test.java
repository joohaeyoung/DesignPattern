import java.lang.reflect.Constructor;

class MyTask implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//Singleton s = Singleton.getInstance();
		EagerSingleton s = EagerSingleton.getInstance();
		System.out.println(s);
	}

}


public class Test {

	public static void main(String[] args) {
		/*
		//�Ѵ� �Ȱ��� ��ü�� �ش�.
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2); //���� ������ �� �Ȱ��� ��ü���� ���°Ŵ�. 
		
		// �츮�� ��Ƽ ������ ȯ���� �������� �ʾ������� �ƹ��� ������ ����. 
	    */
		
		//���� �����忡���� �̱����� ���� �ȵɼ��� �ִ�. 
		
		/*
		Runnable task = new MyTask();
		Thread[] tList = new Thread[10];
		
		for(int i = 0 ; i <tList.length ; i++){
			
			tList[i] = new Thread(task);
			
		}
		
		for(Thread t : tList ) t.start();
		*/
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = null;
		// �����ڸ� private �� �س��Ƽ� ������ ���Ѵ�. �׷����� �ұ��ϰ� �ѹ� ������ �غ��ڵ�.
		try{
			
			Constructor<Singleton>[] constructors = (Constructor<Singleton>[]) Singleton.class.getDeclaredConstructors();
			
			for(Constructor<?> c : constructors ){
				c.setAccessible(true);
				s2 = (Singleton)c.newInstance();
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		//Singleton s2 = (Singleton)s1.clone();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2); //���� ������ �� �Ȱ��� ��ü���� ���°Ŵ�.
		
		
	}

}
