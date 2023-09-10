import java.util.Scanner;

public class Exercicio22 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade m³");
        int m3 = sc.nextInt();

        sc.close();

        double valor;
        

        if(m3 <=10) {
            valor =  7; 
        }else if(m3 <=30) {
            valor = (m3-10) * 1 + 7;
        }else if(m3 <=100) {
            valor = (m3-30) * 2 + 27;
        }else {
            valor = (m3-100)  * 5 + 167;
        }
        System.out.println(valor);
    }
}
