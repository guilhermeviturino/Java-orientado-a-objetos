import java.util.Scanner;

public class Desafio08 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do coeficiente a: ");
        int a = sc.nextInt();

        System.out.println("Digite o valor do coeficiente b: ");
        int b = sc.nextInt();

        System.out.println("Digite o valor do coeficiente c: ");
        int c = sc.nextInt();

        sc.close();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0){
            double x1 = (-b - Math.sqrt(delta)) / 2 * a;
            double x2 = (-b + Math.sqrt(delta)) / 2 * a;

            System.out.printf("X1 = %.0f\n", x1);
            System.out.printf("X2 = %.0f\n", x2);
        } else if (delta == 0) {
            double x = -b / 2 * a;

            System.out.printf("X1 = X2 = %.0f", x);
        } else {
            System.out.println("RAÍZES INDETERMINADAS");
        }
    
    }
    
}
