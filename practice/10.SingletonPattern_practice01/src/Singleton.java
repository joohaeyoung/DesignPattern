class A implements Cloneable{
	
	@Override
	public A clone() throws CloneNotSupportedException{
		return (A)super.clone();
	}
}

public class Singleton extends A{
	
	private static Singleton unique = null;//static 메소드에서 활용되기 때문에 꼭  static으로 나타내야 한다. 
	
	private Singleton(){}//싱글톤 생성자는 private 으로 만든다. 외부에서  Singleton을 생성 하지 못하게 한다.
	
	public static Singleton getInstance(){
		
		if(unique == null ) 
			unique = new Singleton();
		
		return unique;
	}
	
	@Override
	public Singleton clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
			
	}
	
	
}


