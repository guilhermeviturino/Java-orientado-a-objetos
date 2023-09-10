package entidades;

import interfaces.Produto;

public class Jogo implements Produto{

    private String nome;
    private String anoLancamento;
    private String categoia;
    private int idadeMedia;
    private double preco;

    public Jogo() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getCategoia() {
        return categoia;
    }

    public void setCategoia(String categoia) {
        this.categoia = categoia;
    }

    public int getIdadeMedia() {
        return idadeMedia;
    }

    public void setIdadeMedia(int idadeMedia) {
        this.idadeMedia = idadeMedia;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
