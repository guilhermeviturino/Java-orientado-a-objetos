import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double salario = sc.nextDouble();

        sc.close();

        // INFERIOR A R$300,00: AUMENTO DE 5%
        // SUPERIOR A R$300,00 E INFERIOR A 500,00: AUMENTO DE 7%
        // SUPERIOR A R$500,00: AUMENTO DE 10%

            if (salario <= 300) {
                salario = salario * 1.05;
            }

            if ((salario > 300) && (salario <= 500)) {
                salario = salario * 1.07;
            }

            if (salario > 500) {
                salario = salario * 1.10;
            }

            System.out.printf("Salário com aumento é de: %.2f" + "R$", salario);
    }
    
}