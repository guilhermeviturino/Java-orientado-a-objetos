package Ex01;

public class Transporte {

    // Atributos
    private Integer id;
    private Integer ano;
    private String modelo;
    private double cargaMaxima;
    private double potencia;

    public Transporte(Integer id, Integer ano, String modelo, double cargaMaxima, double potencia) {
        this.id = id;
        this.ano = ano;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
        this.potencia = potencia;
    }

    public Transporte() {

    }

    public void mostrarInfo() {
        System.out.println("Id: " + id);
        System.out.println("Ano: " + ano);
        System.out.println("Modelo: " + modelo);
        System.out.println("Carga máxima: " + cargaMaxima);
        System.out.println("Potência: " + potencia);
        System.out.println("Consumo: " + consumo());
    }

    public double consumo() {
        return cargaMaxima * potencia * 100;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
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

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

}