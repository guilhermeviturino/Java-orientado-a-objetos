import java.util.Scanner;

public class Exercicio36 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = sc.nextInt();

        sc.close();

        for (int i= 1; i < num; i++) {
            System.out.print("Ho ");
        }

        System.out.println("Ho!");

    }
}
