
public abstract class Beverage {
	
	private String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	abstract public int cost();
	
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	Beverage removeCondiment(){ return this; }

}
