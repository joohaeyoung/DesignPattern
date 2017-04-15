
/*
 enum 이 singleton pattern 으로 사용될 수 있는 이유는 아래와 같다.

INSTANCE 가 생성될 때, multi thread 로 부터 안전하다. (추가된 methed 들은 safed 하지 않을 수도 있다.)
단 한번의 인스턴스 생성을 보장한다.
사용이 간편하다.
enum value는 자바 프로그램 전역에서 접근이 가능하다

 */

public enum EnumsSingleton {
	UNIQUE;
	
	public static EnumsSingleton getInstance(){
		return UNIQUE;
	}
}


