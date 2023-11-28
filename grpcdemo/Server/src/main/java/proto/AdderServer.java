package proto;
import services.Adder;
import services.AdderImpl;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class AdderServer {
    public static void main(String[] args) {
        try {
            // Specificați adresa IP și portul
            String ipAddress = "10.53.53.11";
            int port = 1099;

            // Creați un registrul RMI pe adresa IP și portul specificate
            LocateRegistry.createRegistry(port);

            // Creați obiectul de implementare
            Adder adder = new AdderImpl();

            // Înregistrați obiectul în registrul RMI sub numele "AdderService"
            Naming.rebind("rmi://" + ipAddress + ":" + port + "/AdderService", adder);

            System.out.println("Serverul Adder a pornit la adresa " + ipAddress + " și portul " + port);
        } catch (Exception e) {
            System.err.println("Eroare la pornirea serverului: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
