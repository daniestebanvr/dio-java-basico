package MeuBanco;

public class ContaPoupanca extends ContaBanco {

    // Método construtuor
    public ContaPoupanca(String nomeBanco,String nomeCliente, int numeroAgencia) {
        super(nomeBanco, nomeCliente, numeroAgencia);
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança === ");
        super.imprimirDadosComuns();
    }
}
