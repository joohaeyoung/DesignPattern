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
			ownerProxy.setName("김상진");
			ownerProxy.setGender(PersonBean.Gender.MALE);
			ownerProxy.setInterest("원예");
			//ownerProxy.setHotOrNotRating(10);
		}
		catch(Exception e){
			System.out.println("자기 자신의 평판을 설정할 수 없음");
		}
		/*
		PersonBean nonOwnerProxy = getNonOwnerProxy(sangjin);
		try{
			nonOwnerProxy.setHotOrNotRating(10);
			nonOwnerProxy.setInterest("골프");
		}
		catch(Exception e){
			System.out.println("다른 사람의 관심사항을 변경할 수 없음");
		}
		*/
	}
}
