import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        int maior = -1;
        int menor = 9999;

        while(cont < 3) {
            System.out.println("Valores inteiros: ");
            int valor = sc.nextInt();

            if (valor > maior){
                maior = valor;
            }else if (valor < menor) {
                menor = valor;
            }
            cont++;
        }
        sc.close();
        
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

    }
    
}
