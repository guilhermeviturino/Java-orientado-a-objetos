import java.util.Scanner;

public class Exercicio23 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int n1 = sc.nextInt();

        System.out.println("Segundo número: ");
        int n2 = sc.nextInt();

        sc.close();

        String sim = "1";
        String nao = "0";

        if(n1 > n2) {
            System.out.println(sim);
        } else {
            System.out.println(nao);
        }

        if(n1 == n2) {
            System.out.println(sim);
        } else {
            System.out.println(nao);
        }

        if(n1 < n2) {
            System.out.println(sim);
        } else {
            System.out.println(nao);
        }

        if(n1 != n2) {
            System.out.println(sim);
        } else {
            System.out.println(nao);
        }

        if(n1 > n2 || n1 == n2) {
            System.out.println(sim);
        } else {
            System.out.println(nao);
        } 
        
       if(n1 < n2 || n1 == n2) {
            System.out.println(sim);
       } else {
        System.out.println(nao);
       }

    }
}
