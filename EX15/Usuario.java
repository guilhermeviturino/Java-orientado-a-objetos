package EX15;

public class Usuario extends Colaborador {

    private String login;
    private String senha;
    private String permissao;
    private Colaborador colaborador;

    public Usuario() {

    }

    private void editarPerfil() {

    }

    private void alterarSenha() {

    }

    private void criarUsuario() {

    }

    private void apagarUsuario() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

  
}
