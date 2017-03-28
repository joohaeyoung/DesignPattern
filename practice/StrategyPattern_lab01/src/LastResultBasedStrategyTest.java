import static org.junit.Assert.*;

import org.junit.Test;

public class LastResultBasedStrategyTest {

	@Test
	public void WonTest() {
		Player player = new Player();
		LastResultBasedStrategy strategy 
			= new LastResultBasedStrategy();
		player.setStrategy(strategy);
		
		strategy.setPrevHand(HandType.GAWI);
		strategy.recordHistory(ResultType.WON);
		
		HandType hand = player.nextHand();
		
		assertTrue(hand!=HandType.GAWI);
	}

}
