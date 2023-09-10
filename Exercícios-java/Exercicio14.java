import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("N: ");
        int n = sc.nextInt();

        sc.close();

        int cont = 0;

        while (cont < 6){
            if (n %2 == 0) {
                n += 1;
            } else {
                n += 2;
            }

            System.out.println("Números impares após (N): " + n);
            cont += 1;
        }

    }

    
}