import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PingInterfaceImpl extends UnicastRemoteObject implements PingInterface {

	private PongInterface ref;

	public PingInterfaceImpl() throws RemoteException {
		super();
	}
	
	public void ping(int num) throws RemoteException{
		System.out.println(num);
		try{
			ref.pong(num);			
		} catch(RemoteException ie){
		
		}
	}


    	public void setCallbackInterface(PongInterface ref) throws RemoteException{
		this.ref = ref;
	}
}
