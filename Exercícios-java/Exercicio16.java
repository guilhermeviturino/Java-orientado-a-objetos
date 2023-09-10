import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade da população (A): ");
        double paisA = sc.nextInt();

        System.out.println("Quantidade da população (B): ");
        double paisB = sc.nextInt();

        sc.close();

        int cont = 0;

        while(paisA <= paisB) {
            paisA = paisA + (paisA * 3)/ 100;
            paisB = paisB + (paisB * 1.5)/100;
            cont += 1;
        }
        System.out.println("Levará " + cont + " anos");
    }

    
}