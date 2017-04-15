/**
* 객체지향개발론 및 실습 2017학년도 1학기 실습 4. Factory Method 패턴
* @author 김상진 (한국기술교육대학교 컴퓨터공학부)
* OffRoad 타입의 차량을 생산하는 Concrete Creator 클래스
*/
public class OffRoadFactory extends VehicleFactory {
	@Override
	protected Vehicle selectVehicle(DrivingStyle style) {
		switch(style){
		case POWERFUL:
			return new OriginalSUV("Jeep Cheroke");
		case LUXURY:
			return new CrossoverSUV("KIA Sorento");
		default:
			throw new IllegalArgumentException("DrivingStyle not supported");
		}
	}
}
