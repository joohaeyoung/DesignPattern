
public interface Subject { //�������� �����Ѵ�. 
	
	public void addObserver(Observer o);
	public void deleteObserver(Observer o);
	public void notifyObservers();

}
