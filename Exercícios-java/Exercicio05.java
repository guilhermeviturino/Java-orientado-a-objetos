import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int primeiro = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int segundo = sc.nextInt();
        
        System.out.println("Digite o terceiro valor: ");
        int terceiro = sc.nextInt();

        sc.close();

        int aux;

        if (primeiro > segundo) {
            aux = primeiro;
            primeiro = segundo;
            segundo = aux;
        }

        if (segundo > terceiro) {
            aux = segundo;
            segundo = terceiro;
            terceiro = aux;
        }

        if (primeiro > segundo) {
            aux = primeiro;
            primeiro = segundo;
            segundo = aux;
        }

        System.out.println(primeiro);
        System.out.println(segundo);
        System.out.println(terceiro);
    }
    
}
