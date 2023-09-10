import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio50 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do andar:");
        int numAndar = sc.nextInt();

        sc.close();

        List<Integer> andares = new ArrayList<>();    

        for(int i = 0; i < 1018; i++){
            String inteiroConvertido = String.valueOf(i+1);

            if(inteiroConvertido.contains("4") || inteiroConvertido.contains("13")) {
                continue;
            }
        }

        System.out.println("O número real do andar é: " + andares.get(numAndar - 1));
    }
}
