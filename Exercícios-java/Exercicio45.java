import java.util.Scanner;

public class Exercicio45 {
    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        String nomeNova="";
        int menorIdade = 9999;
        int maiorIdade = -1;
        double media = 0;
        double soma = 0;
        

      

        for (int i = 1; i <= 5; i++) {

            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            

            if (idade < menorIdade) {
                menorIdade = idade;
                nomeNova = nome;
            }

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            soma += idade;
            media = soma / 5;
        }
        
        
        


        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Nome da pessoa mais nova: " + nomeNova);
        System.out.println("media das idades: " + media);

    }
}
