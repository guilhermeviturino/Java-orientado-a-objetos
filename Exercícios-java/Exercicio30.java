import java.util.Scanner;

public class Exercicio30 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o número 2: ");
        int n2 = sc.nextInt();

        sc.close();

        int maior = -1;
        int menor = 9999;
        int soma = 0;
        int n =1;

        if (n1 < menor) {
            menor = n1;
        } else if (n2 < menor) {
            menor = n2;
        }else if ( n1 > maior) {
            maior = n1;
        } else {
            maior = n2;
        }

        while (menor < maior) {
            soma = soma + menor;
            System.out.println(menor);
            menor += 1;
        } 

        System.out.println("soma: " + soma);
    }
}
