package conta;

public class Conta_corrente {
    protected float saldo;

    public Conta_corrente(){
        this.saldo = 0;
    }

    public Conta_corrente(float saldo){
        this.saldo = saldo;
    }

    public void deposito(float valor){
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor Invalido");
        }
    }

    public boolean sacar(float valor){
        if (getSaldo() >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public String toString(){
        return ("Conta Corrente\nSaldo: " + getSaldo());
    }

    public boolean transferir(Conta_corrente conta, float valor){
        if (sacar(valor)){
            conta.deposito(valor);
            return true;
        } else {
            return false;
        }
    }

    protected float getSaldo() {
        return saldo;
    }
}
