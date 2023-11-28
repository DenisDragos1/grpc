package proto;

import services.Adder;

import java.rmi.Naming;

public class AdderClient {
    public static void main(String[] args) {
        try {
            // Specificați adresa IP și portul
            String ipAddress = "10.53.53.11";
            int port = 1099;

            // Obțineți referința la obiectul remote din RMI Registry
            Adder adder = (Adder) Naming.lookup("rmi://" + ipAddress + ":" + port + "/AdderService");

            // Restul codului clientului rămâne neschimbat
            int result = adder.add(5, 10);
            System.out.println("Rezultat adunare: " + result);
        } catch (Exception e) {
            System.err.println("Eroare la invocarea metodei remote: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

