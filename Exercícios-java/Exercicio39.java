import java.util.Scanner;

public class Exercicio39 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        sc.close();

        int multi;

        for (int i = 1; i <= 10; i++) {
            multi = n * i;
            System.out.println(n+"x"+i+"="+multi);
            
        }
    }
}
