package conta;

public class Conta_especial extends Conta_corrente {
    private float limite;

    public Conta_especial(float saldo, float limite) {
        super(saldo);
        setLimite(limite);
    }

    @Override
    public boolean sacar(float valor){
        if (getSaldo() + getLimite() >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public String toString(){
        if (getSaldo() < 0){
            return ("Conta Especial\nSaldo: " + getSaldo() + "\nLimite: " + getLimite() + "\nLimite disponivel pra compra: " + (getLimite() + getSaldo()));
        } else{
            return ("Conta Especial\nSaldo: " + getSaldo() + "\nLimite: " + getLimite() + "\nLimite disponivel pra compra: " + getLimite());
        }
    }
}