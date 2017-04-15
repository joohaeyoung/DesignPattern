
public class Test {

	public static void main(String[] args) {
	
		Player player1 = new Player();
		Player player2 = new Player();
		
		RandomAndDataStrategy randomAndDataBased = new RandomAndDataStrategy();//���ο� ����
		
		player1.setStrategy(randomAndDataBased);
		player2.setStrategy(new RandomStrategy());
		
		for(int i = 0 ; i < 10 ; i++){
			
			HandType hand1 = player1.nextHand();
			HandType hand2 = player2.nextHand();
			
			System.out.printf("%s vs %s ", hand1, hand2);
			
			if(hand1 == hand2){//���º��� ���.
				System.out.println(">��� : ���º�");
				player1.setResult(ResultType.DRAWN);
				player2.setResult(ResultType.DRAWN);
				
			}
			else if(hand2.winValueOf() == hand1 ){//hand1�� �̰��� ���.
				System.out.println(">���: user1 �¸�");
				player1.setResult(ResultType.WON);
				player2.setResult(ResultType.LOST);
				
				
			}
			else{//hand1�� �̰��� ���.
				System.out.println(">���: user2 �¸�");
				player1.setResult(ResultType.LOST);
				player2.setResult(ResultType.WON);
				
				
			}
			randomAndDataBased.setPrevHand(hand1);//�� �� �� ���� �Ѵ�. 
		}	
		System.out.println("���������� ����");
	}
}
