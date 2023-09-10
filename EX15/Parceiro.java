package EX15;

public class Parceiro {

    private String tipoPessoa;
    private float desempenho;
    private Juridica juridica;
    private Fisica fisica;

    public Parceiro() {

    }

    public void cadastrar() {
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void excluir() {
        System.out.println("Cliente excluído com sucesso!");
    }

    public void bloquear() {
        System.out.println("Cliente bloqueado com sucesso!");
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public float getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(float desempenho) {
        this.desempenho = desempenho;
    }

    public Juridica getJuridica() {
        return juridica;
    }

    public void setJuridica(Juridica juridica) {
        this.juridica = juridica;
    }

    public Fisica getFisica() {
        return fisica;
    }

    public void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }

}
