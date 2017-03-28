import java.util.Observer;

public interface Subject {
	public void addObserver(Observer o);
	public void deleteObserver(Observer o);
	public void notifyObservers();					//pull
	public void notifyObservers(Object data);		//push
}
