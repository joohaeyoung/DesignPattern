
public class SerialNumberGenerator {

//static 클래스! 해당 클래스의 객체를 따로 생성하지 않아도 쓸수가 있다. 
//SerialNumberGenerator 클래스 외부에서 SerialNumberGenerator 클래스의 객체없이도 Holder 클래스의 객체를 만들 수 있다.
//예를 들자면 SerialNumberGenerator.Holder holder = new SerainumberGenerator.Holder();	
//또한 정적 클래스도 static 이기때문에 static 변수와 메소드만 참조할 수 있습니다. 
	
	
	private static class Holder{
		
		private static SerialNumberGenerator unique 
		= new SerialNumberGenerator();
		
	//레이즈. 이객체가 필요한 시점에 만들겠끔 내부 클래스를 쓴다. 내부클래스쓰면서 스택틱 맴버해서 그 게 로드될때 다중스레드 문제가 안되겠금 한다. 
	}
	
	private SerialNumberGenerator(){}
	

	//스태틱으로 해도됨.
	private int number = 0 ;


	//스태틱으로 해도됨. 
	public int getNext(){
		
		return ++number;
	}
	
	public static SerialNumberGenerator getInstance(){
			return Holder.unique;
		
	}
	

}
