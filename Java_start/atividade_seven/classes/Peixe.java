package classes;

public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, String caracteristica, String cor, String ambiente, int comprimento, int numero_patas, float velocidade){
        setAmbiente(ambiente);
        setCaracteristica(caracteristica);
        setCor(cor);
        setNome(nome);
        setComprimento(comprimento);
        setNumero_patas(numero_patas);
        setVelocidade(velocidade);
    }
    
    public String toString(){
        return getNome();
    }

    public void descricao(){
        System.out.println("--------------------------");
        System.out.printf("Animal:          %s%n", this);
        System.out.printf("Comprimento:     %d%n", getComprimento());
        System.out.printf("Patas:           %d%n", getNumero_patas());
        System.out.printf("Cor:             %s%n", getCor());
        System.out.printf("Ambiente:        %s%n", getAmbiente());
        System.out.printf("Velocidade:      %.2f m/s%n", getVelocidade());
        System.out.printf("Caracteristica:  %s%n", getCaracteristica());
        System.out.println("-------------------------");
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    public String getCaracteristica() {
        return caracteristica;
    }
}
