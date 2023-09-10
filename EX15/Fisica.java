package EX15;

import java.util.Date;
import java.util.List;

public abstract class Fisica extends Pessoa {
    private String cpf;
    private String rg;
    private String genero;
    private Date nascimento;
    private List<Parceiro> parceiro;

    public Fisica() {

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getGenero() {
        return genero;
    }

    public List<Parceiro> getParceiro() {
        return parceiro;
    }

    public void setParceiro(List<Parceiro> parceiro) {
        this.parceiro = parceiro;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

}
