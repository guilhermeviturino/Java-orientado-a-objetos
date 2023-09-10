package Ex07;

public class Exercicio {

    public static void main(String[] args) {

        Item item = new Item();
        item.setCodigo(12345);
        item.setNome("Renault Sandero");
        item.setDescricao("4 portas, rodas liga-leve");
        item.mostrarInfo();

        Modelo modelo = new Modelo();
        modelo.setCodigo(123);
        modelo.setMarca("Renault");
        modelo.setNome("Sandero");
        modelo.setMotor("1.6");
        modelo.setSerie(8);
        modelo.mostrarInfo();

        Carro carro = new Carro();
        carro.setChassi("126GDJHAG12312G3");
        carro.setCor("BRANCO");
        carro.setAnoFabricacao(2023);
        carro.setAnoModelo(2024);
        carro.setDataEntrada("10/05/23");
        carro.mostrarInfo();

    }
}
