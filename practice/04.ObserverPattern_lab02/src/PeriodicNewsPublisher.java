import java.util.ArrayList;

public class PeriodicNewsPublisher implements NewsPublisher {
	

	//������ ����.
	private ArrayList<Observer> Observers = new ArrayList<Observer>();
	
	//���ο� �������� ����.
	private ArrayList<String> lastestFeed = new ArrayList<String>();
	
	
	//������ �߻� Ƚ��. 
	private int newsCount = 0;
	
	public int getNewCount(){
		
		return newsCount;
	}
	
	@Override
	public void setNewsFeed(String newsFeed) {
		
		lastestFeed.add(newsFeed);
		newsCount++;//������ �߻��ϸ� Ƚ���� �˷��ش�. 
		notifyObservers();//��ȭ�� �߻��ϸ� �ϴ� notifyObservers()�� �Ѵ�. 
		
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
	public void notifyObservers() {// ��ȭ�� �ϴ� �߻��ϸ� ���������� interval �� Ȯ���Ͽ� �ֱ⿡ �´� �������� �뺸�Ѵ�. 
		

		for( Observer x : Observers ){
			
			if(  newsCount-x.getInterval() == x.getPrevPublish() ){
				System.out.println( x.getId() );
				for(int i = newsCount - x.getInterval()+1 ; i <= newsCount ; i++ )
					x.update( lastestFeed.get(i-1) );
				
			}	
		}
	}
	
}



















