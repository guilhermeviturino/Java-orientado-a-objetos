package Ex05;

public class Aluno {
    
    private String matricula;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String sexo;
    private String endereco;
    private String cidade;
    private String uf;

    public Aluno () {

    }

    public void mostrarInfo() {
        System.out.println("----------------------");
        System.out.println("Informações do aluno");
        System.out.println("Matricula: "+ matricula);
        System.out.println("Nome: "+ nome);
        System.out.println("Cpf: "+ cpf);
        System.out.println("Data de nascimento: "+ dataNascimento);
        System.out.println("Gênero: "+ sexo);
        System.out.println("Endereço: "+ endereco);
        System.out.println("Cidade: "+ cidade);
        System.out.println("UF: "+ uf);
        
    }   


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    

}
