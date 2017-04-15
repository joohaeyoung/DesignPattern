
public class Test {

	public static void main(String[] args) {
	
		Player player1 = new Player();
		Player player2 = new Player();
		
		LastResultBasedStrategy resultBased = new LastResultBasedStrategy();
		
		player1.setStrategy(resultBased);
		player2.setStrategy(new RandomStrategy());
		
		for(int i = 0 ; i < 10 ; i++){
			
			HandType hand1 = player1.nextHand();//머 내서 이겼다 졌다.
			HandType hand2 = player2.nextHand();//아무것도 안나옴.
			
			System.out.printf("%s vs %s ", hand1, hand2);
			
			if(hand1 == hand2){//무승부일 경우.
				System.out.println(">결과 : 무승부");
				player1.setResult(ResultType.DRAWN);
				player2.setResult(ResultType.DRAWN);
				resultBased.recordHistory(ResultType.DRAWN);
				
			}
			else if(hand2.winValueOf() == hand1 ){//hand1이 이겼을 경우.
				System.out.println(">결과: user1 승리");
				player1.setResult(ResultType.WON);
				player2.setResult(ResultType.LOST);
				resultBased.recordHistory(ResultType.WON);
				
			}
			else{//hand1이 이겼을 경우.
				System.out.println(">결과: user2 승리");
				player1.setResult(ResultType.LOST);
				player2.setResult(ResultType.WON);
				resultBased.recordHistory(ResultType.LOST);
				
			}
			resultBased.setPrevHand(hand1);
		}	
	}
}
