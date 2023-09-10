package Ex05;

public class Turma extends Aluno{

    private Integer cod;
    private String turno;
    private Integer sala;

    public Turma() {

    }

    public void mostrarInfo() {
        System.out.println("----------------------");
        System.out.println("Informações da turma");
        System.out.println("Código: "+ cod);
        System.out.println("Turno: "+ turno);
        System.out.println("Sala: "+ sala);

    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }


    public static void main(String[] args) {
        
        Turma quintoA = new Turma();
        quintoA.setCod(12);
        quintoA.setSala(7);
        quintoA.setTurno("Noite");



        Aluno guilherme = new Aluno();
        guilherme.setMatricula("123@45");
        guilherme.setNome("Guilherme viturino da silva");
        guilherme.setCpf("123-456-789-00");
        guilherme.setDataNascimento("25/19/1997");
        guilherme.setSexo("M");
        guilherme.setEndereco("Rua barra feliz n08");
        guilherme.setCidade("Recife");
        guilherme.setUf("PE");
        guilherme.mostrarInfo();


    }
}
