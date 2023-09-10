import entidades.Autor;
import entidades.CarrinhoDeCompras;
import entidades.Ebook;
import entidades.LivroFisico;
import entidades.MiniLivro;

public class CalculadoraDeEstoque08 {

    

    public static void main(String[] args) {

        Autor autor = new Autor();

        autor.setNome("Guilherme Viturino");
        autor.setCpf("070.534.154-22");
        autor.setEmail("guilhermevitturino@gmail.com");

        MiniLivro livro = new MiniLivro();

        livro.setNome("Java Web com Spring Boot");
        livro.setPreco(59.90);
        livro.setDescricao("Curso de Java para iniciantes");
        livro.setIsbn("123-456-679-00-A");
        livro.setAutor(autor);

        livro.aplicaDesconto(0.01);
        livro.mostrarDetalhes();

        LivroFisico livroFisico = new LivroFisico();

        livroFisico.setNome("Curso de python");
        livroFisico.setPreco(49.90);
        livroFisico.setDescricao("Curso de python para iniciantes");
        livroFisico.setIsbn("123-456-679-00-A");
        livroFisico.setAutor(autor);
        livroFisico.mostrarDetalhes();

        Ebook ebook = new Ebook();

        ebook.setNome("Lógica de programação");
        ebook.setMarcaDagua("LP");
        ebook.setAutor(autor);
        ebook.setPreco(49.90);

        ebook.aplicaDesconto(0.10);
        ebook.mostrarDetalhes();

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionar(livro);
        carrinho.adicionar(livroFisico);
        carrinho.adicionar(ebook);

        System.out.println("Total: " + carrinho.getTotal());

        carrinho.exibirItensDaLista();
    }

}
