public class CalculadoraDeEstoque5 {

    public static void main(String[] args) {

        // OPERADOR e (&&) / ou (||)
        
        double livroJava = 59.90;
        double livroPython = 39.90;

        double soma = livroJava + livroPython;
        double diferenca = livroJava - livroPython;
        double produto = livroJava * livroPython;

        if ((soma > 150) && (diferenca < 10) && ( produto > 200)) {
            System.out.println("O estoque está bom");
        }else {
            System.out.println("O estoque está ruim");
        }

        if ((soma > 150) || (diferenca <10) || (produto > 200)) {
            System.out.println("O estoque está bom");
        } else {
            System.out.println("O estoque está ruim");
        }
    }
    
}
