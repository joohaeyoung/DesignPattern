/**
* 객체지향개발론 및 실습 2017학년도 1학기 실습 4. Factory Method 패턴
* @author 김상진 (한국기술교육대학교 컴퓨터공학부)
* 모든 종류의 차량을 추상화할 수 있는 추상 Product 클래스
*/


public abstract class Vehicle {
	
	//칼라는 오직 이 칼라만이 가능하다. 
	
	public enum Color {UNPAINTED, BLUE, BLACK, PERLWHITE, WHITE, SILVER, GRAY, RED};
	
	private Vehicle.Color color = Vehicle.Color.UNPAINTED;
	
	private String description;
	
	public Vehicle(){ 
	}
	public Vehicle(String description){
		this.description = description;
	}
	
	public void paint(Color color){
		this.color = color;
	}
	
	//color 에 따른 추가비용을 발생 시키기 위하여 매개변수를 color로 지정함. 
	public abstract int cost(Vehicle.Color color); // 각각의 차량마다 가격을 다르게 부여한다. 가격은 고정되어있고 넣는 값이 아니기때문에 이렇게 abstract 를 이용한것 같다. 
	
	public String toString(){
		return String.format("%s, %s, %,d만원%n", description, color, cost(color) );
	}
	
}
