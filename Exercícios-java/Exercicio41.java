import java.util.Scanner;

public class Exercicio41 {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("digite sua altura: ");
        double altura = sc.nextDouble();

        sc.close();

        int pesoIdeal = 0;

        if(altura <= 1.50 && peso <= 50) {
            System.out.println("PESO IDEAL");
        } else if (altura <= 1.50 && peso > 50) {
            pesoIdeal = 50;
            peso = peso - pesoIdeal;
            System.out.printf("Emagreça %.0f Kg", peso);
        }

        else if(altura > 1.50 && altura <= 1.90 && peso == 70) {
            System.out.println("PESO IDEAL");
        } else if(altura <=1.90 && peso < 70) {
            pesoIdeal = 70;
            pesoIdeal -= peso;
            System.out.printf("Engorde %.0f Kg", pesoIdeal);
        } else if (altura <= 1.90 && peso > 70){
            pesoIdeal = 70;
            peso -= pesoIdeal;
            System.out.printf("Emagreça %.0f Kg", peso);
        }

        else if(altura > 190 && peso == 100) {
            System.out.println("PESO IDEAL");
        }else if(peso < 100) {
            pesoIdeal = 100;
            pesoIdeal -= peso;
            System.out.printf("Engorde %.0f Kg", pesoIdeal);
        } else if(peso > 100) {
            peso -= pesoIdeal;
            System.out.printf("Emagreça %.0f Kg", peso);
        }
    }
}
