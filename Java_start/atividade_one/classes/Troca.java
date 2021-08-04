package classes;

public class Troca {
    private double a = 100;
    private double b = 50;

    public void chama_tudo() {
        System.out.printf("Com variavel\n");
        troca_com_variavel();
        System.out.printf("Sem variavel\n");
        troca_sem_variavel();
    }

    public void troca_com_variavel() {
        System.out.printf("Antes: a - b = " + this.a + " - " + this.b + "\n");
        double aux = this.a;
        this.a = this.b;
        this.b = aux;
        System.out.printf("Antes: a - b = " + this.a + " - " + this.b + "\n");

    }

    public void troca_sem_variavel() {
        System.out.printf("Antes: a - b = " + this.a + " - " + this.b + "\n");
        this.a = this.b;
        this.b = this.a;
        System.out.printf("Antes: a - b = " + this.a + " - " + this.b + "\n");
    }

}
