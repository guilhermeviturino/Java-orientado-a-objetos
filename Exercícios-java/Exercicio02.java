import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de funcionário: ");
        int numero = sc.nextInt();

        System.out.println("Digite o número de horas trabalhada: ");
        int numeroHoras = sc.nextInt();

        System.out.println("Digite o valor da hora: ");
        double valorHora = sc.nextDouble();


        sc.close();

        double salario = numeroHoras * valorHora;

        System.out.println("Número: " + numero);
        System.out.println("Salário: " + salario);

    }
    
}
