import java.util.Scanner;

public class Exercicio47 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int termo = 1;

        for(int i=0; i<10; i++) {
           termo *= 3;
           System.out.print(termo+"/");
        }
        
    }
}
