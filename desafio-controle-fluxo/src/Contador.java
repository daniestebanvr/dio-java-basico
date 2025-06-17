import java.util.*;

public class Contador {

    public static void main(String[] args) throws Exception {
        int[] numero = new int[2];
        Scanner resultado = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Insira o primeiro número");
                numero[0] = resultado.nextInt();

                System.out.println("Insira o segundo número");
                numero[1] = resultado.nextInt();

                if (numero[0] > numero[1]) {
                    System.out.println("O primeiro número deve ser menor que o segundo");
                } else if (numero[0] < 0 || numero[1] < 0) {
                    System.out.println("Os números digitados devem ser inteiros e positivos");
                } else {
                    contar(numero[0], numero[1]);
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input inválido! insira um número");
                resultado.nextLine();
            }
        }

        resultado.close();
    }

    static void contar(int numero1, int numero2) {
        int quantidadeIteracoes = numero2 - numero1;

        System.out.println("Serão exibidos " + quantidadeIteracoes + " números");
        for (int i = 1; i <= quantidadeIteracoes; i++) {
            if (quantidadeIteracoes == 0) {
                System.out.println("Sem iterações");
            } else {

                System.out.println("Imprimndo o número " + i);
            }
        }
    }
}
