import entidades.Autor;
import entidades.MiniLivro;

public class CalculadoraDeEstoque6 {

    public static void main(String[] args) {

        Autor autor = new Autor();

        autor.setNome("Guilherme Viturino");
        autor.setCpf("070.534.154-22");
        autor.setEmail("guilhermevitturino@gmail.com");

        // Criação de um objeto da class Livro
        MiniLivro livro = new MiniLivro();

        // Atribuindo valores aos seus atributos (características)
        livro.setNome("Java Web com Spring Boot");
        livro.setPreco(59.90);
        livro.setDescricao("Curso de Java para iniciantes");
        livro.setIsbn("123-456-679-00-A");
        livro.setAutor(autor);

        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();

        outroAutor.setNome("Williane Araújo");
        outroAutor.setCpf("070.534.154-22");
        outroAutor.setEmail("williaane6@gmail.com");

        MiniLivro outroLivro = new MiniLivro();

        outroLivro.setNome("Python com Django");
        outroLivro.setPreco(39.90);
        outroLivro.setDescricao("Desenvolvimento Web com Python");
        outroLivro.setIsbn("123-456-789-00-A");
        outroLivro.setAutor(outroAutor);

        outroLivro.mostrarDetalhes();
    }
}
