import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        String nome = sc.nextLine();

        System.out.println("Digite o salário: ");
        double salario = sc.nextDouble();

        System.out.println("Total em vendas: ");
        double venda = sc.nextDouble();

        double comissao = (venda * 15) / 100;
        double total = salario + comissao;

        sc.close();

        System.out.printf("Total: %.2f", total);
        

    }
    
}
