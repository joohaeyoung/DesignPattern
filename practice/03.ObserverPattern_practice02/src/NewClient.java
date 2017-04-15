
import java.util.Observable;
import java.util.Observer;

public class NewClient implements Observer {
	
	private String id;
	
	public NewClient(String id){
		this.id = id;
	}
	
	@Override
	public boolean equals(Object o){
		
		
		if(o==null||o.getClass() != getClass()) return false;
		if(o==this) return true;
		NewClient nc = (NewClient)o;
		return id.equals(nc.id);
	}
	
	
	
	@Override

	public void update(Observable subj, Object data) {	
		//pull
		SportsNewsPublisher newsFeed = (SportsNewsPublisher)subj; 
		System.out.printf("货肺款 家侥 : %s\n", newsFeed.getLatestFeed());
	
		//push
		//String latestFeed = (String)data;
		//System.out.printf("货肺款 家侥! %s : %s\n", id, latestFeed);
	}

}
