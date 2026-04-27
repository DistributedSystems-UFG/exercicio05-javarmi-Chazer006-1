package example.hello;

import java.rmi.Naming;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Server {

    public static void main(String args[]) {
        try {
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            
            HelloImplem objHello = new HelloImplem(5678);
            Naming.rebind("MyHello", objHello);

            ConversorImplem objConv = new ConversorImplem(5679);
            Naming.rebind("MeuConversor", objConv);

            System.err.println("Servidores prontos: 'MyHello' e 'MeuConversor'");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
