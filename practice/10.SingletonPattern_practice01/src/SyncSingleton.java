
//다중 스레드에서의 문제를 해결할수 있으나. Synchronized 가 되어있어서 성능이 좋지가 않다. 

public class SyncSingleton {
	
	private static SyncSingleton unique = null;

	private SyncSingleton(){}
	
	public static synchronized SyncSingleton getInstance(){
		
		if(unique == null ) unique = new SyncSingleton();
			return unique;
	}
	

}
