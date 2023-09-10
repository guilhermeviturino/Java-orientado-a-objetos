package Ex06;

public class Dependente extends Funcionario {
    
    private int sequencial;
    private boolean participaPlano;

    public Dependente () {

    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public boolean isParticipaPlano() {
        return participaPlano;
    }

    public void setParticipaPlano(boolean participaPlano) {
        this.participaPlano = participaPlano;
    }

    
}
