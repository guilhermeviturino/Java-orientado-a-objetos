import java.util.Scanner;

public class Exercicio15 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n = sc.nextInt();

        sc.close();

        int termo = 2;
        int termoA = 1;
        int termoB = 1;
        int termoTotal = termoA + termoB;

        while (termo < n){
            termoTotal = termoA + termoB;
            termoA = termoB;
            termoB = termoTotal;
            termo +=1;
            System.out.println(termoTotal);
        }
    }
}
