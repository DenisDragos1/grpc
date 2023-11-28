package proto;

import services.VectorAdder;
import services.VectorAdderImpl;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class VectorAdderServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            VectorAdder vectorAdder = new VectorAdderImpl();

            // Asigurați-vă că utilizați adresa IP corectă
            String serverAddress = "192.168.37.212";

            Naming.rebind("rmi://" + serverAddress + "/VectorAdderService", vectorAdder);
            System.out.println("Serverul VectorAdder a pornit.");
        } catch (Exception e) {
            System.err.println("Eroare la pornirea serverului: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
