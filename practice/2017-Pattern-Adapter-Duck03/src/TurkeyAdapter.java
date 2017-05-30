

public class TurkeyAdapter extends Duck {

	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey){
		this.turkey = turkey;
	}
	
	@Override
	public void quack(){
		turkey.gobble();
	}
	
	@Override
	public void fly(){
		for(int i = 0 ; i < 5 ; i ++){
			
			turkey.fly();
		}	
	}
	@Override
	public void display(){
		turkey.display();
	}

}
