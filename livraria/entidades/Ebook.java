
package entidades;

import abstracts.Livro;
import interfaces.Produto;
import interfaces.Promocional;

public class Ebook extends Livro implements Promocional, Produto {
    
    private String marcaDagua;

    public Ebook() {

    }

    public String getMarcaDagua() {
        return marcaDagua;
    }

    public void setMarcaDagua(String marcaDagua) {
        this.marcaDagua = marcaDagua;
    }
    
    @Override
    public void mostrarDetalhes () {
        super.mostrarDetalhes();
        System.out.println("Marca D'água: "+ this.marcaDagua);
    }

    @Override
    public void aplicaDesconto(double porcentagem) {
       if (porcentagem <= 0.10) {
            System.out.println("Aplicando desconto...");

            double preco = super.getPreco();
            preco -= preco * porcentagem;
            super.setPreco(preco);
        } else {
            System.out.println("Desconto acima do limite de 10%!");
        }
    }

}
