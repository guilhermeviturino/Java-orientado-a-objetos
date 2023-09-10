package Ex01;

public class Exercicio {

    public static void main(String[] args) {

        Transporte info = new Transporte();
        info.setId(10);
        info.setAno(2020);
        info.setModelo("Carro");
        info.setCargaMaxima(20);
        info.setPotencia(70);

        info.mostrarInfo();

    }
}
