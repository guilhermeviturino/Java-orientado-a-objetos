import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a renda do homen: ");
        double rendaHomen = sc.nextDouble();

        System.out.println("Digite a renda da mulher: ");
        double rendaMulher = sc.nextDouble();

        sc.close();

        double rendaConjunta = rendaHomen + rendaMulher;

        double aliquota = 0;

        if (rendaConjunta < 900){
            aliquota = 0.10;
        } else if (rendaConjunta < 1500){
            aliquota = 0.15;
        } else{
            aliquota = 0.25;
        }

        double impostoDeRenda = aliquota * rendaConjunta;
        double rendaLiquida = rendaConjunta - impostoDeRenda;

        System.out.println("Renda conjunta: " + rendaConjunta);
        System.out.println("Aliquota atualizada: " + aliquota);
        System.out.println("Imposto de renda: " + impostoDeRenda);
        System.out.println("Renda liquida: " + rendaLiquida);
    }
    
}
