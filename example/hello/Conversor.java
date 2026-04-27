package example.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Conversor extends Remote {
    double dolarParaReal(double valorDolar) throws RemoteException;
}