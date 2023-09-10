import java.util.Arrays;
import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo do seu bairro: ");
        String bairro = sc.nextLine();

        System.out.println("Digite sua renda: ");
        double renda = sc.nextDouble();

        System.out.println("Digite o valor do consumo: ");
        double valor = sc.nextDouble();
        
        sc.close();

        if (bairro.equalsIgnoreCase("S") && renda <=500) {
            valor = valor - 50;
        } else if (renda <= 1000) {
            valor = valor - 25;
        }
        else if (bairro.equalsIgnoreCase("I") && renda <= 1000) {
            valor = valor - 240;
        } else if ( renda <= 5000) {
            valor = valor - 120;
        }
        else if (bairro.equalsIgnoreCase("T") && renda <= 10000) {
            valor = valor -720;
        } else {
            valor = valor -360;
        }
    
        System.out.println(valor);
    }
}