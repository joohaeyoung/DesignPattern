import java.util.Scanner;

public class CoffeWithHook extends CaffeineBeverage {

	
	protected void brew(){
		System.out.println("Ŀ�Ǹ� ����");
	}
	protected void addCondiments(){
		System.out.println("������ ��ũ ��ī");
	}
	
	//hook �޼ҵ带 �ϳ� �߰���. ���ϸ� �ڽ� Ŭ�������� �ش� Ŭ������ ������ �ؼ� �˰����� ������ ���� �ٸ��� �ǵ��� ����� �ֵ�. 
	protected boolean customerWantsCondiments(){
		
		Scanner in = new Scanner(System.in);
		System.out.print("��ũ�� ������ �߰��Ͻðڽ��ϱ�?(y/n)?");
		String answer = in.nextLine().toLowerCase();
		in.close();
		return answer.equals("y");
	}
	
}
