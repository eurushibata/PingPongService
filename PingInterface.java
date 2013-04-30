import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PingInterface extends Remote{
    public void ping(int num) throws RemoteException;
    public void setCallbackInterface(PongInterface ref) throws RemoteException;
}
