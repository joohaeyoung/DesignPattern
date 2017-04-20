/**
* 객체지향개발론 및 실습 2017학년도 1학기 실습 4. Factory Method 패턴
* @author 김상진 (한국기술교육대학교 컴퓨터공학부)
* 차량을 생산하는 Abstract Creator 클래스
*/

//생성과 관련된 것을 자식 클래스한테 넘김. 
public abstract class VehicleFactory {
	
	//드라이브 스타일은 오직 이 4개만 가능하다. 
	public enum DrivingStyle {ECONOMICAL, MIDRANGE, LUXURY, POWERFUL};
	
	//final을 쓰면 재정의가 불가능 하다. 
	public final Vehicle build(DrivingStyle style, Vehicle.Color color){
		
		//완성하시오.
		//차량 생산에 관한 것은 서브클래스의 펙토리 메소드에 위임한다. 
		//이렇게 하면 뭐가 좋은가?
		//car, offload 에서 차량을 생산하는 것을 각각 carfactory, offloadfactory에서 독자적인 방식으로 생산할 수 있고 이것을  캡슐화 할 수가 있다. 
		
		//객체를 생산하는것 빼고 나머지 모든 과정은 수퍼클래스에서 한다. 
		//객체 생성과 다른것들과 분리되어있다. 
		

		Vehicle v = selectVehicle(style); //여기서 예외가 발생할 수도 있다. 

		v.paint(color);
		
		
		return v;
			
	}
	
	protected abstract Vehicle selectVehicle(DrivingStyle style);
	//자식클래스에서 만들겠끔 한다 .
	
}
