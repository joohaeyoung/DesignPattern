import java.util.ArrayList;
import java.util.Comparator;

public class Beverage {
	
	private String description = "UnKnown Beverage";
	
	ArrayList<Condiment> condiments = new ArrayList<>();
	
	public void addCondiment(Condiment condiment){
		
		this.condiments.add(condiment);
		
	}
	
	public  String getDescription(){
		
		
		condiments.sort(Comparator.comparing(Condiment::getDescription));
		String output = "";
		for(Condiment c : condiments)
			output += c.getDescription()+",";
		
		output = output.substring(0, output.length()-2);
		return description+","+output;
		
		
		/*
		String output = condiments.stream().sorted(Comparator.comparing(Condiment::getDescription))
				.map(c->c.getDescription())
				.collect(Collectors.joining(","));
		*/
		
	}
	public void setDescription(String description){
		this.description = description;
	}
	
	public int cost(){
		int sum = 0;
		
		for( Condiment c : condiments )
			sum +=c.cost();
		
		return sum;

	}
	/*
	public int cost(){
	
		return condiments.stream().map(c->c.cost()).reduce(0,Integer::sum);

	}
	*/
}
