
import java.util.Observable;
import java.util.Observer;

public class NewClient implements Observer {
	
	private String id;
	
	public NewClient(String id){
		this.id = id;
	}
	
	
	//이유 설명.  -교수님께 다시 무러본다. 
	@Override
	public boolean equals(Object o){
		
		if(o==null||o.getClass() != getClass()) 
			return false;
		
		if(o==this) 
			return true;
		
		NewClient nc = (NewClient)o;
		return id.equals(nc.id);
		
	}
	
	
	@Override
	public void update(Observable subj, Object data) {	
		//pull
		SportsNewsPublisher newsFeed = (SportsNewsPublisher)subj; 
		System.out.printf("새로운 소식 : %s\n", newsFeed.getLatestFeed());
	
		//push
		//String latestFeed = (String)data;
		//System.out.printf("새로운 소식! %s : %s\n", id, latestFeed);
	}
}
