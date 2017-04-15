
public abstract class Beverage {
	
	
	private String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	abstract public int cost();
	
	Beverage removeCondiment(){ return this; }

}
