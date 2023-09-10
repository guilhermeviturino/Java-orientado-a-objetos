package ZOOapp;

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero(String nome, double comprimento, long numPatas, String cor, String ambiente, double velocidadeMedia,
            String alimento) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Alimento: " + this.alimento);
    }
}
