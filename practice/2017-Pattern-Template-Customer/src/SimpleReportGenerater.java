import java.util.List;

public class SimpleReportGenerater {
	
	public String generate(List<Customer> customers){
		
		String report = String.format("�� ��: %d��%n", customers.size());
		report = customers.stream()
		.map(c->String.format("%s : %d%n", c.getName(), c.getPoint()))
		.reduce(report,String::concat);
		return report;
		}

}
