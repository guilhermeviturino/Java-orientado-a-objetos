package Ex07;


public class Carro extends Modelo{

    private String chassi;
    private String cor;
    private int anoFabricacao;
    private int anoModelo;
    private String dataEntrada;

    public Carro () {
        
    }

    public void mostrarInfo(){
        System.out.println("-------");
        System.out.println("Informações do veículo");
        System.out.println("Chassi: "+ chassi);
        System.out.println("Cor: "+ cor);
        System.out.println("Ano de fabricação: "+ anoFabricacao);
        System.out.println("Ano modelo: "+ anoModelo);
        System.out.println("Data de entrada: "+ dataEntrada);
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
}
