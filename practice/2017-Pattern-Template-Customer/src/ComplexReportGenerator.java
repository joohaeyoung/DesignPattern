import java.util.List;

public class ComplexReportGenerator {
	
	public String generate(List<Customer> customers){
		
	int count = 0 ;
	int sum = 0;
	String report="";
	for( Customer c : customers ){
		if(c.getPoint()>=200){
			sum +=c.getPoint();
			++count;
			report += String.format("%d :%s%n", c.getPoint(), c.getName());
		}
	}
	 report = String.format("�� �� : %d��%n",count)+report;
	 report = String.format("�հ� �� : %d��%n",sum);
	 
	 return report;
		
	}
	
	/*
	List<Customer> selected = customers.stream().filter(c->c.getPoint()>=200)
			.collect(Collectors.toList());
	
	String report = String.format("�� �� : %d�� %n", selected.size());
	report =selected.stream()
			.map(c->String.format("%d : %s%n",c.getPoint(),c.getName()))
			.reduce
	*/

}
