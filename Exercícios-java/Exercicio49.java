import java.util.Scanner;

public class Exercicio49 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        sc.close();

        double imc = peso / (altura*altura);

        if (imc < 20) {
            System.out.println("Abaixo do peso");
        }
        else if(imc <=25.5) {
                System.out.println("Peso normal");
        }
        else if(imc <= 30.5) {
            System.out.println("Sobrepeso");
        }
        else if(imc <40.5) {
            System.out.println("Obeso");
        }
        else {
            System.out.println("Obeso mórbido");
        }

    }
}
