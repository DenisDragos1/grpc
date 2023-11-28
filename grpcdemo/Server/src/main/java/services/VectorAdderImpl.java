package services;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class VectorAdderImpl extends UnicastRemoteObject implements VectorAdder {
    public VectorAdderImpl() throws RemoteException {
        super();
    }

    @Override
    public int addVector(int[] vector) throws RemoteException {
        int sum = 0;
        for (int num : vector) {
            sum += num;
        }
        return sum;
    }
}
