package App;
import java.util.*;

public class Main {
    static Scanner opcaoDigitada = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int opcaoEscolhida;

        while (true) {
            System.out.println("=== App Banco ===");
            System.out.println("1 - Criar conta corrente");
            System.out.println("2 - Criar conta poupança");
            System.out.println("3 - Listar meus cliente");
            System.out.println("4 - Fechar app");
            Thread.sleep(2000);
            System.out.print("Escolha a opção: ");
            opcaoEscolhida = opcaoDigitada.nextInt();
            opcaoDigitada.nextLine(); //Consumir quebra de linha

            switch(opcaoEscolhida)
            {
                case 4:
                    break;
            }
        }
    }

    static void criarConta() throws Exception
    {
        while (true) {
            try {
                System.out.println("=== CRIANDO CONTA ===");
                Thread.sleep(2000);
                System.out.print("Digite o nome do cliente: ");
            } catch (InputMismatchException e) {

            }
        }
    }
}
