public class CalculadoraDeEstoque4 {

    public static void main(String[] args) {
        
        double soma = 0;

        // FOR

        for (int i = 0; i < 10; i++) {
            if (i==5) {
                break;
            }

            soma += 20.5;
            System.out.println("Soma: " +i +": " + soma);
        }
    

    //     System.out.println("Soma final: " + soma);
    // }

    // WHILE

    // while (soma < 150) {
    //     soma += 20.5;
    //     System.out.println("Soma: " + soma);
    // }

    // System.out.println("Soma final: " + soma);

    }
}
