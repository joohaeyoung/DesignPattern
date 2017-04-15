/**
* 객체지향개발론 및 실습 2017학년도 1학기 실습 4. Factory Method 패턴
* @author 김상진 (한국기술교육대학교 컴퓨터공학부)
* LUXURY 타입의 OffRoad 차량을 나타내는 Concrete Product 클래스
*/
public class CrossoverSUV extends OffRoad {
	public CrossoverSUV(String description) {
		super(description);
	}
	@Override
	public int cost(Vehicle.Color color) {
		
		AddCost addcost = new AddCost(color);
			
			return 3500 + addcost.addCost();
		}

}
