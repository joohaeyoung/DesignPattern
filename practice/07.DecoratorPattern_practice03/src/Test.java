
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage = new HouseBlend();

		
		beverage.addCondiment( new Mocha() );
		beverage.addCondiment( new Mocha() );
		beverage.addCondiment( new Whip() );
		
		System.out.printf("%s : %, d��%n", beverage.getDescription(),beverage.cost());
		
		
	
	}
	//�����Ʈ���ڸ������� �Τд� ������ ��Ĵ��Ҿֵ�� ����� �ֵ��� �����ϱ� ���� Ÿ���� �ϳ� ������̴�. 
	//��������� �ƴ��� �����ϱ����ؼ� ������͵��ڷ����͸� �д�. 
	// ������Ͱ� �� �����ؾߵǴ°��� ����ȭ ��Ű�� �ִ�. Ŀ���ʹ� �翬�� ������ ������ ��ũ������ ������ �߰��ؼ� �� �߰��ϴ����� ��ũ���ǿ��� ǥ���Ҽ� �ֵ��� �Ѵ�. 
	// ��ȿ�� 2�� �ϳ��� ����ڸ� �����ϴ� Ÿ�� �� �ϳ��� �� ����ڰ� �ݵ�� ������ �Ұ� ������ �߰��� �߰��Ѵ� .
	
}
