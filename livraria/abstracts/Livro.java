package abstracts;

import entidades.Autor;
import interfaces.Produto;

public abstract class Livro implements Produto {

    // Atributos
    private String nome;
    private String descricao;
    private double preco;
    private String isbn;
    private Autor autor;
    private boolean impresso;
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Livro() {
        System.out.println("Novo livro criado com sucesso!");
    }

    // Métodos
    public void mostrarDetalhes() {
        System.out.println("Exibindo detalhes do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Descrição: " + descricao);
        System.out.println("ISBN: " + isbn);

        if (temAutor()) {
            autor.mostrarDetalhes();
        }
        autor.mostrarDetalhes();

        System.out.println("--------");
    }

    public boolean temAutor() {
        return (autor != null);
    }
}
