package three.classes;

public class Cachorro implements Animal {
    private String nome;
    private final String especie = "Cachorro";

    public Cachorro(String nome) {
        setNome(nome);
    }
    
    @Override
    public String getNomeAnimal() {
        return this.nome;
    }

    @Override
    public String getNomeEspecie() {
        return this.especie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
