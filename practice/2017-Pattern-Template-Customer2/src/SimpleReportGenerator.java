import java.util.List;

public class SimpleReportGenerator extends ReportGenerator{
	
	@Override
	public String generateMain(){
		String report ="";
		report = selected.stream().map(c->String.format("%s : %d%n", c.getName(),c.getPoint()))
				.reduce(report, String::concat);
		return report;
	}
}
