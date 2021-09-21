package four.classes;

public class Correntista {
    private String cpfCliente;
    private float saldo;
    public Correntista(String cpfCliente, float saldo) {
        this.cpfCliente = cpfCliente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return ("Cliente: " + getCpfCliente() + " saldo: R$"+getSaldo());
    }

    public String getCpfCliente() {
        return cpfCliente;
    }
    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public static void realizaMovimentacao(Correntista[] correntistas, Movimentacoes[] movimentacoes, Banco banco){
        for (Movimentacoes movimentacao : movimentacoes) {
            for (Correntista corrente : correntistas) {
                Correntista corren_encontrado = banco.encontraCorrentista(correntistas, corrente.getCpfCliente());
                if (corren_encontrado.getCpfCliente().equals(movimentacao.getCPFCorrentista())) {
                    corren_encontrado.setSaldo(corren_encontrado.getSaldo() + movimentacao.getValorMovimento());
                }
            }
        }
    }
}
