package MeuBanco;

public abstract class ContaBanco implements IContaBanco {
    protected String nomeBanco;
    protected String nomeCliente;
    protected int agencia;
    protected int numeroConta;
    protected double saldoDisponivel;

    private static int SEQUENCIAL = 0;

    //Método construtuor
    public ContaBanco(String nomeBanco, String nomeCliente, int numeroAgencia) {
        this.nomeBanco = nomeBanco;
        this.nomeCliente = nomeCliente;
        this.agencia = numeroAgencia;
        this.numeroConta = SEQUENCIAL++;
    }

    //Métodos
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

    //Encapsulamento

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
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
