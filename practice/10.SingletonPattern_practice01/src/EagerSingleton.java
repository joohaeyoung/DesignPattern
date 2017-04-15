
public class EagerSingleton {

	
	//가장 기본적인 싱글턴 패턴. 
	//정적 변수로 초기에 바로 싱글턴객체를 생성해준다. 
	private static EagerSingleton unique = new EagerSingleton();
	
	//private 이기 때문에 외부에서 생성할수 없다. 
	private EagerSingleton(){
		
	}
	
	public static EagerSingleton getInstance(){
		return unique;
	}
	
	
}
