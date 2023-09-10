package entidades;

import abstracts.Livro;

public class LivroFisico extends Livro{
    
    public LivroFisico() {

    }

    public double obterTaxaImpressao() {
        return this.getPreco() * 0.15;
    }

}
