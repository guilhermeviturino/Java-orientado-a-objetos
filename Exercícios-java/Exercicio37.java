import java.util.Scanner;

public class Exercicio37 {
    
    public static void main(String[] args) {
        
        Scanner s1 = new Scanner(System.in);

        System.out.println("Jogador 1: ");
        String jogador1 = s1.nextLine();

        System.out.println("IMPAR OU PAR");
        String opcao1 = s1.nextLine();

        System.out.println("Digite um número: ");
        int n1 = s1.nextInt();

        Scanner s2 = new Scanner(System.in);

        System.out.println("Jogador 2: ");
        String jogador2 = s2.nextLine();

        System.out.println("Digite um número: ");
        int n2 = s2.nextInt();


        String vencedor = "";

        if ( opcao1.equalsIgnoreCase("par")) {
            if ((n1 + n2) % 2 == 0) {
                vencedor = jogador1;
            }
            if ((n1+n2) %2 != 0) {
                vencedor = jogador2;
            }
        }
        System.out.println(("Vencedor: "+ vencedor));
    }
}
