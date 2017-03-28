import java.util.Random;

public class LastResultBasedStrategy implements PlayingStrategy {
	
	private Random randomGen = new Random();
	private HandType prevHand = HandType.valueOf( randomGen.nextInt(3) );
	private ResultType prevResult = ResultType.valueOf( randomGen.nextInt(3));
	
	public void setPrevHand(HandType prevHand){
		this.prevHand = prevHand;
	}
	@Override
	public void recordHistory(ResultType currentResult){
		this.prevResult= currentResult;
	}
	
	@Override
	public HandType nextHand(){
		
		switch(prevResult){
		case WON:{
		
			return HandType.valueOf( ( prevHand.ordinal() + randomGen.nextInt(2)+1)%3 );
		}
		case DRAWN:{
			
			return HandType.valueOf( (prevHand.winValueOf().ordinal() + randomGen.nextInt(2)+1)%3);
			
		}
		case LOST:{
			
			return prevHand.winValueOf().winValueOf();
		}
	}
		return null;
	}

}
