package MeuBanco;

public interface IContaBanco {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, ContaBanco contaDestino);
}
