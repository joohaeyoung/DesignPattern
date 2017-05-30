//클래스 어댑터! 상속을 이용해야 한다.

public class FullNameAdapter2 extends User implements FullName {

	public FullNameAdapter2(String firstName, String lastName) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getFullName(){
		return getFirstName()+" "+getLastName();
	}

}
