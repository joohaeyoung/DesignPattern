/**
* 객체지향개발론 및 실습 2017학년도 1학기 실습 4. Factory Method 패턴
* @author 김상진 (한국기술교육대학교 컴퓨터공학부)
* 일반승용차량 중 POWERFUL 타입에 해당하는 구체적 Product 클래스
*/


public class Sports extends Car {
	public Sports(String description) {
		super(description);
	}
	@Override
	public int cost(Vehicle.Color color) {
		
		AddCost addcost = new AddCost(color);
			
			return 4000 + addcost.addCost();
		}
}