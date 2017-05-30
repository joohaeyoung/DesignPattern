import java.lang.reflect.Proxy;


public class TestProgram {
	public static PersonBean getOwnerProxy(PersonBean person){
		return (PersonBean)Proxy.newProxyInstance(
				person.getClass().getClassLoader(),
				person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person));
	}
	/*
	public static PersonBean getNonOwnerProxy(PersonBean person){
		return (PersonBean)Proxy.newProxyInstance(
				person.getClass().getClassLoader(),
				person.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(person));
	}
	*/
	public static void main(String[] args) {
		PersonBean sangjin = new PersonBeanImpl();
		PersonBean ownerProxy = getOwnerProxy(sangjin);
		try{
			ownerProxy.setName("�����");
			ownerProxy.setGender(PersonBean.Gender.MALE);
			ownerProxy.setInterest("����");
			//ownerProxy.setHotOrNotRating(10);
		}
		catch(Exception e){
			System.out.println("�ڱ� �ڽ��� ������ ������ �� ����");
		}
		/*
		PersonBean nonOwnerProxy = getNonOwnerProxy(sangjin);
		try{
			nonOwnerProxy.setHotOrNotRating(10);
			nonOwnerProxy.setInterest("����");
		}
		catch(Exception e){
			System.out.println("�ٸ� ����� ���ɻ����� ������ �� ����");
		}
		*/
	}
}
