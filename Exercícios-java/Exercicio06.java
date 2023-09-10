import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Km pecorrido: ");
        int km = sc.nextInt();

        System.out.println("Litros: ");
        double litros = sc.nextDouble();

        double consumo = km / litros;

        System.out.printf("Consumo: %.3f", consumo);

    }
    

    
}
