package ZOOapp;

public class Peixe extends Animal {

    private String caracteristica;

    public Peixe(String nome, double comprimento, long numPatas, String cor, String ambiente, double velocidadeMedia,
            String caracteristica) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Característica: " + this.caracteristica);

    }

}
