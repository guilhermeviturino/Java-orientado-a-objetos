import java.util.Scanner;

public class Exercicio32 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cont1 = 0;
        double litro1 = 0;
        double soma1 = 0;

        int cont2 = 0;
        double litro2 = 0;
        double soma2 = 0;

        int cont3 = 0;
        double litro3 = 0;
        double soma3 = 0;


        for (int i=1; i<=5; i++) {

            System.out.println("Digite a opção (1.Álcool) (2.Gasolina) (3.Disel)");
            int combustivel = sc.nextInt();

            System.out.println("Quantidade em litros: ");
            double litros = sc.nextDouble();

            if (combustivel == 1) {
                cont1 += 1;
                litro1 = litros;
                soma1 = soma1 + litros;
            }

            if (combustivel == 2) {
                cont2 += 1;
                litro2 = litros;
                soma2 = soma2 + litros;
            }

            if (combustivel == 3) {
                cont3 += 1;
                litro3 = litros;
                soma3 = soma3 + litros;
            }
        }

        System.out.println("1.Álcool: "+ cont1+" - "+"Quantidade Litros: "+soma1);
        System.out.println("2.Gasolina: "+ cont2+" - "+"Quantidade Litros: "+soma2);
        System.out.println("3.Disel: "+ cont3+" - "+"Quantidade Litros: "+soma3);
    }
}
