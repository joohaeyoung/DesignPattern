
public class Test {
	
	public static void main(String[] args ){
		
		FullName name1 = new FullNameAdapter1( new User("김","상진") );
		FullName name2 = new FullNameAdapter2("김","상진" );
		
		System.out.println(name1.getFullName());
		System.out.println(name2.getFullName());
	}


}
//객체어댑터는 객체는 항상 2개다. 
