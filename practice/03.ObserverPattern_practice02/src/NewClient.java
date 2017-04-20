
import java.util.Observable;
import java.util.Observer;

public class NewClient implements Observer {
	
	private String id;
	
	public NewClient(String id){
		this.id = id;
	}
	
	
	//���� ����.  -�����Բ� �ٽ� ��������. 
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
		System.out.printf("���ο� �ҽ� : %s\n", newsFeed.getLatestFeed());
	
		//push
		//String latestFeed = (String)data;
		//System.out.printf("���ο� �ҽ�! %s : %s\n", id, latestFeed);
	}
}
