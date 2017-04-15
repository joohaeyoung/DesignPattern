
public class Player {//���������� ���ӿ��� �� ����� �Ǵ� ��ǻ�� ������ �����ϴ� Ŭ�����̴�.������ �ܼ�ȭ�� ���� ��� ���� ������ ����ڿ� ��ǻ�͸� �𵨸� ���� �ʴ´�.
	//has-a ���踦 ��Ÿ����. 
	private int[] resultCount = new int[3]; //�̱�Ƚ��,�� Ƚ��, ��� Ƚ�� �� �����Ѵ�.
	
	private PlayingStrategy strategy;
	
	public void setStrategy(PlayingStrategy strategy) {
		this.strategy = strategy;
	}
	public HandType nextHand(){
		return strategy.nextHand();//�ش������� �ش��ϴ� �ؽ�Ʈ �ڵ�.
	}
	
	private int getGameCount(){// �� ���� Ƚ���� �����Ѵ�
		
		int sum = 0;
		for(int i: resultCount) sum += i;
		return sum;
	
	}
	
	public void setResult(ResultType currentResult){
		++resultCount[currentResult.ordinal()];
	}
	
	@Override
	public String toString(){//���� ���� ���¸� �����ش�.
		return String.format("���Ӽ�: %d, ��: %d, ��: %d", 
			getGameCount(), resultCount[0], resultCount[1]);
	}
	
}
