import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class PingPongClient {
    
    public static void main(String[] args) {
   	
        PingInterface pingObj = null; 

        try { 

	    Registry registry = LocateRegistry.getRegistry("localhost");

	    // Lookup object reference associated to the name "PingPongServer"
            pingObj = (PingInterface)registry.lookup("PingPongServer"); 

            PongInterfaceImpl pongObj = new PongInterfaceImpl();
	    pingObj.setCallbackInterface(pongObj);

            for(int i=0; i<3; i++) {
	    	pingObj.ping(i);
	    }
        } catch (Exception e) { 
            System.out.println("PingPongClient exception: " + e.getMessage()); 
            e.printStackTrace(); 
        }        
    }
}
