import java.util.Observer;

public class TestProgram {

	public static void main(String[] args) {
		/* �ǽ� 1���� - push ��� */
//		NewsPublisher newsServer = new SportsNewsPublisher(); 
//		NewClient client1 = new NewClient("kic"); 
//		NewClient client2 = new NewClient("cik"); 
//		newsServer.addObserver(client1); 
//		newsServer.addObserver(client2); 
//		newsServer.setNewsFeed("����Ǯ 1: ���� 0"); 
//		newsServer.setNewsFeed("����Ǯ 2: ���� 0"); 
//		newsServer.deleteObserver(client2); 
//		newsServer.setNewsFeed("����Ǯ 2: ���� 1");
		
		/* �ǽ� 2-2���� - push ��� */
//		NewsPublisher newsServer = new ITNewsPublisher(); 
//		NewClient client1 = new NewClient("kic"); 
//		NewClient client2 = new NewClient("cik"); 
//		newsServer.addObserver(client1); 
//		newsServer.addObserver(client2); 
//		newsServer.setNewsFeed("����Ǯ 1: ���� 0"); 
//		newsServer.setNewsFeed("����Ǯ 2: ���� 0"); 
//		newsServer.deleteObserver(client2); 
//		newsServer.setNewsFeed("����Ǯ 2: ���� 1");		
		
		/* �ǽ� 2-3 - pull ���*/
		SportsNewsPublisher publish = new SportsNewsPublisher();
		Observer o = new NewClient("kic");
		publish.addObserver(o); 
		publish.setNewsFeed("����Ǯ 1: ���� 0"); 
	}

}
