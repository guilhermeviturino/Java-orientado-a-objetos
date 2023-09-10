package Ex03;

public class MeioDeTransporte {

    private int id;
    private int ano;
    private String modelo;
    private double cargaMaxima;


    public MeioDeTransporte(int id, int ano, String modelo, double cargaMaxima) {
        this.id = id;
        this.ano = ano;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
    }

    public MeioDeTransporte() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int i) {
        this.ano = i;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public void mostrarInfo() {
        System.out.println("--------");
        System.out.println("Mostrando informações meio de transporte");
        System.out.println("Id: " + id);
        System.out.println("Ano: " + ano);
        System.out.println("Modelo: " + modelo);
        System.out.println("Carga máxima: " + cargaMaxima);
        
    }

}
