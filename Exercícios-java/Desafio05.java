import java.util.Scanner;

public class Desafio05 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n = sc.nextInt();

        sc.close();


        String seq ="1 1 ";
        int a = 1;
        int b = 1;
        int c;

        System.out.print(seq);

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
            
        }
    }
}
