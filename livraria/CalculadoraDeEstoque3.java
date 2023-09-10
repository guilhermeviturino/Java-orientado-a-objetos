public class CalculadoraDeEstoque3 {

    public static void main(String[] args) {
        
        double livroJava = 75.00;
        double livroPython = 75.00;

        double soma = livroJava + livroPython;

        // operador lógico
        if (soma < 150) {
            System.out.println("O estoque está baixo!");
        } else if (soma == 150) {
            System.out.println("O estoque está no limite!");
        }else {
            System.out.println("O estoque está bom!");
        }

    }
    
}
