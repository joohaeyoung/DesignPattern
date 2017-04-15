
public abstract class Beverage {
	
	
	private String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	abstract public int cost();

	
	public boolean equals(Object o){
		
		
		if(o==null||o.getClass() != getClass()) return false;
		if(o==this) return true;
		return false;
		
	
	}
	
	

}
