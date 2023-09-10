public class Escola {

    public static void main(String[] args) {

        Turma turma = new Turma();

        turma.setNome("Java Web com Spring Boot");
        turma.setPreco(400);
        turma.setCargaHoraria(48);

        // ------------------------------------------------------
        Aluno aluno1 = new Aluno();

        aluno1.setMatricula("123456");
        aluno1.setNome("Guilherme Viturino");
        aluno1.setCpf("070.123.456-78");
        aluno1.setNota1(9);
        aluno1.setNota2(8);

        aluno1.mostrarinfos();
        // -----------------------------------------------------

        Aluno aluno2 = new Aluno();

        aluno2.setMatricula("123336");
        aluno2.setNome("Williane Araújo");
        aluno2.setCpf("070.123.456-88");
        aluno2.setNota1(1);
        aluno2.setNota2(9);

        aluno2.mostrarinfos();

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.mostrarInfos();
        System.out.println("Preço por hora:" + turma.precoHora());

    }
}
