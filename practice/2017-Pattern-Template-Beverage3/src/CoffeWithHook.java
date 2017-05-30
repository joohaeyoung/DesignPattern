import java.util.Scanner;

public class CoffeWithHook extends CaffeineBeverage {

	
	protected void brew(){
		System.out.println("커피를 내림");
	}
	protected void addCondiments(){
		System.out.println("설탕과 밀크 추카");
	}
	
	//hook 메소드를 하나 추가함. 원하면 자식 클래스들이 해당 클래스를 재정의 해서 알고리즘의 동작이 조금 다르게 되도록 만들수 있따. 
	protected boolean customerWantsCondiments(){
		
		Scanner in = new Scanner(System.in);
		System.out.print("밀크와 설탕을 추가하시겠습니까?(y/n)?");
		String answer = in.nextLine().toLowerCase();
		in.close();
		return answer.equals("y");
	}
	
}
