import java.util.Observer;

public class TestProgram {

	public static void main(String[] args) {
		/* 실습 1까지 - push 방식 */
//		NewsPublisher newsServer = new SportsNewsPublisher(); 
//		NewClient client1 = new NewClient("kic"); 
//		NewClient client2 = new NewClient("cik"); 
//		newsServer.addObserver(client1); 
//		newsServer.addObserver(client2); 
//		newsServer.setNewsFeed("리버풀 1: 맨유 0"); 
//		newsServer.setNewsFeed("리버풀 2: 맨유 0"); 
//		newsServer.deleteObserver(client2); 
//		newsServer.setNewsFeed("리버풀 2: 맨유 1");
		
		/* 실습 2-2까지 - push 방식 */
//		NewsPublisher newsServer = new ITNewsPublisher(); 
//		NewClient client1 = new NewClient("kic"); 
//		NewClient client2 = new NewClient("cik"); 
//		newsServer.addObserver(client1); 
//		newsServer.addObserver(client2); 
//		newsServer.setNewsFeed("리버풀 1: 맨유 0"); 
//		newsServer.setNewsFeed("리버풀 2: 맨유 0"); 
//		newsServer.deleteObserver(client2); 
//		newsServer.setNewsFeed("리버풀 2: 맨유 1");		
		
		/* 실습 2-3 - pull 방식*/
		SportsNewsPublisher publish = new SportsNewsPublisher();
		Observer o = new NewClient("kic");
		publish.addObserver(o); 
		publish.setNewsFeed("리버풀 1: 맨유 0"); 
	}

}
