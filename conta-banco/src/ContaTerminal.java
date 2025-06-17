public class ContaTerminal
{
    private int identificador;
    private String nomeCliente;
    private String agencia;
    private double saldo;


    public ContaTerminal(int identificador, String nomeCliente, String agencia, double saldo)
    {
        this.identificador = identificador;
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public int getIdentificador()
    {
        return identificador;
    }
    public void setIdentificador(int Identificador)
    {
        this.identificador = Identificador;
    }

    public String getNomeCliente()
    {
        return nomeCliente;
    }
    public void setNomeCliente(String NomeCliente)
    {
        this.nomeCliente = NomeCliente;
    }

    public String getAgencia()
    {
        return agencia;
    }
    public void setAgencia(String Agencia)
    {
        this.agencia = Agencia;
    }

    public double getSaldo()
    {
        return saldo;
    }
    public void setSaldo(double Saldo)
    {
        this.saldo = Saldo;
    }

    public void ApresentaCliente()
    {
        System.out.println("Olá "+ getNomeCliente() +", obrigado por criar uma conta em nosso banco, sua agência é "+ getAgencia() +", conta "+ getIdentificador() +" e seu saldo "+ getSaldo() +" já está disponível para saque.");
    }
}