/**
* 객체지향개발론 및 실습 2017학년도 1학기 실습 4. Factory Method 패턴
* @author 김상진 (한국기술교육대학교 컴퓨터공학부)
* 일반승용자동차를 나타내는 추상 클래스
*/

//그냥 Car와 offRoad 를 구분하기 위해서 굳이 할필요없지만 이렇게 만들어 놓음
public abstract class Car extends Vehicle {
	public Car(String description) {
		super(description);
	}
}
