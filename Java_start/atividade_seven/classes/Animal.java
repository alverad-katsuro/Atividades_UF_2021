package classes;
public class Animal {
    private String nome;
    private String cor;
    private String ambiente;
    private int comprimento;
    private float velocidade;
    private int numero_patas;

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumero_patas(int numero_patas) {
        this.numero_patas = numero_patas;
    }
    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    public String getAmbiente() {
        return ambiente;
    }
    public int getComprimento() {
        return comprimento;
    }
    public String getCor() {
        return cor;
    }
    public String getNome() {
        return nome;
    }
    public int getNumero_patas() {
        return numero_patas;
    }
    public float getVelocidade() {
        return velocidade;
    }
}
