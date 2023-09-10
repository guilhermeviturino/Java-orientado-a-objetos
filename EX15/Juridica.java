package EX15;

import java.util.Date;
import java.util.List;

public abstract class Juridica extends Pessoa {
    
    private String cnpj;
    private String inscricaoEstadual;
    private Date fundacao;
    private List<Parceiro> parceiro;

    public Juridica() {

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public List<Parceiro> getParceiro() {
        return parceiro;
    }

    public void setParceiro(List<Parceiro> parceiro) {
        this.parceiro = parceiro;
    }

    public Date getFundacao() {
        return fundacao;
    }

    public void setFundacao(Date fundacao) {
        this.fundacao = fundacao;
    }

}
