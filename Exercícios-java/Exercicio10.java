import java.util.Scanner;

public class Exercicio10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade em dias: ");
        int dias = sc.nextInt();

        sc.close();
        
        int ano = dias / 365;

        int mes = dias % 365 / 30;

        int dia = dias % 365 % 30;

        System.out.println(ano + "ano(s), " + mes + "mes(es) e " + dia + "dia(s)");
    }
}
