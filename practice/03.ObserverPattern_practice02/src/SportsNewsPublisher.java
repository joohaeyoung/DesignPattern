import java.util.Observable;

public class SportsNewsPublisher extends Observable implements NewsPublisher {
	
	private String latestFeed;
	
	
	@Override	
	public void setNewsFeed(String newsFeed){
		latestFeed = newsFeed;
		setChanged();
	
		notifyObservers(this);			// pull
		//notifyObservers(newsFeed);	// push	
	}

	public String getLatestFeed(){
		return latestFeed;
	}
}
