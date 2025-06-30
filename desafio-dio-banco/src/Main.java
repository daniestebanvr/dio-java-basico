public class Main {
    public static void main(String[] args) throws Exception {
        ContaBanco contaCorrente = new ContaCorrente();
        ContaBanco contaPoupanca= new ContaPoupanca();

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
