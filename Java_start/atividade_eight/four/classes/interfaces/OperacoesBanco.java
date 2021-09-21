package four.classes.interfaces;

import four.classes.Correntista;

public interface OperacoesBanco {
    public abstract Correntista encontraCorrentista(Correntista todosCorrentistas[], String cpfProcurado);
}
