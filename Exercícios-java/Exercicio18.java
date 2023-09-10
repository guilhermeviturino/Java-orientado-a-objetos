import java.util.Scanner;

public class Exercicio18 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n = Integer.parseInt(sc.nextLine());

        sc.close();

        int invertido = 0;
        int temp;

        while(n != 0) {
            temp = n%10;
            invertido = invertido * 10 + temp;
            n = n /10;
        }
        System.out.println(invertido);

        

    }
}
