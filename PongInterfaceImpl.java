import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PongInterfaceImpl extends UnicastRemoteObject implements PongInterface {

	private PingInterface ref;

	public PongInterfaceImpl() throws RemoteException {
		super();
	}
	
	public void pong(int num) throws RemoteException{
		System.out.println(num);
	}
}
