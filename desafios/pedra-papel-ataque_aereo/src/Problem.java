import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String jog1 = sc.nextLine().trim().toLowerCase();
            String jog2 = sc.nextLine().trim().toLowerCase();

            if (jog1.equals("ataque") && jog2.equals("ataque")) {
                System.out.println("Aniquilacao mutua");
            } else if (jog1.equals("papel") && jog2.equals("papel")) {
                System.out.println("Ambos venceram");
            } else if (jog1.equals("pedra") && jog2.equals("pedra")) {
                System.out.println("Sem ganhador");
            } else if (jog1.equals("ataque")) {
                System.out.println("Jogador 1 venceu");
            } else if (jog2.equals("ataque")) {
                System.out.println("Jogador 2 venceu");
            } else if (jog1.equals("pedra") && jog2.equals("papel")) {
                System.out.println("Jogador 1 venceu");
            } else if (jog1.equals("papel") && jog2.equals("pedra")) {
                System.out.println("Jogador 2 venceu");
            }
        }

        sc.close();
    }
}
