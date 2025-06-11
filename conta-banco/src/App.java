import java.util.Scanner;
import java.util.regex.*;

public class App {
    public static void main(String[] args) throws Exception {
        int identificador;
        String nomeCliente, agencia;
        double saldo;
        Scanner retorno = new Scanner(System.in);

        System.err.println("== Criando conta bancária ==");
        System.err.println("Nome do Cliente:");
        nomeCliente = retorno.nextLine().toUpperCase();
        System.err.println("Identificador:");
        identificador = retorno.nextInt();
        retorno.nextLine();
        System.err.println("Agencia:");
        agencia = retorno.nextLine();
        System.err.println("Saldo:");
        saldo = retorno.nextDouble();
        ContaTerminal cliente = new ContaTerminal(identificador, nomeCliente, agencia, saldo);
        cliente.ApresentaCliente();
    }
}
