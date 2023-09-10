package ZOOapp;

public class Animal {

    private String nome;
    private double comprimento;
    private long numPatas;
    private String cor;
    private String ambiente;
    private double velocidadeMedia;

    

    public Animal(String nome, double comprimento, long numPatas, String cor, String ambiente, double velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    public void exibirDados() {
        System.out.println("");
        System.out.println("=====IMPRIMINDO DADOS=====");
        System.out.println("Nome: " + this.nome);
        System.out.println("Comprimento: " + this.comprimento+"cm");
        System.out.println("Número de patas: " + this.numPatas);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ambiente: " + this.ambiente);
        System.out.println("Velocidade média: " + this.velocidadeMedia+"km/h");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public long getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

}