import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma quantia em reais: ");
        int valor = sc.nextInt();
        
        sc.close();

        int[] cedulas = new int[]{100,50,20,10,5,2,1};

        int resto = valor;


        for (int i = 0; i < cedulas.length; i++) {
            int nota = resto / cedulas[i];
            resto = resto % cedulas[i];

            System.out.printf("%d nota(s) de R$ %d,00\n", nota, cedulas[i]);
        }

    }
    
}
