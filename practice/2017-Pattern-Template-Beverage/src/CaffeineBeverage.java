
//�̷��� �Ϲ�ȭ���Ѽ� �ڵ� �ߺ��� ���ش�. 
public abstract class CaffeineBeverage {

	public abstract void prepareRecipe();
	
	//�ΰ��� �޼ҵ�� �ߺ��Ǿ��־ ������ �´�. 
	//�ۿ����� prepareRecipe�� �ʿ��ϴ�. �ֳ׵��� �ʿ������ʴ�.
	//�ֳ׵��� �ؿ��� �������� �ʿ䰡 ����. 
	protected final void boilWater(){ //fina���� ���� �����Ǹ� ���Ѵ�. 
		System.out.println("���� ����");
	}
	protected final void pourInCup(){
		System.out.println("�ſ� ������");
	}

}
