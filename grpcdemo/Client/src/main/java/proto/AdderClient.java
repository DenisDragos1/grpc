package proto;

import services.Adder;

import java.rmi.Naming;

public class AdderClient {
    public static void main(String[] args) {
        try {
            // Obținere referință la obiectul remote din RMI Registry
            Adder adder = (Adder) Naming.lookup("rmi://10.53.53.11:1099/AdderService");

            // Definire numere pentru adunare
            int num1 = 5;
            int num2 = 10;

            // Invocare metoda remote pentru adunare
            int result = adder.add(num1, num2);

            // Afișare rezultat
            System.out.println("Rezultat adunare: " + result);
        } catch (Exception e) {
            System.err.println("Eroare la invocarea metodei remote: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
