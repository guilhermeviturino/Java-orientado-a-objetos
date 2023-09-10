package Ex07;

public class Modelo extends Item {

    private String marca;
    private String motor;
    private int serie;

    public Modelo() {

    }

    public void mostrarInfo() {
        System.out.println("-------");
        System.out.println("Informações modelo do veículo");
        System.out.println("Código: "+ getCodigo());
        System.out.println("Marca: "+ marca);
        System.out.println("Nome: "+ getNome());
        System.out.println("Motor: "+ motor);
        System.out.println("Série: "+ serie);
    }

    public Modelo(String marca, String motor, int serie) {
        this.marca = marca;
        this.motor = motor;
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

}
