import java.util.Observer;


//subject 클래스를 왜 정의 할까? 
//수퍼클래스가 이미 다른 클래스를 확장하고 있다면 이 클래스는 Observable이 될수 없기때문에. 이 문제를 해겨하기위해 subject 클래스를 쓴다. 

public interface Subject {
	public void addObserver(Observer o);
	public void deleteObserver(Observer o);
	public void notifyObservers();					//pull
	public void notifyObservers(Object data);		//push
}
