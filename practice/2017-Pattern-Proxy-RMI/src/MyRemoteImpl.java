import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	public MyRemoteImpl() throws RemoteException {}

	@Override
	public String sayHello() throws RemoteException {
		return "���ݿ��� ���޵Ǵ� ȲȦ�� ���ڿ�!!!";
	}
}
