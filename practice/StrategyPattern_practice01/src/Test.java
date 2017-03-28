
public class Test {

	public static void main(String[] args) {
	
		Player player1 = new Player();
		Player player2 = new Player();
		
		RandomAndDataStrategy randomAndDataBased = new RandomAndDataStrategy();//새로운 전략
		
		player1.setStrategy(randomAndDataBased);
		player2.setStrategy(new RandomStrategy());
		
		for(int i = 0 ; i < 10 ; i++){
			
			HandType hand1 = player1.nextHand();
			HandType hand2 = player2.nextHand();
			
			System.out.printf("%s vs %s ", hand1, hand2);
			
			if(hand1 == hand2){//무승부일 경우.
				System.out.println(">결과 : 무승부");
				player1.setResult(ResultType.DRAWN);
				player2.setResult(ResultType.DRAWN);
				
			}
			else if(hand2.winValueOf() == hand1 ){//hand1이 이겼을 경우.
				System.out.println(">결과: user1 승리");
				player1.setResult(ResultType.WON);
				player2.setResult(ResultType.LOST);
				
				
			}
			else{//hand1이 이겼을 경우.
				System.out.println(">결과: user2 승리");
				player1.setResult(ResultType.LOST);
				player2.setResult(ResultType.WON);
				
				
			}
			randomAndDataBased.setPrevHand(hand1);//낸 손 을 저장 한다. 
		}	
		System.out.println("가위바위보 종료");
	}
}
