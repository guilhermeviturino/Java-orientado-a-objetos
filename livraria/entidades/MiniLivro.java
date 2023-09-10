package entidades;

import abstracts.Livro;
import interfaces.Promocional;

public class MiniLivro extends Livro implements Promocional{

    @Override
    public void aplicaDesconto(double porcentagem) {
        if(porcentagem <0.25) {
            
           System.out.println("Aplicando desconto...");

            double preco = this.getPreco();
            preco -= preco * porcentagem;
            this.setPreco(preco);

        }
    }

}
