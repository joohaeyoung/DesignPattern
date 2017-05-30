
//�̷��� �Ϲ�ȭ���Ѽ� �ڵ� �ߺ��� ���ش�. 
public abstract class CaffeineBeverage {

	//���ø� �޼ҵ��. ������ �ȵǵ��� final �� ����
	public  final void prepareRecipe(){
		
		boilWater();
		brew();
		pourInCup();
		addCondiments();
		
	}

	//�ΰ��� �޼ҵ�� �ߺ��Ǿ��־ ������ �´�. 
	//�ۿ����� prepareRecipe�� �ʿ��ϴ�. �ֳ׵��� �ʿ������ʴ�.
	//�ֳ׵��� �ؿ��� �������� �ʿ䰡 ����. 
	protected final void boilWater(){ //fina���� ���� �����Ǹ� ���Ѵ�. 
		System.out.println("���� ����");
	}
	protected abstract void brew();
	
	protected final void pourInCup(){
		System.out.println("�ſ� ������");
	}
	protected abstract void addCondiments();
	
}
