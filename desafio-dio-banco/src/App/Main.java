package App;

import java.util.*;
import java.util.regex.Pattern;

import MeuBanco.ContaBanco;
import MeuBanco.ContaCorrente;
import MeuBanco.ContaPoupanca;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static final String nomePadrao = "^[A-Za-z]+([\\s-][A-Za-z]+)*$";
    static final String agenciaPadrao = "\\d{4}$";

    static String bancoEscolhido;

    public static void main(String[] args) throws Exception {
        String opcaoEscolhida;
        int opcaoBanco;

        System.out.println("=== App Banco ===");
        System.out.println("Criar conta no banco? (s/n)");
        opcaoEscolhida = scanner.nextLine();

        if (opcaoEscolhida.equalsIgnoreCase("s")) {
            while (true) {
                try {
                    System.out.println("\n# Escolha o banco:");
                    System.out.println("1 - Santander");
                    System.out.println("2 - Bradesco");
                    System.out.println("3 - Banco do Brasil");
                    System.out.println("4 - Itaú");
                    Thread.sleep(1000);
                    opcaoBanco = scanner.nextInt();
                    scanner.nextLine();

                    if (opcaoBanco < 1) {
                        System.out.println("Escolha uma opção valida: De 1 a 4");
                    } else if (opcaoBanco > 4) {
                        System.out.println("Escolha uma opção valida: De 1 a 4");
                    } else {
                        switch (opcaoBanco) {
                            case 1:
                                bancoEscolhido = "Santander";
                                break;
                            case 2:
                                bancoEscolhido = "Bradesco";
                                break;
                            case 3:
                                bancoEscolhido = "Banco do Brasil";
                                break;
                            case 4:
                                bancoEscolhido = "Itaú";
                                break;
                        }
                        criarConta();
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.err.println("# Escolha 1 para santander, 2 para bradesco e assim continuamente\n");
                    scanner.nextInt();
                }
            }
        }
    }

    static void criarConta() throws Exception {
        String nomeCliente, agencia;
        int tipoConta;
        while (true) {
            System.out.println("Aguarde...");
            Thread.sleep(1000);
            System.out.println("\n=== Criando Conta no Banco: " + bancoEscolhido + " ===");
            do {
                System.out.println("Insira seu nome:");
                nomeCliente = scanner.nextLine();

                if (!Pattern.matches(nomePadrao, nomeCliente)) {
                    System.out.println("# Nome ex.: joao silva");
                }
            } while (!Pattern.matches(nomePadrao, nomeCliente));

            do {
                System.out.println("Informe sua agência:");
                agencia = scanner.nextLine();
                if (!Pattern.matches(agenciaPadrao, agencia)) {
                    System.out.println("# Agência ex.: 1234");
                }
            } while (!Pattern.matches(agenciaPadrao, agencia));

            while (true) {
                try {
                    System.out.println("# Escolha o tipo da sua conta:");
                    System.out.println("1 - Conta corrente");
                    System.out.println("2 - Conta poupança");
                    System.out.println("3 - Ambos");
                    tipoConta = scanner.nextInt();
                    scanner.nextLine();

                    switch (tipoConta) {
                        case 1:
                            ContaBanco contaCorrente = new ContaCorrente(agencia, nomeCliente, tipoConta);
                            System.out.println("Conta corrente criada com sucesso!");
                            contaCorrente.imprimirDadosComuns();
                            System.out.println("Fechando App...");
                            Thread.sleep(1000);
                            return;

                        case 2:
                            ContaBanco contaPoupanca = new ContaPoupanca(agencia, nomeCliente, tipoConta);
                            System.out.println("Conta poupança criada com sucesso!");
                            contaPoupanca.imprimirDadosComuns();
                            System.out.println("Fechando App...");
                            Thread.sleep(1000);
                            return;

                        case 3:
                            ContaBanco contaC = new ContaCorrente(agencia, nomeCliente, tipoConta);
                            System.out.println("Conta corrente criada com sucesso!");
                            contaC.imprimirDadosComuns();

                            ContaBanco contaP = new ContaPoupanca(agencia, nomeCliente, tipoConta);
                            System.out.println("Conta poupança criada com sucesso!");
                            contaP.imprimirDadosComuns();
                            System.out.println("Fechando App...");
                            Thread.sleep(1000);
                            return;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Erro! Digite um número válido");
                }
            }
        }
    }
}
