
public interface Subject { //옵저버를 관리한다. 
	
	public void addObserver(Observer o);
	public void deleteObserver(Observer o);
	public void notifyObservers();

}
