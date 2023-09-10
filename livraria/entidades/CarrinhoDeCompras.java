
package entidades;
import java.util.ArrayList;
import java.util.List;

import interfaces.Produto;

public class CarrinhoDeCompras{

   
    private List<Produto> produtos = new ArrayList<>();
    private double total;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void adicionar(Produto produto) {
        this.total = total + produto.getPreco();

        produtos.add(produto);
    }


    public void exibirItensDaLista() {

        // for(int i = 0; i < produtos.size(); i++) {
        //     Livro livro = produtos.get(i);
        //     System.out.println("Item: "+ produto.getNome());
        // }
     
        for( Produto produto : produtos) {
            System.out.println("Item: "+ produto.getNome());
        }

    }
}
