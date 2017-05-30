
//adapter 해야 할 것이 클래스이면 다중상속이 안되므로 object adapter로만 가능하다
public class Test {
	
	public static void duckSimulation(Duck d){
		d.display();
		d.quack();
		d.fly();
		
	}
	
	public static void main(String[] args){
		//Duck d = new MallardDuck();
		Duck d = new TurkeyAdapter(new Turkey());
		duckSimulation(d);	
	}
}
/*
 * adapter는 인터페이스를 바꿔주는 것이고
 * pacade는 인터페이스를 단순화 시켜주는 것. 
 * 

 * 
 */
