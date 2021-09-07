package classes;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, String alimento, String cor, String ambiente, int comprimento, int numero_patas, float velocidade){
        setAmbiente(ambiente);
        setAlimento(alimento);
        setCor(cor);
        setNome(nome);
        setComprimento(comprimento);
        setNumero_patas(numero_patas);
        setVelocidade(velocidade);
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public String toString(){
        return getNome();
    }

    public void descricao(){
        System.out.println("--------------------------");
        System.out.printf("Animal:          %s%n", this);
        System.out.printf("Comprimento:     %d cm%n", getComprimento());
        System.out.printf("Patas:           %d%n", getNumero_patas());
        System.out.printf("Cor:             %s%n", getCor());
        System.out.printf("Ambiente:        %s%n", getAmbiente());
        System.out.printf("Velocidade:      %.2f m/s%n", getVelocidade());
        System.out.printf("Alimento:        %s%n", getAlimento());
        System.out.println("-------------------------");
    }
}
