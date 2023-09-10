package Ex05;

public class Exercicio {
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        aluno.setMatricula("22GD3");
        aluno.setNome("Guilherme Viturino");
        aluno.setCpf("123.456-789-00");
        aluno.setDataNascimento("25/09/1997");
        aluno.setSexo("M");
        aluno.setEndereco("Rua barra feliz n0");
        aluno.setCidade("Recife");
        aluno.setUf("PE");
        aluno.mostrarInfo();

        Turma turma = new Turma();
        turma.setCod(15);
        turma.setTurno("Noite");
        turma.setSala(8);
        turma.mostrarInfo();

    }
}
