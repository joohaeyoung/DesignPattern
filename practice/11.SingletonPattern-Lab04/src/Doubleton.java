

public enum Doubleton {
	
	FIRST, SECOND;
	
	private static boolean flag = true ;
	
	public static Doubleton getInstance(){
		
		if( flag){
			flag = false;
			return FIRST;
		}
		else{
			flag = true ;
			return SECOND;
				
		}
	}
	
	/*이 코드의 문제점은?
	 * 객체는 두개 생성되는데 이과정은 다중 스레드에서는 제댜로 안알려준다.
	 * 이요청에 대해서는 펄스트 주고 이요청에서 세컨드 주야되는데
	 * 다중스레드 되면 싱그로나이즈가 안되서 
	 * 겟인스턴스가 번갈아 주지 않고 다르게 줄수 있다.
		멀티 스레드 환경떄문에 더블톤을 만들었는데 겟 인스턴스 만든 부분은 멀티 스레드 고려하지 않고 단순히 짬. 
		그런것이 약간 고민 해 볼 수 가 있따. 
		
		많은 프로그램할때는 멀티 스레드 환경을 고려를 하지 않으니까 쉬운 방법으로 가도되지만 멀티스레드 환경에서는 우리가  고민안했떤 부분을 고민할 부분이 생긴다.
		그런것들으르 잘 따져보다.
	
	 */

}
