package four.classes;

import four.classes.interfaces.MovimentoConta;

public class Movimentacoes implements MovimentoConta {
    private final String CPF;
    private final float movimentacao;

    
    public Movimentacoes(String cPF, float movimentacao) {
        CPF = cPF;
        this.movimentacao = movimentacao;
    }

    @Override
    public String getCPFCorrentista() {
        return this.CPF;
    }

    @Override
    public float getValorMovimento() {
        return this.movimentacao;
    }
    
}
