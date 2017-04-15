
//내부 클래스가 호출되는 시점에 최초 생성이 되기 때문에, 속도도 빠르고 필요치 않다면 생성하지도 않습니다.
//이부분이 이해가 잘 가지 않는다.

public class InnerSingleton {

	private static class Holder{
		
		private static final InnerSingleton unique 
		= new InnerSingleton();
		
	}
	
	private InnerSingleton(){}
	
	public static InnerSingleton getInstance(){
		return Holder.unique;
	}
	


}
