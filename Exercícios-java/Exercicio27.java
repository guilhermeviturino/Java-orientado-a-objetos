import java.util.Scanner;

public class Exercicio27 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        double media = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite sua glicose: ");
            int glicose = sc.nextInt();

            if (glicose < 110) {
                System.out.println("Normal");
            }

            if ((glicose >= 110) && (glicose <= 125)) {
                System.out.println("Alterada");
            }

            if (glicose > 125) {
                System.out.println("Muito alta");
            }

            soma = soma + glicose;
            media = soma / i;
        }

        System.out.printf("Média das leituras: %.2f", media);
    }
}
