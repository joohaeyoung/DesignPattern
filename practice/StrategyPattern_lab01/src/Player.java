
public class Player {//가위바위보 게임에서 각 사용자 또는 컴퓨터 역할을 수행하는 클래스이다.설계의 단순화를 위해 상속 계층 구조로 사용자와 컴퓨터를 모델링 하지 않는다.
	//has-a 관계를 나타낸다. 
	private int[] resultCount = new int[3]; //이긴횟수,진 횟수, 비긴 횟수 를 저장한다.
	
	private PlayingStrategy strategy;
	
	public void setStrategy(PlayingStrategy strategy) {
		this.strategy = strategy;
	}
	public HandType nextHand(){
		return strategy.nextHand();//해당전략에 해당하는 넥스트 핸드.
	}
	
	private int getGameCount(){// 총 게임 횟수를 저장한다
		
		int sum = 0;
		for(int i: resultCount) sum += i;
		return sum;
	
	}
	
	public void setResult(ResultType currentResult){
		++resultCount[currentResult.ordinal()];
	}
	
	@Override
	public String toString(){//현재 게임 상태를 보여준다.
		return String.format("게임수: %d, 승: %d, 패: %d", 
			getGameCount(), resultCount[0], resultCount[1]);
	}
	
}
