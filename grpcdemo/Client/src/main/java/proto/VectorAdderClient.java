package proto;

import services.VectorAdder;

import java.rmi.Naming;

public class VectorAdderClient {
    public static void main(String[] args) {
        try {
            // Asigurați-vă că utilizați adresa IP corectă
            String serverAddress = "192.168.37.212";

            VectorAdder vectorAdder = (VectorAdder) Naming.lookup("rmi://" + serverAddress + "/VectorAdderService");

            int[] vector = {1, 2, 3, 4};

            int result = vectorAdder.addVector(vector);

            System.out.println("Rezultat adunare vector: " + result);
        } catch (Exception e) {
            System.err.println("Eroare la invocarea metodei remote: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
