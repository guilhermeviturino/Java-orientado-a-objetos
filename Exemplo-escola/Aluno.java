public class Aluno {

    private String matricula;
    private String nome;
    private String cpf;
    private String email;
    private int idade;
    private char genero;
    private double nota1;
    private double nota2;
    private Turma turma;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    // Exibir infos
    public void mostrarinfos() {

        System.out.println("Exibindo detalhes do aluno");
        System.out.println("Matricula:" + matricula);
        System.out.println("Nome::" + nome);
        System.out.println("Cpf:" + cpf);
        System.out.println("Email:" + email);
        System.out.println("Idade:" + idade);
        System.out.println("Genero:" + genero);
        System.out.println("Média:" + calcularMedia());
        System.out.println("Situação:" + (aprovado() ? "APROVADO" : "REPROVADO"));
    }

    // Calcular média
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public boolean aprovado() {
        return calcularMedia() >= 7;
    }

}