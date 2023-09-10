import java.util.Scanner;

public class Exercicio48 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();

        sc.close();

        double mg = 0;
        double gotas = 0;
        
        
        if(idade < 12 && peso <=9) {
            mg = 125;
        } else if(peso <= 16) {
            mg = 250;
        } else if(peso <= 24) {
            mg = 375;
        } else if(peso <=30) {
            mg = 500;
        } else if (peso > 30) {
            mg = 750;
        }

        if(idade >= 12 && peso >= 60) {
            mg = 1000;
        } else if(idade > 12 && peso < 60) {
            mg = 875;
        } 
        
        gotas = (20 * mg) / 500;
        System.out.printf("%.0f gotas",gotas);
    }
}
