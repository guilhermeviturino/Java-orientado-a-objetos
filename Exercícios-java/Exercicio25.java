import java.util.Scanner;

public class Exercicio25 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("SE O TRABALHO POSSUI TAL REQUISITO, DIGITE 1 SE NÃO, DIGITE 0");
        System.out.println("Interface gráfica");
        System.out.println("Inteligência artificial");
        System.out.println("Encapsulamento");
        System.out.println("Identação");
        System.out.println("Uso de Structs ");

        System.out.println("Digite os números de acordo com os requisitos: ");
        int n = sc.nextInt();

        sc.close();

        if(n <10111) {
            System.out.println("0 (ZERO)");
        } else {
            System.out.println("AVALIADO");
        }
    }
}
