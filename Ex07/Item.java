package Ex07;

public class Item {

    private int codigo;
    private String nome;
    private String descricao;

    public Item() {

    }

    public void mostrarInfo() {
        System.out.println("-------");
        System.out.println("Informações do item");
        System.out.println("Código: "+ codigo);
        System.out.println("Nome: "+ nome);
        System.out.println("Descrição: "+ descricao);
    }
    public Item(int codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
