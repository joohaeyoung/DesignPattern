
public class NewClient implements Observer {
	
	private String Id;
	private int Interval;
	int prevPublish = 0; //이전 통보 시점. 
	
	
	public NewClient(String Id){
		this.Id= Id;
	}
	public void setInterval(int Interval){
		this.Interval = Interval;
	}
	
	public int getInterval(){
		return Interval;
	}
	
	public int getPrevPublish(){
		return prevPublish;
	}
	public void setPrevPublish(int n){
		prevPublish = n;
	}
	public String getId(){
		return Id;
	}
	
	@Override
	public void update(String news) {
		
		System.out.println(news);
		prevPublish ++ ;
	}
}
