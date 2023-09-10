package Ex03;

public class Exercicio {
    
    public static void main(String[] args) {
        
        MeioDeTransporte mdt = new MeioDeTransporte();
        mdt.setId(1031);
        mdt.setAno(2023);
        mdt.setModelo("Ford Ka");
        mdt.setCargaMaxima(20);
        mdt.mostrarInfo();

        Terrestre terrestre = new Terrestre();
        terrestre.setCargaMaxima(20);
        terrestre.setPotencia(70);
        terrestre.mostrarInfo();
        terrestre.consumo();
        
    }
}
