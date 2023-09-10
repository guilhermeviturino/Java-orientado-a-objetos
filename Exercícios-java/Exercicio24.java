import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite: ");
        int n = sc.nextInt();

        sc.close();

       int polidromo = 0;
       int aux = n;

       while (aux > 0) {
        polidromo = polidromo * 10 + aux % 10;
        aux = aux / 10;
       }

       if(n == polidromo) {
        System.out.println("S");
       } else {
        System.out.println("N");
       }


        

    }
}