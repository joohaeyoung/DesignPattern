import java.util.List;

public abstract class ReportGenerator {
	
	protected List<Customer> selected = null;
	
	public String generate(List<Customer> customers){
		
		 selected = select(customers);
		
		return generateHeader()+
				 generateMain()+
				 generateFooter();
	}
	
	protected List<Customer> select( List<Customer> customers){
		return customers;
	}
	
	protected String generateHeader( ){
		return String.format("°í°´ ¼ö  : %d¸í %n", selected.size());
		
	}
	
	protected abstract String generateMain();
	
	
	protected String generateFooter(){
		return "";
	}

}
