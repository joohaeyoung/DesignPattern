
public class Tea extends CaffeineBeverage {
	
	public Tea(){
		super( new TeaStrategy() );
	}
}
