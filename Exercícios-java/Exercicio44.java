import java.util.Scanner;

public class Exercicio44 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double contImp = 0;
        double somaImpares = 0;
        double mediaImpares = 0;
        double maior = -1;
        double menor = 9999;
        double mPar = 0;
        double diferenca = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Digite um número: ");
            double n = sc.nextDouble();

            if (n > maior) {
                maior = n;
            }
            if (n < menor) {
                menor = n;
            }

            if (n %2 != 0) {
                somaImpares += n;
                contImp ++;
            }
            if (n %2 == 0) {
                mPar = n;
                if (mPar > maior) {
                    maior = mPar;
                }
            }

            diferenca = maior - menor;
            mediaImpares = somaImpares / contImp;
        }

        System.out.println("Média dos impares: " + mediaImpares);
        System.out.println("Maior número PAR: " + mPar);
        System.out.println("Diferença: " + diferenca);

    }
}
