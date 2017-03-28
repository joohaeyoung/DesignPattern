import java.util.Random;
import java.util.Vector;

public class RandomAndDataStrategy implements PlayingStrategy {

	//���������� 4��°������ �����Լ��� �̿��ؼ� nextHand�� �ϴµ� 5���̻���ʹ� ������� ���帹�̳����� �̱�� ���� ����.
	int count = 0;
	int cBAWI = 0;
	int cBO = 0;
	int cGAWI = 0;
	private Random randomGen = new Random();

	Vector<HandType> prevHand = new Vector<HandType>(5);

	
	//������� �� ���� �����Ѵ�.
	public void setPrevHand(HandType prevHand){
		this.prevHand.add(prevHand);
	}
	
	
	@Override
	public HandType nextHand() {
		count ++;
		
		if(count < 5)//4��° ������ �����Լ��� �̿��Ͽ� �������� ����
			return HandType.valueOf(randomGen.nextInt(3));
		else if(count >=5 ){//5��° ������  ������� ������ ���帹�� �´� ���� �̱�� ���� ����.
			
			for(HandType temp : prevHand){
				
				if(temp == HandType.BAWI){
					cBAWI++;
				}else if(temp == HandType.BO){
					cBO++;
				}else if(temp == HandType.GAWI){
					cGAWI++;
				}
			}
			
			int max = (cBAWI>cBO)?(cBAWI>cGAWI)?cBAWI:cGAWI:(cBO>cGAWI)?cBO:cGAWI;
		
			if( max == cBAWI)
				return HandType.BAWI.winValueOf();
			else if ( max == cBO)
				return HandType.BO.winValueOf();
			else if ( max == cGAWI)
				return HandType.GAWI.winValueOf();
		}
		
		return null;
	}
	
	@Override
	public void recordHistory(ResultType currentResult) {
		// TODO Auto-generated method stub
	}

}
