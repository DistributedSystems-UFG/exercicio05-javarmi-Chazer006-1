package example.hello;

import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        String host = (args.length < 1) ? "localhost" : args[0];
        
        try {
            System.out.println("--- Testando Servidor Hello ---");
            Hello stubHello = (Hello) Naming.lookup("rmi://" + host + "/MyHello"); 
            
            System.out.println("Soma (10+5): " + stubHello.soma(10, 5));
            System.out.println("Subtração (20-8): " + stubHello.subtrai(20, 8));
            System.out.println("Maiúsculo: " + stubHello.paraMaiusculo("java rmi funcional"));

            System.out.println("\n--- Testando Novo Servidor Conversor ---");
            Conversor stubConv = (Conversor) Naming.lookup("rmi://" + host + "/MeuConversor");
            
            double valorDolar = 50.0;
            System.out.println("Valor em Dólar: $" + valorDolar);
            System.out.println("Conversão para Real: R$ " + stubConv.dolarParaReal(valorDolar));

        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
