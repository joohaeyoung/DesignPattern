import java.util.Observable;
import java.util.Observer;

public class ITNewsPublisher implements NewsPublisher {
	
	ImprovedObservable observers = new ImprovedObservable();
	
	private String latestFeed;
	
	@Override
	
	public void setNewsFeed(String newsFeed){
		
		this.latestFeed = newsFeed;
		observers.setChanged();
		//pull
		//notifyObservers();
		
		// push
		notifyObservers(latestFeed);
	}

	public String getLatestFeed(){
		return this.latestFeed;
	}
	
	@Override
	public void addObserver(Observer o) {
		observers.addObserver(o);
	}

	@Override
	public void deleteObserver(Observer o) {
		observers.deleteObserver(o);
	}

	@Override
	public void notifyObservers() {//pull
		observers.notifyObservers(this);
	}

	@Override
	public void notifyObservers(Object data) {//push
		observers.notifyObservers(data);
	}
}
