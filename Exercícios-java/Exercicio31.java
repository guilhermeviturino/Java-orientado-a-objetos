import java.util.Scanner;

public class Exercicio31 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.println("Nota 2: ");
        double nota2 = sc.nextDouble();

        sc.close();

        double soma = 0;
        double media;

        if ((nota1 < 0) || (nota1 > 10)) {
            System.out.println("Nota inválida.");
            
            if ((nota2 < 0) || (nota2 > 10)) {
            System.out.println("Nota inválida.");

            }
        }
        
        if ((nota1 >= 0) && (nota2 >= 0)) {
            if ((nota1 <= 10) && (nota2 <= 10)){
                soma = nota1 + nota2;
                media = soma / 2;

                System.out.printf("Média: %.2f", media);
            }
        }
    }
}
