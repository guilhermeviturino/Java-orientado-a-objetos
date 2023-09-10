package Ex04;

public abstract class ItemDeLoja {

    private int codigoDoltem;
    private String nomeDoltem;
    private String descricaoDoltem;
    private double valorDoltem;

    public ItemDeLoja() {

    }

    public abstract void codIdentificador();

    public abstract void mostrarInfo();

    public abstract void cadastrar();

    // ------------------------------------------------------------------------------
    public int getCodigoDoltem() {
        return codigoDoltem;
    }

    public void setCodigoDoltem(int codigoDoltem) {
        this.codigoDoltem = codigoDoltem;
    }

    public String getNomeDoltem() {
        return nomeDoltem;
    }

    public void setNomeDoltem(String nomeDoltem) {
        this.nomeDoltem = nomeDoltem;
    }

    public String getDescricaoDoltem() {
        return descricaoDoltem;
    }

    public void setDescricaoDoltem(String descricaoDoltem) {
        this.descricaoDoltem = descricaoDoltem;
    }

    public double getValorDoltem() {
        return valorDoltem;
    }

    public void setValorDoltem(double valorDoltem) {
        this.valorDoltem = valorDoltem;
    }

}
