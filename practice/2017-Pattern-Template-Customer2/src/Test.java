import java.util.ArrayList;
import java.util.List;


public class Test {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("ȫ�浿", 100));
		customers.add(new Customer("������", 300));
		customers.add(new Customer("�̼���", 150));
		customers.add(new Customer("�庸��", 250));
		
		ReportGenerator generator = new SimpleReportGenerator();
		ReportGenerator cGenerator = new ComplexReportGenerator();
		
		System.out.println(generator.generate(customers));
		System.out.println(cGenerator.generate(customers));
	}
}
