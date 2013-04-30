import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PongInterface extends Remote{
    public void pong(int num) throws RemoteException;
}
