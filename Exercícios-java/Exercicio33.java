import java.util.Scanner;

public class Exercicio33 {

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número inteiro: ");
    int n = sc.nextInt();

    sc.close();

    int cont = 0;

    int a = 1;
    int b = 2;
    int c = 3;

    while(cont < n) {
        System.out.println(a +" "+b+" "+c+" "+"PUM");
        a += 4;
        b += 4;
        c += 4;
        cont ++;
    }

}
    
}