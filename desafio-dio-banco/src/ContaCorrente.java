public class ContaCorrente extends ContaBanco{
    public void imprimirExtrato()
    {
        System.out.println("=== Extrato Conta Corrente === ");
        super.imprimirDadosComuns();
    }
}
