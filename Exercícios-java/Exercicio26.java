import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        sc.close();

        int cont = 0;

        if ((altura > 1.40) && (idade > 12)) {
            cont = 1;
            if ((altura >= 1.49) && (idade > 14)) {
                cont++;
            }
        }

        if ((altura > 1.70) && (idade > 16)) {
            cont = 1;
        }

        System.out.println(cont);

    }
}