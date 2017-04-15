import java.lang.reflect.Constructor;
import java.util.Arrays;

public abstract class Beverage {
	private String description = "Unknown Beverage";
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	abstract public int cost();
	public static Beverage getInstance(
		Beverage beverage, String... list){
		Arrays.sort(list);
		for(String s: list){
			try{
				Class<? extends CondimentDecorator> c 
				= Class.forName(s).asSubclass(CondimentDecorator.class);
				if(c.getSuperclass()!=CondimentDecorator.class)
					throw new IllegalArgumentException("Must use Coffee Decorator");
				Constructor<? extends CondimentDecorator> constructor 
					= c.getConstructor(Beverage.class);
				
				beverage = (Beverage)constructor.newInstance(beverage); 
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		return beverage;
	}
}
