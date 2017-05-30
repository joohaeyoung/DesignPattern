
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
