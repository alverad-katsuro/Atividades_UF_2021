package four.classes;

import four.classes.interfaces.OperacoesBanco;

public class Banco implements OperacoesBanco {

    @Override
    public Correntista encontraCorrentista(Correntista[] todosCorrentistas, String cpfProcurado) {
        for (Correntista correntista : todosCorrentistas) {
            if (correntista.getCpfCliente().equals(cpfProcurado)) {
                return correntista;
            }
        }
        return null;
    }
    
}
