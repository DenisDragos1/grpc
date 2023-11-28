package services;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface VectorAdder extends Remote {
    int addVector(int[] vector) throws RemoteException;
}
