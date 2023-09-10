package Ex06;

import java.util.Date;

public class Funcionario {
    
    private String matricula;
    private String nomeCompleto;
    private String cpf;
    private Date dataNascimmento;
    private String sexo;
    private double salario;
    private int telefone;

    public Funcionario () {

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimmento() {
        return dataNascimmento;
    }

    public void setDataNascimmento(Date dataNascimmento) {
        this.dataNascimmento = dataNascimmento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
    

}
