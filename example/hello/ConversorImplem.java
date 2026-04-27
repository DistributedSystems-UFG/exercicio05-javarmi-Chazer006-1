package example.hello;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class ConversorImplem extends UnicastRemoteObject implements Conversor {

    public ConversorImplem(int port) throws RemoteException {
        super(port);
    }

    @Override
    public double dolarParaReal(double valorDolar) throws RemoteException {
        // Cotação fictícia de 5.0
        return valorDolar * 5.0;
    }
}