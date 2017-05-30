import java.rmi.Naming;


public class MyRemoteClient {
	
	public static void main(String[] args) {
	
		try{
			MyRemote service = (MyRemote)Naming.lookup("rmi://172.18.66.193/RemoteHello");
				//(MyRemote)Naming.lookup("rmi://220.68.82.24/RemoteHello");
			
			String s = service.sayHello();
			System.out.println(s);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
}
