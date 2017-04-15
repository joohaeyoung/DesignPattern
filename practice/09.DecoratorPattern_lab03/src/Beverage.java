import java.util.ArrayList;

public abstract class Beverage {
	
	private Beverage beverage;
	
	protected int number = 0;
	int count = 3;
	private String getBeverage = "getBeverage()";
	
	int confirm = 0;
	
	private String description = "UnKnown Beverage";
	
	protected Beverage getBeverage(){
		return beverage;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description ;
	}
	
	abstract public int cost();
	
	public boolean equals(Object o){
		
		ArrayList<String> className = new ArrayList<String>();
		
		className.add( o.getClass().getName() );
		className.add(( (CondimentDecorator) o).getBeverage().getClass().getName() );
		className.add( ( (CondimentDecorator) o).getBeverage().getBeverage().getClass().getName());
		className.add( ( (CondimentDecorator) o).getBeverage().getBeverage().getBeverage().getClass().getName());
		
		
		
		for(int i = 0 ; i < count ; i ++ ){
			
	
			if( this.getClass().getName() == className.get(i) ){
				System.out.println("1");
				System.out.println( this.getClass().getName() +"=="+ className.get(i));
				number++;
				className.remove(i);
			}
			
			if(number == 1 ){
				count --;
				break;
			}
				
				
		}
		
		for(int i = 0 ; i < count ; i ++ ){
			
			if( this.getBeverage().getClass().getName() == className.get(i) ){
				System.out.println("2");
				System.out.println( this.getBeverage().getClass().getName() +"=="+ className.get(i));
				number++;
				className.remove(i);
			}
			
			if(number == 2 )
				break;
				
		}
		
	for(int i = 0 ; i < count ; i ++ ){
			
			if( this.getBeverage().getBeverage().getClass().getName() == className.get(i) ){
				System.out.println("3");
				System.out.println( this.getBeverage().getBeverage().getClass().getName() +"=="+ className.get(i));
				number++;
				className.remove(i);
			
			}
			
			if(number == 3 )
				break;
				
		}
	
	for(int i = 0 ; i < count ; i ++ ){
		
		if( this.getBeverage().getBeverage().getBeverage().getClass().getName() == className.get(i) ){
			System.out.println("4");
			System.out.println( this.getBeverage().getBeverage().getBeverage().getClass().getName() +"=="+ className.get(i));
			number++;
			className.remove(i);
			
		}
		if(number == 4 )
			break;
		
	}
		
		if( number  == 4 ){
			System.out.println("�Ȱ��� ��ǰ�Դϴ� ");
			return true;
		}
			
		else{
			System.out.println("�ٸ���ǰ�Դϴ�");
			return false;

		}
			
	}
	
}
