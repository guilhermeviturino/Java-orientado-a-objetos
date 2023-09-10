package Ex03;

public class Terrestre extends MeioDeTransporte {

    private int qntRoda;
    private double potencia;

    

    public Terrestre(int qntRoda, double potencia) {
        this.qntRoda = qntRoda;
        this.potencia = potencia;
    }

    public Terrestre() {
    }

    public double consumo() {
        return this.getCargaMaxima() * getPotencia() * 100 ;
    }

    public int getQntRoda() {
        return qntRoda;
    }

    public void setQntRoda(int qntRoda) {
        this.qntRoda = qntRoda;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void mostrarInfo() {
        System.out.println("--------");
        System.out.println("Mostrando informações terrestre");
        System.out.println("Potência: " + potencia);
        System.out.println("Quantidade rodas: " + qntRoda);
        System.out.println("Consumo: "+ consumo());
    }

}
