import java.util.Scanner;

public class Exercicio34 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro númeor: ");
        int p1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int p2 = sc.nextInt();

        sc.close();

        int n1 = 1;
        int n2 = 2;
        int n3 = 3;

        for(int i = 1; i <= p2; i++){
            System.out.println(n1+" "+n2+" "+n3);
            n1 += 3;
            n2 += 3;
            n3 += 3;
        }

    }
}
