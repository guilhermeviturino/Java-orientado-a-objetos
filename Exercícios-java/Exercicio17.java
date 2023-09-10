import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int n = sc.nextInt();

        sc.close();

        int primo = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                primo++;
            }
        }
        
        if (primo == 2) {
            System.out.println(n +" É um número primo!");
        } else {
            System.out.println(n + " Não é um número primo...");
        }
    }
}
