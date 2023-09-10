import entidades.Autor;
import entidades.Ebook;
import entidades.MiniLivro;

public class CalculadoraDeEstoque7 {
    
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


        Ebook ebook = new Ebook();

        ebook.setNome("Lógica de programação");
        ebook.setMarcaDagua("LP");
        ebook.setAutor(autor);
        ebook.setPreco(39.90);

        ebook.aplicaDesconto(0.10);
        
        ebook.mostrarDetalhes();
    }
}
