package four;

import four.classes.Banco;
import four.classes.Correntista;
import four.classes.Movimentacoes;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Correntista correntistas[] = {
        new Correntista("123456789", 5000),
        new Correntista("987654321", 1000), 
        new Correntista("331331331", 99999.5f),
        new Correntista("111222111", 50.5f),
        new Correntista("959595955", 0f),
        new Correntista("141414141", -50f)
        };
        Movimentacoes movimentacoes[] = {
            new Movimentacoes("123456789", -5000),
            new Movimentacoes("987654321", 1), 
            new Movimentacoes("331331331", -999.5f),
            new Movimentacoes("111222111", -20.5f),
            new Movimentacoes("959595955", 50f),
            new Movimentacoes("141414141", 150f)
        };
        Correntista.realizaMovimentacao(correntistas, movimentacoes, banco);

        for (Correntista corrente : correntistas) {
            System.out.println(corrente);
        }
    }
}
