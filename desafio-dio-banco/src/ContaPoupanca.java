public class ContaPoupanca extends ContaBanco {
    public void imprimirExtrato()
    {
        System.out.println("=== Extrato Conta Poupança === ");
        super.imprimirDadosComuns();
    }
}
