import java.util.Scanner;

public class Exercicio40 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Lado 1: ");
        int l1 = sc.nextInt();

        System.out.println("Lado 2: ");
        int l2 = sc.nextInt();

        System.out.println("Lado 3: ");
        int l3 = sc.nextInt();

        sc.close();

        if (l1 > l2+l3 || l2> l1+l3 ||l3 > l1+l2) {
        System.out.println("Os números não formam um triãngulo");
        }else if (l1 != l2 && l1 != l3 && l2 != l3) {
            System.out.println("Escaleno");
        }

        if (l1 == l2 && l1 == l3 && l3 == l2) {
            System.out.println("Equilátero");
        }

        if (l1 == l3 && l1 != l2) {
            System.out.println("Isósceles");
        } else if (l1 == l2 && l2 != l3) {
            System.out.println("Isósceles");
        } else if (l3 == l2 && l2 != l1) {
            System.out.println("Isósceles");
        }
    }
}

