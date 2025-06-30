package MeuBanco;

public class ContaCorrente extends ContaBanco{

    //Método construtuor
    public ContaCorrente(String nomeBanco,String nomeCliente, int numeroAgencia) {
        super(nomeBanco, nomeCliente, numeroAgencia);
    }

    public void imprimirExtrato()
    {
        System.out.println("=== Extrato Conta Corrente === ");
        super.imprimirDadosComuns();
    }
}
