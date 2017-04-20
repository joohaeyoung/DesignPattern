import java.util.Observer;


//subject Ŭ������ �� ���� �ұ�? 
//����Ŭ������ �̹� �ٸ� Ŭ������ Ȯ���ϰ� �ִٸ� �� Ŭ������ Observable�� �ɼ� ���⶧����. �� ������ �ذ��ϱ����� subject Ŭ������ ����. 

public interface Subject {
	public void addObserver(Observer o);
	public void deleteObserver(Observer o);
	public void notifyObservers();					//pull
	public void notifyObservers(Object data);		//push
}
