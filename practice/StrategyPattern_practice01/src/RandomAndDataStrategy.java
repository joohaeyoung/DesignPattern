import java.util.Random;
import java.util.Vector;

public class RandomAndDataStrategy implements PlayingStrategy {

	//가위바위보 4번째까지는 랜덤함수를 이용해서 nextHand를 하는데 5번이상부터는 상대편이 가장많이낸것을 이기는 것을 낸다.
	int count = 0;
	int cBAWI = 0;
	int cBO = 0;
	int cGAWI = 0;
	private Random randomGen = new Random();

	Vector<HandType> prevHand = new Vector<HandType>(5);

	
	//상대편이 낸 손을 저장한다.
	public void setPrevHand(HandType prevHand){
		this.prevHand.add(prevHand);
	}
	
	
	@Override
	public HandType nextHand() {
		count ++;
		
		if(count < 5)//4번째 까지는 랜덤함수를 이용하여 다음손을 낸다
			return HandType.valueOf(randomGen.nextInt(3));
		else if(count >=5 ){//5번째 까지는  상대편의 이전에 가장많이 냈던 손을 이기는 손을 낸다.
			
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
