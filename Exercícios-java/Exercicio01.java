import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double a = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double b = sc.nextDouble();

        double mediaPonderada = (a * 3.5 + b * 7.5) / 11;

        System.out.printf("MÉDIA: %.5f", mediaPonderada);

        sc.close();

    }

}