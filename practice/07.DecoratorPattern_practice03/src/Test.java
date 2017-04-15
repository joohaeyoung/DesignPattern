
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage = new HouseBlend();

		
		beverage.addCondiment( new Mocha() );
		beverage.addCondiment( new Mocha() );
		beverage.addCondiment( new Whip() );
		
		System.out.printf("%s : %, d원%n", beverage.getDescription(),beverage.cost());
		
		
	
	}
	//컨디멘트데코리ㅇ이터 두ㅠ는 이유는 장식당할애들과 장신할 애들은 구분하기 위한 타입을 하나 만든것이다. 
	//장식자인지 아닌지 구분하기위해서 컨디맨터데코레이터를 둔다. 
	// 컨디멘터가 꼭 구현해야되는것을 강제화 시키고 있다. 커스터는 당연히 만들어야 하지만 디스크리션을 무조건 추가해서 뭘 추가하는지를 디스크립션에서 표현할수 있도록 한다. 
	// 이효과 2개 하나는 장식자를 포괄하는 타입 또 하나는 이 장식자가 반드시 재정의 할게 있으면 중간에 추가한다 .
	
}
