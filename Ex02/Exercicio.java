package Ex02;

public class Exercicio {
    
    public static void main(String[] args) {
        
        Produto produto = new Produto();
        produto.setId(1234);
        produto.setNome("Fiat UNO");
        produto.setDescricao("4 portas, ar condicionado, vidro elétrico");
        produto.setValidade(10);
        produto.mostrarInfo();

    }
}
