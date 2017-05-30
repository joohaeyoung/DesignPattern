
//새롭게 Turkey 가 추가되었다. 
//이 터키를 기존에 Duck 에서 이용해야 한다. 
//이용할 방법은?
// 어댑터를 이용하면 인터페이스 호환성 문제 떄문에 같이 쓸 수 없는 클래스들을 연결해서 쓸 수 있다.
public class Turkey {
	
	public void display(){
		System.out.println("난 칠면조야");
	}

	public void gobble(){
		System.out.println(" 꼬르르륵 ");
	}
	public void fly(){
		System.out.println("푸 더덕");
	}
}
