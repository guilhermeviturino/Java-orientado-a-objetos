package Ex04;

public class Ferramenta extends ItemDeLoja {

    private String categoria;
    private Integer serial;

    public Ferramenta() {

    }

    public void separar() {

        if (categoria == "") {
            System.out.println("Categoria: Outros");
        } else {
            System.out.println("Categoria: " + this.categoria);
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
    
    @Override
    public void codIdentificador() {

    }

    @Override
    public void cadastrar() {
        System.out.println(getNomeDoltem()+" "+getDescricaoDoltem()+" "+"CADASTRADO COM SUCESSO!!!");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("-----------------------");
        System.out.println("Mostrando informações");
        System.out.println("-----------------------");
        System.out.println("Nome: " + this.getNomeDoltem());
        System.out.println("Valor: " + getValorDoltem());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Descrição: " + getDescricaoDoltem());
    }

}
