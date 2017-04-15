
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultitonV2 instance1 = MultitonV2.getInstance();
		MultitonV2 instance2 = MultitonV2.getInstance(); 
		MultitonV2 instance3 = MultitonV2.getInstance();
		
		
		
		
		MultitonV2 instance4 = MultitonV2.getInstance(); 
		MultitonV2 instance5 = MultitonV2.getInstance();
		
		
		
		if(instance1==instance4) System.out.println("올바르게 동작중");
		if(instance2==instance5) System.out.println("올바르게 동작중2");

	}

}
