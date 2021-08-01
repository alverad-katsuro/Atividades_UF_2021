package atividade_three.classes;

public class Elevador {
    private int andar = 0;
    private int total_de_andares;
    private int pessoas_dentro = 0;
    private int max_pessoas_dentro = 0;

    public Elevador(int total_de_andares, int max_pessoas_dentro){
        this.total_de_andares = total_de_andares;
        this.max_pessoas_dentro = max_pessoas_dentro;
    }

    public void entra() {
        if (1 + getPessoas_dentro() > getMax_pessoas_dentro()){
            System.out.printf("O elevador não suporta essa quantidade de pessoas %d deve sair do elevador para outra entrar.%n", 1);
        } else {
            System.out.println("Uma pessoa entrou.");
            setPessoas_dentro((getPessoas_dentro() + 1));
        }
    }

    public void sai() {
        if (getPessoas_dentro() >= 1){
            setPessoas_dentro((getPessoas_dentro() - 1));
            System.out.println("Uma pessoa saiu.");
        } else {
            System.out.println("Não há ninguem no elevador");
        }
    }

    public void sobe(){
        if (getAndar() < getTotal_de_andares()){
            setAndar((getAndar() + 1));
            andar_atual_msg();
        } else {
            System.out.println("Já estamos no ultimo andar");
        }
    }

    public void desce(){
        if (getAndar() > 0){
            setAndar((getAndar() - 1));
            andar_atual_msg();
        } else {
            System.out.println("Já estamos no Terreo");
        }
    }

    public void andar_atual_msg() {
        System.out.printf("Estamos no %d andar %n", getAndar());
    }

    public int getAndar() {
        return andar;
    }

    public int getPessoas_dentro() {
        return pessoas_dentro;
    }

    public int getTotal_de_andares() {
        return total_de_andares;
    }
    
    public int getMax_pessoas_dentro() {
        return max_pessoas_dentro;
    }

    public void setMax_pessoas_dentro(int max_pessoas_dentro) {
        this.max_pessoas_dentro = max_pessoas_dentro;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public void setPessoas_dentro(int pessoas_dentro) {
        this.pessoas_dentro = pessoas_dentro;
    }

    public void setTotal_de_andares(int total_de_andares) {
        this.total_de_andares = total_de_andares;
    }
}
