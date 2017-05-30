import java.util.ArrayList;
import java.util.List;


public class Test {

	public static void main(String[] args) {
	
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("홈길동",100));
		customers.add(new Customer("홈길동",100));
		customers.add(new Customer("홈길동",100));
		customers.add(new Customer("홈길동",100));
		customers.add(new Customer("홈길동",100));
		
		SimpleReportGenerater generator = new SimpleReportGenerater();
		
		System.out.println( generator.generate(customers) );
		
		
	}

}
