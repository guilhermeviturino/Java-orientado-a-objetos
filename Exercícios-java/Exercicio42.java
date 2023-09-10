import java.util.Scanner;

public class Exercicio42 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor anterior: ");
        double valorAnterior = sc.nextDouble();

        System.out.println("Digite o valor atutal: ");
        double valorAtual = sc.nextDouble();

        sc.close();

   
        double porcentagem =(valorAtual - valorAnterior) * 100 / valorAnterior;
    
        System.out.printf("%.0f",porcentagem);
        System.out.println("%");


    }
}
