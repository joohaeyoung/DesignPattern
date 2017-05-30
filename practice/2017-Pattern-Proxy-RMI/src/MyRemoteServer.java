import java.rmi.Naming;


public class MyRemoteServer {
	
	public static void main(String[] args) {
		try{
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("RemoteHello", service);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
