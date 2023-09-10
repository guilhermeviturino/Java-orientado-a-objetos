import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int maiorAno = -1;
        double maiorVelocidade = -1;
        double soma = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite o ano do veículo: ");
            int anoVeiculo = sc.nextInt();

            System.out.println("Digite a velocidade: ");
            double velocidade = sc.nextDouble();

            if (anoVeiculo > maiorAno) {
                maiorAno = anoVeiculo;
            }

            if (velocidade > maiorVelocidade) {
                maiorVelocidade = velocidade;
            }
        }

        System.out.println("Ano do carro mais novo: " + maiorAno);
        System.out.println("Velocidade do mais rápido: " + maiorVelocidade);
    }
}