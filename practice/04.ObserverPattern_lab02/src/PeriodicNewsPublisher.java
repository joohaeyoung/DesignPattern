import java.util.ArrayList;

public class PeriodicNewsPublisher implements NewsPublisher {
	

	//옵저버 관리.
	private ArrayList<Observer> Observers = new ArrayList<Observer>();
	
	//새로운 뉴스정보 관리.
	private ArrayList<String> lastestFeed = new ArrayList<String>();
	
	
	//새뉴스 발생 횟수. 
	private int newsCount = 0;
	
	public int getNewCount(){
		
		return newsCount;
	}
	
	@Override
	public void setNewsFeed(String newsFeed) {
		
		lastestFeed.add(newsFeed);
		newsCount++;//새뉴스 발생하면 횟수를 알려준다. 
		notifyObservers();//변화가 발생하면 일단 notifyObservers()를 한다. 
		
	}
	
	@Override
	public void addObserver(Observer o) {
		Observers.add(o);			
	}
	
	@Override
	public void deleteObserver(Observer o) {
		Observers.remove(o);
	}
	
	
	@Override
	public void notifyObservers() {// 변화가 일단 발생하면 옵저버들의 interval 을 확인하여 주기에 맞는 옵저버에 통보한다. 
		

		for( Observer x : Observers ){
			
			if(  newsCount-x.getInterval() == x.getPrevPublish() ){
				System.out.println( x.getId() );
				for(int i = newsCount - x.getInterval()+1 ; i <= newsCount ; i++ )
					x.update( lastestFeed.get(i-1) );
				
			}	
		}
	}
	
}



















