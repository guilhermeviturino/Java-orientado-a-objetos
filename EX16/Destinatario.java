package EX16;

import java.util.ArrayList;
import java.util.List;

public class Destinatario {

    private String emailDestinatario;
    private List<Destinatario> destinatarios;

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }

    public List<Destinatario> getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(List<Destinatario> destinatarios) {
        this.destinatarios = destinatarios;
    }

    public Destinatario() {
        this.destinatarios = new ArrayList<>();
    }

    public void buscar() {

        for (Destinatario destinatario : destinatarios) {
            System.out.println("");
            System.out.println(destinatario.getEmailDestinatario());
            System.out.println("");
        }
    }

    public List<Destinatario> adicionar(Destinatario destinatario) {
        this.destinatarios.add(destinatario);

        return this.destinatarios;
    }

    public List<Destinatario> apagar(Destinatario destinatario) {
        System.out.println("");
        System.out.println(destinatario.getEmailDestinatario() + " Removido com sucesso!");
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("Lista de destinatários atualizada!");
        System.out.println("----------------------------------");
        this.destinatarios.remove(destinatario);

        return this.destinatarios;
    }

    public void quantidade() {
        System.out.println("");
        System.out.println("Total: " + destinatarios.size());
    }

}
