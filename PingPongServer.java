import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class PingPongServer {
    
    public static void main(String[] args) {
        
        try {
            System.setProperty("java.rmi.server.hostname",
"localhost");
            PingInterfaceImpl obj = new PingInterfaceImpl();

            // Bind this object instance to the name "HelloServer"
            Registry registry = LocateRegistry.getRegistry("localhost");
            registry.rebind("PingPongServer", obj);

            System.out.println("PingPongServer bound in registry");
        } catch (RemoteException e) {
            System.out.println("PingPongServer err: " + e.getMessage());
        }
    }
    
}


            
