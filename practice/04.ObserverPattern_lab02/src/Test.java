
public class Test {

	public static void main(String[] args) {
		
		
		PeriodicNewsPublisher newsServer = new PeriodicNewsPublisher();
		NewClient client1 = new NewClient("haeyoung");
		NewClient client2 = new NewClient("wonjun");
		NewClient client3 = new NewClient("namhyung");
		
		newsServer.addObserver(client1);
		newsServer.addObserver(client2);
		newsServer.addObserver(client3);
		
		client1.setInterval(1);
		client2.setInterval(2);
		client3.setInterval(3);
		
		newsServer.setNewsFeed("리버풀 1: 맨유 :0 ");
		newsServer.setNewsFeed("리버풀 2: 맨유 :0 ");
		newsServer.setNewsFeed("리버풀 3: 맨유 :0 ");
		
		newsServer.deleteObserver(client1);
		System.out.println("-----------");
		newsServer.setNewsFeed("리버풀 4: 맨유 :0 ");
		newsServer.setNewsFeed("리버풀 5: 맨유 :0 ");
		newsServer.setNewsFeed("루니퇴장");
		
		NewClient client4 = new NewClient("wngodyddlek");
		newsServer.addObserver(client4);
		client4.setInterval(1);
		
		client4.setPrevPublish(newsServer.getNewCount());
		
		System.out.println("-----------");
		newsServer.setNewsFeed("홍연퇴장");
		newsServer.setNewsFeed("성현퇴장");
		newsServer.setNewsFeed("성현퇴장");
		newsServer.setNewsFeed("성현퇴장");
		
	}

}
