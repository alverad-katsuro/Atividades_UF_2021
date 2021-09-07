package conta;


public class Cliente {
    private String nome;
    private Conta_corrente conta;

    public Cliente(String nome, float saldo, float limite){
        this.nome = nome;
        this.conta = new Conta_especial(saldo, limite);

    }

    public Cliente(String nome, float saldo){
        this.nome = nome;
        this.conta = new Conta_corrente(saldo);
    }

    public Cliente(String nome){
        this.nome = nome;
        this.conta = new Conta_corrente();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public String toString(){
        return getNome() + "\n" + getConta().toString() + "\n";
    }

    public boolean sacar(float valor){
        return getConta().sacar(valor);
    }
    
    public void deposito(float valor){
        getConta().deposito(valor);
    }
    
    public boolean tranferir(Cliente cliente, float valor){
        return getConta().transferir(cliente.getConta(), valor);
    }

    private Conta_corrente getConta() {
        return conta;
    }
}
