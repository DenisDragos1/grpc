package proto;

import services.Adder;
import services.AdderImpl;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class AdderServer {
    public static void main(String[] args) {
        try {
            // Creare și pornire registrul RMI pe portul 1099
            LocateRegistry.createRegistry(1099);

            // Creare obiect de implementare și înregistrare în RMI Registry
            Adder adder = new AdderImpl();
            Naming.rebind("AdderService", adder);

            System.out.println("Serverul Adder a pornit.");
        } catch (Exception e) {
            System.err.println("Eroare la pornirea serverului: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
