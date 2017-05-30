
public class ComplexReportGenerator extends ReportGenerator {
	
	public String generateHeader(){
		return String.format("고객 수 : %d명\n", selected.stream().filter(c->c.getPoint()>=200).count());
		
	}
	
	@Override
	public String generateMain(){
		String report = "";
		report = selected.stream()
				.filter(c->c.getPoint()>=200)
				.map(c->String.format("%d  : %s\n", c.getPoint(), c.getName()))
				.reduce(report, String::concat);
		report += String.format("합계: %d", selected.stream()
				.filter(c->c.getPoint()>=200)
				.map(c->c.getPoint()).reduce(0, Integer::sum));
		return report;		
	}
	

}
