public abstract class ContaBanco implements IContaBanco {
    protected int agencia;
    protected int numeroConta;
    protected double saldoDisponivel;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 0;

    public ContaBanco() {
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
    }

    public void sacar(double valor) {
        this.saldoDisponivel -= valor;
    }

    public void depositar(double valor) {
        this.saldoDisponivel += valor;
    }

    public void transferir(double valor, ContaBanco contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    protected void imprimirDadosComuns(){
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldoDisponivel));
    }

    protected abstract void imprimirExtrato();
}
