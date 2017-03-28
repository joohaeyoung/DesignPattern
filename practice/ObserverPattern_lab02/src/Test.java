
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
		
		newsServer.setNewsFeed("����Ǯ 1: ���� :0 ");
		newsServer.setNewsFeed("����Ǯ 2: ���� :0 ");
		newsServer.setNewsFeed("����Ǯ 3: ���� :0 ");
		
		newsServer.deleteObserver(client1);
		System.out.println("-----------");
		newsServer.setNewsFeed("����Ǯ 4: ���� :0 ");
		newsServer.setNewsFeed("����Ǯ 5: ���� :0 ");
		newsServer.setNewsFeed("�������");
		
		NewClient client4 = new NewClient("wngodyddlek");
		newsServer.addObserver(client4);
		client4.setInterval(1);
		
		client4.setPrevPublish(newsServer.getNewCount());
		
		System.out.println("-----------");
		newsServer.setNewsFeed("ȫ������");
		newsServer.setNewsFeed("��������");
		newsServer.setNewsFeed("��������");
		newsServer.setNewsFeed("��������");
		
	}

}
