
public class Test {
	
	public static void main(String[] args ){
		
		FullName name1 = new FullNameAdapter1( new User("��","����") );
		FullName name2 = new FullNameAdapter2("��","����" );
		
		System.out.println(name1.getFullName());
		System.out.println(name2.getFullName());
	}


}
//��ü����ʹ� ��ü�� �׻� 2����. 
